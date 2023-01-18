package com.bolsaideas.spring.backend.apirest;

import java.util.Iterator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@SpringBootApplication
public class SprintBootBackendApirestApplication implements CommandLineRunner{

	@Autowired
	private BCryptPasswordEncoder bCryptPasswordEncoder;
	
	public static void main(String[] args) {
		SpringApplication.run(SprintBootBackendApirestApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		String pasword = "12345";
		
		for(int i = 0; i < 4; i++) {
			String passwordBcrypt = bCryptPasswordEncoder.encode(pasword);
			System.out.println(passwordBcrypt);
		}
	}

}
