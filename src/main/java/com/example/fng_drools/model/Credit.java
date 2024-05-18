package com.example.fng_drools.model;

import java.util.Date;

public class Credit {
	private String id;
	private Double amount;
	private Double interestRate;
	private Integer termInMonths;
	private String status;
	private Date startDate;
	private String currencyCode;
	
	
	//-----------------------------------
	//------- Constructors --------------
	//-----------------------------------
	public Credit(String id, Double amount, Double interestRate,
			Integer termInMonths, String status, Date startDate, String currencyCode) {
		super();
		this.id = id;
		this.amount = amount;
		this.interestRate = interestRate;
		this.termInMonths = termInMonths;
		this.status = status;
		this.startDate = startDate;
		this.setCurrencyCode(currencyCode);
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
	public Double getAmount() {
		return amount;
	}
	public void setAmount(Double amount) {
		this.amount = amount;
	}
	public Double getInterestRate() {
		return interestRate;
	}
	public void setInterestRate(Double interestRate) {
		this.interestRate = interestRate;
	}
	public Integer getTermInMonths() {
		return termInMonths;
	}
	public void setTermInMonths(Integer termInMonths) {
		this.termInMonths = termInMonths;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public Date getStartDate() {
		return startDate;
	}
	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}



	public String getCurrencyCode() {
		return currencyCode;
	}



	public void setCurrencyCode(String currencyCode) {
		this.currencyCode = currencyCode;
	}
	
	
	

}
