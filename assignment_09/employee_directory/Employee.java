package assignment_09.employee_directory;

import java.util.Objects;

public class Employee {
    int id;
    String name;
    String department;

    public Employee(int id, String name, String department) {
        this.id = id;
        this.name = name;
        this.department = department;
    }

    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;
        if (getClass() != obj.getClass()) return false;
        Employee other = (Employee) obj;
        return id == other.id;
    }

    public int hashCode() {
        return Objects.hash(id);
    }

    public void displayEmployee() {
        System.out.println("ID: " + id + ", Name: " + name + ", Department: " + department);
    }
}
