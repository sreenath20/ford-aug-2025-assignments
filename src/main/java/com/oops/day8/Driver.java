package com.oops.day8;

public class Driver {
    public static void main(String[] args) {
        try {
            first();
        } catch (CustomException e) {
            System.out.println(e.getMessage());
        }
        System.out.println("end of the program");
    }
    static void first() throws CustomException {

            throw new CustomException("Custom message");
    }
}
