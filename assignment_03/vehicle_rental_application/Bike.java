package assignment_03.vehicle_rental_application;

class Bike extends Vehicle {
    private int engineCapacity;

    public Bike(String registrationNumber, String brand, double rentalRate, int engineCapacity) {
        super(registrationNumber, brand, rentalRate);
        this.engineCapacity = engineCapacity;
    }

    public int getEngineCapacity() {
        return engineCapacity;
    }

    public void setEngineCapacity(int engineCapacity) {
        this.engineCapacity = engineCapacity;
    }

    public void displayBikeInfo() {
        System.out.println("Vehicle Type: Bike");
        displayVehicleInfo();
        System.out.println("Engine Capacity: " + engineCapacity + " CC");
        System.out.println();
    }
}
