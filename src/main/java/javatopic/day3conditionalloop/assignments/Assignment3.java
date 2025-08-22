package javatopic.day3conditionalloop.assignments;
// display employee name using for each loop

public class Assignment3 {
    public static void main(String[] args) {
        String employeesNames[]=new String[5];
        employeesNames[0]="aab";
        employeesNames[1]="abc";
        employeesNames[2]="abd";
        employeesNames[3]="acd";
        employeesNames[4]="ace";
        for(String employeename : employeesNames){
            System.out.println("Employee Name is "+employeename);


        }
    }
}
