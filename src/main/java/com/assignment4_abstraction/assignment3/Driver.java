package com.assignment4_abstraction.assignment3;

public class Driver {
   public static void main(String[] args) {
        ProgrammingCourse programmingCourse = new ProgrammingCourse("aaa", "Java ", 30);
        programmingCourse.enrollStudent("aaa");
        programmingCourse.startCourse();
        programmingCourse.generateCertificate("aaa");

        DesignCourse designCourse = new DesignCourse("bbb", "Graphic", 45);
        designCourse.enrollStudent("bbb");
        designCourse.startCourse();
        designCourse.generateCertificate("bbb");
    }
}
