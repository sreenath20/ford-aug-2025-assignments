package com.oops.day4;

public class Bank {
    private String name;
    private String userid;
    private Double balance;

    public Bank(String name, String userid, Double balance) {
        this.name = name;
        this.userid = userid;
        this.balance = 10000.0;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid;
    }

    public Double getBalance() {
        return balance;
    }

    public void setBalance(Double balance) {
        this.balance = balance;
    }

    public void addfunds(Double depositamount) {
        if (depositamount <= 0) {
            System.out.println("please deposit a valid amount");
            return;
        } else {
            balance += depositamount;
            System.out.printf("Deposit successful. New balance: %.2f%n", balance);
        }
    }


    public void withdrawfunds(Double withdrawamount) {
        if (withdrawamount <= balance) {
            System.out.println("InSufficient balanace please deposit a valid amount");
            return;
        } else {
            balance -= withdrawamount;
            System.out.printf("withdrawamount successful. New balance: %.2f%n", balance);
        }


    }


    public String displaydetails() {
        return "bank{" +
                "name='" + name + '\'' +
                ", userid='" + userid + '\'' +
                ", balance=" + balance +
                '}';
    }
}
