package com.assignment.day4.assignment1;

class Manager extends Employee {
    private int teamSize;
    private String projectName;

    public Manager(String id, String name, double salary, String department, int teamSize, String projectName) {
        super(id, name, salary, department);
        this.teamSize = teamSize;
        this.projectName = projectName;
    }

    public void display(){
        System.out.println("Manager ID: " + getId());
        System.out.println("Name: " + getName());
        System.out.println("Salary: " + getSalary());
        System.out.println("Department: " + getDepartment());
        System.out.println("Team Size: " + this.teamSize);
        System.out.println("Project Name: " + this.projectName);
    }

}
