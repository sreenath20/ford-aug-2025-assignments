package day2Part2;

public class Assignment6 {
    public static void main(String[] args) {
        String[] statuses = {"P", "D", "C", "F", "P", "D", "P", "C", "F", "D"};
        int pendingCount = 0, deliveredCount = 0, cancelledCount = 0, failedCount = 0;

        int orderNumber = 1;
        for (String status : statuses) {
            String meaning;
            switch (status) {
                case "P":
                    meaning = "Pending";
                    pendingCount++;
                    break;
                case "D":
                    meaning = "Delivered";
                    deliveredCount++;
                    break;
                case "C":
                    meaning = "Cancelled";
                    cancelledCount++;
                    break;
                case "F":
                    meaning = "Failed";
                    failedCount++;
                    break;
                default:
                    meaning = "Unknown";
            }
            System.out.println("Order " + orderNumber + ": " + meaning);
            orderNumber++;
        }

        System.out.println("Summary:");
        System.out.println("Pending: " + pendingCount);
        System.out.println("Delivered: " + deliveredCount);
        System.out.println("Cancelled: " + cancelledCount);
        System.out.println("Failed: " + failedCount);
    }
}
