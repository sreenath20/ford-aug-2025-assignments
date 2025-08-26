package assignment_07.file_upload_size_validation;

import java.util.Scanner;

public class FileUploadSizeValidation {
    public static void main(String[] args) {
        System.out.println(" \nFile Upload Size Validation System \n");

        FileUploader uploader = new FileUploader();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Maximum file size allowed: " + uploader.getMaxFileSize() + " MB\n");

        while (true) {
            try {
                System.out.print("Enter file name (or 'exit' to quit): ");
                String fileName = scanner.nextLine().trim();

                if (fileName.equalsIgnoreCase("exit")) {
                    System.out.println("Exiting file upload system...");
                    break;
                }

                if (fileName.isEmpty()) {
                    System.out.println(" File name cannot be empty.");
                    continue;
                }

                System.out.print("Enter file size in MB: ");
                double fileSize = scanner.nextDouble();
                scanner.nextLine();

                System.out.println("Uploading " + fileName + " (" + fileSize + " MB)...");
                uploader.uploadFile(fileName, fileSize);

            } catch (FileTooLargeException e) {
                System.out.println("Error: " + e.getMessage());

            } catch (NumberFormatException e) {
                System.out.println("Error: Please enter a valid number for file size.");

            } catch (Exception e) {
                System.out.println("Unexpected error: " + e.getMessage());
            }
            System.out.println();
        }
    }
}
