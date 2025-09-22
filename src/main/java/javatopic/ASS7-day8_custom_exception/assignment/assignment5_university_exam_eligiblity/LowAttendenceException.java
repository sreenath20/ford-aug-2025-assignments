package javatopic.day8_custom_exception.assignment.assignment5_university_exam_eligiblity;

public class LowAttendenceException extends Exception{
    public LowAttendenceException() {

    }
    public LowAttendenceException(String message) {
        super(message);
    }

}
