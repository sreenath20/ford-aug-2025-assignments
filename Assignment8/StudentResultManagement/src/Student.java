import java.util.Objects;

public class Student implements Comparable<Student>{
    private Integer rollNo;
    private String name;
    private Double marks;

    public Student() {
    }

    public Student(Integer rollNo, String name, Double marks) {
        this.rollNo = rollNo;
        this.name = name;
        this.marks = marks;
    }



    public Integer getRollNo() {
        return rollNo;
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getMarks() {
        return marks;
    }

    public void setMarks(Double marks) {
        this.marks = marks;
    }

    @Override
    public String toString() {
        return "Student{" +
                "rollNo=" + rollNo +
                ", name='" + name + '\'' +
                ", marks=" + marks +
                '}';
    }

    @Override
    public int compareTo(Student o) {
        return Double.compare(o.marks, this.marks);// this will do descending order comparision

    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return Objects.equals(rollNo, student.rollNo);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(rollNo);
    }
}
