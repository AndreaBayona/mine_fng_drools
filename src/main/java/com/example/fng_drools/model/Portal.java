package com.example.fng_drools.model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;


public class Portal {
	
	private ArrayList<Intermediary> financialIntermediaries;
	private ArrayList<String> municipalityCodes;
	private ArrayList<Role> roles;
	private HashMap<String, List<String[]>> loadedDataFiles;
	
	//-----------------------------------
	//------- Constructors --------------
	//-----------------------------------
	public Portal(ArrayList<Intermediary> financialIntermediaries, ArrayList<String> municipalityCodes,
			ArrayList<Role> roles) {
		this.financialIntermediaries = financialIntermediaries;
		this.municipalityCodes = municipalityCodes;
		this.roles = roles;
		this.loadedDataFiles = new HashMap<>();
	}
	
	
    public void addDataFiles(String fileName, List<String[]> data) {
        loadedDataFiles.put(fileName, data);
    }
    
    public List<String[]> getDataFileByName(String name){
    	return loadedDataFiles.get(name);
    }
    
    public boolean doesIntermediaryExist(Integer id) {
        for (Intermediary intermediary : financialIntermediaries) {
            if (intermediary.getId().equals(id)) {
                return true;
            }
        }
        return false;
    }
    
    public boolean doesMunicipalityExist(String id) {
        for (String codes : municipalityCodes) {
            if (codes.equals(id)) {
                return true;
            }
        }
        return false;
    }
	
	//-----------------------------------
	//------ Getters and Setters --------
	//-----------------------------------
	public ArrayList<Intermediary> getFinancialIntermediaries() {
		return financialIntermediaries;
	}

	public void setFinancialIntermediaries(ArrayList<Intermediary> financialIntermediaries) {
		this.financialIntermediaries = financialIntermediaries;
	}

	public ArrayList<String> getMunicipalityCodes() {
		return municipalityCodes;
	}

	public void setMunicipalityCodes(ArrayList<String> municipalityCodes) {
		this.municipalityCodes = municipalityCodes;
	}

	public ArrayList<Role> getRoles() {
		return roles;
	}

	public void setRoles(ArrayList<Role> roles) {
		this.roles = roles;
	}

}
