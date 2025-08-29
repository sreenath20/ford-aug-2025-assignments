public class FileUploader {

    public void uploadFile(String fileName,double fileSizeMB){
        System.out.println("Uploading " + fileName + " (" + fileSizeMB + " MB)... ");
        if(fileSizeMB > 25){
            throw new FileTooLargeException("File must not exceed 25 MB");
        }
        System.out.println("File uploaded successfully");
    }
}
