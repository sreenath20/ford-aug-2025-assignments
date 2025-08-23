package Assignment9_JavaCollectionSetMapwithCustomDataTypes;

import java.util.*;
import java.util.stream.Collectors;

class Employee {
    private final int id;
    private String name;
    private String department;

    public Employee(int id, String name, String department) {
        this.id = id;
        this.name = name;
        this.department = department;
    }

    public int getId() { return id; }
    public String getName() { return name; }
    public String getDepartment() { return department; }
    public void setName(String name) { this.name = name; }
    public void setDepartment(String department) { this.department = department; }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return id == employee.id; // uniqueness by id
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public String toString() {
        return "Employee{id=" + id +
                ", name='" + name + '\'' +
                ", department='" + department + '\'' +
                '}';
    }
}

class EmployeeDirectory {
    private final Set<Employee> employees = new HashSet<>();

    // Add a new employee. Returns true if added, false if duplicate
    public boolean add(Employee e) {
        return employees.add(e);
    }

    // Remove by ID. Returns true if removed.
    public boolean removeById(int id) {
        return employees.removeIf(e -> e.getId() == id);
    }

    // Update department for a given employee id. Returns true if found & updated.
    public boolean updateDepartment(int id, String newDepartment) {
        for (Employee e : employees) {
            if (e.getId() == id) {
                e.setDepartment(newDepartment);
                return true;
            }
        }
        return false;
    }

    // View all employees (unordered)
    public List<Employee> viewAll() {
        return new ArrayList<>(employees);
    }

    // Find by ID
    public Optional<Employee> findById(int id) {
        return employees.stream().filter(e -> e.getId() == id).findFirst();
    }

    // Find all employees in a department
    public List<Employee> findByDepartment(String department) {
        return employees.stream()
                .filter(e -> e.getDepartment().equalsIgnoreCase(department))
                .collect(Collectors.toList());
    }

    // Sorted by name (ascending)
    public List<Employee> sortedByName() {
        return employees.stream()
                .sorted(Comparator.comparing(Employee::getName, String.CASE_INSENSITIVE_ORDER))
                .collect(Collectors.toList());
    }

    // Sorted by department then by id
    public List<Employee> sortedByDepartmentThenId() {
        return employees.stream()
                .sorted(Comparator.comparing(Employee::getDepartment, String.CASE_INSENSITIVE_ORDER)
                        .thenComparingInt(Employee::getId))
                .collect(Collectors.toList());
    }
}

class EmployeeDirectoryDemo {
    public static void main(String[] args) {
        EmployeeDirectory dir = new EmployeeDirectory();
        dir.add(new Employee(1, "Alice", "HR"));
        dir.add(new Employee(2, "Bob", "Engineering"));
        dir.add(new Employee(3, "Carlos", "Engineering"));
        dir.add(new Employee(2, "Bob Duplicate", "Sales")); // will not add because id=2 exists

        System.out.println("All employees: " + dir.viewAll());
        System.out.println("Find id=2: " + dir.findById(2));
        System.out.println("Engineering: " + dir.findByDepartment("Engineering"));

        dir.updateDepartment(1, "People Ops");
        System.out.println("Sorted by name: " + dir.sortedByName());
        System.out.println("Sorted by department then id: " + dir.sortedByDepartmentThenId());
        dir.removeById(3);
        System.out.println("After removing id=3: " + dir.viewAll());
    }
}
