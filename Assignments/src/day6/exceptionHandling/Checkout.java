package day6.exceptionHandling;

public class Checkout {
    public double calculateTotal(double price, int quantity) {
        if (price <= 0 || quantity <= 0){
            throw new IllegalArgumentException("Price must be greater than or equal to 0.");


        }
        return price * quantity;
    }

}
