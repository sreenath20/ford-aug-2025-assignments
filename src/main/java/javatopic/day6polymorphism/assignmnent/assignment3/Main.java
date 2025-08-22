package javatopic.day6polymorphism.assignmnent.assignment3;

public class Main {
    public static void main(String[] args) {
        Customer customer1 = new Customer();
        //overloading
        customer1.calculateDiscount(10.0);
        customer1.calculateDiscount(10.0,20);

        Customer customer2 = new RegularCustomer();
        //method override
        customer2.calculateDiscount(500);
        customer2.display();// method only in parent not in child but still can access bcz it inherit parent

        //method override
        Customer customer3=new RegularCustomer();
        customer3.calculateDiscount(1000);

    }
}
