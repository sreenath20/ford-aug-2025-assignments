package assignment2.assignment2Part2;

public class TollBoothBillingSystem {

    public static void main(String[] args) {

        String[] vehicleType = {"Car", "Truck", "Bike", "Car", "Bus"};
        Integer totalTollCollection = 0;
        Integer carCount = 0;
        Integer truckCount = 0;
        Integer bikeCount = 0;
        Integer busCount = 0;

        for (int i = 0; i < vehicleType.length; i++) {
            switch (vehicleType[i]) {
                case "Car":
                    System.out.println("The Vehicle is Car");
                    totalTollCollection += 100;
                    carCount++;
                    break;
                case "Truck":
                    System.out.println("The Vehicle is Truck");
                    totalTollCollection += 250;
                    truckCount++;
                    break;
                case "Bike":
                    System.out.println("The Vehicle is Bike");
                    totalTollCollection += 50;
                    bikeCount++;
                    break;
                case "Bus":
                    System.out.println("The Vehicle is Bus");
                    totalTollCollection += 200;
                    busCount++;
                    break;
            }
        }
        System.out.println("The Total Toll Collection is: " + totalTollCollection);
        System.out.println("The total count of vehicle types is below: ");
        System.out.println("Cars  - " + carCount);
        System.out.println("Bike  - " + bikeCount);
        System.out.println("Bus   - " + busCount);
        System.out.println("Truck - " + truckCount);
    }
}
