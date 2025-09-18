package com.example.jpamappingassignment.onetomany;

import org.springframework.aop.support.DefaultBeanFactoryPointcutAdvisor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.expression.ExpressionException;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class DepartmentController {

    @Autowired
    private DepartmentRepository departmentRepository;

    @Autowired
    private EmployeeRepository employeeRepository;

    @PostMapping("/departments")
    public Department addNewDepartment(@RequestBody Department department) {
        return departmentRepository.save(department);
    }

    @PostMapping("/employees/{departmentid}")
    public Employee addNewEmployee(@RequestBody Employee employee, @PathVariable int departmentid) throws Exception {
        Department department = this.departmentRepository.findById(departmentid).orElseThrow(()-> new Exception("Department does not exist"));
        employee.setDepartment(department);
        return employeeRepository.save(employee);
    }

    @GetMapping("/departments/{id}")
    public Department getDepartment(@PathVariable int id) throws Exception {
        Department department = this.departmentRepository.findById(id).orElseThrow(()-> new Exception("Department does not exist"));
        return department;
    }

    @GetMapping("/employees/{id}")
    public EmployeeResponseDto getEmployee(@PathVariable int id) throws Exception {
        Employee employee = this.employeeRepository.findById(id).orElseThrow(()-> new Exception("Employee does not exist"));
        Department department = employee.getDepartment();
        EmployeeResponseDto employeeResponseDto = new EmployeeResponseDto();
        employeeResponseDto.setId(employee.getId());
        employeeResponseDto.setFirstName(employee.getFirstName());
        employeeResponseDto.setLastName(employee.getLastName());
        employeeResponseDto.setEmail(employee.getEmail());
        employeeResponseDto.setSalary(employee.getSalary());

        DepartmentDto departmentDto = new DepartmentDto();
        departmentDto.setId(department.getId());
        departmentDto.setName(department.getName());
        departmentDto.setLocation(department.getLocation());

        employeeResponseDto.setDepartment(departmentDto);

        return employeeResponseDto;

    }

    @GetMapping("/departments")
    public List<Department> getDepartmentsWithoutEmployees() throws Exception {
        List<Department> departments = this.departmentRepository.findAll();
        List<Department> departmentsWithoutEmployees = new ArrayList<>();
        for(Department department : departments) {
            if(department.getEmployees().size() == 0) {
                departmentsWithoutEmployees.add(department);
            }
        }
        return departmentsWithoutEmployees;

    }

    @DeleteMapping("/departments/{id}")
    public Department deleteDepartment(@PathVariable int id) throws Exception {
        Department department =  this.departmentRepository.findById(id).orElseThrow(()-> new Exception("Department does not exist"));
        this.departmentRepository.deleteById(id);
        return department;
    }

}
