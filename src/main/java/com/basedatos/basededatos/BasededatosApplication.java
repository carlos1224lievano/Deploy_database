package com.basedatos.basededatos;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"com.basedatos.basededatos.dao.UserDao"})
@ComponentScan(basePackages = {"com.basedatos.basededatos.controllers.UserController"})

@ComponentScan(basePackages = {"com.basedatos.basededatos.dao.ProducerDao"})
@ComponentScan(basePackages = {"com.basedatos.basededatos.controllers.ProducerController"})

public class BasededatosApplication {

	public static void main(String[] args) {
		SpringApplication.run(BasededatosApplication.class, args);
	}

}
