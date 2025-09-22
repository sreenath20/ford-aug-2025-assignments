package javatopic.day8_custom_exception.assignment.assignment4_online_order;

public class OrderService {

    boolean placeOrder(String productName,int quantity){
        if(quantity<=0){
            throw new InvalidOrderQuantityException("Quantity must be greater than 0");
        }
        else{
            return true;
        }

    }
}
