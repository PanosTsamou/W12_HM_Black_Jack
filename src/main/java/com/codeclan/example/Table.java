package com.codeclan.example;

import com.codeclan.example.cards.Card;
import com.codeclan.example.hummans.Dealer;
import com.codeclan.example.hummans.Person;
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
            giveCards.add(dealer.removeCard());
            giveCards.add(dealer.removeCard());
            player.setMyCards(giveCards);
        }
        ArrayList<Card> dealersCards = new ArrayList<>();
        dealersCards.add(dealer.removeCard());
        dealersCards.add(dealer.removeCard());
        dealer.setMyCards(dealersCards);
    }

    public void winOrLose(){
        for (Player player : players) {
            if (dealer.getPoints() > 21 || dealer.getPoints() < player.getPoints()) {
                player.winTheBet();
            } else if (dealer.getPoints() == 21 || dealer.getPoints() > player.getPoints()) {
                player.lostBet();
            } else {
                player.addBetBackToBalance();
            }
            dealer.addCardsBackToDeck(player.getMyCards());
            player.emptyMyCards();
        }
        dealer.addCardsBackToDeck(dealer.getMyCards());
        dealer.emptyMyCards();
    }

    public void twistCards(Person person){
        if (players.contains(person)){
            person.addCardInMyCards(dealer.removeCard());
        } else if (person == dealer) {
            while (person.getPoints() < 16){
                person.addCardInMyCards(dealer.removeCard());
            }
        }
    }
}
