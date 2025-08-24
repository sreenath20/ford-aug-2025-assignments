package day6_1.Assignment1;

public class HRPortal {
    public static void main(String[] args) {
        Employee employee = new Employee(75000,"IT","NE123");
        employee.getSalary();
        employee.department = "ET";
        System.out.println(employee.employeeId);
    }
}
