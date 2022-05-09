package com.example.demo;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

//@component create object for class in a container
@Component

@Scope(value="singleton") //by default it will take singleton...it create object once in a container
//@Scope(value="prototype")//if user needs object then only it creates a cobject
public class Student {
	
	private int id;
	private String name;
	
	public Student() {
		super();
		System.out.println("constructor");
	}

	public Student(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + "]";
	}
	public void display()
	{
		System.out.println("Student Display");
	}
	
	
	
	

}
