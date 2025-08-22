package com.ford.assignment7;

class LowAttendanceException extends Exception {
    public LowAttendanceException(String message) {
        super(message);
    }
}

class ExamEligibility {
    public void checkEligibility(String studentName, double attendancePercent) throws LowAttendanceException {
        if (attendancePercent < 75) {
            throw new LowAttendanceException("Attendance below 75%. Not eligible for exam.");
        }
        System.out.println("Checking eligibility for " + studentName + " (Attendance: " + attendancePercent + "%)... → Eligible for exam.");
    }
}

public class ExamEligibilityMain {
    public static void main(String[] args) {
        ExamEligibility eligibility = new ExamEligibility();

        try {
            eligibility.checkEligibility("Loke", 80);
            eligibility.checkEligibility("Karan", 65);
        } catch (LowAttendanceException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
