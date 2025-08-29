import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class EmployeeDirectory {

    private Set<Employee> employees = new HashSet<Employee>();


    public Set<Employee> getEmployees() {
        return employees;
    }

    //CRUD OperTIONS

    //1.Adding employees to Hashset
    public void addEmployee(Employee employee) {
        // no need to take care of duplicates
        // because sets won't allow duplicates implicitly
        if(employees.contains(employee)) {
            System.out.println("Employee already exists");
            return;
        }
        System.out.println("Employee " + employee.getName() + " has been added.");
        employees.add(employee);
    }

    //2.removing employee based on id
    public boolean removeEmployee(int id) {
        // removeIf(....) method is used to remove employees with the given condition met
        // this method return true if the object is removed
        // else returns false
        //emp -> emp.getId()==id is a lambda expression acts as filter based on condition

        return employees.removeIf(employee -> employee.getId() == id);
    }

    //3. updating department based on id
    public void updateDepartment(int id, String newDepartment) {
        boolean updated = false;
        for (Employee employee : employees) {
            if (employee.getId() == id) {
                employee.setDepartment(newDepartment);
                updated = true;
                System.out.println("Updated Department for employee id "+id+" to " + newDepartment);
            }
        }
        if (!updated) {
            System.out.println("updation failed employee id "+ id+ "not found");
        }
    }

    //4.viewing all the empoloyees
    public void viewAllEmployees() {
        for (Employee employee : employees) {
            System.out.println(employee);
        }
    }

    // Searching Operations

    //    1.finding an employee with is id
    public void searchEmployeeById(int id) {
        for (Employee employee : employees) {
            if (employee.getId() == id) {
                System.out.println("employee with id " + employee.getId() + " is found");

                return;
            }
        }
        System.out.println("employee with id" + id + " not found");
    }

    // 2. Finding all employees based on their department
    public void findAllEmployees(String department) {
        boolean found = false;
        for (Employee employee : employees) {
            if (Objects.equals(employee.getDepartment(), department)) {
                System.out.println("employees found: "+ employee.getName());

                found = true;
            }
        }
        if (!found) {
            System.out.println("employees with department" + department + " not found!");
        }
    }




}
