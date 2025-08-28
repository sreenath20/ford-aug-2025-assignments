package com.assignment.day4.assignment4;

class Person{
    private String name;
    private String email;
    private int age;


    public Person() {
    }

    public Person(String name, String email, int age) {
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

    public void setEmail(String email) {
        this.email = email;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}

class Student extends Person{
    private int studentId;
    private String courseList;

    public Student() {
    }

    public Student(String name, String email, int age, int studentId, String courseList) {
        super(name, email, age);
        this.studentId = studentId;
        this.courseList = courseList;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public String getCourseList() {
        return courseList;
    }

    public void setCourseList(String courseList) {
        this.courseList = courseList;
    }
}

class Professor extends Person{
    private int employeeId;
    private String subjectTaught;

    public Professor() {
    }

    public Professor(String name, String email, int age, int employeeId, String subjectTaught) {
        super(name, email, age);
        this.employeeId = employeeId;
        this.subjectTaught = subjectTaught;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public String getSubjectTaught() {
        return subjectTaught;
    }

    public void setSubjectTaught(String subjectTaught) {
        this.subjectTaught = subjectTaught;
    }
}

class Course {
    private String courseName;
    private String courseCode;
    private int credits;
    Student student;
    Professor professor;

    public Course() {
    }

    public Course(String courseName, String courseCode, int credits, Student student, Professor professor) {
        this.courseName = courseName;
        this.courseCode = courseCode;
        this.credits = credits;
        this.student = student;
        this.professor = professor;
    }

    public String getCourseName() {
        return courseName;
    }
    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }
    public String getCourseCode() {
        return courseCode;
    }
    public void setCourseCode(String courseCode) {
        this.courseCode = courseCode;
    }

    public int getCredits() {
        return credits;
    }

    public void setCredits(int credits) {
        this.credits = credits;
    }
}

public class Day4Assignment4 {
    public static void main(String[] args) {
        Student student = new Student("Deepak","abc@gmail",20,1,"Python");
        Professor professor = new Professor("Dr. Smith","prof@gmail",45,101,"Data Science");
        Course course = new Course("Data Science","DS101",3,student,professor);
        System.out.println("Student Name: " + student.getName());
        System.out.println("Professor Name: " + professor.getName());
        System.out.println("Course Name: " + course.getCourseName());
        System.out.println("Course Code: " + course.getCourseCode());
        System.out.println("Credits: " + course.getCredits());
        System.out.println("Student Details: " + student.getName() + ", " + student.getEmail() + ", " + student.getAge() + ", " + student.getStudentId() + ", " + student.getCourseList());
        System.out.println("Professor Details: " + professor.getName() + ", " + professor.getEmail() + ", " + professor.getAge() + ", " + professor.getEmployeeId() + ", " + professor.getSubjectTaught());



    }
}
