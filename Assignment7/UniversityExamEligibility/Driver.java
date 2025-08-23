package Assignment7.UniversityExamEligibility;

public class Driver {
    public static void main(String[] args) {
        ExamEligibility eligibility = new ExamEligibility();

        try {
            eligibility.checkEligibility("Ram", 90);
            eligibility.checkEligibility("Sam", 60);
        } catch (LowAttendanceException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
