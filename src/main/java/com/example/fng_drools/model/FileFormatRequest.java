package com.example.fng_drools.model;


public class FileFormatRequest {

    private User user;
    private FileInfo fileInfo;

    public FileFormatRequest(User user, FileInfo fileInfo) {
        this.user = user;
        this.fileInfo = fileInfo;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public FileInfo getFileInfo() {
        return fileInfo;
    }

    public void setFileInfo(FileInfo fileInfo) {
        this.fileInfo = fileInfo;
    }
}
