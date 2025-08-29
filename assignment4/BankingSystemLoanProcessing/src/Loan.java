abstract public class Loan {
//    protected double principal;
//    protected double rate;
//    protected int tenureMonths;





    public double CalculateEmi(double principal, double rate, int tenureMonths){
        double monthlyRate=rate / 12/100;

//      Formula for EMI = [p * R * (1+R)^N]/[(1+R)^N - 1]
        double onePlusRPowerN=Math.pow((1+monthlyRate),tenureMonths);
        double emi=(principal * monthlyRate * onePlusRPowerN)/(onePlusRPowerN-1);
        return emi;
    }


}
