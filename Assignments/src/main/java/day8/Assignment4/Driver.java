package day8.Assignment4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Driver {


    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        Student student1 = new Student(5015,"ABC",97.5);
        Student student2 = new Student(5028,"DEF",98.8);
        Student student3 = new Student(5007,"GHI",99.0);
        Student student4 = new Student(5042,"JKL",99.9);
        Student student5 = new Student(5042,"MNO",90.8);
        students.add(student1);
        students.add(student2);
        students.add(student3);
        students.add(student4);
        students.add(student5);
        System.out.println("Before sorting: "+students);
        Collections.sort(students,Collections.reverseOrder());
        System.out.println("After reverse sorting by marks: "+students);
        students.sort(new NameComparator());
        System.out.println("After sorting by name: "+students);
        students.sort(new RollnoComparator());
        System.out.println("After sorting by rollno: "+students);
        delete(students,5042);
        System.out.println("After deleting: "+students);
        update(students,5015,98.5);
        System.out.println("After updating: "+students);
        System.out.println(search(students,5042));


    }
    public static void delete(List<Student> students,int rollNo){
        students.removeIf(student -> student.rollNo==rollNo);
    }
    public static void update(List<Student> students,int rollNo,double newMarks){
        for(Student student : students){
            if(student.rollNo==rollNo){
                student.marks = newMarks;
            }
        }
    }
    public static boolean search(List<Student> students,int rollNo){
        for(Student student : students){
            if(student.rollNo==rollNo){
                return true;
            }
        }
        return false;
    }
}
