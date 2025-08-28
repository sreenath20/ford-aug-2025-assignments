package day7.Assignment5;

public class ExamEligibility {
    public void checkEligibility(String StudentName, double attendancePercentage) throws LowAttendanceException {
        if(attendancePercentage<75){
            throw new LowAttendanceException("Attendance below 75%. Not eligible");
        }
        else{
            System.out.println("Eligible for exam");
        }
    }
}
