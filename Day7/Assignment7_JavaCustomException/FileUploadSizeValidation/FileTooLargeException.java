package FileUploadSizeValidation;

public class FileTooLargeException extends Exception {
    public FileTooLargeException(String message) {
        super(message);
    }
}
