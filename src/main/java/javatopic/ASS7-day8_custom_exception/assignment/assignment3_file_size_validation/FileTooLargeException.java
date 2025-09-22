package javatopic.day8_custom_exception.assignment.assignment3_file_size_validation;

public class FileTooLargeException extends Exception{
    public FileTooLargeException() {
    }
    public FileTooLargeException(String message) {
        super(message);
    }
}

