package com.e_commerce.onlinemart.manytoone;


import jakarta.persistence.criteria.CriteriaBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/department")
public class DepartmentController {


    @Autowired
    private DepartmentRepo departmentRepo;

    @Autowired
    private ProjectRepo projectRepo;

    @Autowired
    private EmployeeRepo employeeRepo;

    public DepartmentController(DepartmentRepo departmentRepo) {
        this.departmentRepo = departmentRepo;
    }

//    public DepartmentController(EmployeeRepo employeeRepo) {
//        this.employeeRepo = employeeRepo;
//    }

    @PostMapping
    public Department addNewDepartment(@RequestBody Department department) {

        return this.departmentRepo.save(department);
    }




//    @PostMapping("/employee")
//    public Employee addNewEmployee(@RequestBody Employee employee) {
//        return this.employeeRepo.save(employee);
//    }





    @GetMapping("/{id}")
    public Department getDepartmentById(@PathVariable Integer id) throws Exception {
        return this.departmentRepo.findById(id)
                .orElseThrow(() -> new Exception("Department not found."));
    }

    @GetMapping("/{id}/employee")
    public Department getDepartmentANDEmployeeById(@PathVariable Integer id) throws Exception {
        return this.departmentRepo.findById(id)
                .orElseThrow(() -> new Exception("Department not found."));
        

    }

    @PostMapping("/{deptId}/project")
    public Project addNewProject(@RequestBody Project project, @PathVariable Integer deptId) throws Exception {
        Department foundDepartment = this.departmentRepo.findById(deptId)
                .orElseThrow(() -> new Exception("Department not found."));
        project.setDepartment(foundDepartment);
        return this.projectRepo.save(project);
    }

    @DeleteMapping("/{id}")
    public Department deleteDepartmentById(@PathVariable Integer id) throws Exception {
        Department foundDepartment = this.departmentRepo.findById(id).orElseThrow(() -> new Exception("Department not found."));

        this.departmentRepo.delete(foundDepartment);
        return foundDepartment;
    }



}
