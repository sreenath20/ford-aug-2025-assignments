package day5.Assignment4;

public class Driver {
    public static void main(String[] args) {
        String email = "abc@organisation.com";
        String phone = "+919876543210";
        System.out.println("Email is not empty: " + DataValidator.isNotEmpty(email));
        System.out.println("Phone is not empty: " + DataValidator.isNotEmpty(phone));
        System.out.println();
        EmailValidator emailValidator = new EmailValidator();
        PhoneValidator phoneValidator = new PhoneValidator();

        System.out.println("Is valid email: " + emailValidator.isValid(email));
        System.out.println("Is valid phone: " + phoneValidator.isValid(phone));
    }
}
