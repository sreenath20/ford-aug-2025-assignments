package com.assignment.day8.assignment3;

class FileTooLargeException extends Exception {
    public FileTooLargeException(String message) {
        super(message);
    }
}

public class FileUploader {

    public void uploadFile(String fileName, double fileSizeMB) throws FileTooLargeException {
        if(fileSizeMB>25){
            throw new FileTooLargeException("File size exceeds the maximum limit of 25MB.");
        }
        System.out.println("File " + fileName + " uploaded successfully.");
    }

    public static void main(String[] args) {
        FileUploader uploader = new FileUploader();
        try {
            uploader.uploadFile("example.txt", 10);
            uploader.uploadFile("example.txt", 30);
        } catch (FileTooLargeException e) {
            System.out.println( e.getMessage());
        }
    }

}
