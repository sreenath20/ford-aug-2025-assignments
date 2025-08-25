package com.demo.Assignment5;

public class data_validator {
        public static void main(String[] args) {
            System.out.println(DataValidator.isNotEmpty("hELLO"));
            System.out.println(DataValidator.isNotEmpty(""));
            EmailValidator emailValidator = new EmailValidator("Hello");
            emailValidator.isValid("@2003");
            PhoneValidator phoneValidator = new PhoneValidator("DAd");
            phoneValidator.isValid("+44654321");
        }
}
interface DataValidator {
    static boolean isNotEmpty(String input){
        int stringLength = input.length();
        if(stringLength == 0){
            return false;
        }
        return true;
    }
    public void isValid(String input);
}
class EmailValidator implements DataValidator {
    String input;
    public EmailValidator(String input1) {
        this.input = input1;
    }

    @Override
    public void isValid(String input2) {
        if(DataValidator.isNotEmpty(input)){
            System.out.println("The input is not empty. so you have this "+input2);
        }
            }
}
class PhoneValidator implements DataValidator {
    PhoneValidator(String input1) {

    }
    @Override
    public void isValid(String input2) {
        if(DataValidator.isNotEmpty(input2)){
            System.out.println("The input is not empty. so you have this "+input2);
        }
    }
}
