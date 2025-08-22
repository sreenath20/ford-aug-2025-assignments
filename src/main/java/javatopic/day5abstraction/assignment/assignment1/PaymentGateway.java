package javatopic.day5abstraction.assignment.assignment1;

public abstract class PaymentGateway {
    String Api;
    String connectionUrl;
    public void connect() {
        System.out.println("Connect to Payment Gateway api");
    }
    public void disconnect() {
        System.out.println("Disconnect from Payment Gateway api");
    }


    public boolean validateAmount(double v) {
        return false;
    }
}
