package com.example.demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PwU1P4TDllApplication implements CommandLineRunner{
	
	public static final Logger LOG=LoggerFactory.getLogger(PwU1P4TDllApplication.class);

	@Override
	public void run(String... args) throws Exception {
		LOG.info("Segundo programa en STS");
		LOG.info("Tarea3");
		
	}

	public static void main(String[] args) {
		SpringApplication.run(PwU1P4TDllApplication.class, args);
	}
	

}
