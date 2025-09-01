package com.demo.Assignment9.set;

import java.util.Objects;

public class EmployeeDetails implements Comparable<EmployeeDetails>{
    private Integer EmployeeId;
    private String EmployeeName;
    private String EmployeeDepartment;

    public EmployeeDetails() {
    }

    public EmployeeDetails(Integer employeeId, String employeeName, String employeeDepartment) {
        EmployeeId = employeeId;
        EmployeeName = employeeName;
        EmployeeDepartment = employeeDepartment;
    }

    public Integer getEmployeeId() {
        return EmployeeId;
    }

    public void setEmployeeId(Integer employeeId) {
        EmployeeId = employeeId;
    }

    public String getEmployeeName() {
        return EmployeeName;
    }

    public void setEmployeeName(String employeeName) {
        EmployeeName = employeeName;
    }

    public String getEmployeeDepartment() {
        return EmployeeDepartment;
    }

    public void setEmployeeDepartment(String employeeDepartment) {
        EmployeeDepartment = employeeDepartment;
    }

    @Override
    public String toString() {
        return "EmployeeDetails{" +
                "EmployeeId=" + EmployeeId +
                ", EmployeeName='" + EmployeeName + '\'' +
                ", EmployeeDepartment='" + EmployeeDepartment + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        EmployeeDetails that = (EmployeeDetails) o;
        return Objects.equals(EmployeeId, that.EmployeeId);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(EmployeeId);
    }

    @Override
    public int compareTo(EmployeeDetails o) {
        return this.EmployeeId.compareTo(o.EmployeeId);
    }
}
