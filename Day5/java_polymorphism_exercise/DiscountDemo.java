


class DiscountCalculator {
    // Method 1: percent-based discount
    public double calculateDiscount(double price, double discountPercent) {
        return price * (discountPercent / 100.0);
    }

    // Method 2: flat discount (isFlat true => treat discountAmount as flat)
    public double calculateDiscount(double price, double discountAmount, boolean isFlat) {
        if (isFlat) {
            // Do not return a discount larger than the price
            return Math.min(discountAmount, price);
        } else {
            // If isFlat is false, interpret discountAmount as percent
            return price * (discountAmount / 100.0);
        }
    }

    // Method 3: default discount = 5% of price
    public double calculateDiscount(double price) {
        return price * 0.05;
    }
}

public class DiscountDemo {
    public static void main(String[] args) {
        DiscountCalculator dc = new DiscountCalculator();

        // percent-based discount
        double percentDiscount = dc.calculateDiscount(2000.0, 5.0); // 5% of 2000 = 100
        System.out.println("Discount using percent: " + percentDiscount);

        // flat discount
        double flatDiscount = dc.calculateDiscount(500.0, 50.0, true); // flat 50
        System.out.println("Discount using flat amount: " + flatDiscount);

        // default discount (5%)
        double defaultDiscount = dc.calculateDiscount(500.0); // 5% of 500 = 25
        System.out.println("Discount using default: " + defaultDiscount);

    }
}

