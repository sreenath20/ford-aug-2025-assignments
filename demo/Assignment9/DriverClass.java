package com.demo.Assignment9;

import java.util.*;

public class DriverClass {
    public static void main(String[] args) {
        Map<Student, Set<Course>> StudentDetails = new HashMap<>();
        Course c1= new Course("math",101);
        Course c2= new Course("Englis",102);
        Course c3= new Course("Science",103);
        Set<Course> courseForAbi= new HashSet<>();
        courseForAbi.add(c1);
        courseForAbi.add(c2);
        courseForAbi.add(c3);

        Set<Course> courseForKishore= new HashSet<>();
        courseForKishore.add(c1);
        courseForKishore.add(c2);
        courseForKishore.add(c3);


       StudentDetails.put(new Student(101,"Abinash"),courseForAbi);
       StudentDetails.put(new Student(102,"kishore"),courseForKishore);

        //Crud operation

        Course c4= new Course("math",104);
        courseForAbi.add(c4);
        courseForKishore.add(c4);
        StudentDetails.replace(new Student(104,"Abinash"),courseForAbi);
        StudentDetails.replace(new Student(103,"kishore"),courseForKishore);

        //


    }
}
