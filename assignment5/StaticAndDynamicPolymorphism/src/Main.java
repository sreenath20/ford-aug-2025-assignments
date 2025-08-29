//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        //static polymorphism(overloading)

        Customer customer = new Customer();
        customer.calculateDiscount(200);
        customer.calculateDiscount(200, 120);
        System.out.println("______________________");

        //Dynamic Polymorphism(overriding)
        Customer reguler = new RegularCustomer();
        Customer premium = new PremiumCustomer();

        reguler.calculateDiscount(300);
        premium.calculateDiscount(300);
    }
}