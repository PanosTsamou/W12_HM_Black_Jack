package com.codeclan.example.hummans;

import com.codeclan.example.cards.Card;

import java.util.ArrayList;

public abstract class Person {

    private String name;
    private ArrayList<Card> myCards;


    public Person(String name){
        this.name = name;
        this.myCards = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public ArrayList<Card> getMyCards() {
        return myCards;
    }

    public void emptyMyCards(){
        myCards.clear();
    }

    public void setMyCards(ArrayList<Card> myCards) {
        this.myCards = myCards;
    }

    public int getPoints(){
        int totalPoints = 0;
        for (Card card : myCards){
            totalPoints += card.getValue();
        }
        return  totalPoints;
    }


    public void addCardInMyCards(Card card) {
        myCards.add(card);
    }
}
