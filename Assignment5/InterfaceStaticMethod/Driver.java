package Assignment5.InterfaceStaticMethod;

public class Driver {
        public static void main(String[] args) {
            String email = "john@example.com";
            String phone = "9876543210";
            System.out.println("Email is not empty: " + DataValidator.isNotEmpty(email));
            System.out.println("Phone is not empty: " + DataValidator.isNotEmpty(phone));

            EmailValidator emailValidator = new EmailValidator();
            PhoneValidator phoneValidator = new PhoneValidator();

            System.out.println("Is valid email: " + emailValidator.isValid(email));
            System.out.println("Is valid phone: " + phoneValidator.isValid(phone));
        }

}
