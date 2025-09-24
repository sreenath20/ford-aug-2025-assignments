package com.abc.app.one_To_ManyExcercise.department;


import com.abc.app.one_To_ManyExcercise.employee.EntityEmployee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/department")
public class ControllerForOneToMany {
    private deptService deptService;
    @Autowired
    public ControllerForOneToMany(deptService deptService) {
        this.deptService = deptService;
    }

    @PostMapping
    public EntityDepartment newDepartment(@RequestBody EntityDepartment entityDepartment) {
        return this.deptService.addNewDept(entityDepartment);
    }
    //to get list of employee by department id
    @GetMapping("/{id}")
    public List<EntityEmployee> getDepartmentById(@PathVariable int id) {
        return this.deptService.getAllByDept(id);
    }
    @GetMapping
    public List<EntityDepartment> getAllDepartments() {
        return this.deptService.getAllDept();
    }
    @DeleteMapping("/{id}")
    public void deleteDepartmentById(@PathVariable Integer id) {
         this.deptService.deleteALlrecords(id);
    }


}
