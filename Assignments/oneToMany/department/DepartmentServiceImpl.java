package com.demo.company.department;

import com.demo.company.employee.Employee;
import com.demo.company.project.Project;
import com.demo.company.project.ProjectException;
import com.demo.company.project.ProjectRepository;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@Service
public class DepartmentServiceImpl implements DepartmentService {

    private final DepartmentRepository departmentRepository;

    public DepartmentServiceImpl(DepartmentRepository departmentRepository) {
        this.departmentRepository = departmentRepository;
    }


    @Override
    public Department addNewDepartment(Department department) throws DepartmentException {
        if(!department.getProjects().isEmpty()){
            department.getProjects().forEach(project -> project.setDepartment(department));
        }
        return departmentRepository.save(department);
    }

    @Override
    public Department getDepartmentById(Integer deptId) throws DepartmentException {
        return departmentRepository.findById(deptId)
                .orElseThrow(() -> new DepartmentException("Department with id " + deptId + " not found"));
    }

    @Override
    public Department getDepartmentByName(String name) throws DepartmentException {
        Department foundDepartment = departmentRepository.findDepartmentByName(name);
        if(foundDepartment == null){
            throw new DepartmentException("Department with name " + name + " not found");
        }
        return foundDepartment;
    }

    @Override
    public List<Project> getProjectsByDepartmentName(String deptName) throws DepartmentException {
        Department foundDepartment = departmentRepository.findDepartmentByName(deptName);
        if(foundDepartment == null)
            throw new DepartmentException("Department with name " + deptName + " not found");
        List<Project> projects = foundDepartment.getProjects();


        if(projects.isEmpty())
            throw new DepartmentException("No projects assigned for department " + deptName);
        return projects;
//        For id, name only, Make List<Object> in service,serviceImpl,controller
//                .stream()
//                .map(project -> {
//                    Map<String,Object> mapP = new LinkedHashMap<>();
//                    mapP.put("id",project.getId());
//                    mapP.put("name",project.getName());
//                    return mapP;
//                }).collect(Collectors.toList());
    }

    @Override
    public List<Employee> getEmployeesByDepartmentName(String deptName) throws DepartmentException {
        Department foundDepartment = departmentRepository.findDepartmentByName(deptName);
        if(foundDepartment == null)
            throw new DepartmentException("Department with name " + deptName + " not found");
        List<Employee> employees = foundDepartment.getEmployees();

        if(employees.isEmpty())
            throw new DepartmentException("No employees assigned for department " + deptName);
        return employees;
    }
}
