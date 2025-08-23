package Assignment7.FileUploadSizeValidation;

public class Driver {
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
