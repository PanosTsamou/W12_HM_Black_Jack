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
        if (bet <= this.balance){
            this.balance -= bet;
            this.bet = bet;
        }

    }

    public  void winTheBet(){
        this.balance += 2 * getBet();
        this.bet=0;
    }

    public void lostBet() {
        this.bet = 0;
    }

    public void addBetBackToBalance() {
        this.balance += getBet();
        this.bet = 0;
    }


}
