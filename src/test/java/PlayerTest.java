
import com.codeclan.example.cards.Card;
import com.codeclan.example.hummans.Player;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class PlayerTest {

    private Player player;
    private Card card;

    @Before
    public void setup(){
        player = new Player("Panos", 1000.00);
        card = new Card("3", 3, "Diamonds");
    }
    @Test
    public void hasName(){
        assertEquals("Panos", player.getName());
    }
    @Test
    public  void hasMoney(){
        assertEquals(1000,player.getBalance(),.00);
    }
    @Test
    public void canBet(){
        player.setBet(200);
        assertEquals(200, player.getBet(), .00);
        assertEquals(800, player.getBalance(), .00);
    }

    @Test
    public void hasCards(){
        assertEquals(0 , player.getNumberOfCards());
    }

    @Test
    public void canAddCard(){
        player.addCardInMyCards(card);
        assertEquals(1, player.getNumberOfCards());
    }

    @Test
    public void canAddACollectionOfCards(){
        ArrayList<Card> cards = new ArrayList<>();
        cards.add(card);
        cards.add(card);
        player.setMyCards(cards);
        assertEquals(2, player.getNumberOfCards());
    }
    @Test
    public void canCalculatePoints(){
        ArrayList<Card> cards = new ArrayList<>();
        cards.add(card);
        cards.add(card);
        player.setMyCards(cards);
        assertEquals(6, player.getPoints());
    }

    @Test
    public void canEmptyMyCards(){
        player.addCardInMyCards(card);
        player.addCardInMyCards(card);
        player.emptyMyCards();
        assertEquals(0, player.getNumberOfCards());
    }


    @Test
    public void  canAddMoreMoney(){
        player.setBalance(2000);
        assertEquals(2000, player.getBalance(), .00);
    }


}
