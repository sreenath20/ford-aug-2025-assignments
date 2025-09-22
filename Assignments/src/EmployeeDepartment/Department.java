package EmployeeDepartment;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name="departments")
public class Department {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(unique = true, nullable=false)
    private String name;

    private String location;

    @OneToMany(mappedBy="department", fetch=FetchType.LAZY)
    @JsonManagedReference
    private List<Employee> employees;


    public Department() {
    }

    public Department(Integer id, String name, String location, List<Employee> employees) {
        this.id = id;
        this.name = name;
        this.location = location;
        this.employees = employees;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public List<Employee> getEmployees() {
        return employees;
    }

    public void setEmployees(List<Employee> employees) {
        this.employees = employees;
    }
}
