package com.demo.day4;

public class Developer extends Employee {

    Double projectAllowance;

    public Developer() {
    }

    public Developer(String name, String email, String id, Double basicsalary, Double projectAllowance) {
        super(name,email,id,basicsalary);
        this.projectAllowance = projectAllowance;
    }

    public Double getProjectAllowance() {
        return projectAllowance;
    }

    public void setProjectAllowance(Double projectAllowance) {
        this.projectAllowance = projectAllowance;
    }

    @Override
    public Double calculatesalary(){
        return super.calculatesalary()+this.projectAllowance;
    }



}
