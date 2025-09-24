package com.abc.app.one_To_ManyExcercise.department;

import com.abc.app.one_To_ManyExcercise.employee.EntityEmployee;
import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class EntityDepartment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer deptId;
    @Column(unique = true,nullable = false)
    private String Name;
    private String Location;

    @OneToMany(mappedBy = "entityDepartment",cascade = CascadeType.ALL)
    @JsonIgnore
    private List<EntityEmployee> entityEmployee = new ArrayList<>();

    public  void adddata(EntityEmployee employees){
       entityEmployee.add(employees);
       employees.setEntityDepartment(this);
   }

}
