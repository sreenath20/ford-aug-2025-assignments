package com.demo.company.department;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;

public interface DepartmentRepository extends JpaRepository<Department,Integer> {

    Department findDepartmentByName(@Param("deptName") String deptName);

}
