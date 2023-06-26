import com.codeclan.example.cards.Card;
import com.codeclan.example.cards.Deck;
import com.codeclan.example.hummans.Dealer;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class DealerTest {

    private Dealer dealer;
    private Card card;
    private Deck deck;

    @Before
    public void setup() {
        deck = new Deck(2);
        dealer = new Dealer("Panos", deck);
        card = new Card("3", 3, "Diamonds");
    }

    @Test
    public void hasName() {
        assertEquals("Panos", dealer.getName());
    }
    @Test
    public void hasCards() {
        assertEquals(0, dealer.getNumberOfCards());
    }

    @Test
    public void canAddCard() {
        dealer.addCardInMyCards(card);
        assertEquals(1, dealer.getNumberOfCards());
    }

    @Test
    public void canAddACollectionOfCards() {
        ArrayList<Card> cards = new ArrayList<>();
        cards.add(card);
        cards.add(card);
        dealer.setMyCards(cards);
        assertEquals(2, dealer.getNumberOfCards());
    }

    @Test
    public void canCalculatePoints() {
        ArrayList<Card> cards = new ArrayList<>();
        cards.add(card);
        cards.add(card);
        dealer.setMyCards(cards);
        assertEquals(6, dealer.getPoints());
    }

    @Test
    public void canEmptyMyCards() {
        dealer.addCardInMyCards(card);
        dealer.addCardInMyCards(card);
        dealer.emptyMyCards();
        assertEquals(0, dealer.getNumberOfCards());
    }

    @Test
    public void removeCardFromDeck(){
        dealer.removeCard();
        dealer.removeCard();
        assertEquals(102 , dealer.getDeckSize());
    }
    @Test
    public void canReturnCardBackToDeck(){
        ArrayList<Card> cards = new ArrayList<>();
        cards.add(dealer.removeCard());
        cards.add(dealer.removeCard());
        cards.add(dealer.removeCard());
        dealer.addCardsBackToDeck(cards);
        assertEquals(104, dealer.getDeckSize());
    }
}