package com.codeclan.example.hummans;

public class Player extends Person{

    private double balance;
    private double bet;

    public Player(String name, double balance){
        super(name);
        this.balance = balance;
    }
    public double getBalance() {
        return balance;
    }

    public double getBet() {
        return bet;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void setBet(double bet) {
        this.bet = bet;
    }
}
