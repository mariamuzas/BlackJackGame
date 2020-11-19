import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class HandTest {

    Hand hand;

    @Before
    public void before(){
        hand = new Hand();
    }
    
    @Test
    public void startWithNoCards(){
        assertEquals(0, hand.cardCount());
    }

}




