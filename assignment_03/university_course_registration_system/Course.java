package assignment_03.university_course_registration_system;

public class Course {
    private String courseName;
    private String courseCode;
    private Professor professor;
    private Student[] registeredStudents;
    private int studentCount;

    public Course(String courseName, String courseCode, Professor professor) {
        this.courseName = courseName;
        this.courseCode = courseCode;
        this.professor = professor;
        this.registeredStudents = new Student[25];
        this.studentCount = 0;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public int getStudentCount() {
        return studentCount;
    }

    public void setStudentCount(int studentCount) {
        this.studentCount = studentCount;
    }

    public String getCourseCode() {
        return courseCode;
    }

    public void setCourseCode(String courseCode) {
        this.courseCode = courseCode;
    }

    public Professor getProfessor() {
        return professor;
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }

    public Student[] getRegisteredStudents() {
        return registeredStudents;
    }

    public void setRegisteredStudents(Student[] registeredStudents) {
        this.registeredStudents = registeredStudents;
    }

    private boolean isStudentRegistered(Student student) {
        for (int i = 0; i < studentCount; i++) {
            if (registeredStudents[i].getStudentID().equals(student.getStudentID())) {
                return true;
            }
        }
        return false;
    }

    public void registerStudent(Student student) {
        if (studentCount<25){
            if(!isStudentRegistered(student)){
                registeredStudents[studentCount] = student;
                studentCount++;
                student.registerForCourse(courseName);
                System.out.println(student.getName()+" successfully registered for course - " + courseName );
            }
            else{
                System.out.println("Student " + student.getName() +" is already registered for course - " + courseName);
            }
        }
        else{
            System.out.println("Sorry, current batch for the course if full!");
        }
    }

    public void displayCourseInfo(){
        System.out.println("Course Name: " + courseName);
        System.out.println("Course Code: " + courseCode);
        System.out.println("Professor Name: " + professor.getName());
        System.out.println("Students Enrolled: "+ studentCount);
        System.out.println();
    }
}

