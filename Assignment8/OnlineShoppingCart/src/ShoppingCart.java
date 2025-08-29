import java.util.ArrayList;

public class ShoppingCart {

    private ArrayList<CartItem> cart = new ArrayList<>();

    // adding an item into cart
    public void addItem(CartItem item) {
        if(this.cart.contains(item)) {
            // here we are taking index of existing item in the cart
           int index = this.cart.indexOf(item);

//         here we are extracting existing item present in the cart by using index
           CartItem temp = this.cart.get(index);

//         updating the quantity of existing item
           temp.setQuantity(temp.getQuantity() + item.getQuantity());
            System.out.println("Quantity updated for existing item.");
        }
        else {
            cart.add(item);
            System.out.println("Item added to cart.");
        }
    }
//    removing item in a cart by id
    public void removeItem(int itemId) {
        for(CartItem item : cart) {
            if(item.getItemId() == itemId)
            {
                cart.remove(item);
                System.out.println("Item removed from cart.");
                break;
            }
        }

    }

    // Updating item quantity
    public void updateQuantity(int itemId,int newQuantity) {
        boolean found=false;
        for(CartItem item : cart) {
            if(item.getItemId() == itemId) {
                item.setQuantity(newQuantity);
                System.out.println("Quantity updated for existing item.");
                found=true;
                break;
            }
        }
        if(!found) {
            System.out.println("Item not found.");
        }

    }

    //Searching item using itemId;

    public String searchItem(int itemId) {
        for(CartItem item : cart) {
            if(item.getItemId() == itemId) {

                System.out.println("Item found.");
                return (item.toString());

            }

        }
        return "Item not found";
    }

    public double getTotalBill() {
        double total = 0;
        for(CartItem item : cart) {
            total+= (item.getQuantity() * item.getPricePerUnit());
        }
        return total;
    }

    @Override
    public String toString() {
        return "ShoppingCart{" +
                "cart=" + cart +
                '}';
    }
}
