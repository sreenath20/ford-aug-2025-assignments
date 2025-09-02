package assignment_08.student_result_management;

public class Student implements Comparable<Student> {
    int rollNo;
    String name;
    double marks;

    public Student(int rollNo, String name, double marks) {
        this.rollNo = rollNo;
        this.name = name;
        this.marks = marks;
    }

    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;
        if (getClass() != obj.getClass()) return false;
        Student other = (Student) obj;
        return rollNo == other.rollNo;
    }

    public int compareTo(Student other) {
        return Double.compare(other.marks, this.marks);
    }

    public void displayStudent() {
        System.out.println("Roll: " + rollNo + ", Name: " + name + ", Marks: " + marks);
    }
}
