package com.abc.app.one_To_ManyExcercise.employee;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/Employee")
public class ControllerEmployee
{
    private ServiceEmp serviceEmp;
    public ControllerEmployee(ServiceEmp serviceEmp){
        this.serviceEmp = serviceEmp;
    }

    @PostMapping("/{id}")
    public EntityEmployee addEmployee(@RequestBody EntityEmployee entityEmployee, @PathVariable Integer id) {
        return serviceEmp.addEmployee(id, entityEmployee);
    }

    @GetMapping("/{id}")
    public List<EntityEmployee> getEmployee(@PathVariable Integer id) {
        return serviceEmp.getDetails(id);
    }
}
