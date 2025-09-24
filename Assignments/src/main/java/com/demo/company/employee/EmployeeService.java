package com.demo.company.employee;


import com.demo.company.aadhaar.Aadhaar;
import com.demo.company.project.ProjectException;

public interface EmployeeService {

    Employee addNewEmployee(Employee newEmployee) throws EmployeeException;

    Employee getEmployeeById(Integer id) throws EmployeeNotFoundException;

    Employee addAadhartoEmployee(Integer employeeId, Aadhaar aadhaar) throws Exception;

    Employee getEmployeeByAadhaarId(Integer id) throws EmployeeNotFoundException;

}