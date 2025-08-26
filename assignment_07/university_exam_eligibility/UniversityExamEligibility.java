package assignment_07.university_exam_eligibility;

import java.util.Scanner;

public class UniversityExamEligibility {
    public static void main(String[] args) {
        System.out.println("University Exam Eligibility System\n");

        ExamEligibility eligibilityChecker = new ExamEligibility();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Minimum attendance required: " + eligibilityChecker.getMinimumAttendance() + "%\n");

        while (true) {
            try {
                System.out.print("Enter student name (or 'exit' to quit): ");
                String studentName = scanner.nextLine();

                if (studentName.equalsIgnoreCase("exit")) {
                    System.out.println("Exiting eligibility system...");
                    break;
                }

                if (studentName.isEmpty()) {
                    System.out.println("Student name cannot be empty.");
                    continue;
                }

                System.out.print("Enter attendance percentage (0-100): ");
                double attendance = scanner.nextDouble();
                scanner.nextLine();

                System.out.println("Checking eligibility for " + studentName + " (Attendance: " + attendance + "%)...");
                eligibilityChecker.checkEligibility(studentName, attendance);

            } catch (LowAttendanceException e) {
                System.out.println("Error: " + e.getMessage());

            } catch (NumberFormatException e) {
                System.out.println("Error: Please enter a valid number for attendance.");

            } catch (Exception e) {
                System.out.println("Unexpected error: " + e.getMessage());
            }

            System.out.println();
        }
    }
}
