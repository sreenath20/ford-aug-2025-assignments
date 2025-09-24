package com.abc.app.one_To_ManyExcercise.employee;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface EmployeeRepo extends JpaRepository<EntityEmployee,Integer> {
    @Query("SELECT e FROM EntityEmployee e WHERE e.entityDepartment.deptId= :id")
    List<EntityEmployee> findByDeptId(@Param("id") Integer id);

}
