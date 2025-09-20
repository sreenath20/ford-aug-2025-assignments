package com.demo.company.project;

import com.demo.company.department.Department;
import com.demo.company.employee.Employee;
import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
public class Project {

    @Id
    private Integer id;

    private String name;

    private Double budget;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn
    private Department department;



    @ManyToMany(cascade = {CascadeType.DETACH, CascadeType.MERGE, CascadeType.PERSIST, CascadeType.REFRESH})
    @JoinTable(name= "WORKS_ON",
            joinColumns=
            @JoinColumn(name= "Project_Id", referencedColumnName= "id"),
            inverseJoinColumns=
            @JoinColumn(name= "Employee_Id", referencedColumnName= "id")
    )
    List<Employee> employees = new ArrayList<>();

    public Project() {}


    public Project(Integer id, String name, Double budget) {
        this.id = id;
        this.name = name;
        this.budget = budget;
    }

    public List<Employee> getEmployees() {
        return employees;
    }

    public void setEmployees(List<Employee> employees) {
        this.employees = employees;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
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




}
