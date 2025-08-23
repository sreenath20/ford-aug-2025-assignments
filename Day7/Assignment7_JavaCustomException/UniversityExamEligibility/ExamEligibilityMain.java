package UniversityExamEligibility;

public class ExamEligibilityMain {
    public static void main(String[] args) {
        ExamEligibility eligibility = new ExamEligibility();

        try {
            eligibility.checkEligibility("Alice", 80.0);
        } catch (LowAttendanceException e) {
            System.out.println("Error: " + e.getMessage());
        }

        try {
            eligibility.checkEligibility("Bob", 65.0);
        } catch (LowAttendanceException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}