package com.demo.Assignment3;

public class Manager extends Employee {
    private int teamSize;
    private String ProjectName;
    public Manager(String name, String dept, int id, double salary,String ProjectName,int teamSize) {
        super(name,dept,id,salary);
        this.teamSize = teamSize;
        this.ProjectName = ProjectName;

    }
    public void display(){
        System.out.println("Name:"+getName());
        System.out.println("Dept:"+getDept());
        System.out.println("ID:"+getId());
        System.out.println("Salary:"+getSalary());
        System.out.println("Team Size:"+teamSize);
        System.out.println("Project Name:"+ProjectName);

    }

}
