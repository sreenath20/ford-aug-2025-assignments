package assignment_03.employee_management_system;

public class EmployeeManagementSystem {
        public static void main(String[] args) {
            System.out.println("--- Welcome to Employee Management System! \n");

            Employee emp1 = new Employee(101, "Anil kumar", 50000.0, "MP&L");

            emp1.displayEmployeeInfo();
            System.out.println();

            Manager m1 = new Manager(201, "Bob", 80000.0, "IT", 5, "Mobile App Development");
            m1.displayFullManagerDetails();
            System.out.println();

            System.out.println("Updating Employee Information ---");
            emp1.setSalary(55000.0);
            emp1.setDepartment("Software Development");
            System.out.println("** Anil got promoted! **");
            emp1.displayEmployeeInfo();
            System.out.println();

            System.out.println("--- Updating Manager Information ---");
            m1.setTeamSize(8);
            m1.setProjectName("AI ChatBot Project");
            System.out.println("** Bob's team expanded! **");
            m1.displayFullManagerDetails();
        }
}
