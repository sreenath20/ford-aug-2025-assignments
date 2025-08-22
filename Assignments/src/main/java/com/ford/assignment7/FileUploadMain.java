package com.ford.assignment7;

class FileTooLargeException extends Exception {
    public FileTooLargeException(String message) {
        super(message);
    }
}

class FileUploader {
    public void uploadFile(String fileName, double fileSizeMB) throws FileTooLargeException {
        if (fileSizeMB > 25) {
            throw new FileTooLargeException("File size exceeds the 25 MB limit.");
        }
        System.out.println("Uploading " + fileName + " (" + fileSizeMB + " MB)... → File uploaded successfully.");
    }
}

public class FileUploadMain {
    public static void main(String[] args) {
        FileUploader uploader = new FileUploader();

        try {
            uploader.uploadFile("report.pdf", 12);
            uploader.uploadFile("movie.mp4", 30);
        } catch (FileTooLargeException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
