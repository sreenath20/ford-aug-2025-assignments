package com.demo.day4;

public class Manager extends Employee{

    Double bonus;

    public Manager() {
    }

    public Manager(String name, String email, String id, Double basicsalary,Double bonus) {
        super(name,email,id,basicsalary);
        this.bonus = bonus;
    }

    public Double getBonus() {
        return bonus;
    }

    public void setBonus(Double bonus) {
        this.bonus = bonus;
    }

    @Override
    public Double calculatesalary(){
        return super.calculatesalary()+this.bonus;
    }

}
