package com.demo.Assignment7;

public class UploadSizeValidation {
    public static void main(String[] args)  {
        FileUploaderClass fileUploader=new FileUploaderClass();
       try{
           fileUploader.upload("Report.pdf",30);
       }
       catch(FileTooLargeException e){
           System.out.println(e.getMessage());
       }

    }
}
class FileTooLargeException extends Exception{
    FileTooLargeException(String message){
        super(message);
    }
}
class FileUploaderClass{
    void upload(String FileName,double fileSizeMB) throws FileTooLargeException{

            if(fileSizeMB<25){
                System.out.println("Uploading"+FileName+"("+fileSizeMB+")");
                System.out.println("file uploaded successfully");
            }

        else{
            throw new FileTooLargeException("File size exceeds the 25 MB limit");
        }
    }
}

