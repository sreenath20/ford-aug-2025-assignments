package com.demo.company.employee;

import com.demo.company.aadhaar.Aadhaar;
import com.demo.company.aadhaar.AadharRepository;
import com.demo.company.department.Department;
import com.demo.company.department.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    private final EmployeeRepository employeeRepository;
    private final AadharRepository aadharRepository;
    private final DepartmentService departmentService;


    @Autowired
    public EmployeeServiceImpl(EmployeeRepository employeeRepository, AadharRepository aadharRepository, DepartmentService departmentService) {
        this.employeeRepository = employeeRepository;
        this.aadharRepository = aadharRepository;
        this.departmentService = departmentService;
    }

    @Override
    public Employee addNewEmployee(Employee newEmployee) throws EmployeeException {
        if(newEmployee.getAadhaar()!=null){
            newEmployee.getAadhaar().setEmployee(newEmployee);
        }
        if(employeeRepository.existsById(newEmployee.getId())) {
            throw new EmployeeException("Employee already exists for id  " + newEmployee.getId());
        }
        Department department = departmentService.getDepartmentByName(newEmployee.getDepartment().getName());
        newEmployee.setDepartment(department);
        return employeeRepository.save(newEmployee);
    }

    @Override
    public Employee getEmployeeById(Integer id) throws EmployeeNotFoundException {
        return employeeRepository.findById(id)
                .orElseThrow(() -> new EmployeeNotFoundException("Employee not found for id "+id));
    }

    @Override
    public Employee addAadhartoEmployee(Integer employeeId, Aadhaar aadhaar) throws Exception {
        aadharRepository.save(aadhaar);
        Employee foundEmployee = employeeRepository.findById(employeeId)
                .orElseThrow(() -> new EmployeeNotFoundException("Employee not found for id "+employeeId));
        foundEmployee.setAadhaar(aadhaar);
        return employeeRepository.save(foundEmployee);
    }

    @Override
    public Employee getEmployeeByAadhaarId(Integer id) throws EmployeeNotFoundException {

        Aadhaar foundAadhaar = aadharRepository.findById(id)
                .orElseThrow(() -> new EmployeeNotFoundException("Aadhaar not found for id "+id));

        return foundAadhaar.getEmployee();
    }

}
