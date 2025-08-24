package day1;

public class Assignment1 {
    public static void main(String[] args) {
        double principleAmount=100.02;
        float intrestRate=7;
        int tenureYears=5;
        double temp1=(principleAmount*intrestRate*(Math.pow((1+intrestRate),tenureYears)));
        double temp2=(Math.pow(1+intrestRate,tenureYears)-1);
        double emi=temp1/temp2;
        //String return_emi=String.format("%.2f",emi);
        System.out.printf("EMI amount is %.2f%n", emi);
    }
}
