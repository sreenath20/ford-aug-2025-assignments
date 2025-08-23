
package com.assignment9_sets.assignment1;

import java.util.Objects;

public class Employee implements Comparable<Employee> {
    private Integer id;
    private String name;
    private String department;

    public Employee(Integer id, String name, String department) {
        this.id = id;
        this.name = name;
        this.department = department;
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

    public String toString() {
        return "Employee{id=" + this.id + ", name='" + this.name + "', department='" + this.department + "'}";
    }

    public boolean equals(Object o) {
        if (o != null && this.getClass() == o.getClass()) {
            Employee employee = (Employee)o;
            return this.id == employee.id && this.department.equals(employee.department);
        } else {
            return false;
        }
    }

    public int hashCode() {
        return Objects.hash(new Object[]{this.id, this.department});
    }

    public int compareTo(Employee o) {
        return this.id.compareTo(o.id);
    }
}