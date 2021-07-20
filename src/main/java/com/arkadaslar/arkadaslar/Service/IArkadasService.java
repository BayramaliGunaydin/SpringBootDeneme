package com.arkadaslar.arkadaslar.Service;

import java.util.List;


import com.arkadaslar.arkadaslar.Entities.*;

public interface IArkadasService {

	 List<Arkadas> getAll();
	 void add(Arkadas arkadas);
	 void update(Arkadas arkadas);
	 void delete(Arkadas arkadas);
	 Arkadas serachtbyıd(int id);
}
