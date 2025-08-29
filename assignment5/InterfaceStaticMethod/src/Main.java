import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

                System.out.println("Check static method:");
                System.out.println("Is 'Hello' not empty? " + DataValidator.isNotEmpty("Hello"));
                System.out.println("Is '' not empty? " + DataValidator.isNotEmpty(""));

                // Email validation
                DataValidator emailValidator = new EmailValidator();
                System.out.println("\nEmail validation using simple regex:");
                System.out.println("Is 'user@example.com' valid? " + emailValidator.isValid("user@example.com"));
                System.out.println("Is 'invalid-email' valid? " + emailValidator.isValid("invalid-email"));

                // Phone validation
                DataValidator phoneValidator = new PhoneValidator();
                System.out.println("\nPhone validation using simple regex:");
                System.out.println("Is '1234567890' valid? " + phoneValidator.isValid("1234567890"));
                System.out.println("Is '12345' valid? " + phoneValidator.isValid("12345"));



    }
}