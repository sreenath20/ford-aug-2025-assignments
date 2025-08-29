import java.io.File;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the file name");
        String fileName = sc.nextLine();
        System.out.println("Enter the file size");
        double fileSize = sc.nextDouble();
        FileUploader file = new FileUploader();
        try{
            file.uploadFile(fileName,fileSize);
        }
        catch(FileTooLargeException e){
            System.out.println("Error: "+e.getMessage());
        }


    }
}