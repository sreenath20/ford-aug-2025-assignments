package com.demo.company.project;

import com.demo.company.employee.Employee;

public interface ProjectService {

    Project addNewProject(Project project);

    Project getProjectById(Integer id);

    Project addProjectToEmployee(Integer projId, Integer empId);

    Project assignDepartmentToProject(Integer projId, Integer deptId);
}
