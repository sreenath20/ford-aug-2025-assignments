package javatopic.day10_collections_set.assignments.assignment3;

import java.util.*;

public class Driver {
    public static void main(String[] args) {
        Set<Course> programmingCourse1 =new HashSet<Course>();
        Set<Course> programmingCourse2 =new HashSet<Course>();

        Set<Course> developmentCourse1=new HashSet<>();
        Set<Course> developmentCourse2 =new HashSet<>();
        Set<Course> designCourse =new HashSet<>();

        //CRUD

        //CREATE


        programmingCourse1.add( new Course(1,"Java"));
        programmingCourse2.add( new Course(2,"Cpp"));
        developmentCourse1.add( new Course(3,"FullStackPython"));
        developmentCourse2.add( new Course(4,"FullStackJava"));
        designCourse.add( new Course(5,"UI/UX"));


         Map<Student, Set<Course>>  studentEnrollments=new HashMap<Student, Set<Course>>();

       // studentEnrollments.put(new Student(201, "William",programmingCourse1);
        Student student1=new Student(1,"John");
        studentEnrollments.put(student1,developmentCourse1);
        studentEnrollments.put(new Student(202,"Anil"), programmingCourse2);
        studentEnrollments.put(new Student(203,"Aany"), developmentCourse1);
        studentEnrollments.put(new Student(204,"Smith"), developmentCourse2);
        studentEnrollments.put(new Student(205,"Zara"), designCourse);
        System.out.println("studentEnrollments:\n"+studentEnrollments);


        //UPDATE ADD OR DROP COURSE
        //DROP COURSE


        //System.out.println(studentEnrollments.replace(new Student(201,"William"), (Set<Course>) new Course(10,"frontEnd"))+"\n");

        //
        System.out.println("UPDATION:\n"+studentEnrollments);

        //REMOVE
        System.out.println("removal of student student ");
        studentEnrollments.remove(student1);
        studentEnrollments.remove(new Student(204, "Smith"),developmentCourse2);



        System.out.println("studentEnrollments:\n"+studentEnrollments);
    }





}
