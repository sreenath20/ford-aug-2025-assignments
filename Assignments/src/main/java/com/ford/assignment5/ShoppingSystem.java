package com.ford.assignment5;

class Customer {
    public double calculateDiscount(double purchaseAmount) {
        return purchaseAmount * 0.05;
    }

    public double calculateDiscount(double purchaseAmount, int loyaltyPoints) {
        return purchaseAmount * 0.05 + loyaltyPoints * 0.1;
    }
}

class RegularCustomer extends Customer {
    @Override
    public double calculateDiscount(double purchaseAmount) {
        return purchaseAmount * 0.1;
    }
}

class PremiumCustomer extends Customer {
    @Override
    public double calculateDiscount(double purchaseAmount) {
        return purchaseAmount * 0.2;
    }
}

class ShoppingSystem {
    public static void main(String[] args) {
        Customer regular = new RegularCustomer();
        Customer premium = new PremiumCustomer();

        System.out.println("Regular discount: " + regular.calculateDiscount(1000));
        System.out.println("Premium discount: " + premium.calculateDiscount(1000));
        System.out.println("Overloaded discount: " + regular.calculateDiscount(1000, 50));
    }
}
