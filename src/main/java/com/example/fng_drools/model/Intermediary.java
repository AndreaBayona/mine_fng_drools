package com.example.fng_drools.model;

public class Intermediary {
	private Integer nit;
	private String name;
    
	//-----------------------------------
	//------- Constructors --------------
	//-----------------------------------
	public Intermediary(Integer id, String name)
	{
		this.nit = id;
		this.name = name;
	}
    
	//-----------------------------------
	//------ Getters and Setters --------
	//-----------------------------------
	public Integer getId() {
		return nit;
	}
	public void setId(Integer id) {
		this.nit = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

}
