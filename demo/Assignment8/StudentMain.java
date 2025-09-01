package com.demo.Assignment8;

import java.security.spec.RSAOtherPrimeInfo;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class StudentMain {
    public static void main(String[] args) {

        List<Student> studentsList = new ArrayList<>();
    //adding new elements
        studentsList.add(new Student(1,"akash",520.0));
        studentsList.add(new Student(22,"Dinesh",320.0));
        studentsList.add(new Student(3,"Mohan",620.0));
        studentsList.add(new Student(4,"Ram",400.0));
        studentsList.add(new Student(5,"Srikrishna",510.0));

        Student updateList = new Student(22,"ravikumar",360.0);
      //update
        studentsList.set(2,updateList);
        System.out.println(studentsList);

        //searching & Deletion

        if(studentsList.contains(updateList)){ //contains used to compare in collection level
            Integer index = studentsList.indexOf(updateList);
            System.out.println(index);
            studentsList.remove(index);

        }

//        System.out.println(studentsList.indexOf(updateList));
//        //sorting
       studentsList.sort(new ComparatorByRollNo());
       System.out.println(studentsList);
       studentsList.sort(new ComparatorByName());
       System.out.println(studentsList);

    }
}
