package com.assignment7_customexception.assignment3;

public class FileUploader {
    public String filename;
    public double fileSizeMB;

    public void uploadFile(String fileName, double fileSizeMB) throws TooLargeException {
        double maxFileSizeMB = 25.0; // Maximum file size allowed in MB
        if (fileSizeMB > maxFileSizeMB) {
            throw new TooLargeException( " Uploading "+filename+" ("+fileSizeMB+" MB)..->Error: File size exceeds the 25 MB limit");
        }
        System.out.println(" Uploading "+filename+" ("+fileSizeMB+" MB)..-> File uploaded successfully");
    }
}
