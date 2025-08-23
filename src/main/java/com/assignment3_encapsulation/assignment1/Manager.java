package com.assignment3_encapsulation.assignment1;

public class Manager extends Employee {
       private int teamsize;
       private String projectName;

       public Manager(int id , String name, Double salary, String department ,int teamsize, String projectName) {
           super(id,name,salary,department);
           this.teamsize=teamsize;
           this.projectName=projectName;
       }

    public int getTeamsize() {
        return teamsize;
    }

    public void setTeamsize(int teamsize) {
        this.teamsize = teamsize;
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
                "ID=" + getID() +
                ", Name='" + getName() + '\'' +
                ", Salary=" + getSalary() +
                ", Department='" + getDepartment() + '\'' +
                ", Team Size=" + teamsize +
                ", Project Name='" + projectName + '\'' +
                '}';
    }
}
