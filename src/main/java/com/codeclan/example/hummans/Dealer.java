package com.codeclan.example.hummans;

import com.codeclan.example.cards.Card;
import com.codeclan.example.cards.Deck;

import java.util.ArrayList;

public class Dealer extends Person{

    private Deck deck;

    public Dealer(String name, Deck deck){
        super(name);
        this.deck = deck;
    }
    public Card removeCard(int index){
        return deck.removeCard(index);
    }
    public void addCardsBackToDeck(ArrayList<Card> cards){
        deck.addListOfCardsInTheDeck(cards);
    }
}
