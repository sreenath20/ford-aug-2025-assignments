package assignment_05.data_validator;

public class DataValidatorSystem {
    public static void main(String [] args){
        EmailValidator emailValidator = new EmailValidator();
        PhoneValidator phoneValidator = new PhoneValidator();

        System.out.println("\n--- Form Validation Simulation ---");

        String userEmail = "user@domain.com";
        String userPhone = "555-123-4567";

        System.out.println("Form Submission Data:");
        System.out.println("Email: " + userEmail);
        System.out.println("Phone: " + userPhone);
        System.out.println();

        System.out.println("Step 1: Checking if fields are not empty...");
        boolean emailNotEmpty = DataValidator.isNotEmpty(userEmail);
        boolean phoneNotEmpty = DataValidator.isNotEmpty(userPhone);

        System.out.println("Email not empty: " + emailNotEmpty);
        System.out.println("Phone not empty: " + phoneNotEmpty);

        if (emailNotEmpty && phoneNotEmpty) {
            System.out.println("\nStep 2: Validating specific formats...");
            boolean emailValid = emailValidator.isValid(userEmail);
            boolean phoneValid = phoneValidator.isValid(userPhone);

            System.out.println("Email valid: " + emailValid);
            System.out.println("Phone valid: " + phoneValid);

            if (emailValid && phoneValid) {
                System.out.println("\n Form validation successful!");
            } else {
                System.out.println("\n Form validation failed!");
            }
        } else {
            System.out.println("\n Form has empty fields!");
        }
    }
}
