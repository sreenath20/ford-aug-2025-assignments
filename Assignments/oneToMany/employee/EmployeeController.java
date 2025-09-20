package com.demo.company.employee;

import com.demo.company.aadhaar.Aadhaar;
import com.demo.company.project.ProjectException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/employee")
public class EmployeeController {

    private final EmployeeService employeeService;

    @Autowired
    public EmployeeController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @PostMapping()
    public Employee addNewEmployee(@RequestBody Employee newEmployee){
        return employeeService.addNewEmployee(newEmployee);
    }

    @PostMapping("/{empId}/aadhaar")
    public Employee addAadharToEmployee(@PathVariable Integer employeeId, @RequestBody Aadhaar aadhaar) throws Exception{
        return employeeService.addAadhartoEmployee(employeeId, aadhaar);
    }


    @GetMapping("/{id}")
    public Employee getEmployeeById(@PathVariable("id") Integer id) throws EmployeeNotFoundException {
        return employeeService.getEmployeeById(id);
    }

    @GetMapping("/aadhaar/{aadhaarId}")
    public Employee getEmployeeByAadhaarId(@PathVariable("aadhaarId") Integer id) throws EmployeeNotFoundException {
        return employeeService.getEmployeeByAadhaarId(id);
    }



}
