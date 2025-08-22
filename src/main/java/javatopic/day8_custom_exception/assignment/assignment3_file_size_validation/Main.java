package javatopic.day8_custom_exception.assignment.assignment3_file_size_validation;

import java.util.Scanner;

public class Main {
    public static void main(String args[]) throws FileTooLargeException
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter fileName");
        String fileName=sc.nextLine();
        System.out.println("Enter file size");
        double fileSizeMB=sc.nextDouble();
        boolean fileSizeValid=false;
        FileUploader fileUploader=new FileUploader();

        try{
            fileSizeValid=fileUploader.uploadFile(fileName,fileSizeMB);

        }
        catch(FileTooLargeException e){
           // System.out.println(e.getMessage());
        }


        if(fileSizeValid){
            System.out.println("Uploading "+fileName+"("+fileSizeMB+"MB)  File uploaded successfully");

        }
        else{
            System.out.println("Uploading "+fileName+"("+fileSizeMB+"MB)  Error: File size exceeds the 25MB Limit ");
        }


    }
}
