package UniversityExamEligibility;

public class ExamEligibility {
    public void checkEligibility(String studentName, double attendancePercent) throws LowAttendanceException {
        System.out.println("Checking eligibility for " + studentName + " (Attendance: " + attendancePercent + "%)...");
        if (attendancePercent < 75.0) {
            throw new LowAttendanceException("Attendance below 75%. Not eligible for exam.");
        }
        System.out.println("Eligible for exam.");
    }
}
