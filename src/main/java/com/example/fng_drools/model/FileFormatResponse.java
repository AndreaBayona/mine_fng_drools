package com.example.fng_drools.model;

import java.util.ArrayList;
import java.util.List;

public class FileFormatResponse {
    private String userId;
    private String fileType;
    private Integer fileSize;
    private boolean isValid;
    private List<String> messages;

    public FileFormatResponse(String userId) {
        this.userId = userId;
        this.isValid = true;
    }

    public void addMessage(String message) {
        if (messages == null) {
            messages = new ArrayList<String>();
        }
        messages.add(message);
    }

    public boolean isValid() {
        return isValid;
    }

    public void setValid(boolean valid) {
        isValid = valid;
    }

    public List<String> getMessage() {
        return messages;
    }

    public void setMessage(List<String> messages) {
        this.messages = messages;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getFileType() {
        return fileType;
    }

    public void setFileType(String fileType) {
        this.fileType = fileType;
    }

    public Integer getFileSize() {
        return fileSize;
    }

    public void setFileSize(Integer fileSize) {
        this.fileSize = fileSize;
    }
}
