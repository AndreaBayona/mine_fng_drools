package com.example.fng_drools.model;

public class Intermediary {
	private String nit;
	private String name;
    
	//-----------------------------------
	//------- Constructors --------------
	//-----------------------------------
	public Intermediary(String id, String name)
	{
		this.nit = id;
		this.name = name;
	}
    
	//-----------------------------------
	//------ Getters and Setters --------
	//-----------------------------------
	public String getId() {
		return nit;
	}
	public void setId(String id) {
		this.nit = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

}
