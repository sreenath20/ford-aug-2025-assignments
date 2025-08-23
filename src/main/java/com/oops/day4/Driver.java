package com.oops.day4;

public class Driver {
    public static void main(String[] args) {
        Integer data = 100;
        Employee employee1 = new Employee();
        employee1.setName("cheran");
        employee1.setEmail("chern@ford.com");
        employee1.setEmpid("1");

        System.out.println("Name: " + employee1.getName());
        System.out.println("Email: " + employee1.getEmail());
        System.out.println("Empid: " + employee1.getEmpid());

        Employee employee2=new Employee("gomathi","gomathi@ford.com","2");
        System.out.println(employee2.toString());
        System.out.println(employee2);
        System.out.println(employee1);

        Product product1 = new Product();
        product1.setName("Laptop");
        product1.setProductid("P001");
        product1.setPrice(50000.0);

        System.out.println("Product Name: " + product1.getName());
        System.out.println("Product ID: " + product1.getProductid());
        System.out.println("Product Price: " + product1.getPrice());
        System.out.println(product1.toString());


        Bank account1=new Bank("cheran","2021115022",10000.0);
        System.out.println("Account Holder Name: " + account1.getName());
        System.out.println("User ID: " + account1.getUserid());
        System.out.println("Initial Balance: " + account1.getBalance());
        account1.addfunds(5000.0);
        System.out.println(account1.displaydetails());
        account1.withdrawfunds(2000.0);
        System.out.println(account1.displaydetails());

        parent parent1 = new parent();
        parent1.display1();
        child child1=new child();
        child1.display1();
        child1.display2();
        grandchild grandchild1=new grandchild();
        grandchild1.display3();
        System.out.println("-----------------------------");
        parent parent2=parent1;
        parent2.display1();
        child child2=new child();
        parent2=child2;
        parent2.display1();
        String xx=parent2.name;
        System.out.println("Name: " + xx);
    }
}
