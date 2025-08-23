

import java.util.Scanner;

public class PriceComparisonEngine {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Price from site A: ");
        double p1 = Double.valueOf(sc.nextLine());
        System.out.print("Price from site B: ");
        double p2 = Double.valueOf(sc.nextLine());
        System.out.print("Price from site C: ");
        double p3 = Double.valueOf(sc.nextLine());

        double min = (p1 <= p2) ? ((p1 <= p3) ? p1 : p3) : ((p2 <= p3) ? p2 : p3);
        double max = (p1 >= p2) ? ((p1 >= p3) ? p1 : p3) : ((p2 >= p3) ? p2 : p3);

        double diff = max - min;
        double diffPercent = (max == 0) ? 0.0 : (diff / max) * 100.0;

        System.out.printf("Prices: A=%.2f, B=%.2f, C=%.2f%n", p1, p2, p3);
        System.out.printf("Lowest price = %.2f%n", min);
        System.out.printf("Highest price = %.2f%n", max);
        System.out.printf("Absolute difference = %.2f%n", diff);
        System.out.printf("Difference (%% of highest) = %.2f%%%n", diffPercent);

        System.out.println("Best deal at price: " + min);
        sc.close();
    }
}
