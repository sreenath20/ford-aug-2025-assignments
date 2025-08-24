package day4.Assignment4;

public class CarLoan extends Loan implements ApprovalProcess {
    @Override
    public void approveLoan() {
        System.out.println("Car Loan is approved.......");
    }

    @Override
    public void calculateEMI(double principal, double ratePerMonth, int tenureMonths) {
        double intermidiate=1.0;
        for(int i=0; i<tenureMonths; i++){
            intermidiate *= (1+ ratePerMonth);
        }
       // System.out.println("Intermediate Value: "+intermidiate);
        double EMI = (double) (principal* ratePerMonth *intermidiate)/(intermidiate-1);
        EMI = Math.round(EMI*100)/100.0f;
        System.out.println("Car Loan EMI for "+principal+" is "+EMI);
    }
}
