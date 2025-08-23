package Assignment2;

public class DynamixTaxBracketCalculator {
    public static void main(String[] args) {
        double[] incomes = {180000, 300000, 600000, 1200000, 450000};
        double taxRate;
        double taxAmount;

        for (int i = 0; i < incomes.length; i++) {
            double income = incomes[i];
            if (income <= 250000) {
                taxRate = 0.0;
            } else if (income <= 500000) {
                taxRate = 0.05;
            } else if (income <= 1000000) {
                taxRate = 0.20;
            } else {
                taxRate = 0.30;
            }

            taxAmount = income * taxRate;

            System.out.printf("User %d: Income = ₹%.2f | Tax Rate = %.0f%% | Tax = ₹%.2f\n",
                    (i + 1), income, taxRate * 100, taxAmount);
        }
    }
}

