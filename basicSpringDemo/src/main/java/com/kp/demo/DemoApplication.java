package com.kp.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {

		ApplicationContext applicationContext = SpringApplication.run(DemoApplication.class, args);
		Laptop myNewLaptop = applicationContext.getBean(Laptop.class);
		String result = "This laptop uses "+myNewLaptop.produceLaptop();
		System.out.println(result);


	}

}

