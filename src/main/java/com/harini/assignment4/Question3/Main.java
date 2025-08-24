package com.harini.assignment4.Question3;

public class Main {
    public static void main(String[] args) {
        ProgrammingCourse pc = new ProgrammingCourse("Java Programming","6 months");
        DesignCourse dc = new DesignCourse("CAD Design","6 months");

        pc.enrollStudent("Harini");
        pc.startCourse();
        pc.generateCertificate("Harini");
        System.out.println();
        dc.enrollStudent("Bindu");
        dc.startCourse();
        dc.generateCertificate("Bindu");
    }
}
