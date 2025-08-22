package com.fullstackab.OOPS.DAy12;

public class Employee {
    int id;
    String name;
    String department;
    Double salary;
    int expInYears;

    public Employee(int id, String name, String department, Double salary, int expInYears) {
        this.id = id;
        this.name = name;
        this.department = department;
        this.salary = salary;
        this.expInYears = expInYears;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", department='" + department + '\'' +
                ", salary=" + salary +
                ", expInYears=" + expInYears +
                '}';
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

    public int getExpInYears() {
        return expInYears;
    }

    public void setExpInYears(int expInYears) {
        this.expInYears = expInYears;
    }
}
