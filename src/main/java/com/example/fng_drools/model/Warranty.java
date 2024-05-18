package com.example.fng_drools.model;

import java.util.Date;

public class Warranty {
	private String id;
	private Date startDate;
	private Integer productWarrantyCode;
	private Double supportedPercentage;
	
	//-----------------------------------
	//------- Constructors --------------
	//-----------------------------------

	public Warranty(String id, Date startDate, Integer productWarrantyCode, Double supportedPercentage) {
		super();
		this.id = id;
		this.startDate = startDate;
		this.productWarrantyCode = productWarrantyCode;
		this.supportedPercentage = supportedPercentage;
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
	public Date getStartDate() {
		return startDate;
	}
	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}
	public Integer getProductWarrantyCode() {
		return productWarrantyCode;
	}
	public void setProductWarrantyCode(Integer productWarrantyCode) {
		this.productWarrantyCode = productWarrantyCode;
	}
	public Double getSupportedPercentage() {
		return supportedPercentage;
	}
	public void setSupportedPercentage(Double supportedPercentage) {
		this.supportedPercentage = supportedPercentage;
	}
	
	

}
