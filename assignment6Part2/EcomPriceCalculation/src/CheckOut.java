public class CheckOut {

    public double calculateTotal(double price, int quantity) {
        if (price <= 0 || quantity <= 0) {
            throw new IllegalArgumentException("Invalid input please enter valid inputs!");

        }

        double total = price * quantity;
        if (Double.isInfinite(total) || total > Double.MAX_VALUE) {
            throw new ArithmeticException("Overflow occurred during total calculation.");
        }
        return total;
    }
}
