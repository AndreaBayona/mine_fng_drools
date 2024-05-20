package com.example.fng_drools.model;

import java.util.Date;

public class Debtor {
	public static final String CC = "CC";
	public static final String CE = "CE";
	public static final String NIT = "NIT";
	
	private String id;
	private String idType;
	private String name;
	private Date bithDate;
	private String address;
	private Integer municipalityCode;
	private String phone;
	private String email;
	
	
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getIdType() {
		return idType;
	}
	public void setIdType(String idType) {
		this.idType = idType;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Date getBithDate() {
		return bithDate;
	}
	public void setBithDate(Date bithDate) {
		this.bithDate = bithDate;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public Integer getMunicipalityCode() {
		return municipalityCode;
	}
	public void setMunicipalityCode(Integer municipalityCode) {
		this.municipalityCode = municipalityCode;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public static String getCc() {
		return CC;
	}
	public static String getCe() {
		return CE;
	}
	public static String getNit() {
		return NIT;
	}
	
	
	
	

}
