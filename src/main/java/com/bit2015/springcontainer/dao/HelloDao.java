package com.bit2015.springcontainer.dao;

import org.springframework.stereotype.Component;

@Component
public class HelloDao {
	
	private String name;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void hello(){
		System.out.println("HelloDao:Hello(" + name + ")");
	}
}
