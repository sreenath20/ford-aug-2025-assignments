package day4.paymentGateway;

public abstract class PaymentGateway {
    public void connect(String gateway){
        System.out.println("Connected to "+gateway+" API");
    }
    public void disconnect(String gateway){
        System.out.println("Disconnected to "+gateway+" API");
    }
}
