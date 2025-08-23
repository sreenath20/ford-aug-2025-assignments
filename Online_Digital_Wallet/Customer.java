package Online_Digital_Wallet;


public class Customer {
    private Integer customerId;
    private String name;
    private String email;
    private String mobileNumber;
    private Double balance;

    public Customer() {
    }

    public Customer(Integer customerId, String name, String email, String mobileNumber) {
        this.customerId = customerId;
        this.name = name;
        this.email = email;
        this.mobileNumber = mobileNumber;
        this.balance = 0.0; // Default balance
    }

    public Customer(Integer customerId, String name, String email, String mobileNumber, Double balance) {
        this.customerId = customerId;
        this.name = name;
        this.email = email;
        this.mobileNumber = mobileNumber;
        this.balance = balance != null ? balance : 0.0;
    }

    // Getters and Setters
    public Integer getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Integer customerId) {
        this.customerId = customerId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMobileNumber() {
        return mobileNumber;
    }

    public void setMobileNumber(String mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

    public Double getBalance() {
        return balance;
    }

    public void setBalance(Double balance) {
        this.balance = balance;
    }

    @Override
    public String toString() {
        return String.format("Customer{ID=%d, Name='%s', Email='%s', Mobile='%s', Balance=%.2f}",
                customerId, name, email, mobileNumber, balance);
    }
}

