package Assignment8.employeemanagementsystem;

import java.util.Objects;

public class Employee extends Object {
    private Integer id;
    private String Name;
    private String department;
    private Double salary;

    public Employee() {}
    public Employee(Integer id, String name, String department, Double salary) {
        this.id = id;
        this.Name = name;
        this.department = department;
        this.salary = salary;
    }
    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }
    public String getName() {
        return Name;
    }
    public void setName(String name) {
        this.Name = name;
    }
    public String getDepartment() {
        return department;
    }
    public void setDepartment(String department) {
        this.department = department;
    }
    public Double getSalary() {
        return salary;
    }
    public void setSalary(Double salary) {
        this.salary = salary;
    }
    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + Name + '\'' +
                ", department=" + department +
                ", Salary=" + salary+
                '}';
    }
    public boolean equals(Object o) {
        if(o==null || o.getClass()!=Employee.class){
            return false;
        }
        Employee e=(Employee)o;
        return (this.id.equals(e.id));
    }
    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }

}
