package com.demo.Assignment3;

public class Saving_Account extends Bank_Account {
   private double interst=0;
    public Saving_Account(String name, String dept, int id,int balance,double interst ) {
        super(name,dept,id);
        this.interst=interst;

    }
    public void inters_to_calculate(){
        double final_interest_value=getBalance()*interst;
        System.out.println("total balance: "+(getBalance()+final_interest_value));

    }


}
class currentAccount extends Bank_Account{
    private double overDraftAmount=0;
    currentAccount(String name, String dept, int id,int balance,double overDraftAmount) {

        super(name,dept,id);
        this.overDraftAmount=overDraftAmount;


    }
    public void inters_to_calculate(){
        System.out.println("total balance: "+(getBalance()+overDraftAmount));
    }

}
