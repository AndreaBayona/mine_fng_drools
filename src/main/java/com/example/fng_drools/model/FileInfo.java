package com.example.fng_drools.model;

public class FileInfo {
    private String fileType;
    private Integer fileSize;
    private Integer fileId;

    public FileInfo(String fileType, Integer fileSize, Integer fileId) {
        this.fileType = fileType;
        this.fileSize = fileSize;
        this.fileId = fileId;
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

    public Integer getFileId() {
        return fileId;
    }

    public void setFileId(Integer fileId) {
        this.fileId = fileId;
    }
}
