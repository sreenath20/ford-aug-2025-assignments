package com.demo.company.employee;



import com.demo.company.Adhar;
import com.demo.company.adhar.AadharRepository;
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
        if(newEmployee.getadhar()!=null){
            newEmployee.getadhar().setEmployee(newEmployee);
        }
        if(employeeRepository.existsById(newEmployee.getId())) {
            throw new EmployeeException("Employee already exists for id  " + newEmployee.getId());
        }
        Department department = departmentService.getDepartmentByName(newEmployee.getDepartment().getName());
        newEmployee.setDepartment(department);
        return employeeRepository.save(newEmployee);
    }

    
    @Override
    public Employee addAadhartoEmployee(Integer employeeId, adhar adhar) throws Exception {
        return null;
    }

  

   
    
    }

   
    }

}