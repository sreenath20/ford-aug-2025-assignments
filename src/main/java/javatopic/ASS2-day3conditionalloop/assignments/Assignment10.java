package javatopic.day3conditionalloop.assignments;

public class Assignment10 {
    public static void main(String args[]) {

        Integer[] income = new Integer[5];
        income[0] = 100000;
        income[1] = 200000;
        income[2] = 350000;
        income[3] = 500000;
        income[4] = 1000000;
        for (int i = 0; i < income.length; i++) {
            if (income[i] <= 250000) {
                System.out.println("Income:" + income[i]);
                System.out.println("Tax: zero percentage");
                System.out.println("totalamount " + income[i]);
            }  else if (income[i]>250000 && income[i] < 500000) {
                System.out.println("Income:" + income[i]);
                System.out.println("Tax :five percentage");
                System.out.println("totalamount " + (income[i]+(income[i] * 0.05)));
            }  else if (income[i]>=500000 && income[i] < 1000000) {
                System.out.println("Income:" + income[i]);
                System.out.println("Tax: Twenty percentage");
                System.out.println("totalamount " + (income[i]+(income[i] * 0.20)));
            } else {
                System.out.print("Income: " + income[i]);
                System.out.println("Tax :Thirty percentage");
                System.out.println("totalamount " + (income[i]+(income[i] * 0.30)));


            }
        }
    }
}
