package com.demo.banking;

/**
 <p>Online digital wallet<br>
 1. Customer Registration<br>
 2. Add funds<br>
 3. Withdraw funds<br>
 4. Transfer funds<br>
 5. Get account details<br>
 6. Admin function : get all registered users.<br>

 <p>Solution:<br>
 1. Collections [Map]<br>
 2. DBMS<br>
 */
public class Wallet {
    private Integer accountId;
    private String customerName;
    private String emailAddress;
    private String userPassword;
    private Double accountBalance;

    public Wallet(Integer accountId, String customerName, String emailAddress, String userPassword, Double accountBalance) {
        this.accountId = accountId;
        this.customerName = customerName;
        this.emailAddress = emailAddress;
        this.userPassword = userPassword;
        this.accountBalance = accountBalance;
    }

    public Wallet() {

    }

    public Integer getAccountId() {
        return accountId;
    }

    public void setAccountId(Integer accountId) {
        this.accountId = accountId;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public String getUserPassword() {
        return userPassword;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }

    public Double getAccountBalance() {
        return accountBalance;
    }

    public void setAccountBalance(Double accountBalance) {
        this.accountBalance = accountBalance;
    }

    @Override
    public String toString() {
        return "Wallet{" +
                "accountId=" + accountId +
                ", customerName='" + customerName + '\'' +
                ", emailAddress='" + emailAddress + '\'' +
                ", userPassword='" + userPassword + '\'' +
                ", accountBalance=" + accountBalance +
                '}';
    }
}
