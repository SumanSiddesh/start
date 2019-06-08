package com.manh.DAL;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import controller.GreetingController;

@SpringBootApplication
@ComponentScan(basePackageClasses = GreetingController.class)
public class DalApplication {

	public static void main(String[] args) {
		SpringApplication.run(DalApplication.class, args);
	}

}
