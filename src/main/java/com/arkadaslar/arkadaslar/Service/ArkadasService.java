package com.arkadaslar.arkadaslar.Service;

import java.util.List;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.arkadaslar.arkadaslar.Entities.*;
import com.arkadaslar.arkadaslar.Repository.IArkadasDal;

@Service
public class ArkadasService implements IArkadasService {

	private IArkadasDal arkadasdal;
	
	
    @Autowired
	public ArkadasService(IArkadasDal arkadasdal) {
		this.arkadasdal = arkadasdal;
	}



	@Transactional
	public List<Arkadas> getAll() {		
		return this.arkadasdal.getAll();
	}



	@Override
	public void add(Arkadas arkadas) {
		this.arkadasdal.add(arkadas);
		
	}



	@Override
	public void update(Arkadas arkadas) {
		this.arkadasdal.update(arkadas);
		
	}



	@Override
	public void delete(Arkadas arkadas) {
		this.arkadasdal.delete(arkadas);
		
	}



	@Override
	public Arkadas serachtbyıd(int id) {
	         return arkadasdal.serachtbyıd(id);
	}

}
