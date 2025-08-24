package day3.Assignment5;

public class Car extends Vehicle{
    int seatCapacity;
    public Car(int registrationNumber, String brand, double rentalRate,int seatCapacity) {
        super(registrationNumber, brand, rentalRate);
        this.seatCapacity = seatCapacity;
    }

    @Override
    public double calculateRent(int days) {
        super.calculateRent(days);
        if(seatCapacity>5){
            rent+= 500;
        }
        return rent;
    }
}
