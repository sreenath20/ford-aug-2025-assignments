package com.demo.company.project;

import com.demo.company.department.Department;
import com.demo.company.department.DepartmentException;
import com.demo.company.department.DepartmentRepository;
import com.demo.company.employee.Employee;
import com.demo.company.employee.EmployeeNotFoundException;
import com.demo.company.employee.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/project")
public class ProjectController {

    private final ProjectService projectService;

    @Autowired
    public ProjectController(ProjectService projectService) {
        this.projectService = projectService;
    }

    @PostMapping()
    public Project addProject(@RequestBody Project project){
        return projectService.addNewProject(project);
    }

    @GetMapping("/{projId}")
    public Project getProjectById(@PathVariable("projId") Integer projId) throws Exception{
        return projectService.getProjectById(projId);
    }

    @PatchMapping("/{projId}/employee/{empId}")
    @ResponseStatus(HttpStatus.ACCEPTED)
    public Project addProjectToEmployee(@PathVariable("projId") Integer projId, @PathVariable("empId") Integer empId) throws Exception{
        return projectService.addProjectToEmployee(projId, empId);
    }

    @PatchMapping("/{projId}/department/{deptId}")
    @ResponseStatus(HttpStatus.ACCEPTED)
    public Project assignDepartmentToProject(@PathVariable("projId") Integer projId, @PathVariable("deptId") Integer deptId) throws Exception{
        return projectService.assignDepartmentToProject(projId, deptId);
    }

}