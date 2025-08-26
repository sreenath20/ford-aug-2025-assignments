package day6.Part6_1.Assignment1;

public class HRPortal {
    public void accessEmployee(Employee e) {
        System.out.println("Accessing HR Portal...");
        // System.out.println(e.salary); //private - not accessible
        System.out.println("Employee ID: " + e.employeeId);
        System.out.println("Department: " + e.department);
        System.out.println("Name: " + e.employeeName);
    }
}
