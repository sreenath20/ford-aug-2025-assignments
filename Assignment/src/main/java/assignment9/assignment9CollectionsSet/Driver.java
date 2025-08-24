package assignment9.assignment9CollectionsSet;

import java.util.*;

public class Driver {
    public static void main(String[] args) {
        Set<EmployeeDirectory> employeeSet = new HashSet<>();

//Create
        employeeSet.add(new EmployeeDirectory(1, "Antonio", "Sales"));
        employeeSet.add(new EmployeeDirectory(5, "Raj", "Design"));
        employeeSet.add(new EmployeeDirectory(8, "Zara", "HR"));
        employeeSet.add(new EmployeeDirectory(2, "Preetha", "Finance"));
        employeeSet.add(new EmployeeDirectory(10, "Kapoor", "Security"));
        employeeSet.add(new EmployeeDirectory(8, "Zara", "HR"));

        System.out.println("Employee Directory list is : " + employeeSet);


//Read
        for (EmployeeDirectory employee : employeeSet) {
            System.out.println(employee);
        }
//Update (Removing and adding a new entry)

//        employees.remove(new EmployeeDirectory(5,"Raj","Design"));
//        System.out.println("Employee Directory list after removing Raj : " +employees);
//        employees.add(new EmployeeDirectory(15,"Zenith","Design"));
//        System.out.println("Employee Directory list after adding new entry : " +employees);

// Delete
// Remove an employee by ID
        employeeSet.remove(new EmployeeDirectory(15, "Zenith", "Design"));
        System.out.println("Employee list after removing Zenith : " + employeeSet);
//      employees.removeAll(employees);
//      System.out.println("Employee list after removing all employees : " +employees);

//Update an employee's department

        for (EmployeeDirectory employee : employeeSet) {
            if (employee.getId().equals(8)) {
                employee.setDepartment("Finance"); // 10% increase
                break;
            }
        }

        System.out.println("Employee list after update : " + employeeSet);

//Searching - Finding an employee by id
        for (EmployeeDirectory employee : employeeSet) {
            if (employee.getId().equals(10)) {
                System.out.println("Found the employee with requested ID : " + employee);
            }
            else {
                System.out.println("Employee not found");
            }
        }

// Find all employees in given department
        for (EmployeeDirectory employee : employeeSet) {
            if (employee.getDepartment().equals("Finance")) {
                System.out.println("The employees with requested department : " + employee);
            }
        }

//Sorting
//
//        Collections.sort(employeelist, new EmployeeDepartmentComparator());
//        System.out.println("Employee List" +employeelist);

        List<EmployeeDirectory> employeeList = new ArrayList<>(employeeSet);
        System.out.println("Employee list before sorting : " + employeeList);

        Collections.sort(employeeList,new EmployeeIdComparator());
        System.out.println("Employee list sorted using ID" + employeeList);

        Collections.sort(employeeList,new EmployeeNameComparator());
        System.out.println("Employee list sorted using Name" + employeeList);

       Collections.sort(employeeList,new EmployeeDepartmentComparator());
        System.out.println("Employee list sorted using Department" + employeeList);

    }
}
