package com.teachmeskills.lesson9.task3.model.card;

public abstract class BasicCard {

    private static int counter;
    protected long id;
    protected int cvv;
    protected double currentBalance;
    protected int currencyCode;
    protected double commissionPercentage;

    public BasicCard() {
        this.id = ++counter;
    }

    abstract public int getTransferLimit();

    public BasicCard(long id, int cvv, double currentBalance, int currencyCode, double commissionPercentage) {
        this.id = id;
        this.cvv = cvv;
        this.currentBalance = currentBalance;
        this.currencyCode = currencyCode;
        this.commissionPercentage = commissionPercentage;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public int getCvv() {
        return cvv;
    }

    public void setCvv(int cvv) {
        this.cvv = cvv;
    }

    public double getCurrentBalance() {
        return currentBalance;
    }

    public void setCurrentBalance(double currentBalance) {
        this.currentBalance = currentBalance;
    }

    public int getCurrencyCode() {
        return currencyCode;
    }

    public void setCurrencyCode(int currencyCode) {
        this.currencyCode = currencyCode;
    }

    public double getCommissionPercentage() {
        return commissionPercentage;
    }

    public void setCommissionPercentage(double commissionPercentage) {
        this.commissionPercentage = commissionPercentage;
    }

    public abstract boolean checkTransferLimit();
}



