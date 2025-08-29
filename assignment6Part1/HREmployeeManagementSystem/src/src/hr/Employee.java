package hr;

public class Employee {
    //private: only accessible within the hr package
    //default: accessible within the hr package
    //protected: accessible in hr package and subclasses outside
    // public: accessible everywhere
    private double salary;
    int employeeID;    //default
    protected String department;
    public String name;

    public Employee(double salary, int employeeID, String department,String name) {
        this.salary = salary;
        this.employeeID = employeeID;
        this.name=name;
        this.department = department;
    }

    public double getSalary() {
        return salary;
    }
}
