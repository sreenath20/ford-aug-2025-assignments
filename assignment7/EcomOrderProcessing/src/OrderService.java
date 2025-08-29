public class OrderService {

    public void placeOrder(String productName,int quantity)
    {
        System.out.println("Order is in progress!");
        if(quantity <= 0)
        {
            throw new InvalidOrderQuantityException(" Order quantity must be greater than zero");
        }
        else {
            System.out.println("Order has been placed successfully");
        }
    }
}
