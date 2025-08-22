package com.assignments.assignment9;

import java.util.Objects;

public class Employee implements Comparable<Employee>{
    Integer id;
    String name;
    String department;

    public Employee(Integer id, String name, String department) {
        this.id = id;
        this.name = name;
        this.department = department;
    }

    public Employee() {

    }

    public Employee(Integer id) {
        this.id = id;
        name = null;
    }

    public String getName() {
        return name;
    }

    public String getDepartment() {
        return department;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", department=" + department +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return Objects.equals(id, employee.id);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    @Override
    public int compareTo(Employee o) {
        return id.compareTo(o.id);
    }

    public Integer getId() {
        return id;
    }
}
