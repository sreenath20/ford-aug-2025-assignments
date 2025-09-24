package com.demo.company.project;

import com.demo.company.department.Department;
import com.demo.company.department.DepartmentException;
import com.demo.company.department.DepartmentRepository;
import com.demo.company.employee.Employee;
import com.demo.company.employee.EmployeeNotFoundException;
import com.demo.company.employee.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProjectServiceImpl implements ProjectService {

    private final ProjectRepository projectRepository;
    private final EmployeeRepository employeeRepository;
    private final DepartmentRepository departmentRepository;

    @Autowired
    public ProjectServiceImpl(ProjectRepository projectRepository,
                              EmployeeRepository employeeRepository,
                              DepartmentRepository departmentRepository) {
        this.projectRepository = projectRepository;
        this.employeeRepository = employeeRepository;
        this.departmentRepository = departmentRepository;
    }

    @Override
    public Project addNewProject(Project project) throws ProjectException {
        if (projectRepository.existsById(project.getId()))
            throw new ProjectException("Project already exists for id " + project.getId());
        return projectRepository.save(project);
    }

    @Override
    public Project getProjectById(Integer id) {
        return projectRepository.findById(id)
                .orElseThrow(() -> new ProjectException("Project not found for id " + id));
    }

    @Override
    public Project addProjectToEmployee(Integer projId, Integer empId) {
        Project foundProject = projectRepository.findById(projId)
                .orElseThrow(()->new ProjectException("Project not found for Id "+projId));
        Employee foundEmployee = employeeRepository.findById(empId)
                .orElseThrow(()->new EmployeeNotFoundException("Employee not found for Id "+empId));

        foundProject.getEmployees().add(foundEmployee);
        return projectRepository.save(foundProject);
    }

    @Override
    public Project assignDepartmentToProject(Integer projId, Integer deptId) {
        Project foundProject = projectRepository.findById(projId)
                .orElseThrow(()->new ProjectException("Project not found for Id "+projId));
        Department foundDepartment = departmentRepository.findById(deptId)
                .orElseThrow(()->new DepartmentException("Department not found for Id "+deptId));

        foundProject.setDepartment(foundDepartment);
        return projectRepository.save(foundProject);
    }
}