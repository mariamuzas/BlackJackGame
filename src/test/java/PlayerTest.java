import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PlayerTest {

    Player player;
    Deck deck;

    @Before
    public void before(){
        player = new Player();
        deck = new Deck();
        deck.populateDeck();
    }

    @Test
    public void startWithNoCards(){
        assertEquals(0, player.cardCount());
    }

    @Test
    public void canAddCardToHand() {
        player.addCardToHand(deck);
        assertEquals(1, player.cardCount());
    }

}




