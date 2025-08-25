package assignment_05.dynamic_polymorphism;

public class PaymentGatewaySystem {
    public static void main(String[] args) {
        System.out.println("\nPayment Gateway System\n");


        System.out.println("--- Direct Payment Processing ---");
        CreditCardPayment creditCard = new CreditCardPayment();
        creditCard.processPayment(100.50);
        System.out.println();

        UPIPayment upi = new UPIPayment();
        upi.processPayment(75.05);
        System.out.println();


        System.out.println("--- Dynamic Polymorphism Demo ---");
        Payment payment1 = new CreditCardPayment();
        Payment payment2 = new UPIPayment();
        System.out.println("Using Payment reference for Credit Card:");
        payment1.processPayment(200.00);
        System.out.println();
        System.out.println("Using Payment reference for UPI:");
        payment2.processPayment(150.75);
        System.out.println();

        System.out.println("--- Processing Multiple Payments ---");
        Payment[] payments = {
                new CreditCardPayment(),
                new UPIPayment(),
                new CreditCardPayment()
        };
        double[] amounts = {50.00, 80.25, 120.50};
        for (int i = 0; i < payments.length; i++) {
            System.out.println("Payment " + (i + 1) + ":");
            payments[i].processPayment(amounts[i]);
            System.out.println();
        }

        System.out.println("--- Runtime Binding Demo ---");
        Payment payment;
        boolean useCreditCard = true;
        if (useCreditCard) {
            payment = new CreditCardPayment();
        } else {
            payment = new UPIPayment();
        }
        System.out.println("Runtime decided payment method:");
        payment.processPayment(300.00);
    }
}
