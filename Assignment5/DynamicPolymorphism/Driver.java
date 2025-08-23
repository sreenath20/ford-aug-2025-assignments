package Assignment5.DynamicPolymorphism;

public class Driver {
        public static void main(String[] args) {
            Payment payment1 = new CreditCardPayment();
            Payment payment2 = new UPIPayment();

            payment1.processPayment(1000.0);
            payment2.processPayment(500.0);
        }

}
