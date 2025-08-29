import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class StudentOperation {

    // crud - operation
    //list of students
    private List<Student> studentsList =new ArrayList<Student>();

    // method to add a student
    public void addStudent(Student student){
            if(!studentsList.contains(student)) {


                studentsList.add(student);
                System.out.println("Student added successfulluy with roll number: " + student.getRollNo());
            }
            else {
                System.out.println("Student already exists with roll number: "+student.getRollNo());
            }

    }

    // list is declared as private, so we are creating getStudentsList() method
//    which return type is list we can use this in future purposes
    public List<Student> getStudentsList() {
        return studentsList;
    }

    //getArrayList() method
    public void getStudentList(){
        System.out.println("\nAll students:");
        for(Student student : studentsList){
            System.out.println(student);
        }
    }
    // method to delete a student
    public void deleteStudent(Integer rollnumber){
        for(int i=0;i<studentsList.size();i++){
            if(studentsList.get(i).getRollNo().equals(rollnumber))
            {

                    studentsList.remove(i);
                    System.out.println("Student deleted successfulluy");
                    return;

                }
            }
        System.out.println("Student not found");

        }



    //method to update marks
    public  void updateStudentMarks(Integer rollnumber,double newMarks){
        for(int i=0;i<studentsList.size();i++){
            if(Objects.equals(studentsList.get(i).getRollNo(), rollnumber))
            {
                studentsList.get(i).setMarks(newMarks);
                System.out.println("Student marks updated successfully");
                return;
            }
        }
    }

    //searching using equals() method Wrapper classes
    public void searchStudentByRollNo(Integer rollnumber) {
        boolean found = false;
        for (int i = 0; i < studentsList.size(); i++) {
            if (studentsList.get(i).getRollNo().equals(rollnumber)) {
                System.out.println("Student match found!");
                System.out.println(studentsList.get(i));
                found = true;
                break;

            }
        }
        if (!found) {
            System.out.println("Student not found");

        }
    }


}

