package com.codeclan.example;

import com.codeclan.example.cards.Card;
import com.codeclan.example.hummans.Dealer;
import com.codeclan.example.hummans.Player;

import java.util.ArrayList;

public class Table {

    private Dealer dealer;
    private ArrayList<Player> players;

    public  Table(Dealer dealer){
        this.dealer = dealer;
        players = new ArrayList<>();
    }

    public Dealer getDealer() {
        return dealer;
    }

    public ArrayList<Player> getPlayers() {
        return players;
    }

    public int getNumberOfPlayers(){
        return players.size();
    }

    public void setPlayers (Player player){
        players.add(player);
    }

    public void putCardsBackToDeck(){
        ArrayList<Card> allCards = new ArrayList<>();
        allCards.addAll(dealer.getMyCards());
        dealer.emptyMyCards();
        for (Player player: players){
            allCards.addAll(player.getMyCards());
            player.emptyMyCards();
        }
        dealer.addCardsBackToDeck(allCards);
    }
    public void putBets(Player player, double amount){
        if (players.contains(player) && player.getBalance() > amount){
            player.setBet(amount);
        }
    }

    public void shareCards(){
        for (Player player : players){
            ArrayList<Card> giveCards = new ArrayList<>();
            giveCards.add(dealer.removeCard(index));
            giveCards.add(dealer.removeCard(index));
            player.setMyCards(giveCards);
        }
        ArrayList<Card> dealersCards = new ArrayList<>();
        dealersCards.add(dealer.removeCard(index));
        dealersCards.add(dealer.removeCard(index));
        dealer.setMyCards(dealersCards);
    }
}
