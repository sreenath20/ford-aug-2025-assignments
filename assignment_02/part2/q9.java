package assignment_02.part2;

import java.util.Scanner;

public class q9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("-----  Employee Attendance Summary  -----");
        System.out.print("How many employees do you want to track? ");
        int numEmployees = sc.nextInt();
        //sc.nextLine();
        char[][] attendance = new char[numEmployees][7];
        String[] days = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};

        for (int emp = 0; emp < numEmployees; emp++) {
            System.out.println("\n---- Employee " + (emp + 1) + " ----");
            for (int i = 0; i < 7; i++) {
                System.out.print("Enter attendance for " + days[i] + " (P/A/L): ");
                char status = sc.next().toUpperCase().charAt(0);
                while (status != 'P' && status != 'A' && status != 'L') {
                    System.out.print("Invalid input! Please enter P, A, or L: ");
                    status = sc.next().toUpperCase().charAt(0);
                }

                attendance[emp][i] = status;
            }
        }
        System.out.println("\n---- Attendence Analysis ----");

        int employeeNumber = 1;

        for (char[] employeeWeek : attendance) {
            int presentCount = 0;
            int absentCount = 0;
            int leaveCount = 0;

            for (char dayStatus : employeeWeek) {
                switch (dayStatus) {
                    case 'P':
                        presentCount++;
                        break;
                    case 'A':
                        absentCount++;
                        break;
                    case 'L':
                        leaveCount++;
                        break;
                }
            }
            System.out.printf("Employee %d → P: %d, A: %d, L: %d%n", employeeNumber, presentCount, absentCount, leaveCount);
            employeeNumber++;
        }
    }
}