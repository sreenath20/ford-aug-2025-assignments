package com.assignments.assignment4;

import com.training.day5.B;

public class Driver {
    public static void main(String[] args) {


        StripeGateway stripeGateway = new StripeGateway("stripe apikey","stripe connection url");
        stripeGateway.connect();
        stripeGateway.processPayment(500.0);
        stripeGateway.processRefund(100.0);
        stripeGateway.disconnect();
        System.out.println("\n");
        PayPalGateway payPalGateway = new PayPalGateway("paypal apikey","paypal connection url");
        payPalGateway.connect();
        payPalGateway.processPayment(250.0);
        payPalGateway.processRefund(50.0);
        payPalGateway.disconnect();

        Car car1 = new Car("Ford", "Mustang");
        car1.service();
        car1.repair();
        System.out.println("\n");
        Bike bike1 = new Bike("Yamaha", "Rx100");
        bike1.service();
        bike1.repair();

        ProgrammingCourse javaPC = new ProgrammingCourse("Java Programming",3.5f);
        javaPC.enrollStudent("Raamji");
        javaPC.startCourse();
        javaPC.generateCertificate("Raamji");
        System.out.println("\n");
        DesignCourse graphicsDC = new DesignCourse("Graphics Design",2.0f);
        graphicsDC.enrollStudent("Srenath");
        graphicsDC.startCourse();
        graphicsDC.generateCertificate("Srenath");

        HomeLoan homeLoan = new HomeLoan();
        homeLoan.calculateEMI(50000,10,12);
        homeLoan.approveLoan();
        System.out.println("\n");
        CarLoan carLoan = new CarLoan();
        carLoan.calculateEMI(20000,9,18);
        carLoan.approveLoan();

        SmartLight smartLight = new SmartLight("Smart Light");
        smartLight.turnOn();
        smartLight.controlByVoice("Turn on the lights");
        System.out.println("\n");
        SmartAC smartAC = new SmartAC("Smart AC");
        smartAC.turnOn();
        smartAC.controlByVoice("Set temperature to 22°C");

        Pizza pizza = new Pizza("Margherita");
        pizza.prepare();
        pizza.deliver(5);
        System.out.println("\n");
        Burger burger = new Burger("Veggie Burger");
        burger.prepare();
        burger.deliver(2);

    }
}
