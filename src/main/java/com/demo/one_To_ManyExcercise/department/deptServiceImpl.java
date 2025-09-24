package com.abc.app.one_To_ManyExcercise.department;

import com.abc.app.one_To_ManyExcercise.employee.EntityEmployee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class deptServiceImpl implements deptService {
    private RepoDept repoDept;

    @Autowired
    public void setDeptRepository(RepoDept repoDept) {
        this.repoDept = repoDept;
    }

    @Override
    public EntityDepartment addNewDept(EntityDepartment entityDepartment) {
        return repoDept.save(entityDepartment);
    }

    @Override
    public List<EntityEmployee> getAllByDept(int id) {
        EntityDepartment department = repoDept.findById(id)
                .orElseThrow(() -> new RuntimeException("Department not found with id: " + id));
        List<EntityEmployee> foundEmp=department.getEntityEmployee();
        return foundEmp;
    }

    @Override
    public List<EntityDepartment> getAllDept() {
        return repoDept.findAll();
    }

    @Override
    public void deleteALlrecords(int id) {
        repoDept.deleteById(id);
    }


}
