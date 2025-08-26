package assignment_07.university_exam_eligibility;

class ExamEligibility {
    private static final double MinAttendance = 75.0;
    public void checkEligibility(String studentName, double attendancePercent) throws LowAttendanceException {
        if (attendancePercent < 0 || attendancePercent > 100) {
            throw new LowAttendanceException("Invalid attendance percentage. Must be between 0 and 100. Entered: " + attendancePercent + "%");
        }
        if (attendancePercent < MinAttendance) {
            throw new LowAttendanceException("Attendance below " + MinAttendance + "%. Not eligible for exam. Current attendance: " + attendancePercent + "%");
        }
    }

    public double getMinimumAttendance() {
        return MinAttendance;
    }
}
