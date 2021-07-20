package com.arkadaslar.arkadaslar.Repository;

import java.util.List;

import com.arkadaslar.arkadaslar.Entities.*;
public interface IArkadasDal {

	 List<Arkadas> getAll();
	 void add(Arkadas arkadas);
	 void update(Arkadas arkadas);
	 void delete(Arkadas arkadas);
	 Arkadas serachtbyıd(int id);
}
