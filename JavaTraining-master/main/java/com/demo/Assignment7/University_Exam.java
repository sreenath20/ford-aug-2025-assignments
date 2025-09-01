package com.demo.Assignment7;

public class University_Exam {
        public static void main(String[] args) throws Exception{
            ExamEligibility examEligibility=new ExamEligibility();
            try{
                examEligibility.checkEligibility("Alice",70);
            }catch(Exception e){
                System.out.println(e.getMessage());

            }
        }
}
class LowAttendanceException extends Exception{
    public LowAttendanceException(String message){
        super(message);
    }
}
class ExamEligibility{
    void checkEligibility(String studentName,double attendancePercent) throws LowAttendanceException{
        System.out.println("Checking eligiblity for "+studentName+"\n(Attendance Percentage: "+attendancePercent+")");
        if(attendancePercent<75){
            throw new LowAttendanceException("Attendance below 75%. Not eligible");
        }
        else{
            System.out.println("Eligible for exam");
        }

    }
}
