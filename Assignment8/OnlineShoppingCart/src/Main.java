public class Main {
    public static  void main(String[] args) {
        // Create a shopping cart
        ShoppingCart cart = new ShoppingCart();
        // Create some items
        CartItem item1 = new CartItem(1, "Laptop", 1, 1200.00);
        CartItem item2 = new CartItem(2, "Mouse", 2, 25.50);
        CartItem item3 = new CartItem(3, "Keyboard", 1, 45.99);
        CartItem item4 = new CartItem(1, "Laptop", 2, 1200.00); // Same itemId as item1

        // Add items to the cart
        cart.addItem(item1);
        cart.addItem(item2);
        cart.addItem(item3);
        cart.addItem(item4); // Duplicate itemId, should update quantity
//        System.out.println(cart.toString());
        System.out.println();

        // Print total bill
        System.out.println("Total Bill: $" + cart.getTotalBill());

        // Update quantity of an item
        cart.updateQuantity(2, 5); // Mouse quantity updated to 5

        // Remove an item
        cart.removeItem(3); // Removes keyboard
        System.out.println(cart.toString());

        // Search for an item
        System.out.println("Search Result: " + cart.searchItem(1)); // Should find Laptop
        System.out.println("Search Result: " + cart.searchItem(3)); // Should not find Keyboard

        // Print final total
        System.out.println("Final Total Bill: $" + cart.getTotalBill());
    }
}
