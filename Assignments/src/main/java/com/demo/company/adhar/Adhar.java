package com.demo.company.adhar;


import com.demo.company.employee.Employee;
import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;

@Entity
public class Aadhaar {

    @Id
    @GeneratedValue
    private Integer id;
    private String aadhaarNo;

    @OneToOne(mappedBy = "aadhaar")
    @JsonIgnore  // to avoid recursion by Jakson lib
    private Employee employee;

    public Aadhaar() {}

    public Aadhaar(String aadhaarNo) {
        this.aadhaarNo = aadhaarNo;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getAadhaarNo() {
        return aadhaarNo;
    }

    public void setAadhaarNo(String aadharNo) {
        this.aadhaarNo = aadharNo;
    }

    @Override
    public String toString() {
        return "Aadhaar{" +
                "id=" + id +
                ", aadhaarNo='" + aadhaarNo + '\'' +
                ", employee=" + employee +
                '}';
    }
}