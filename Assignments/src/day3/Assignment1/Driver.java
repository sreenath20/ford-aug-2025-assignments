package day3.Assignment1;

public class Driver {
    public static void main(String[] args) {

        Employee e = new Employee(1, "Suhas", 60000.0, "ET");
        e.displayEmployeeInfo();
        Manager m = new Manager(21, "Alex", 900000.0, "GDIA", 17, "XYZ");
        m.displayManagerDetails();

    }
}
