import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CardTest {
    Card playingCard;

    @Before
    public void before(){
        playingCard = new Card(SuitType.HEARTS, RankType.THREE);
    }

    @Test
    public void canGetSuit(){
        assertEquals(SuitType.HEARTS, playingCard.getSuit());//our getter
    }

    @Test
    public void canGetCardRank(){
        assertEquals(RankType.THREE, playingCard.getRank());
    }

    @Test
    public void cardHasValueOfThree(){
        assertEquals(3, playingCard.getValueRank());
    }
}
