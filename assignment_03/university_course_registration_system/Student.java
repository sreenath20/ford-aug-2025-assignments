package assignment_03.university_course_registration_system;

class Student extends Person {
    private String studentID;
    private String[] courseList;
    private int courseCount;

    public Student(String name, String email, int age, String studentID) {
        super(name, email, age);
        this.studentID = studentID;
        this.courseList = new String[5];
        this.courseCount = 0;
    }

    public String getStudentID() {
        return studentID;
    }

    public void setStudentID(String studentID) {
        this.studentID = studentID;
    }

    public String[] getCourseList() {
        return courseList;
    }

    public int getCourseCount() {
        return courseCount;
    }

    private boolean isRegisteredForCourse(String courseName) {
        for (int i = 0; i < courseCount; i++) {
            if (courseList[i].equals(courseName)) {
                return true;
            }
        }
        return false;
    }

    public void registerForCourse(String courseName) {
        if(courseCount < 5) {
            if(!isRegisteredForCourse(courseName)) {
                courseList[courseCount] = courseName;
                courseCount++;
                System.out.println(getName() + " has registered for the course - " + courseName);
            }
            else {
                System.out.println(getName() + " had already registered for the course - " + courseName);
            }
        }
        else {
            System.out.println("Sorry, " + getName()+"!. You have already reached the limit of registering 5 courses at maximum." );
        }
    }

    public void displayStudentInfo(){
        displayPersonInfo();
        System.out.println("Student ID: " + studentID);
        System.out.println("Registered Courses: ");
        for (int i = 0; i < courseCount; i++) {
            System.out.println(courseList[i]);
        }
        System.out.println();
    }
}
