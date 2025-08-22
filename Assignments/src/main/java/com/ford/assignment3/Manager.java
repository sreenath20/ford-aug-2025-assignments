package com.ford.assignment3;

public class Manager extends Employee {
    private int teamSize;
    private String projectName;

    public Manager(int id, String name, double salary, String department, int teamSize, String projectName) {
        super(id, name, salary, department); // Call to superclass constructor
        this.teamSize = teamSize;
        this.projectName = projectName;
    }

    // Getters
    public int getTeamSize() {
        return teamSize;
    }

    public String getProjectName() {
        return projectName;
    }

    // Setters
    public void setTeamSize(int teamSize) {
        this.teamSize = teamSize;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    public void displayManagerDetails() {
        System.out.println("--- Manager Details ---");
        System.out.println("Employee ID: " + getId()); // Inherited getter
        System.out.println("Name: " + getName());       // Inherited getter
        System.out.println("Salary: $" + String.format("%.2f", getSalary())); // Inherited getter
        System.out.println("Department: " + getDepartment()); // Inherited getter
        System.out.println("Team Size: " + teamSize);
        System.out.println("Project Name: " + projectName);
        System.out.println("-----------------------");
    }
}
