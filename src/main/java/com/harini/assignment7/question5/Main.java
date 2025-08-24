package com.harini.assignment7.question5;

public class Main {
    public static void main(String[] args) {
        ExamEligibility examEligibility = new ExamEligibility();
        try{
            examEligibility.checkEligibility("Riya",74.9);
        }catch(LowAttendanceException e) {
            System.out.println(e.getMessage());
        }finally {
            System.out.println("End of the application");
        }
    }
}
