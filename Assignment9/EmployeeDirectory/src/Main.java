import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

    EmployeeDirectory directory = new EmployeeDirectory();
//    adding employees to employees set
        directory.addEmployee(new Employee(101, "Alice", "HR"));
        directory.addEmployee(new Employee(101, "Bob", "IT"));
        directory.addEmployee(new Employee(103, "Charlie", "Finance"));
        directory.addEmployee(new Employee(104, "David", "IT"));
        directory.addEmployee(new Employee(105, "Eve", "HR"));

        System.out.println();
//        printing all the employees
        System.out.println("Printing all employee details");
        directory.viewAllEmployees();

        System.out.println();

//       removing employees by id
        System.out.println("removing employee:");
        if(directory.removeEmployee(101))
        {
            System.out.println("Removed employee with id :"+101);
        }
        else {
           System.out.println("employee id not found");
        }


        System.out.println();


//        updating employees department
        directory.updateDepartment(104,"Finance");
        System.out.println();

//        viewing all employees
        System.out.println("Printing all employee details");
        directory.viewAllEmployees();
        System.out.println();

// searching
        System.out.println("searching for employee with id "+103);
        directory.searchEmployeeById(103);
        System.out.println();

//        searching all the employees who are in the same department
        System.out.println("searching for employees with department finance:");
        directory.findAllEmployees("Finance");
        System.out.println();

// Sorting
        System.out.println("Employees sorted by their names");
        List<Employee> employeeList = new ArrayList<>(directory.getEmployees());
        Collections.sort(employeeList, new NameComparator());
        for(Employee e: employeeList){
            System.out.println(e);

        }
        System.out.println();

        System.out.println("Employees sorted by department then by id");
        Collections.sort(employeeList,new DepartmentAndIdComparator());
        for(Employee e: employeeList){
            System.out.println(e);
        }




    }
}