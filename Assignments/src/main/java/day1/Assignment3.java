package day1;

public class Assignment3 {
    public static void main(String[] args) {
        Double price1 = Double.parseDouble("299.99");
        Double price2 = Double.parseDouble("279.50");
        Double price3 = Double.parseDouble("310.00");

        double minPrice = (price1 < price2) ? (price1 < price3 ? price1 : price3) : (price2 < price3 ? price2 : price3);
        double maxPrice = (price1 > price2) ? (price1 > price3 ? price1 : price3) : (price2 > price3 ? price2 : price3);

        double differencePercent = ((maxPrice - minPrice) / minPrice) * 100;

        System.out.println("Prices: Site1 ₹" + price1 + ", Site2 ₹" + price2 + ", Site3 ₹" + price3);
        System.out.println("Best Deal: ₹" + minPrice);
        System.out.printf("Price Difference: %.2f%%\n", differencePercent);

    }
}
