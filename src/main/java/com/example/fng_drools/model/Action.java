package com.example.fng_drools.model;

import com.example.fng_drools.FileLoader;
import com.example.fng_drools.enums.ActionRole;

import java.util.List;

public class Action {
	private ActionRole actionType;
	private FileInfo fileInfo;
	private List<String[]> data;

	//-----------------------------------
	//------- Constructors --------------
	//-----------------------------------
	public Action(ActionRole actionType) {
		super();
		this.actionType = actionType;
	}

	public Action(ActionRole actionType, FileInfo fileInfo, List<String[]> data) {
		this.actionType = actionType;
		this.fileInfo = fileInfo;
		this.data = data;
	}

	//-----------------------------------
	//------ Load file functions --------
	//-----------------------------------

	public boolean validateCSVFileType() {
		boolean csv = FileLoader.isCSVFile(fileInfo.getFileType());
		
		if(!csv) {
			System.out.println("ERROR: File is not of CSV type");
		}
		
		return csv;
	}
	
	
	public boolean validateFileIsNotEmpty() {
	   boolean validate = fileInfo.getFileSize() > 0;

	   if(!validate) {
		   System.out.println("ERROR: File is empty");
	   }

	   return validate;
	}

	public boolean validateFileNotExceedsSize(Integer maxSizeInBytes) {
		boolean validate = fileInfo.getFileSize() <= maxSizeInBytes;

		if(!validate) {
			System.out.printf("ERROR: File exceeds the max size of %d bytes%n", maxSizeInBytes);
		}

		return validate;
	}
	
	
	//-----------------------------------
	//------ Getters and Setters --------
	//-----------------------------------
	public ActionRole getActionType() {
		return actionType;
	}
	public void setActionType(ActionRole actionType) {
		this.actionType = actionType;
	}

	public List<String[]> getData() {
		return data;
	}

	public void setData(List<String[]> data) {
		this.data = data;
	}

	public FileInfo getFileInfo() {
		return fileInfo;
	}

	public void setFileInfo(FileInfo fileInfo) {
		this.fileInfo = fileInfo;
	}


}
