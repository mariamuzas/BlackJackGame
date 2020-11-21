import org.junit.Before;

import static org.junit.Assert.assertEquals;

public class GameTest {

    Player player;
    Dealer dealer;
    Deck deck;
    Game game;

    @Before
    public void before() {
        player = new Player();
        dealer = new Dealer();
        deck = new Deck();
        game = new Game(deck);
    }

    public void canDealOneToPlayer() {
        assertEquals(1, player.cardCount());
    }

}
