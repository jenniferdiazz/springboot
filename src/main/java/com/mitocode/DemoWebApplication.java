package com.mitocode;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.mitocode.service.IPersonaService;
import com.mitocode.service.PersonaServiceImpl;

@SpringBootApplication
public class DemoWebApplication implements CommandLineRunner{
	
	private static Logger LOG = LoggerFactory.getLogger(DemoWebApplication.class);
	
	@Autowired
	private IPersonaService service;
	

	public static void main(String[] args) {
		SpringApplication.run(DemoWebApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		//System.out.println("Hola Coders desde spring");
		//LOG.info("HOlaaaaaaaaaaa");
		//LOG.warn("cuidado");
		//service = new PersonaServiceImpl();
		service.registrar("Mitocode");
		
		//"Mitocode viaja a traves de la capa services y esta la redirecciona a la capa repo e implementa la funcion"
	}
	
	
	
	

}
