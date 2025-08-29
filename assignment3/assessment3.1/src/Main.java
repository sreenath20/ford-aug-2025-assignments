//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Employee employee = new Employee();
        employee.setName("Rishan");
        employee.display();
        Manager manager = new Manager();
        manager.setName("uiop");
        manager.display(9,"opo");
        System.out.println(employee.getName());
        manager.display(7,"proj");
        System.out.println("---------------------------");
        employee.setSalary(5000);
        employee.setDepartment("Manager");
        employee.display();
    }
}