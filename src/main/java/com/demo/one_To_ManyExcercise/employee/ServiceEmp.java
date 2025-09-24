package com.abc.app.one_To_ManyExcercise.employee;

import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

public interface ServiceEmp {
    EntityEmployee addEmployee(Integer Id, EntityEmployee entityEmployee);
    List<EntityEmployee> getDetails(@PathVariable int id);
}
