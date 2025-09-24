package com.abc.app.one_To_ManyExcercise.department;

import org.springframework.data.jpa.repository.JpaRepository;

public interface RepoDept extends JpaRepository<EntityDepartment,Integer> {
}
