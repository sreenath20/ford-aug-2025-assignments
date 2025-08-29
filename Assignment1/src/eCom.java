import java.util.Scanner;

public class eCom {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter price from web 1: ");
        double priceFromweb1 = sc.nextDouble();
        System.out.println("Please enter price from web 2: ");
        double priceFromWeb2 = sc.nextDouble();
        System.out.println("Please enter price from web 3: ");
        double priceFromWeb3 = sc.nextDouble();
        double max=Math.max(Math.max(priceFromweb1,priceFromWeb2),priceFromWeb3);
        double min=Math.min(Math.min(priceFromweb1,priceFromWeb2),priceFromWeb3);
        System.out.println("Price 1 :"+" "+priceFromweb1);
        System.out.println("Price 2 :"+" "+priceFromWeb2);
        System.out.println("Price 3 :"+" "+priceFromWeb3);
        System.out.println("Best Deal is "+" "+min);


        double priceDifference=max-min;
        float DifferenceInPercentage=(float)(priceDifference/min)*100;
        System.out.printf("percentage difference : %.2f",DifferenceInPercentage);




    }
}
