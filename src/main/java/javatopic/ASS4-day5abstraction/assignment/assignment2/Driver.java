package javatopic.day5abstraction.assignment.assignment2;

// about abstraction class
public class Driver {
    public static void main(String[] args) {
        Vehicle scooter=new Bike("tvs",500.0);
        scooter.start();


        //Vehicle jeep=new Vehicle("jeep",2500.0);'Vehicle' is abstract; cannot be instantiated
        Vehicle jeep=new Car("jeep",2500.0);
        jeep.start();
        jeep.DisplayDetails();

    }
}
// analog for abstraction class
// best analog here is apartment external is done but the interior is left to customer choose