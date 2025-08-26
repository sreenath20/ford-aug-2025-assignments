package day6.Part6_2.Assignment2;

public class Checkout {
    public double calculateTotal(double price, int quantity) {
        if (price <= 0 || quantity <= 0) {
            throw new IllegalArgumentException("Price and quantity must be greater than zero.");
        }

        double total = price * quantity;

        if (Double.isInfinite(total)) {
            throw new ArithmeticException("Calculation overflow.");
        }

        return total;
    }
}
