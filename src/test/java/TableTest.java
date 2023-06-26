import com.codeclan.example.Table;
import com.codeclan.example.cards.Deck;
import com.codeclan.example.hummans.Dealer;
import com.codeclan.example.hummans.Player;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TableTest {
    private Table table;
    private Dealer dealer;
    private Deck deck;
    private Player player;

    @Before
    public void setUp(){
        deck = new Deck(2);
        dealer = new Dealer("Ron", deck);
        player = new Player("Panos", 5000);
        table = new Table(dealer);
    }
    @Test
    public void hasDealer(){
        assertEquals(dealer, table.getDealer());
    }
    @Test
    public void hasPlayers(){
        assertEquals(0, table.getNumberOfPlayers());
    }

    @Test
    public void canAddPlayer(){
        table.setPlayers(player);
        assertEquals(1, table.getNumberOfPlayers());
    }
    @Test
    public void canHaveMultiplePlayers(){
        table.setPlayers(player);
        table.setPlayers(player);
        table.setPlayers(player);
        assertEquals(3, table.getNumberOfPlayers());
    }
    @Test
    public void canAcceptPlayersBet(){
        table.setPlayers(player);
        table.putBets(player, 200);
        assertEquals(200, player.getBet(), .00);
        assertEquals(1800, player.getBalance(), .00);
    }
    @Test
    public void canShareCardsToPlayers(){
        table.setPlayers(player);
        table.shareCards();
        assertEquals(2, player.getNumberOfCards());
        assertEquals(2, dealer.getNumberOfCards());
    }
    @Test
    // because cards are random i can't predict when i am winning ore losing
    // So the test can be failed some times.
    public void canCheckHowWonTheRound(){
        table.setPlayers(player);
        table.putBets(player, 200);
        table.shareCards();
        table.twistCards(player);
        table.twistCards(dealer);
        table.winOrLose();
        assertEquals(0 , player.getNumberOfCards());
        assertEquals(5200, player.getBalance(), .00);
    }

    @Test
    // because cards are random i can't predict when i am winning ore losing
    // So the test can be failed some times.
    public void dealerCantGoOver16(){
        table.setPlayers(player);
        table.putBets(player, 200);
        table.shareCards();
        //table.twistCards(player);
        table.twistCards(dealer);
        table.twistCards(dealer);
        table.twistCards(dealer);
        table.twistCards(dealer);
        assertEquals(20, dealer.getPoints());
    }
}
