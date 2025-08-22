package com.fullstackab.OOPS.Day4;

public class Driver {
    public static void main(String[] args) {
        System.out.println("Encapsulation concepts");
        Employee employee = new Employee();

        employee.setName("Abinaya");
        employee.setEmail("babinaya@ford.com");
        employee.setGender("Female");
        employee.setId("AB001");

        System.out.println(employee.getName());
        System.out.println(employee.getEmail());
        System.out.println(employee.getGender());
        System.out.println(employee.getId());
        // printing the details in a formatted way .. explicit way
        System.out.println(employee.toString());

        Employee employee2 = new Employee("Saras", "saras@ford.com", "Female", "SR0001");
//        System.out.println(employee2.getName());;
//        System.out.println(employee2.getEmail());
//        System.out.println(employee2.getGender());
//        System.out.println(employee2.getId());
        //calls the tostring method called implicitly here
        System.out.println(employee2);

        // Product Class
        System.out.println("Product tasks");
        Product product1 = new Product();
        product1.setProductName("Bottle");
        product1.setProductId(21);
        product1.setProductPrice(20.00);
        System.out.println(product1.toString());

        Product product2 = new Product("Bag", 22, 30.00);
        System.out.println(product2.toString());

        // Bank account - addFunds and Withdraw funds, view account details
        System.out.println("Account details task with additional methods");
        Account userAccount1 = new Account(10001, "ABI", 5000.00);
        System.out.println("Your Account Details");
        userAccount1.displayAccountDetails();
        userAccount1.addFunds(1000.00);
        userAccount1.withDrawFunds(500.00);
        System.out.println("Account details after withdrawal");
        userAccount1.displayAccountDetails();

        // Inheritance Concepts
        System.out.println("Inheritance Concepts");
        Parent parent = new Parent();
        parent.display();
        Child child = new Child();
        child.display();
        GrandChild grandChild = new GrandChild();
        grandChild.display();
        //creating only the reference variable and it will be in stack and no memory allocated in Heap
        //but child object memory allocated in the heap area
        // so we can access we can use the parentref variable to use the child object.
        Parent parentRef ;
        //parentRef = new Parent();
        parentRef = child;
        parentRef.display();

        // Create base class as Employee and create 2 subclasses manager and developer .
        // Implement calculate salary for the employee. Manager can add bonus.. For developer can add project allowance.
        System.out.println(" Employee Salary calc for manager and developer");
        EmployeeData  employeeRef = new EmployeeData(1001,"John","Manager",2000.00);
        employeeRef.calculateSalary();
        Manager manager = new  Manager();
        Developer developer = new  Developer();
        EmployeeData employeeNewRef;
        employeeNewRef = manager;
       // employeeNewRef.calculateSalary();
    }
}

