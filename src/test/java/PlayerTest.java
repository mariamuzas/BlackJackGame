import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PlayerTest {

    Player player;
    Deck deck;
    Card card;

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
    public void canTakeCard() {
        player.takeCard(card);
        assertEquals(1, player.cardCount());
    }

}




