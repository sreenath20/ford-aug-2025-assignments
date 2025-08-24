package com.harini.assignment3.Question1;

public class Manager extends Employee {
    String name = getName();
    String email = getEmail();
    String id = getId();
    double salary = getSalary();
    private int teamSize;
    private String projectName;
    public Manager(String name,String department,String id,double salary,int teamSize,String projectName) {
        super(name,department,id,salary);
        this.teamSize = teamSize;
        this.projectName = projectName;
    }

    public int getTeamSize() {
        return teamSize;
    }

    public void setTeamSize(int teamSize) {
        this.teamSize = teamSize;
    }

    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    @Override
    public String toString() {
        return "Manager{" +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", id='" + id + '\'' +
                ", salary=" + salary +
                ", teamSize=" + teamSize +
                ", projectName='" + projectName + '\'' +
                '}';
    }
}
