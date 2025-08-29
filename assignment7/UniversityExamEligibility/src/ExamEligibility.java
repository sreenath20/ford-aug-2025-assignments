public class ExamEligibility {
    public void checkEligibility(String studentName,double attendancePercentage) throws LowAttendanceException {
        if(attendancePercentage < 75)
        {
            throw new LowAttendanceException("Attendance below 75%,Not eligible for Exam");
        }
        else{
            System.out.println("Eligible for Exam");
        }


    }
}
