package javatopic.day8_custom_exception.assignment.assignment5_university_exam_eligiblity;

public class ExamEligibility {
        boolean checkEligibility(String studentName,double attendencePercent) throws LowAttendenceException {
        if(attendencePercent < 75){
            throw new LowAttendenceException("Low attendence percent is less than 75");

        }
        else{
            return true;
        }


    }
}
