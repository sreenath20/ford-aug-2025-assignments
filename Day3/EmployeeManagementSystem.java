class Employee {
    private int id;
    private String name;
    private double salary;
    private String department;

    public Employee(int id, String name, double salary, String department) {
        this.id = id; this.name = name; this.salary = salary; this.department = department;
    }

    // Getters and setters
    public int getId() { return id; }
    public void setId(int id) { this.id = id; }
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    public double getSalary() { return salary; }
    public void setSalary(double salary) { this.salary = salary; }
    public String getDepartment() { return department; }
    public void setDepartment(String department) { this.department = department; }

    public void display() {
        System.out.println("Employee[id=" + id + ", name=" + name + ", salary=" + salary +
                ", department=" + department + "]");
    }
}

class Manager extends Employee {
    private int teamSize;
    private String projectName;

    public Manager(int id, String name, double salary, String department, int teamSize, String projectName) {
        super(id, name, salary, department);
        this.teamSize = teamSize;
        this.projectName = projectName;
    }

    public int getTeamSize() { return teamSize; }
    public void setTeamSize(int teamSize) { this.teamSize = teamSize; }
    public String getProjectName() { return projectName; }
    public void setProjectName(String projectName) { this.projectName = projectName; }

    public void displayManagerDetails() {
        display();
        System.out.println(" Manager[teamSize=" + teamSize + ", projectName=" + projectName + "]");
    }
}

public class EmployeeManagementSystem {
    public static void main(String[] args) {
        Employee e = new Employee(1001, "Alice", 70000, "Engineering");
        Manager m = new Manager(1002, "Bob", 95000, "Engineering", 8, "Apollo");

        e.display();
        m.displayManagerDetails();
    }
}
