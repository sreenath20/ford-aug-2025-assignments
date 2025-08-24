package day3.Assignment1;

public class Driver {
    public static void main(String[] args) {
        Employee e = new Employee(101, "A", 60000.0, "ET");
        e.displayEmployeeInfo();
        Manager m = new Manager(201, "B", 9000.0, "GDIA", 12, "XYZ");
        m.displayManagerDetails();
    }
}
