package com.e_commerce.onlinemart.manytoone;


import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
public class Project {

    @Id
    @GeneratedValue
    private Integer id;
    private String name;
    private Double budget;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "department_id")
    @JsonIgnore
    private Department department;


    @ManyToMany(fetch = FetchType.LAZY,cascade = CascadeType.ALL)
   @JoinTable(name="project emp",
    joinColumns=
    @JoinColumn(name="prj_id",referencedColumnName = "ID"),
    inverseJoinColumns=
    @JoinColumn(name="emp_id",referencedColumnName="ID")
   )

   private List<Employee> employees =new ArrayList<>();
    public Project() {
    }

    public Project(Integer id, String name, Double budget, Department department) {
        this.id = id;
        this.name = name;
        this.budget = budget;
        this.department = department;
    }

    public Project(Integer id, String name, Double budget, Department department, List<Employee> employees) {
        this.id = id;
        this.name = name;
        this.budget = budget;
        this.department = department;
        this.employees = employees;
    }

    public List<Employee> getEmployees() {
        return employees;
    }

    public void setEmployees(List<Employee> employees) {
        this.employees = employees;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getBudget() {
        return budget;
    }

    public void setBudget(Double budget) {
        this.budget = budget;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }
}
