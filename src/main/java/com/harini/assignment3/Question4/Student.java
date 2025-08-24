package com.harini.assignment3.Question4;

public class Student  extends Person{
    String studentId;
    Course[] couseList;
    int courseCount;
    public Student(String name, String email, int age,int maxCount ) {
        super(name, email, age);
        this.courseCount=0;
        this.couseList =new Course[maxCount];
    }
    public void registerCourse(Course course){
        if(courseCount<couseList.length){
            couseList[courseCount] = course;
            courseCount++;
        }
        else{
            System.out.println("Maximum number of courses exceeded.");
        }
    }
    public void displayCourses(){
        for(int i=0;i<courseCount;i++){
            System.out.println(couseList[i].courseName+" "+couseList[i].courseCode);
        }
    }

}
