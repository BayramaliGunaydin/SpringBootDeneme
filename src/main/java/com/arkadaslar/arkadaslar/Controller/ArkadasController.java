package com.arkadaslar.arkadaslar.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.arkadaslar.arkadaslar.Entities.*;
import com.arkadaslar.arkadaslar.Service.IArkadasService;




@RestController
@RequestMapping("/api")
public class ArkadasController {
	
	private IArkadasService arkadasservice;
	
	@Autowired
	public ArkadasController(IArkadasService arkadasservice) {
		this.arkadasservice = arkadasservice;
	}

	@GetMapping("/arkadaslar")
	public List<Arkadas> get(){
		return arkadasservice.getAll();
	}

	@PostMapping("/add")
	public void add(@RequestBody Arkadas arkadas){
		arkadasservice.add(arkadas);
	}
	
	@PostMapping("/update")
	public void update(@RequestBody Arkadas arkadas){
		arkadasservice.update(arkadas);
	}
	
	@PostMapping("/delete")
	public void delete(@RequestBody Arkadas arkadas){
		arkadasservice.delete(arkadas);
	}
	
	@GetMapping("/arkadaslar/{id}")
	public Arkadas searchbyid(@PathVariable int id){
		return arkadasservice.serachtbyıd(id);
	}

}
