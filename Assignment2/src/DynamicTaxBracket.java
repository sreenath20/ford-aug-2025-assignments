import java.util.Scanner;

public class DynamicTaxBracket {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter 5 user salaries");
        double [] salary=new double[5];
        for(int i=0;i< salary.length;i++){
            salary[i]=sc.nextDouble();
        }
        double taxAmount=0.0;
        for(int j=0;j<salary.length;j++){
            System.out.println("--------------------");
            System.out.println("Income of user "+(j+1)+":"+salary[j]);

            if(salary[j] <=250000)
            {
                taxAmount=0;
                System.out.println("Tax percentage : 0%");
                System.out.printf("User "+(j+1)+" tax amount is %.2f",0.0);
                System.out.println();
            }
            else if(salary[j]>250000 && salary[j]<=500000)
            {
                taxAmount=(salary[j]*5)/100;
                System.out.println("Tax percentage : 5%");
                System.out.printf("User "+(j+1)+" tax amount is %.2f:",taxAmount);
            } else if (salary[j] > 500000 && salary[j] <=1000000) {
                taxAmount=(salary[j]*20)/100;
                System.out.println("Tax percentage : 20%");
                System.out.printf("User "+(j+1)+" tax amount is %.2f:",taxAmount);
                System.out.println();

            }
            else if(salary[j]>1000000)
            {
                taxAmount=(salary[j]*30)/100;
                System.out.println("Tax percentage : 30%");
                System.out.printf("User "+(j+1)+" tax amount is %.2f:",taxAmount);
                System.out.println();

            }
        }

    }
}
