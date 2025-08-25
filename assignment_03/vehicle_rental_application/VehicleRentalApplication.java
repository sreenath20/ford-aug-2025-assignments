package assignment_03.vehicle_rental_application;

public class VehicleRentalApplication {
    public static void main(String[] args) {
        System.out.println("Welcome to Vehicle Rental System! \n");

        System.out.println("--- Creating Vehicles ---");
        Car car = new Car("TN47QT2387", "FORD", 450.0, 5);
        Bike bike = new Bike("TN38WR7634", "Bajaj", 70.0, 100);
        Truck truck = new Truck("TN45AV6752", "Mahindra", 1800.0, 10.0);

        car.displayCarInfo();
        bike.displayBikeInfo();
        truck.displayTruckInfo();
        System.out.println();

        System.out.println("--- Direct Rental Calculations ---");
        int rentalDays = 7;

        double carRental = car.calculateRental(rentalDays);
        double bikeRental = bike.calculateRental(rentalDays);
        double truckRental = truck.calculateRental(rentalDays);

        System.out.println("Car rental for " + rentalDays + " days: Rs." + carRental);
        System.out.println("Bike rental for " + rentalDays + " days: Rs." + bikeRental);
        System.out.println("Truck rental for " + rentalDays + " days: Rs." + truckRental);
        System.out.println();

        Vehicle vehicle1 = new Car("TN47QT2387", "FORD", 450.0, 5);
        Vehicle vehicle2 = new Bike("TN38WR7634", "Bajaj", 70.0, 100);
        Vehicle vehicle3 = new Truck("TN45AV6752", "Mahindra", 1800.0, 10.0);

        Vehicle[] vehicles = {vehicle1, vehicle2, vehicle3};
        String[] vehicleTypes = {"Car", "Bike", "Truck"};
        int[] rentalDaysArray = {3, 5, 10};

        for (int i = 0; i < vehicles.length; i++) {
            System.out.println(vehicleTypes[i] + " Details:");
            vehicles[i].displayVehicleInfo();

            double rental = vehicles[i].calculateRental(rentalDaysArray[i]);
            System.out.println("Rental for " + rentalDaysArray[i] + " days: Rs." + rental);
            System.out.println();
        }

        double totalBusiness = carRental + bikeRental + truckRental;
        System.out.println("Total rental income today: Rs." + totalBusiness);
    }
}
