package com.codeclan.example.hummans;

import com.codeclan.example.cards.Card;
import com.codeclan.example.cards.Deck;
import java.util.Random;
import java.util.ArrayList;

public class Dealer extends Person{

    private Deck deck;

    public Dealer(String name, Deck deck){
        super(name);
        this.deck = deck;
    }
    public Card removeCard(){
        return deck.removeCard(getRandomIndex());
    }
    public void addCardsBackToDeck(ArrayList<Card> cards){
        deck.addListOfCardsInTheDeck(cards);
    }

    private int getRandomIndex (){
        Random random = new Random();
        int rand_num = random.nextInt(deck.getNumberOfDecks());
        return rand_num;
    }

    public int getDeckSize() {
        return deck.getDeckLength();
    }
}
