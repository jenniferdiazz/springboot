package com.mitocode.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.mitocode.repository.IPersonaRepo;
import com.mitocode.repository.PersonaRepompl;

//estereotipos : para no hacer instancias si no acceder a la instancia definida en el contenedor de spring

//service representa la logica de negocio
//autowired busca alguna instancia definida por algun estereotipo: "quiero inyectar"

@Service
public class PersonaServiceImpl implements IPersonaService{
	@Autowired
	@Qualifier("persona2")
	private IPersonaRepo repo;
	
	@Override
	public void registrar(String nombre) {
		//repo = new PersonaRepompl();
		repo.registrar(nombre);
		
	}
	

}
