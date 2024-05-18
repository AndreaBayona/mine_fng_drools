package com.example.fng_drools.model;

import java.util.ArrayList;

public class User {
	public static final String PERSONA_NATURAL = "persona_natural";
	public static final String PERSONA_JURIDICA = "persona_juridica";
	
	private String id;
	private String name;
    private String type;
    private String userName;
    private String password;
    private ArrayList<Integer> roleIds;
    
    
	//-----------------------------------
	//------- Constructors --------------
	//-----------------------------------
	public User (String id, String type, String name, String userName, ArrayList<Integer> roleIds)
	{
		this.id = id;
		this.type = type;
		this.name = name;
		this.userName = userName;
		this.setRoleIds(roleIds);
	}
	
	
	//-----------------------------------
	//------ Getters and Setters --------
	//-----------------------------------
	
    public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}
	
    
    public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getName() {
		return name;
	}
    
	public void setName(String name) {
		this.name = name;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public ArrayList<Integer> getRoleIds() {
		return roleIds;
	}

	public void setRoleIds(ArrayList<Integer> roleIds) {
		this.roleIds = roleIds;
	}

}
