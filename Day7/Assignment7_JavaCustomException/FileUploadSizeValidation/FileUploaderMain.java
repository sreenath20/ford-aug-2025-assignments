package FileUploadSizeValidation;

public class FileUploaderMain {
    public static void main(String[] args) {
        FileUploader uploader = new FileUploader();

        try {
            uploader.uploadFile("report.pdf", 12.0);
        } catch (FileTooLargeException e) {
            System.out.println("Error: " + e.getMessage());
        }

        try {
            uploader.uploadFile("movie.mp4", 30.0);
        } catch (FileTooLargeException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
