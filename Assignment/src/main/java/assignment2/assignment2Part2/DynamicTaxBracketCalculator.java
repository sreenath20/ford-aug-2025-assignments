package assignment2.assignment2Part2;

public class DynamicTaxBracketCalculator {
    public static void main(String[] args) {
        Double[] income = {50000.57, 400000.87, 760008.54, 29000.44, 1000000.00};
        Double taxPercent = 0.0;

        for (int i = 0; i < income.length; i++) {
            if (income[i] <= 250000) {
                System.out.println("0% tax on the provided income");
            } else if ((income[i] > 250000 & income[i] <= 500000)) {
                taxPercent = income[i] * 0.05;
                System.out.println("Tax percent based on the income " + income[i] + " is 5% and the tax amount is Rs." + taxPercent);
            } else if ((income[i] > 500000 & income[i] < 1000000)) {
                taxPercent = income[i] * 0.2;
                System.out.println("Tax percent based on the income " + income[i] + " is 20% and the tax amount is Rs." + taxPercent);
            } else if (income[i] == 1000000) {
                taxPercent = income[i] * 0.3;
                System.out.println("Tax percent based on the income " + income[i] + " is  5% and the tax amount is Rs." + taxPercent);

            }
        }

    }
}
