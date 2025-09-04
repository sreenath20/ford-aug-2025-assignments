package exercise_java_stream_api;

import java.util.*;
import java.util.stream.*;

public class SalesRecords {
    public static void main(String[] args) {
        List<Integer> sales = Arrays.asList(200, 450, 300, 150, 600);

        Integer totalSales = sales.stream()
                .reduce(0, Integer::sum);

        System.out.println("\nTotal sales: Rs." + totalSales);
    }
}
