package day7.Assignment3;

public class FileUploader {
    public void uploadFile(String fileName,double fileSizeMB) throws FileTooLargeException{
        if(fileSizeMB>25){
            throw new FileTooLargeException("File size exceeds the maximum limit of 25MB");
        }
        else{
            System.out.println("File uploaded successfully");
        }
    }
}
