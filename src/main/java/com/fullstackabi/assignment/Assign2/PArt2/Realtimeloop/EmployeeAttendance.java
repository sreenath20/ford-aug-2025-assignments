package com.fullstackabi.assignment.Assign2.PArt2.Realtimeloop;

public class EmployeeAttendance {

    public static void main(String[] args) {
        char[][] attendance = {
                {'P', 'P', 'A', 'P', 'L', 'P', 'P'}, // emp 1 attendance
                {'P', 'A', 'A', 'P', 'P', 'P', 'L'}, // emp2 attendance
                {'P', 'P', 'P', 'P', 'P', 'P', 'P'}  // emp3 attendance
        };
        int presentCount = 0;
        int absentCount = 0;
        int leaveCount = 0;
        System.out.println("Employee Attendance");
        for (int i = 0; i < attendance.length; i++) {

            for (char day : attendance[i]) {
                if (day == 'P') {
                    presentCount++;

                }
                if (day == 'A') {
                    absentCount++;

                }
                if (day == 'L') {
                    leaveCount++;
                }

            }
            System.out.println("Employee " + (i + 1) + "attendance is : 'P:' " + presentCount +
                    " A: " + absentCount +
                    " L: " + leaveCount
            );
        }
    }
}
