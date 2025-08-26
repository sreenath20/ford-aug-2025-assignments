package day2.Part_2;

public class Assignment10 {
    public static void main(String[] args) {
        double[] incomes = {200000, 300000, 750000, 1200000, 450000};

        for (int i = 0; i < incomes.length; i++) {
            double taxPercent;
            if (incomes[i] <= 250000) {
                taxPercent = 0;
            } else if (incomes[i] <= 500000) {
                taxPercent = 5;
            } else if (incomes[i] <= 1000000) {
                taxPercent = 20;
            } else {
                taxPercent = 30;
            }

            double taxAmount = (incomes[i] * taxPercent) / 100;
            System.out.println("User " + (i+1) + " → Income: ₹" + incomes[i] +
                    ", Tax %: " + taxPercent + "%" +
                    ", Tax Amount: ₹" + taxAmount);
        }
    }
}
