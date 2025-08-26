package assignment_07.university_exam_eligibility;

class LowAttendanceException extends Exception {
    public LowAttendanceException(String message) {
        super(message);
    }
    public LowAttendanceException() {
        super("Attendance below required minimum");
    }
}

