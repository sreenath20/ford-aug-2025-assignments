package com.assignment.day8.assignment5;

class LowAttendanceException extends Exception {
    public LowAttendanceException(String message) {
        super(message);
    }
}

public class ExamEligibility {

    public void checkEligibility(int attendance) throws LowAttendanceException {
        if (attendance < 75) {
            throw new LowAttendanceException("Student is not eligible to sit for the exam due to low attendance: " + attendance + "%");
        } else {
            System.out.println("Student is eligible to sit for the exam with attendance: " + attendance + "%");
        }
    }

    public static void main(String[] args) {
        ExamEligibility eligibility = new ExamEligibility();
        int[] attendanceRecords = {80, 70, 90, 60, 75};

        for (int attendance : attendanceRecords) {
            try {
                eligibility.checkEligibility(attendance);
            } catch (LowAttendanceException e) {
                System.out.println(e.getMessage());
            }
        }
    }

}
