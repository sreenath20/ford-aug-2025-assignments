//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

    StripGateway strip=new StripGateway("apikey","https:/api.strip.com");
    strip.connect();
    strip.processPayment(100.0);
    strip.processRefund(50.0);
    strip.disconnect();
    System.out.println();
    PayPalGateway paypal=new PayPalGateway("paypal-apikey","connectionURL");
    paypal.connect();
    paypal.processPayment(600.0);
    paypal.processRefund(400.0);
    paypal.disconnect();
    }
}