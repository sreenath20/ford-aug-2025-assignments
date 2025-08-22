package javatopic.day8_custom_exception.assignment.assignment5_university_exam_eligiblity;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String studentName;
        double attendancePercent;
        boolean eligiblityStatus=false;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your name:");
        studentName=sc.nextLine();
        System.out.println("Enter your attendance percent:");
        attendancePercent=sc.nextDouble();

        ExamEligibility examEligibility=new ExamEligibility();
        try{
            eligiblityStatus=examEligibility.checkEligibility(studentName,attendancePercent);
        }
        catch(LowAttendenceException e){

        }

        if(eligiblityStatus){
            System.out.println("Checking eligibility for "+studentName+" (Attendance: " +attendancePercent+")"+" Eligible for exam");
        }
        else{
            System.out.println("Checking eligibility for "+studentName+" (Attendance: " +attendancePercent+")"+" Error:attendence below 75% .Mot eligible");
        }

    }
}
