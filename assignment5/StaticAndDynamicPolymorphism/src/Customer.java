public class Customer {

    public void calculateDiscount(double purchaseAmount) {
        double discountPercentage=0.05;
        System.out.println("Purchase amount is " + purchaseAmount * discountPercentage);
    }

    public void calculateDiscount(double purchaseAmount,int loyalityPoints) {
        double discount=purchaseAmount * 0.05;

//      Reducing 1 rupee = 10 loyality points
        int extraDiscount=loyalityPoints/10;
        System.out.println("Loyality points discount deducted: "+ extraDiscount);


        System.out.println("Purchase discount amount is " + (discount + extraDiscount));
    }

}

class RegularCustomer extends Customer {
    public void calculateDiscount(double purchaseAmount) {
        System.out.println("RegularCustomer discount is " + purchaseAmount * 0.1);
    }
}

class PremiumCustomer extends Customer {
    public void calculateDiscount(double purchaseAmount) {

        System.out.println("PremiumCustomer discount is " + purchaseAmount * 0.20);

    }
}
