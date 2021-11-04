package com.company;

public class Account {
    public double balance;

    public Double Account(Double intBalance){
        balance = intBalance;
        return intBalance;
    }

    public double getBalance() {
        return balance;
    }

    public Double deposit(double amt){
        balance = balance + amt;
        return balance;
    }

    public Double withdraw(double amt){
        balance = balance - amt;
        return balance;
    }
}
