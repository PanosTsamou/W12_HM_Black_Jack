import com.codeclan.example.cards.Card;
import com.codeclan.example.cards.Deck;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class DeckTest {

    private Deck deck;

    @Before
    public void setup(){
        deck = new Deck(2);
    }

    @Test
    public void deckHasCards(){
        assertEquals(104, deck.getDeckLength());
    }
    @Test
    public void howManyDecks(){
        assertEquals(2, deck.getNumberOfDecks());
    }
    @Test
    public void getACardFromDeck(){
        Card expectedCard = new Card("2", 2, "Diamonds");
        assertEquals(expectedCard.getName(), deck.getCard(0).getName());
        assertEquals(expectedCard.getValue(), deck.getCard(0).getValue());
        assertEquals(expectedCard.getShape(), deck.getCard(0).getShape());
    }
    @Test
    public void canRemoveCardFromDeck(){
        deck.removeCard(3);
        assertEquals(103, deck.getDeckLength());
    }
    @Test
    public void canAddCardInDeck(){
        Card card = new Card("2", 2, "Diamonds");
        deck.addCardInTheDeck(card);
        assertEquals(105, deck.getDeckLength());
    }
    @Test
    public void canAddAListOfCardsInDeck(){
        ArrayList<Card> cardsList = new ArrayList<>();
        Card card1 = new Card("2", 2, "Diamonds");
        Card card2 = new Card("2", 2, "Diamonds");
        Card card3 = new Card("2", 2, "Diamonds");
        cardsList.add(card1);
        cardsList.add(card2);
        cardsList.add(card3);
        deck.addListOfCardsInTheDeck(cardsList);
        assertEquals(107, deck.getDeckLength());
    }

}
