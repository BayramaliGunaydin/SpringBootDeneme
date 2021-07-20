package com.arkadaslar.arkadaslar.Repository;

import java.util.List;
import javax.persistence.EntityManager;

import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.arkadaslar.arkadaslar.Entities.*;




@Repository
public class ArkadasDal implements IArkadasDal{

	private EntityManager manager;
	
	@Autowired
	public ArkadasDal(EntityManager manager) {
		this.manager = manager;
	}

	@Override
	@Transactional
	public List<Arkadas> getAll() {
		Session session = manager.unwrap(Session.class);
		List<Arkadas> arkadaslar = session.createQuery("from Arkadas",Arkadas.class).getResultList();
		return arkadaslar;
	}

	@Override
	@Transactional
	public void add(Arkadas arkadas) {
		Session session = manager.unwrap(Session.class);
		session.save(arkadas);		
	}

	@Override
	@Transactional
	public void update(Arkadas arkadas) {
		Session session = manager.unwrap(Session.class);
		session.update(arkadas);	
	}

	@Override
	@Transactional
	public void delete(Arkadas arkadas) {
		Session session = manager.unwrap(Session.class);
		City citytodelete = session.get(City.class,arkadas.getIdarkadas());
		session.delete(citytodelete);
	}

	@Override
	@Transactional
	public Arkadas serachtbyıd(int id) {
		Session session = manager.unwrap(Session.class);
	    Arkadas arkadas = session.get(Arkadas.class,id);
		return arkadas;
	}
	
}
