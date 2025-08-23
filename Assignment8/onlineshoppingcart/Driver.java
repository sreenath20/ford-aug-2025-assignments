package Assignment8.onlineshoppingcart;

public class Driver {
    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart();

        // Create/Add items
        CartItem item1 = new CartItem(101, "Laptop", 1, 50000.00);
        CartItem item2 = new CartItem(102, "Mouse", 2, 500.00);
        CartItem item3 = new CartItem(103, "Keyboard", 1, 1000.00);
        CartItem itemDuplicate = new CartItem(101, "Laptop", 1, 50000.00); // same ID as item1

        cart.addItem(item1);
        cart.addItem(item2);
        cart.addItem(item3);
        cart.addItem(itemDuplicate);

        // Display cart items
        System.out.println("Cart Items:");
        for (CartItem item : cart.getCartItems()) {
            System.out.println(item);
        }

        // Check equals
        if (item1.equals(itemDuplicate)) {
            System.out.println("Item1 and itemDuplicate are the same based on itemId.");
        } else {
            System.out.println("Items are different.");
        }

        // Update quantity
        cart.updateQuantity(102, 5);
        System.out.println("----After Quantity Update----");
        System.out.println(cart.searchItem(102));

        // Delete item
        cart.removeItem(103);
        System.out.println("----After Remove----");
        for (CartItem item : cart.getCartItems()) {
            System.out.println(item);
        }

        System.out.println("----Search Item (ID: 101)----");
        CartItem searchResult = cart.searchItem(101);
        if (searchResult != null) {
            System.out.println(searchResult);
        } else {
            System.out.println("Item not found.");
        }

        System.out.println("----Total Bill----");
        System.out.println("Total: ₹" + cart.getTotalBill());
    }
}

