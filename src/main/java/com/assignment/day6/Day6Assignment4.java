package com.assignment.day6;

interface DataValidator{

    static boolean isNotEmpty(String str) {
        if (str == null || str.isEmpty()) {
            return false;
        }
        else{
            return true;
        }
    }

    abstract public void isValid(String str);

}

class EmailValidator implements DataValidator {

    @Override
    public void isValid(String str) {
        if (str.contains("@") && str.contains(".")) {
            System.out.println("Valid Email");
        } else {
            System.out.println("Invalid Email");
        }
    }
}

class PhoneValidator implements DataValidator {

    @Override
    public void isValid(String str) {
        if (str.matches("\\d{10}")) {
            System.out.println("Valid Phone Number");
        } else {
            System.out.println("Invalid Phone Number");
        }
    }
}

public class Day6Assignment4 {
    public static void main(String[] args) {

        DataValidator emailValidator = new EmailValidator();
        DataValidator phoneValidator = new PhoneValidator();
        String email = "deepu@gmail.com";
        String phone = "";
        if (DataValidator.isNotEmpty(email)) {
            emailValidator.isValid(email);
        } else {
            System.out.println("Email is empty");
        }
        if (DataValidator.isNotEmpty(phone)) {
            phoneValidator.isValid(phone);
        } else {
            System.out.println("Phone number is empty");
        }

    }
}
