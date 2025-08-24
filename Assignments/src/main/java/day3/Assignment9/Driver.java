package day3.Assignment9;

public class Driver {
    public static void main(String[] args) {
        Policy p1 = new LifeInsurance("AB101", "XYZ", 60000, "MNO");
        Policy p2 = new HealthInsurance("CD202", "ABC", 55000, "PQR Hospital");
        Policy p3 = new VehicleInsurance("XY303", "GHI", 10000, "Car: Sedan");
        System.out.println("Life Insurance Premium: " + p1.calculatePremium());
        System.out.println("Health Insurance Premium: " + p2.calculatePremium());
        System.out.println("Vehicle Insurance Premium: " + p3.calculatePremium());
    }
}
