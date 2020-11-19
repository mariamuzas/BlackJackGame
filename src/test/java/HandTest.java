import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class HandTest {

    Hand hand;
    Deck deck;

    @Before
    public void before(){
        hand = new Hand();
        deck = new Deck();
        deck.populateDeck();
    }

    @Test
    public void startWithNoCards(){
        assertEquals(0, hand.cardCount());
    }

    @Test
    public void canAddCardToHand() {
        hand.addCardToHand(deck);
        assertEquals(1, hand.cardCount());
    }

}




