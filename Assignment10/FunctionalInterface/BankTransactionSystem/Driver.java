package Assignment10.FunctionalInterface.BankTransactionSystem;


import java.util.Random;
import java.util.function.*;

public class Driver {
    public static void main(String[] args) {
        //Predicate
        Predicate<Double> checkTransaction=(transaction)-> transaction > 50000.00;
        System.out.println("Transaction is Suspicious: "+checkTransaction.test(60000.00));
        //Consumer
        Consumer<Double> amount=(data)->System.out.println("Processed Transaction of amount: "+data);
        amount.accept(6000.00);
        //Supplier
        Supplier<Integer> otpSupplier=()->{
            Random random=new Random();
            return 1000+random.nextInt(1000);
        };
        Integer otp=otpSupplier.get();
        System.out.println("Your OTP is: "+otp);
        //Function
        Function<Integer,Integer> deductFee=(amountOne)->(int)Math.round(amountOne*0.98);
        Integer OriginalAmount=1000;
        Integer FinalAmount=deductFee.apply(OriginalAmount);
        System.out.println("Amount After deduction is "+FinalAmount);
        //BiFunction
        BiFunction<Double,Double,Double> discount=(amountTwo,feePercentage)->amountTwo-(amountTwo*feePercentage/100);
        Double OriginalAmountTwo=3000.00;
        Double FeePercent=0.2;
        Double FinalAmountTwo=discount.apply(OriginalAmountTwo,FeePercent);
        System.out.println("Amount After discount is "+FinalAmountTwo);




    }

}
