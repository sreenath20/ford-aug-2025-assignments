package assignment_07.file_upload_size_validation;

class FileUploader {
    private static final double MaxFileSize = 25.0;

    public void uploadFile(String fileName, double fileSizeMB) throws FileTooLargeException {
        if (fileSizeMB > MaxFileSize) {
            throw new FileTooLargeException("File size exceeds the " + MaxFileSize + " MB limit. File size: " + fileSizeMB + " MB");
        }

        if (fileSizeMB <= 0) {
            throw new FileTooLargeException("File size must be greater than 0 MB. File size: " + fileSizeMB + " MB");
        }
        System.out.println("Size: " + fileSizeMB + " MB");
    }
    public double getMaxFileSize() {
        return MaxFileSize;
    }
}
