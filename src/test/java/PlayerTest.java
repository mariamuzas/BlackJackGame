import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PlayerTest {

    Player player;
    Card card;
    Card card1;

    @Before
    public void before(){
        player = new Player();
        card = new Card(SuitType.SPADES, RankType.ACE);
        card1 = new Card(SuitType.HEARTS, RankType.THREE);

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

    @Test
    public void canGetTotalHand() {
        player.takeCard(card);
        player.takeCard(card1);
        assertEquals(4, player.handTotal());
    }


}




