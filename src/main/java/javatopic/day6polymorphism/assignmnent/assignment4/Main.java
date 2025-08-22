package javatopic.day6polymorphism.assignmnent.assignment4;

public class Main {
    public static void main(String[] args) {
        DataValidator dataValidator;
        boolean value1=DataValidator.isNotEmpty("Hello World");
        System.out.println(value1);
        boolean value2;
        boolean value3;
        dataValidator=new EmailValidator();
        value2=dataValidator.isValid("Hello Earth");
        System.out.println(value2);
        dataValidator=new PhoneValidator();
        value3=dataValidator.isValid("Hello Universe");
        System.out.println(value3);
    }
}
