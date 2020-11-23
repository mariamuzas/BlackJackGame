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
        assertEquals(14, player.handTotal());
    }

    @Test
    public void canTwist() {
        player.takeCard(card);
        player.setTwist(true);
        player.playerTwist(card1);
        assertEquals(2, player.cardCount());
    }

    @Test
    public void dontWantTwist() {
        player.takeCard(card);
        player.setTwist(false);
        player.playerTwist(card1);
        assertEquals(1, player.cardCount());
    }

}




