package javatopic.day5abstraction.assignment.assignment3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Course course1=new ProgrammingCourse();
        course1.courseName="java";
        course1.duration=3;
        System.out.println("Enter student name:");
        String studentName=input.nextLine();
        course1.enrollStudent(studentName);
        course1.startCourse();

        System.out.println("Programming Course completed yes/no");
        String courseCompletedStatus=input.nextLine();
        if(courseCompletedStatus.equalsIgnoreCase("yes")){
            CertificateProvider certificateProvider=new ProgrammingCourse();
            certificateProvider.generateCertificate(studentName);
        }
        else{
            System.out.println("course not completed");
        }

        // design course
        Course course2=new DesignCourse();
        course2.courseName="UI/UX";
        course2.duration=2;
        System.out.println("Enter student name:");
        String studentName1=input.nextLine();
        course2.enrollStudent(studentName1);
        course2.startCourse();

        System.out.println("Design Course completed yes/no");
        String courseCompletedStatus1=input.nextLine();
        if(courseCompletedStatus.equalsIgnoreCase("yes")){
            CertificateProvider certificateProvider=new  DesignCourse();
            certificateProvider.generateCertificate(studentName);
        }
        else{
            System.out.println("course not completed");
        }



    }
}
