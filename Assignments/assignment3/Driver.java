package com.assignments.assignment3;

public class Driver {
    public static void main(String[] args) {

        Employee employee = new Employee(241,"Raamji",50_000,"ET");
        employee.display();
        System.out.println("\n");
        Manager manager = new Manager(232,"Karthick",1_00_000,"ET","MQTT documentation",3);
        manager.display();

        SavingsAccount savingsAccount = new SavingsAccount("12345","Raamji",100000,5);
        savingsAccount.deposit(50000);
        savingsAccount.calculateIntrest();
        savingsAccount.withdraw(25000);
        System.out.println("\n");
        CurrentAccount currentAccount = new CurrentAccount("54321","Raamji",500000,200000);
        currentAccount.withdraw(350000);
        currentAccount.deposit(150000);

        Electronics electronics = new Electronics(1234,"Tv",34999,"Wall mountable",2);
        electronics.displayDetails();
        System.out.println("\n");
        Clothing clothing = new Clothing(3214,"Boys T-Shirt",599,"Cotton fit",40,"Cotton");
        clothing.displayDetails();
        System.out.println("\n");
        Groceries groceries = new Groceries(2134,"Mustard",50,"Refined","12/25");
        groceries.displayDetails();

        InPatient inPatient = new InPatient(1,"Lalith",55,814,"07/06/2025");
        inPatient.dislayPatientDetails();
        System.out.println("\n");
        OutPatient outPatient = new OutPatient(2,"Rajan",65,"11/08/2025",500);
        outPatient.dislayPatientDetails();

        Device device;
        device = new SmartLight(1,"Light","light-off");
        device.performAction();
        device.performAction();
        System.out.println("\n");
        device = new SmartThermostat(2,"Thermostat","high");
        device.performAction();
        device.performAction();
        System.out.println("\n");
        device = new SmartLock(3,"Lock","unlocked");
        device.performAction();
        device.performAction();

    }
}
