package javatopic.day8_custom_exception.assignment.assignment3_file_size_validation;

public class FileUploader {
    boolean uploadFile(String fileName,double fileSizeMB) throws FileTooLargeException {
        if(fileSizeMB>25) {
            throw new FileTooLargeException();
        }
        else{
            return true;
        }
    }
    }


