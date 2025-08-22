package com.assignments.assignment3;

public class Manager extends Employee {

    private String projectName;
    private int teamSize;

    public Manager(int id, String name, double salary, String department,String projectName, int teamSize) {
        super(id, name, salary, department);
        this.projectName = projectName;
        this.teamSize = teamSize;
    }

    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    public int getTeamSize() {
        return teamSize;
    }

    public void setTeamSize(int teamSize) {
        this.teamSize = teamSize;
    }

    @Override
    public void display() {
        System.out.println("Employee : \n" +
                "id : " + getId() +
                "\nname : " + getName() +
                "\nsalary : " + getSalary() +
                "\ndepartment : " + getDepartment() +
                "\nprojectname : " + projectName +
                "\nteamsize : " + teamSize
        );
    }
}
