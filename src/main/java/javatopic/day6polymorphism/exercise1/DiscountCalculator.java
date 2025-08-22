package javatopic.day6polymorphism.exercise1;

public class DiscountCalculator {
    /* final double price;
     final double discountPercent;
    boolean isFlat;

    public DiscountCalculator(double price, double discountPercent, boolean isFlat) {
        this.price=price;
        this.discountPercent=discountPercent;
        this.isFlat=isFlat;


    }*/

    public void calculateDiscount(double price, double discountPercent){
        System.out.println("return discoutn on percent");
    }

    public void calculateDiscount(double price,double discountAmount,boolean isFlat){
        System.out.println("return discoutn based flat discount");
    }
    public void calculateDiscount(double price){
        System.out.println("return discoutn as price * 0.05");
    }
}
