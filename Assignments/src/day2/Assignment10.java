package day2;

public class Assignment10 {
    public static void main(String[] args) {
        Double[] incomeAmount={150000.25,4500400.45,700022.0,4000340.0,1000000.0};
        int totalIncomeAmounts=incomeAmount.length;
        for(int i=0;i<totalIncomeAmounts;i++){
            Double income=incomeAmount[i];
            Double taxRate=0.0;
            if(income<=250000.0){
                taxRate=0.0;
            }
            else if(income>250000.0 && income<=500000.0){
                taxRate=5.0;
            }
            else if(income>500000.0 && income<=1000000.0){
                taxRate=20.0;
            }else{
                taxRate=30.0;
            }
            Double taxAmount=(income*taxRate)/100;
            System.out.println("Income: "+income+"\ntax percentage: "+taxRate+"%\ntax Amount: "+taxAmount);

        }
    }
}
