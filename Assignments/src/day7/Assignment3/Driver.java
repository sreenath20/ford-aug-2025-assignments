package day7.Assignment3;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Driver {
    public static void main(String[] args) {
        FileUploader fileUploader = new FileUploader();
        Scanner sc = new Scanner(System.in);

        try{
            System.out.print("Please enter the file name: ");
            String fileName = sc.nextLine();
            System.out.print("Please enter the file size: ");
            double fileSize = sc.nextDouble();
            fileUploader.uploadFile(fileName,fileSize);
        }
        catch(FileTooLargeException e){
            System.out.println(e.getMessage());
        }
        catch(InputMismatchException e){
            System.out.println(e.getMessage());
        }
        finally {
            System.out.println("End of the application");
        }
    }
}
