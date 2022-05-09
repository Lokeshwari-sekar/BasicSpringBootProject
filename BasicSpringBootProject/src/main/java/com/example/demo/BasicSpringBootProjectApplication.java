package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

//@springBootApplication is responsible for the boot application is not a normal spring application
@SpringBootApplication
public class BasicSpringBootProjectApplication 
{

	public static void main(String[] args)
	{
		ConfigurableApplicationContext contextob=SpringApplication.run(BasicSpringBootProjectApplication.class, args);
	
		Student sob=contextob.getBean(Student.class);
		System.out.println(sob);
		sob.display();
	
	
	}

}
