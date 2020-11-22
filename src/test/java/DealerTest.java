import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DealerTest {

    Dealer dealer;
    Deck deck;
    Card card;
    Card card1;

    @Before
    public void before() {
        deck = new Deck();
        dealer = new Dealer(deck);
        card = new Card(SuitType.HEARTS, RankType.TWO);
        card1 = new Card(SuitType.HEARTS, RankType.FIVE);
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

    @Test
    public void canAddToHand() {
        dealer.takeCard(card);
        assertEquals(1, dealer.cardCount());
    }

    @Test
    public void canCheckHandTotal() {
        dealer.takeCard(card);
        dealer.takeCard(card1);
        assertEquals(7, dealer.handTotal());
    }

    @Test
    public void canTwist(){
        dealer.takeCard(card);
        dealer.takeCard(card1);
        dealer.twist(card1);
        assertEquals(3, dealer.cardCount());
    }

    @Test
    public void cannotTwist(){
        dealer.takeCard(card);
        dealer.takeCard(card1);
        dealer.takeCard(card1);
        dealer.takeCard(card1);
        dealer.twist(card1);
        assertEquals(4, dealer.cardCount());
    }
}

