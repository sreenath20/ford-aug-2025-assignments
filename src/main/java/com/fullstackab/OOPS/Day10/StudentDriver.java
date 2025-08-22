package com.fullstackab.OOPS.Day10;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class StudentDriver {
    public static void main(String[] args) {

        Set<Student> students = new HashSet<>();
        students.add (new Student(106 ,"John"));
        students.add (new Student(104,"Zara"));
        students.add(new  Student(112,"Priya"));
        students.add(new  Student(111,"RAj"));
        students.add(new  Student(101,"Priya"));
        students.add(new  Student(103,"AMit"));
        students.add(new  Student(101,"Priya"));
        System.out.println("     HashSet Display      ");
        System.out.println(students);

        System.out.println("    LinkedHashSet Display    ");
        Set<Student> studentLinked = new LinkedHashSet<>();
        studentLinked.add (new Student(106 ,"John"));
        studentLinked.add (new Student(104,"Zara"));
        studentLinked.add(new  Student(102,"Priya"));
        studentLinked.add(new  Student(105,"RAj"));
        studentLinked.add(new  Student(101,"Priya"));
        studentLinked.add(new  Student(103,"AMit"));
        studentLinked.add(new  Student(101,"Priya"));
        System.out.println(studentLinked);

        System.out.println("     TreeSet Display    ");
        Set<Student> studentTree = new TreeSet<>(studentLinked);
//        studentTree.add (new Student(106 ,"John"));
//        studentTree.add (new Student(104,"Zara"));
//        studentTree.add(new  Student(102,"Priya"));
//        studentTree.add(new  Student(105,"RAj"));
//        studentTree.add(new  Student(101,"Priya"));
//        studentTree.add(new  Student(103,"AMit"));
//        studentTree.add(new  Student(101,"Priya"));
        System.out.println(studentTree);

        System.out.println("Does HashSet Contains Amit ?: " +students.contains(new Student(103,"Amit")));
        System.out.println("Does LinkedHashset contains Amit ? : " +studentLinked.contains(new Student(103,"Amit")));
        System.out.println("Does Treeset contains Amit ? : " +studentTree.contains(new Student(103,"Amit")));

    }
}
