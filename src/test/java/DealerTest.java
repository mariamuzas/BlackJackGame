import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DealerTest {

    Dealer dealer;
    Deck deck;

    @Before
    public void before() {
        deck = new Deck();
        dealer = new Dealer(deck);
    }

    @Test
    public void dealerStartsEmptyHand() {
        assertEquals(0, dealer.cardCount());
    }

    @Test
    public void dealerHasPopulatedOwnDeck() {
        dealer.populatedDeck(deck);
        assertEquals(52, dealer.deckCount());
    }
}

