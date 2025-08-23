package day12_lambda_stream.Excercise;

import java.util.Objects;

public class Employee implements Comparable<Employee> {
    private Integer id;
    private String name;
    private Double salary;

    public Employee() {
    }

    public Employee(Integer id, String name, Double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public Integer getId() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getSalary() {
        return this.salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    public String toString() {
        return "Employee{id=" + this.id + ", name='" + this.name + "', salary=" + this.salary + "}";
    }

    public boolean equals(Object o) {
        if (o != null && this.getClass() == o.getClass()) {
            Employee employee = (Employee)o;
            return Objects.equals(this.id, employee.id);
        } else {
            return false;
        }
    }

    public int hashCode() {
        return Objects.hashCode(this.id);
    }

    public int compareTo(Employee e2) {
        return this.id.compareTo(e2.getId());
    }
}