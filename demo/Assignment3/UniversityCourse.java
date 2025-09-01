package com.demo.Assignment3;
//--------------------Assignment 4---------------------
public class UniversityCourse {
    private String name;
    private String email;
    private int age;
    UniversityCourse(String name, String email, int age) {
        this.name = name;
        this.email = email;
        this.age = age;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getEmail() {
        return email;
    }
    public int getAge() {
        return age;
    }
    public static void main(String[] args){
        Student s1= new Student("AK","ak@gmail.com",21,"ECE",203);
        Professor p1= new Professor("JK","jk@gmail.com",45,405,"ECE");
        s1.display();
        p1.display();
    }

}
class Student extends UniversityCourse {
    private int studentId;
    private String courseList;
    Student(String name, String email, int age, String courseList, int studentId) {
        super(name,email,age);
        this.studentId = studentId;
        this.courseList = courseList;
    }
    void display(){
        System.out.println("Name: "+getName()+"Email: "+getEmail()+"Age: "+getAge()+"CourseList: "+courseList+"StudentId: "+studentId);
    }
}
class Professor extends UniversityCourse {
    private int profId;
    private String courseList;
    Professor(String name, String email, int age, int profId, String courseList) {
        super(name,email,age);
        this.profId = profId;
        this.courseList = courseList;
    }
    void display(){
        System.out.println("Name: "+getName()+"Email: "+getEmail()+"ProfId: "+profId+"CourseList: "+courseList);
    }
}
