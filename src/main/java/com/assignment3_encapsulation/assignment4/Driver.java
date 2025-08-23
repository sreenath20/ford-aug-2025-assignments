package com.assignment3_encapsulation.assignment4;

public class Driver {
public static void main(String[] args) {
    // Create a Student object
    Person person=new Person("bbb", "bbb@gmail.com", 20);
    System.out.println(person);
    Student student = new Student("aaa", "aaa@gmail.com", 18,2001,   "Computer Architecture ");
    System.out.println(student);
    Professor professor = new Professor(1001, "ccc", "ccc@gmail.com",40,"computer Architecture , os ");
    System.out.println(professor);
}

}
