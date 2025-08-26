package assignment_07.file_upload_size_validation;

class FileTooLargeException extends Exception {
    public FileTooLargeException(String message) {
        super(message);
    }
    public FileTooLargeException() {
        super("File size exceeds the limit");
    }
}

