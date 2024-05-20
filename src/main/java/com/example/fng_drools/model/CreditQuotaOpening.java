package com.example.fng_drools.model;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class CreditQuotaOpening {

	private String id;
	private String CIIUCode;
	private Credit creditReference;
	private Warranty warrantyReference;
	private Debtor debtor;
	private Intermediary bank;
	private Portal portal;

	
	//-----------------------------------
	//------- Constructors --------------
	//-----------------------------------
	public CreditQuotaOpening(String id, String cIIUCode,
			Credit creditReference, Warranty warrantyReference, Debtor debtor, Intermediary bank, Portal portal) {
		super();
		this.id = id;
		CIIUCode = cIIUCode;
		this.creditReference = creditReference;
		this.warrantyReference = warrantyReference;
		this.bank = bank;
		this.debtor = debtor;
		this.portal = portal;
	}

	public boolean validateIntermediaryNitCharactersNumber(){
		String bankNit = this.bank.getId().toString();
		return bankNit.length() == 10;
	}

	public boolean validateIntermediaryNitIsNumeric(){
		String bankNit = this.bank.getId().toString();
		return Utils.isNumeric(bankNit);
	}

	public boolean validateIntermediaryNitDoesNotExist(){
		String bankNit = this.bank.getId().toString();
		return portal.doesIntermediaryExist(bank.getId());
	}
	
	public boolean validateDebtorIdCCType(){
		String debtorId = this.debtor.getId();
		return debtorId.length() <= 10 && Objects.equals(this.debtor.getIdType(), Debtor.CC);
	}

	public boolean validateDebtorIdIsNumeric(){
		String debtorId = this.debtor.getId();
		return Utils.isNumeric(debtorId);
	}
	
	public boolean validateDebtorTypeId(){
		String idType = this.debtor.getIdType();
        return idType.equals(Debtor.CC) || idType.equals(Debtor.CE) || idType.equals(Debtor.NIT);
	}

    public boolean validateMunicipalityCodeLength(){
        String code = this.debtor.getMunicipalityCode();
        return code.length() <= 5;
    }

    public boolean validateMunicipalityCodeIsNumeric(){
        String code = this.debtor.getMunicipalityCode();
        return Utils.isNumeric(code);
    }

    public boolean validateMunicipalityCodeExists(){
        String code = this.debtor.getMunicipalityCode();
        return portal.doesMunicipalityExist(code);
    }

    public boolean validateCIIUCodeLength(){
        return this.CIIUCode.length() <= 4;
    }
	
	public boolean validateCIIUCodeIsNumeric(){
        return Utils.isNumeric(this.CIIUCode);
	}

    public boolean validateCreditReferenceCharactersLength(){
        String reference = this.creditReference.getId();
        return reference.length() <= 14;
    }

	public boolean validateCreditReferenceIsNumeric(){
		String reference = this.creditReference.getId();
        return Utils.isNumeric(reference);
	}

    public boolean validateWarrantyCodeCharactersLength(){
        String reference = this.warrantyReference.getId();
        return reference.length() <= 6;
    }
	
	public boolean validateWarrantyCodePattern(){
		String reference = this.warrantyReference.getId();
        return Utils.validateWarrantyCodePattern(reference);
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


	public String getCIIUCode() {
		return CIIUCode;
	}


	public void setCIIUCode(String cIIUCode) {
		CIIUCode = cIIUCode;
	}


	public Credit getCreditReference() {
		return creditReference;
	}


	public void setCreditReference(Credit creditReference) {
		this.creditReference = creditReference;
	}


	public Warranty getWarrantyReference() {
		return warrantyReference;
	}


	public void setWarrantyReference(Warranty warrantyReference) {
		this.warrantyReference = warrantyReference;
	}


	public Debtor getDebtor() {
		return debtor;
	}


	public void setDebtor(Debtor debtor) {
		this.debtor = debtor;
	}


	public Intermediary getBank() {
		return bank;
	}


	public void setBank(Intermediary bank) {
		this.bank = bank;
	}

	public void setPortal(Portal portal) {
		this.portal = portal;
	}
}
