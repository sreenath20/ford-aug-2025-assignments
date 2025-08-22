package com.assignments.assignment7;

public class ExamEligibility {
    void checkEligibility(String name,double attendancePercent) throws LowAttendanceException{
        System.out.print("Checking eligibility for "+name+"(Attendance: "+attendancePercent+"%) -> ");
        if(attendancePercent < 75) throw new LowAttendanceException("Attendance below 75%. Not eligible for exam.");
        System.out.println("Eligible for exam.");
    }
}
