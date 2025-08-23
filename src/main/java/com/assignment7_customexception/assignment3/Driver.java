package com.assignment7_customexception.assignment3;

public class Driver {
    public static void main(String[] args) {
        FileUploader fileUploader = new FileUploader();
        try {
            fileUploader.uploadFile("example.txt",30.0);
        } catch (TooLargeException e) {
            System.out.println( e.getMessage());
        }
    }

}
