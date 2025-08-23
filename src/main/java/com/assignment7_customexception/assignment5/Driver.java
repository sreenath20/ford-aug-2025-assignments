package com.assignment7_customexception.assignment5;

public class Driver {
    public static void main(String[] args ) {
        ExamEligibility exam =new ExamEligibility();
        try {
            exam.checkEligibility("John Doe", 80);
        } catch (LowAttendanceException e) {
            System.out.println(e.getMessage());
        }
    }
}
