package assignment_03.vehicle_rental_application;

class Truck extends Vehicle {
    private double loadCapacity;

    public Truck(String registrationNumber, String brand, double rentalRate, double loadCapacity) {
        super(registrationNumber, brand, rentalRate);
        this.loadCapacity = loadCapacity;
    }

    public double getLoadCapacity() {
        return loadCapacity;
    }

    public void setLoadCapacity(double loadCapacity) {
        this.loadCapacity = loadCapacity;
    }

    public void displayTruckInfo() {
        System.out.println("Vehicle Type: Truck");
        displayVehicleInfo();
        System.out.println("Load Capacity: " + loadCapacity + " tons");
        System.out.println();
    }
}
