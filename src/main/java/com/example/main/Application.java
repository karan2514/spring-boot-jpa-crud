package com.example.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;


import com.example.controller.UserController;

@SpringBootApplication
@ComponentScan(basePackages = "com.example.*")
@ComponentScan(basePackageClasses = UserController.class)
@EntityScan("com.example.*")
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

}
