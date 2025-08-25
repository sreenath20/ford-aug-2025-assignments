package assignment_04.vehicle_management_system;

class Car extends Vehicle implements Repairable {

    public Car(String brand, String model) {
        super(brand, model);
    }

    @Override
    public void service() {
        System.out.println("Servicing car: " + brand + " " + model);
    }

    @Override
    public void repair() {
        System.out.println("Repairing car engine...");
    }
}


