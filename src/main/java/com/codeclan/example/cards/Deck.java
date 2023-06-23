package com.codeclan.example.cards;

import java.util.ArrayList;

public class Deck {
    private int numberOfDecks;
    private ArrayList<Card> deck;
    private String[] names = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace"};
    private int[]  values = {2, 3, 4, 5, 6, 7, 8, 9, 10, 10, 10, 10, 11};
    private  String[] shapes = {"Diamonds", "Spades", "Hearts", "Clubs"};

    public Deck(int numberOfDecks){
        this.deck = new ArrayList<>();
        this.numberOfDecks = numberOfDecks;
        generateDeck();
    }

    private void generateDeck(){
        for (int i = 0; i < numberOfDecks; i++){
            for (int k=0; k < shapes.length; k++ ){
                for(int j = 0; j < names.length; j++){
                    Card card = new Card(names[j], values[j], shapes[k]);
                    deck.add(card);
                }
            }
        }

    }

    public int getNumberOfDecks() {
        return numberOfDecks;
    }

    public ArrayList<Card> getDeck() {
        return deck;
    }

    public int getDeckLength(){
        return deck.size();
    }

    public Card getCard(int index){
        return deck.get(index);
    }

    public Card removeCard(int index){
        return  deck.remove(index);
    }

    public  void  addCardInTheDeck(Card card){
        deck.add(card);
    }

    public void  addListOfCardsInTheDeck(ArrayList<Card> cards){
        deck.addAll(cards);
    }
}
