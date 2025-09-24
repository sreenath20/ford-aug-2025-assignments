package com.demo.company.employee;



import com.demo.company.aadhaar.Aadhaar;
import com.demo.company.department.Department;
import com.demo.company.project.Project;
import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
public class Employee {

    @Id
    private Integer id;
    private String name;
    private Double salary;
    private String position;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(referencedColumnName = "id") // aadhaar id
    private Aadhaar aadhaar;

    @ManyToOne
    @JoinColumn(referencedColumnName = "id")
    private Department department;

    @ManyToMany(mappedBy = "employees", cascade = {CascadeType.DETACH, CascadeType.MERGE, CascadeType.PERSIST, CascadeType.REFRESH})
    @JsonIgnore
    private List<Project> projects = new ArrayList<>();


    public Aadhaar getAadhaar() {
        return aadhaar;
    }

    public List<Project> getProjects() {
        return projects;
    }

    public void setProjects(List<Project> projects) {
        this.projects = projects;
    }

    public void setAadhaar(Aadhaar aadhaar) {
        this.aadhaar = aadhaar;
    }

    public Employee(){}

    public Employee(Integer id, String name, Double salary, String position) {
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.position = position;
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

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }



    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                ", department='" + department + '\'' +
                ", position='" + position + '\'' +
                '}';
    }
}