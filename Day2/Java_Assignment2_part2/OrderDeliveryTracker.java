

import java.util.Locale;

public class OrderDeliveryTracker {
    public static void main(String[] args) {
        String[] statuses = {"P", "D", "C", "F", "D", "P", "D", "P", "C", "D"};

        int pending = 0, delivered = 0, cancelled = 0, failed = 0;
        int index = 1;
        for (String code : statuses) {
            String c = (code == null) ? "" : code.trim().toUpperCase(Locale.ROOT);
            String text;
            switch (c) {
                case "P":
                    text = "Pending";
                    pending++;
                    break;
                case "D":
                    text = "Delivered";
                    delivered++;
                    break;
                case "C":
                    text = "Cancelled";
                    cancelled++;
                    break;
                case "F":
                    text = "Failed";
                    failed++;
                    break;
                default:
                    text = "Unknown";
            }
            System.out.println("Order " + index + ": " + text);
            index++;
        }

        System.out.println("\nSummary:");
        System.out.println("Pending: " + pending);
        System.out.println("Delivered: " + delivered);
        System.out.println("Cancelled: " + cancelled);
        System.out.println("Failed: " + failed);
    }
}
