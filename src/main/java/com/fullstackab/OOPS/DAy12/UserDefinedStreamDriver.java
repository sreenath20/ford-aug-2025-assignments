package com.fullstackab.OOPS.DAy12;

import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class UserDefinedStreamDriver {
    public static void main(String[] args) {

        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee(1, "Emp1", "IT", 150000.00, 5));
        employees.add(new Employee(2, "Emp2", "HR", 20000.00, 2));
        employees.add(new Employee(3, "Emp3", "IT", 70000.00, 20));
        employees.add(new Employee(4, "Emp4", "ADMIN", 100000.00, 10));
        employees.add(new Employee(5, "Emp5", "IT", 30000.00, 1));

        //1.	Filter Employees by Department
        employees.stream()
                .filter((e) -> e.getDepartment().equals("IT"))
                .forEach(e -> System.out.println("Employees in IT dept : " + e));

        //2.	Find High Earners
        employees.stream().filter(e -> e.getSalary() > 50000)
                .forEach(e -> System.out.println("Employees earning High : " + e));

        //3.	Sort Employees by Salary
        Comparator<Employee> compareBySalary = new Comparator<Employee>() {
            @Override
            public int compare(Employee o1, Employee o2) {
                return o2.getSalary().compareTo(o1.getSalary());
            }
        };

        List<Employee> employeeList = employees.stream()
                .sorted(compareBySalary)
                .toList();
        System.out.println("Original list of Employees :" + employees);
        System.out.println("Sorted Employees by Salary Descending Order :" + employeeList);

        // 4.	Find Employee Names Only
        List<String> empNameList = employees
                .stream()
                .map(e -> e.getName())
                .toList();
        System.out.println("Names of Employees :" + empNameList);


        //5.	Find the Highest Paid Employee
        Optional<Employee> maxSalaryEmployee = employees
                .stream()
                .max(Comparator.comparingDouble(Employee::getSalary));

        System.out.println("Max Salary Employee :" + maxSalaryEmployee.get());

        //6.	Average Salary in Each Department
        Map<String, Double> groupByDept = employees
                .stream()
                .collect(Collectors.groupingBy(Employee::getDepartment, Collectors.averagingDouble(Employee::getSalary)));

        System.out.println("Department and Average Salary of each Dept :" + groupByDept);


        //7.	Check if Any Employee Has More Than 10 Years of Experience
        Predicate<Employee> tenYrExp = (e -> e.getExpInYears() > 10);
        for (Employee e : employees) {
            if (tenYrExp.test(e)) {
                System.out.println("Emp is more than 10 year exp is:" + e.getName());
            }
        }

        //8.	Count Employees in HR Department
        Long hrCount = employees.stream()
                .filter(e ->e.getDepartment().equals("HR")).count();
        System.out.println("HR count :" + hrCount);
    }
}
