package com.demo.day4;

import java.util.Scanner;

public class Driver {

    public static void main(String[] args) {

        //Employee

//        Employee employee = new Employee();
//
//        employee.setName("Deepak");
//        employee.setEmail("deepak@gmail.com");
//        employee.setId("PUQ98HJK");
//
//        System.out.println(employee.getName());
//        System.out.println(employee.getEmail());
//        System.out.println(employee.getId());
//
//        Employee employee2 = new Employee("Kumar","k@gmail","MM123456M");
//        System.out.println(employee2.getName());
//        System.out.println(employee2.getEmail());
//        System.out.println(employee2.getId());
//
//        System.out.println(employee2);

        //Product

//        Product product1 = new Product();
//
//        product1.setId("123");
//        product1.setName("Biscuit");
//        product1.setPrice(20.0);
//
//        System.out.println(product1.getName());
//        System.out.println(product1.getPrice());
//        System.out.println(product1.getId());
//
//        Product product2 = new Product("Chips","456",25.0);
//        System.out.println(product2.getName());
//        System.out.println(product2.getPrice());
//        System.out.println(product2.getId());
//
//        System.out.println(product1);
//        System.out.println(product2);

        //CREATE A BANK ACC
        //USERNAME,USERID,BALANCE
        //WRITE OR IMPLEMENT BELOW METHODS
        //ADD FUNDS
        //WITHDRAW FUNDS
        //DISPLAY ACCOUNT DETAILS

        Scanner sc=new Scanner(System.in);

//        BankAccount account1 = new BankAccount("Deepak","ABC123",25000.00);
//
//        int choice;
//        double funds;
//
//        while(true){
//            System.out.println("----------------------");
//            System.out.println("MENU");
//            System.out.println("1. ADD FUNDS");
//            System.out.println("2. WITHDRAW FUNDS");
//            System.out.println("3. ACCOUNT DETAILS");
//            System.out.println("4. EXIT");
//            System.out.println("Enter your choice : ");
//            choice=sc.nextInt();
//            System.out.println("----------------------");
//
//            if(choice==1){
//                System.out.println("Enter the amount to be deposited : ");
//                funds=sc.nextDouble();
//                if(funds>0){
//                    account1.addFunds(funds);
//                    System.out.println("ADD FUNDS SUCCESSFUL, BALANCE : "+account1.getBalance());
//                }
//                else{
//                    System.out.println("FUNDS CANNOT NEGATIVE OR EQUAL TO ZERO");
//                }
//            }
//            else if(choice==2){
//                System.out.println("Enter the amount to be withdrawed : ");
//                funds=sc.nextDouble();
//                if(funds<= account1.getBalance()){
//                    account1.withdrawFunds(funds);
//                    System.out.println("WITHDRAW FUNDS, BALANCE : "+account1.getBalance());
//                }
//                else{
//                    System.out.println("FUNDS CANNOT BE GREATER THAN BALANCE");
//                }
//            }
//            else if(choice==3){
//                System.out.println("ACCOUNT DETAILS : "+account1);
//            }
//            else if(choice==4){
//                System.out.println("APPLICATION EXITED SUCCESSFULLY");
//                break;
//            }
//            else{
//                System.out.println("INVALID INPUT");
//            }
//        }


        //INHERITANCE
        //Parent is implicitly inheriting from Object class because java wants evetg to be object oriented
        //So any class created will automatically inherits from Object class
//        Parent parent = new Parent();
//        parent.display();
//
//        Child child = new Child();
//        child.display();
//        child.info();
//
//        GrandChild grandChild = new GrandChild();
//        grandChild.display();
//        grandChild.info();

//        System.out.println("DYNAMIC POLYMORPHISM");
        //PARENT METHOD REFERENCE CAN ACCESS PARENT METHODS AND CHILD OVERRIDDEN METHODS BUT NOT NEW IMPLEMENTATIONS
//        Parent parentref;
//        parentref = parent; // parent is already created object
//        parentref.display();
//        parentref = child;
//        parentref.display();
        //parentref.info(); //throws an error not possible cuz new implementation are not visible but overrided methods are visible


        //Create a base class called employee
        //id,name,basicsalary,calculatesalary
        //create 2 subclasses manager and developer
        //calculatesalary - bonus,projectallowance
        //override calculate in parent

        Developer developer = new Developer("Deepak Developer","d@gmail.com","1",20000.00,1500.00);
        Manager manager = new Manager("Deepak Manager","d@gmail.com","1",50000.00,15000.00);


        System.out.println("DEVELOPER");
        System.out.println("DEVELOPER DETAILS : "+developer);
        System.out.println("DEVELOPER PROJECT ALLOWANCE : "+developer.getProjectAllowance());
        System.out.println("DEVELOPER SALARY : "+developer.calculatesalary());

        System.out.println("MANAGER");
        System.out.println("MANAGER DETAILS : "+manager);
        System.out.println("MANAGER BONUS : "+manager.getBonus());
        System.out.println("MANAGER SALARY : "+manager.calculatesalary());

    }
}
