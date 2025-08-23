package com.assignment8_collections.assignment1;

import java.util.Objects;

public class Employee implements Comparable<Employee> {
    private Integer id;
    private String name;
    private String department;
    private Double salary;

    public Employee(Integer id, String name, String department, Double salary) {
        this.id = id;
        this.name = name;
        this.department = department;
        this.salary = salary;
    }

    public Integer getId() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDepartment() {
        return this.department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public Double getSalary() {
        return this.salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    public String toString() {
        return "Employee{id=" + this.id + ", name='" + this.name + "', department='" + this.department + "', salary=" + this.salary + "}";
    }

    public boolean equals(Object o) {
        if (o != null && this.getClass() == o.getClass()) {
            Employee employee = (Employee)o;
            return Objects.equals(this.id, employee.id) && Objects.equals(this.department, employee.department) && Objects.equals(this.salary, employee.salary);
        } else {
            return false;
        }
    }

    public int hashCode() {
        return Objects.hash(new Object[]{this.id});
    }

    public int compareTo(Employee o) {
        return this.id.compareTo(o.id);
    }
}