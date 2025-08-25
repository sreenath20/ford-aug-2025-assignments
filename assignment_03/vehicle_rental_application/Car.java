package assignment_03.vehicle_rental_application;

class Car extends Vehicle{
    private int seatingCapacity;

    public Car(String registrationNumber, String brand, double rentalRate, int seatingCapacity) {
        super(registrationNumber, brand, rentalRate);
        this.seatingCapacity = seatingCapacity;
    }

    public int getSeatingCapacity() {
        return seatingCapacity;
    }

    public void setSeatingCapacity(int seatingCapacity) {
        this.seatingCapacity = seatingCapacity;
    }

    public void displayCarInfo() {
        System.out.println("Vehicle Type: Car");
        displayVehicleInfo();
        System.out.println("Seating Capacity: " + seatingCapacity + " persons");
        System.out.println();
    }
}
