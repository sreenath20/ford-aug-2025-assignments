package Assignment7.UniversityExamEligibility;

public class ExamEligibility {
    public void checkEligibility(String studentName, double attendancePercent) throws LowAttendanceException {
        if (attendancePercent < 75) {
            throw new LowAttendanceException("Attendance below 75%. Not eligible for exam.");
        }
        System.out.println("Checking eligibility for " + studentName + " (Attendance: " + attendancePercent + "%)... Eligible for exam.");
    }
}
