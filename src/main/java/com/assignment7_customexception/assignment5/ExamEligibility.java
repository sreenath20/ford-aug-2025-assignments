package com.assignment7_customexception.assignment5;

public class ExamEligibility {
    public static void checkEligibility(String studentName, int attendance) throws LowAttendanceException {
        if (attendance < 75) {
            throw new LowAttendanceException(" Checking eligibility for "+studentName+" (Attendance: "+attendance+"%)... → Error: Attendance below 75%. Not eligible for exam. ");
        } else {
            System.out.println(" Checking eligibility for "+studentName+" (Attendance: "+attendance+"%)... → Eligible for exam");
        }
    }


}
