package day8.Assignment1;

import java.util.ArrayList;
import java.util.List;

public class Driver {
    public static void main(String[] args) {
        List<Employee> employeeList = new ArrayList<>();
        Employee employee1 = new Employee("ABC",33,50000.0);
        Employee employee2 = new Employee("DEF",22,60000.0);
        Employee employee3 = new Employee("MNO",11,70000.0);
        Employee employee4 = new Employee("XYZ",44,55000.0);
        employeeList.add(employee1);
        employeeList.add(employee2);
        employeeList.add(employee3);
        employeeList.add(employee4);
        System.out.println(employeeList);
        Employee updateEmployee = new Employee("GHI",91,80000.0);
        employeeList.set(3,updateEmployee);
        System.out.println(employeeList);
        employeeList.remove(updateEmployee);
        System.out.println(employeeList);
        Employee searchEmployee = new Employee("UYT",33,50000.0);
        System.out.println(employeeList.indexOf(searchEmployee));
        System.out.println(employeeList);

    }
}
