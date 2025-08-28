package com.assignment.day9.assignment1;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

class Employee extends Object implements Comparable<Employee>{

    private int id;
    private String name;
    private String department;
    private Double salary;

    public Employee() {
    }

    public Employee(int id, String name, String department, Double salary) {
        this.id = id;
        this.name = name;
        this.department = department;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    @Override
    public int compareTo(Employee o) {
        return this.name.compareTo(o.getName());
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }

    @Override
    public boolean equals(Object obj) {
        Employee e = (Employee)obj;
        if(obj ==null || getClass() != obj.getClass()) return false;
        return this.id == e.getId() ;
    }
}

public class Day9Assignment1 {

    public static void main(String[] args) {

        List<Employee> employees = new ArrayList<>();

        employees.add(new Employee(101, "Alice", "HR", 60000.0));
        employees.add(new Employee(102, "Bob", "Engineering", 75000.0));
        employees.add(new Employee(103, "Charlie", "Marketing", 50000.0));
        employees.add(new Employee(104, "David", "Engineering", 80000.0));
        employees.add(new Employee(105, "Eve", "HR", 62000.0));

        for(Employee e : employees){
            System.out.println(e.getId() + " " + e.getName() + " " + e.getDepartment() + " " + e.getSalary());
        }

        //delete employee with id 103
        Employee toDelete = new Employee();
        toDelete.setId(103);
        employees.remove(toDelete);
        System.out.println("After deletion:");
        for(Employee e : employees){
            System.out.println(e.getId() + " " + e.getName() + " " + e.getDepartment() + " " + e.getSalary());
        }

        //update employee with id 104
        for(Employee e : employees) {
            if (e.getId() == 104) {
                e.setSalary(85000.0);
                e.setDepartment("Product");
                break;
            }
        }
        System.out.println("After updation:");
        for(Employee e : employees){
            System.out.println(e.getId() + " " + e.getName() + " " + e.getDepartment() + " " + e.getSalary());
        }

        //search employee with id 102
        for(Employee e : employees) {
            if (e.getId() == 102) {
                System.out.println("Found employee: " + e.getName());
                break;
            }
        }

    }

}
