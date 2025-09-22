//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.OptionalDouble;

public class Main {
    public static void main(String[] args) {
        List<Double> sales = Arrays.asList(4500.0, 12000.0, 8000.0, 3000.0, 15000.0);

        System.out.println("Sales Data Processing: ");
        System.out.println("-----------------------------------------------------");

        //filter
        List<Double> filteredSales = sales.stream().filter(sale -> sale > 5000).toList();
        System.out.println("Filtered Sales (greater than 5000): " + filteredSales);

        //sort
        List<Double> sortedSales = filteredSales.stream().sorted(Collections.reverseOrder()).toList();
        System.out.println("Sorted Sales (in descending order): " + sortedSales);

        //map
        List<Double> salesWithGST = filteredSales.stream().map(sale -> sale + sale * 0.18).toList();
        System.out.println("Sales with GST (18%): " + salesWithGST);

        //high sale
        Double highestSale = sales.stream().max((d1, d2) -> Double.compare(d1, d2)).orElse(0.0);
        System.out.println("Highest Sale: " + highestSale);

        //totalSales
        Double totalSales = sales.stream().reduce(0.0, (sum, amount) -> sum + amount);
        System.out.println("Total Sales: " + totalSales);
        System.out.println("-----------------------------------------------------");


    }
}