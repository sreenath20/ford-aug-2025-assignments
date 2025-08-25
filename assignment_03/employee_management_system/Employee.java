package assignment_03.employee_management_system;

class Employee {
    private int id;
    private String name;
    private double salary;
    private String department;


    public Employee(int id, String name, double sal, String dept) {
        this.id = id;
        this.name = name;
        this.salary = sal;
        this.department = dept;
    }


    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public String getDepartment() {
        return department;
    }



    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public void displayEmployeeInfo() {
        System.out.println("Employee Information");
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Salary: " + salary);
        System.out.println("Department: " + department);
    }
}
