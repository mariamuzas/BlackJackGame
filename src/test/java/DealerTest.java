import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DealerTest {

    Dealer dealer;
    Deck deck;

    @Before
    public void before() {
        dealer = new Dealer();
        deck = new Deck();
        deck.populateDeck();
    }

    @Test
    public void dealerStartsEmptyHand() {
        assertEquals(0, dealer.cardCount());
    }
}
