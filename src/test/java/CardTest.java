import com.codeclan.example.cards.Card;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CardTest {

    private Card card;

    @Before
    public void setup(){
       card = new Card("10", 10, "Spades");
    }

    @Test
    public void  hasName(){
        assertEquals("10", card.getName());
    }
    @Test
    public void hasValue(){
        assertEquals(10, card.getValue());
    }
    @Test
    public  void  hasShape(){
        assertEquals("Spades", card.getShape());
    }
}
