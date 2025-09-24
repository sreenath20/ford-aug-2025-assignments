package com.abc.app.one_To_ManyExcercise.employee;

import com.abc.app.one_To_ManyExcercise.department.EntityDepartment;
import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class EntityEmployee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer Id;
    private String firstName;
    private String lastName;
    private String email;
    private Double Salary;

    @ManyToOne()
    @JoinColumn(name="depart_Id",referencedColumnName = "deptId")
    @JsonIgnore
    private EntityDepartment entityDepartment;
}
