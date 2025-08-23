public class PaymentGatewayDemo {

    public interface PaymentGateway {
        String DEFAULT_CURRENCY = "INR";
        double TAX_RATE = 0.18;

        boolean processPayment(double amount);

        default double applyTax(double amount) {
            return amount + (amount * TAX_RATE);
        }

        static boolean validateAmount(double amount) {
            return amount > 0;
        }
    }

    public static class PayPalGateway implements PaymentGateway {
        @Override
        public boolean processPayment(double amount) {
            System.out.println("Processing payment via PayPal for amount: " + amount + " " + PaymentGateway.DEFAULT_CURRENCY);
            return true;
        }
    }

    public static class StripeGateway implements PaymentGateway {
        @Override
        public boolean processPayment(double amount) {
            System.out.println("Processing payment via Stripe for amount: " + amount + " " + PaymentGateway.DEFAULT_CURRENCY);
            return true;
        }

        @Override
        public double applyTax(double amount) {
            double taxed = amount + (amount * PaymentGateway.TAX_RATE) + 10.0;
            return taxed;
        }
    }

    public static void main(String[] args) {
        double amount = 1000.0;
        double invalidAmount = -50.0;

        System.out.println("Valid amount: " + PaymentGateway.validateAmount(amount));
        if (PaymentGateway.validateAmount(amount)) {
            PaymentGateway paypal = new PayPalGateway();
            PaymentGateway stripe = new StripeGateway();

            double paypalAmountWithTax = paypal.applyTax(amount);
            double stripeAmountWithTax = stripe.applyTax(amount);
            paypal.processPayment(paypalAmountWithTax);
            stripe.processPayment(stripeAmountWithTax);
        }

        System.out.println("Default Currency: " + PaymentGateway.DEFAULT_CURRENCY);
        System.out.println("Tax Rate: " + PaymentGateway.TAX_RATE);

        System.out.println("\nValid amount (negative): " + PaymentGateway.validateAmount(invalidAmount));
        if (!PaymentGateway.validateAmount(invalidAmount)) {
            System.out.println("Amount " + invalidAmount + " is invalid. Skipping processing.");
        }
    }
}
