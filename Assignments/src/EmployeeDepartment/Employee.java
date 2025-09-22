package EmployeeDepartment;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;

@Entity
@Table(name=" employees ")
public class Employee {

    @Id
    private Integer id;

    private String firstName;
    private String lastName;

    @Column(unique=true,nullable=false)
    private String email;

    private Double Salary;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="department_id")
    @JsonBackReference
    private Department department;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Double getSalary() {
        return Salary;
    }

    public void setSalary(Double salary) {
        Salary = salary;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }
}
