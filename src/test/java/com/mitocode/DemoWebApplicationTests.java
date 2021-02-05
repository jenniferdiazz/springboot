package com.mitocode;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import com.mitocode.model.Usuario;
import com.mitocode.repo.IUsuarioRepo;

@SpringBootTest
class DemoWebApplicationTests {
	@Autowired
	private IUsuarioRepo repo;
	
	@Autowired
	private BCryptPasswordEncoder encoder;

	@Test
	void crearUsuarioTest() {
		Usuario us = new Usuario();
		us.setId(3);
		us.setNombre("mito");
	//encode transforma la contraseña en algo no legible
		us.setClave(encoder.encode("123"));
		Usuario retorno = repo.save(us);
		
		//prueba si la clave que se mando en la base de datos es la misma que se esta mandando
		assertTrue(retorno.getClave().equalsIgnoreCase(us.getClave()));
	}

}
