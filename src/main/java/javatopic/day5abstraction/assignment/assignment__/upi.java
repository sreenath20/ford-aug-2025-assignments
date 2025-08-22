package javatopic.day5abstraction.assignment.assignment__;

public class upi implements Payment {
    @Override
    public void pay(Double amount) {
        System.out.println("Payment method through UPI");
    }

    public void displayDetails() {
        System.out.println("display upi transaction");
    }
}
