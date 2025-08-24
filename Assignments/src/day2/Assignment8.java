package day2;

public class Assignment8 {
    public static void main(String[] args) {
        String[] vehicleInformation={"Car","Truck","Bike","Car","Bus"};
        int numberOfVehicles=vehicleInformation.length;
        Integer numberOfCars=0;
        Integer numberOfTrucks=0;
        Integer numberOfBike=0;
        Integer numberOfBuses=0;
        Integer totalTollCollection=0;
        for(int i=0;i<numberOfVehicles;i++){
            switch(vehicleInformation[i]){
                case "Car":
                    totalTollCollection+=100;
                    numberOfCars++;
                    break;
                case "Truck":
                    totalTollCollection+=250;
                    numberOfTrucks++;
                    break;
                case "Bike":
                    totalTollCollection+=50;
                    numberOfBike++;
                    break;
                case "Bus":
                    totalTollCollection+=200;
                    numberOfBuses++;
                    break;
                default:
                    System.out.println("Not a valid vehicle");
            }


        }
        System.out.println("Total Toll Collection: "+totalTollCollection);
        System.out.println("Total number of Buses: "+numberOfBuses);
        System.out.println("Total number of Cars: "+numberOfCars);
        System.out.println("Total number of Trucks: "+numberOfTrucks);
        System.out.println("Total number of Bike: "+numberOfBike);


    }
}
