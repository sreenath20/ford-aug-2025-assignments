package com.demo.company.department;

import com.demo.company.employee.Employee;
import com.demo.company.project.Project;
import com.demo.company.project.ProjectException;

import java.util.List;

public interface DepartmentService {

    Department addNewDepartment(Department department) throws DepartmentException;

    Department getDepartmentById(Integer deptId) throws DepartmentException;

    Department getDepartmentByName(String departmentName) throws DepartmentException;

    List<Project> getProjectsByDepartmentName(String deptName) throws DepartmentException;

    List<Employee> getEmployeesByDepartmentName(String deptName) throws DepartmentException;
}
