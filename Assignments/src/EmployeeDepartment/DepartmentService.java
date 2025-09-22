package EmployeeDepartment;


import jakarta.transaction.Transactional;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class DepartmentService {
    private final DepartmentRepository departmentRepository;

    public DepartmentService(DepartmentRepository departmentRepository) {
        this.departmentRepository = departmentRepository;
    }

    public Department createDepartment(Department department) {
        return departmentRepository.save(department);
    }

    public List<Department> getAllDepartments() {
        return departmentRepository.findAll();
    }

    public Optional<Department> getDepartmentById(Integer id) {
        return departmentRepository.findById(id);
    }

    public void deleteDepartment(Integer id) {
        departmentRepository.deleteById(id);
    }

    @Transactional
    public List<Department> getDepartmentsWithLazyLoading() {
        List<Department> departments = departmentRepository.findAll();
        departments.forEach(d -> d.getEmployees().size()); // trigger lazy load
        return departments;
    }
}
