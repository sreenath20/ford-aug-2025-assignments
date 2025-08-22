package com.assignments.assignment7;

public class FileUploader {

    void uploadFile(String fileName,double fileSize) throws FileTooLargeException{
        System.out.print("Uploading file "+fileName+"("+fileSize+" MB)...");
        if(fileSize > 25) throw new FileTooLargeException("File  size exceeds the limit 25 MB.");
        System.out.println("File uploaded successfully.");
    }
}
