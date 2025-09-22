package EmployeeDepartment;


import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;


@RestController

@RequestMapping("/employees")

public class EmployeeController {

    private final EmployeeService employeeService;
    public EmployeeController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @PostMapping("/{departmentId}")
    public ResponseEntity<Employee> createEmployee(@RequestBody Employee employee, @PathVariable Integer departmentId) {
        return ResponseEntity.ok(employeeService.createEmployee(employee, departmentId));
    }

    @GetMapping("/{id}")
    public ResponseEntity<Employee> getEmployeeById(@PathVariable Integer id) {
        Optional<Employee> employee = employeeService.getEmployeeById(id);
        return employee.map(ResponseEntity::ok).orElse(ResponseEntity.notFound().build());
    }

}

