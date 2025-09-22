package javatopic.day9_collections.exercise;

//Exercise : Create List of employees and do below operations:
// 1) CRUD operations,
// 2) Sort employee list by id/name/salary,
// 3) Search for given Employee in list


import java.util.Objects;

public class Employee extends Object implements Comparable<Employee> {


    private Integer employeeId;
    private String firstName;
    private Double salary;

    public Employee() {
    }
    public Employee(Integer employeeId, String firstName, Double salary) {
        this.employeeId = employeeId;
        this.firstName = firstName;
        this.salary = salary;

    }

    public Integer getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(Integer employeeId) {
        this.employeeId = employeeId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return Objects.equals(employeeId, employee.employeeId);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(employeeId);
    }

    @Override
    public String toString() {
        return "Employee{" +
                "employeeId=" + employeeId +
                ", firstName='" + firstName + '\'' +
                ", salary=" + salary +
                '}';
    }

    @Override
    public int compareTo(Employee e2) {
        return this.employeeId.compareTo(e2.getEmployeeId());

    }




}
