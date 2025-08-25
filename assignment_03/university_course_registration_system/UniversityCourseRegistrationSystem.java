package assignment_03.university_course_registration_system;

public class UniversityCourseRegistrationSystem {
    public static void main(String[] args) {
        System.out.println("\nUniversity Course Registration System\n");

        Professor p1= new Professor("Dr. Geetha", "geetha@rmd.ac.in", 38,"grmd08","Database Management System");
        Professor p2=new Professor("Dr. Vedaraj", "raj@rmd.ac.in", 40, "vjrmd102", "Design Architecture");

        Course dbCourse = new Course("Mongo DB", "DB111", p1);
        Course designCourse = new Course("Engineering Graphics", "RA105", p2);
        System.out.println("--- Course Information ---");
        dbCourse.displayCourseInfo();
        designCourse.displayCourseInfo();

        System.out.println("--- Professor Information ---");
        p1.displayProfessorInfo();
        p2.displayProfessorInfo();

        Student s1= new Student("Rekha", "rekha@gmail.com",18,"rk6537");
        Student s2= new Student("Joe", "joe05@gmail.com", 20,"je6431");
        Student s3= new Student("Aarthi","aarthishiva@gmail.com",26,"ah6235");

        System.out.println("--- Student Registration ---");
        dbCourse.registerStudent(s1);
        designCourse.registerStudent(s1);
        designCourse.registerStudent(s2);
        dbCourse.registerStudent(s3);
        designCourse.registerStudent(s3);
        System.out.println();

        System.out.println("--- Student Information ---");
        s1.displayStudentInfo();
        s2.displayStudentInfo();
        s3.displayStudentInfo();

        System.out.println("Course Name: "+ dbCourse.getCourseName());
        System.out.println("Student count: "+ dbCourse.getStudentCount());
        System.out.println();
        System.out.println("Course Name: "+ designCourse.getCourseName());
        System.out.println("Student count: "+ designCourse.getStudentCount());
    }
}
