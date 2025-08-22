package javatopic.day3conditionalloop.assignments;

// toll booth billing assignment
public class Assignment8 {
    public static void main(String[] args) {
        int totalVehicle = 5;
        String[] vehicleType = new String[totalVehicle];
        vehicleType[0] = "Car";
        vehicleType[1] = "Truck";
        vehicleType[2] = "Bike";
        vehicleType[3] = "Car";
        vehicleType[4] = "Bus";
        int noOfCar = 0;
        int noOfTruck = 0;
        int noOfBike = 0;
        int noOfBus = 0;
        int totalTollCollection = 0;
        for (int vehicle = 0; vehicle < totalVehicle; vehicle++) {
            switch (vehicleType[vehicle]) {
                case "Car":
                    totalTollCollection = totalTollCollection + 100;
                    noOfCar = noOfCar + 1;
                    break;
                case "Truck":
                    totalTollCollection = totalTollCollection + 250;
                    noOfTruck = noOfTruck + 1;
                    break;
                case "Bike":
                    totalTollCollection = totalTollCollection + 50;
                    noOfBike = noOfBike + 1;
                    break;
                case "Bus":
                    totalTollCollection = totalTollCollection + 200;
                    noOfBus = noOfBus + 1;
                    break;
                default:
                    System.out.println("Invalid vehicle type");

            }
        }
        System.out.println("Total Toll Collection: " + totalTollCollection);
        System.out.println("No of Car: " + noOfCar);
        System.out.println("No of Truck: " + noOfTruck);
        System.out.println("No of Bike: " + noOfBike);
        System.out.println("No of Bus: " + noOfBus);


    }
}
