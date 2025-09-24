package com.abc.app.one_To_ManyExcercise.department;

import com.abc.app.one_To_ManyExcercise.employee.EntityEmployee;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

public interface deptService {
 EntityDepartment addNewDept(EntityDepartment entityDepartment);
 List<EntityEmployee> getAllByDept(int id);
 List<EntityDepartment> getAllDept();
 void deleteALlrecords(int id);

}
