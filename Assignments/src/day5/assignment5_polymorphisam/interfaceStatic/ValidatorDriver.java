package day5.assignment5_polymorphisam.interfaceStatic;

public class ValidatorDriver {
    public static void main(String[] args) {
        System.out.println("Check Hello world: "+DataValidator.isNotEmpty("Hello"));

        EmailValidator emailValidator = new EmailValidator();
        System.out.println("Email Validator: "+emailValidator.isValid("Hello@gmail.com"));
        System.out.println("Email Validator: "+emailValidator.isValid("gmail.com"));

        PhoneValidator phoneValidator = new PhoneValidator();
        System.out.println("Phone Validator: "+phoneValidator.isValid("0944444444"));
        System.out.println("Phone Validator: "+phoneValidator.isValid("+4444444444"));


    }
}
