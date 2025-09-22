package EmployeeDepartment;


import org.springframework.stereotype.Service;



import java.util.Optional;

@Service
public class EmployeeService {
    private final EmployeeRepository employeeRepository;
    private final DepartmentRepository departmentRepository;

    public EmployeeService(EmployeeRepository employeeRepository, DepartmentRepository departmentRepository) {
        this.employeeRepository = employeeRepository;
        this.departmentRepository = departmentRepository;
    }

    public Employee createEmployee(Employee employee, Integer departmentId) {
        Optional<Department> department = departmentRepository.findById(departmentId);
        department.ifPresent(employee::setDepartment);
        return employeeRepository.save(employee);
    }

    public Optional<Employee> getEmployeeById(Integer id) {
        return employeeRepository.findById(id);
    }
}
