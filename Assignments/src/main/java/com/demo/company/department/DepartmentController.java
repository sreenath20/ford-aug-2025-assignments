package com.demo.company.department;



import com.demo.company.employee.Employee;
import com.demo.company.project.Project;
import com.demo.company.project.ProjectException;
import com.demo.company.project.ProjectRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/department")
public class DepartmentController {

    private final DepartmentService departmentService;

    public DepartmentController(DepartmentService departmentService, ProjectRepository projectRepository) {
        this.departmentService = departmentService;
    }

    @PostMapping()
    public Department addDepartment(@RequestBody Department department) {
        return departmentService.addNewDepartment(department);
    }

    @GetMapping("/{deptId}")
    public Department getDepartment(@PathVariable("deptId") Integer deptId) {
        return departmentService.getDepartmentById(deptId);
    }

    @GetMapping("/{deptName}/projects")
    public List<Project> getProjectsByDepartmentName(@PathVariable("deptName") String deptName) {
        return departmentService.getProjectsByDepartmentName(deptName);
    }

    @GetMapping("/{deptName}/employees")
    public List<Employee> getEmployeesByDepartmentName(@PathVariable("deptName") String deptName) {
        return departmentService.getEmployeesByDepartmentName(deptName);
    }

}