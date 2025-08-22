package com.ford.assignment2;

public class EmployeeAttendance {

        public static void main(String[] args) {
            char[][] attendance = {
                    {'P', 'P', 'A', 'P', 'L', 'P', 'P'},
                    {'P', 'A', 'A', 'P', 'P', 'P', 'L'},
                    {'P', 'P', 'P', 'P', 'P', 'P', 'P'}
            };

            for (int emp = 0; emp < attendance.length; emp++) {
                int presentCount = 0, absentCount = 0, leaveCount = 0;

                for (char day : attendance[emp]) {
                    switch (day) {
                        case 'P': presentCount++; break;
                        case 'A': absentCount++; break;
                        case 'L': leaveCount++; break;
                    }
                }

                System.out.println("Employee " + (emp + 1) + " → P: " + presentCount + ", A: " + absentCount + ", L: " + leaveCount);
            }
        }


}
