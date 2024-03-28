package com.vk.springbootproject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringBootProjectsApplication {

	public static void main(String[] args) {

		ApplicationContext context = SpringApplication.run(SpringBootProjectsApplication.class, args);
		Programmer obj = context.getBean(Programmer.class);
		obj.con();
		System.out.println("Hello Spring Boot");
		System.out.println("test");
		System.out.println("test2");
		Laptop lap = context.getBean(Laptop.class);
		lap.compile();
		Cpu work = context.getBean(Cpu.class);
		work.runTask();


	}

}
