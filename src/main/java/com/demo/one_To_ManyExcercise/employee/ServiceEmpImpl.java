package com.abc.app.one_To_ManyExcercise.employee;


import com.abc.app.one_To_ManyExcercise.department.EntityDepartment;
import com.abc.app.one_To_ManyExcercise.department.RepoDept;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class ServiceEmpImpl implements ServiceEmp {

    private final RepoDept deptRepo;
    private final EmployeeRepo employeeRepo;


    @Autowired
    public ServiceEmpImpl(RepoDept deptRepo,EmployeeRepo employeeRepo) {
        this.employeeRepo = employeeRepo;

        this.deptRepo = deptRepo;
    }
    @Override
    public EntityEmployee addEmployee(Integer Id, EntityEmployee entityEmployee) {
        EntityDepartment entityDepartment = deptRepo.findById(Id)
                .orElseThrow(() -> new RuntimeException("Department not found with id: " + Id));
        entityDepartment.adddata(entityEmployee);
        deptRepo.save(entityDepartment);
        return entityEmployee;
    }

    // for all employees for particular deptId
    @Override
    public List<EntityEmployee> getDetails(int id) {
        return employeeRepo.findByDeptId(id);
    }


}
