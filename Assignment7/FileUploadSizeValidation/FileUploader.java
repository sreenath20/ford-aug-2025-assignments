package Assignment7.FileUploadSizeValidation;

public class FileUploader {
    public void uploadFile(String fileName, double fileSizeMB) throws FileTooLargeException {
        if (fileSizeMB > 25) {
            throw new FileTooLargeException("File size exceeds the 25 MB limit.");
        }
        System.out.println("Uploading " + fileName + " (" + fileSizeMB + " MB)... File uploaded successfully.");
    }
}
