package com.assignment.day10_set.assignment1;

import java.util.Objects;

public class Employee extends Object implements Comparable<Employee> {

    int id;
    String name;
    String department;

    public Employee(int id, String name, String department) {
        this.id = id;
        this.name = name;
        this.department = department;
    }

    public Employee() {}

    @Override
    public int compareTo(Employee o) {
        // Natural ordering logic: compare by id
        return Integer.compare(this.id, o.id);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }

    @Override
    public boolean equals(Object obj) {
        Employee employee = (Employee) obj;
        if(employee==null || this.getClass()!= employee.getClass()) {
            return false;
        }
        return this.id == employee.id && this.name.equals(employee.name) && this.department.equals(employee.department);
    }
}
