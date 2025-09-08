package com.bank.wallet;

public class WalletDto {

    private String fromEmailId;
    private String toEmailId;
    private Double amount;

    public WalletDto() {
    }

    public WalletDto(String fromEmailId, String toEmailId, Double amount) {
        this.fromEmailId = fromEmailId;
        this.toEmailId = toEmailId;
        this.amount = amount;
    }

    public String getFromEmailId() {
        return fromEmailId;
    }

    public void setFromEmailId(String fromEmailId) {
        this.fromEmailId = fromEmailId;
    }

    public String getToEmailId() {
        return toEmailId;
    }

    public void setToEmailId(String toEmailId) {
        this.toEmailId = toEmailId;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }
}