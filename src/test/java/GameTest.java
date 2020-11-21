import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GameTest {

    Player player;
    Dealer dealer;
    Deck deck;
    Game game;

    @Before
    public void before() {
        player = new Player();
        dealer = new Dealer(deck);
        deck = new Deck();
        game = new Game(player, dealer);
        dealer.populatedDeck(deck);

    }

    @Test
    public void gameHasADeckOf52() {
        assertEquals(52, deck.getCardCount());
    }

    @Test
    public void canDealTwoToPlayer() {
        game.dealTwoToPlayer();
        assertEquals(2, player.cardCount());
        assertEquals(50, dealer.deckCount());
    }

    @Test
    public void canDealTwoToDealer() {
        game.dealTwoToDealer();
        assertEquals(2, dealer.cardCount());
        assertEquals(50, dealer.deckCount());
    }

    @Test
    public void canDealToDealerAndPlayer() {
        game.dealTwoToPlayer();
        game.dealTwoToDealer();
        assertEquals(2, dealer.cardCount());
        assertEquals(2, player.cardCount());
        assertEquals(48, dealer.deckCount());
    }

    @Test
    public void canAddValueOfHands() {
        game.dealTwoToPlayer();
        System.out.println(player.showCard(0));
        System.out.println(player.showCard(1));
        game.dealTwoToDealer();
        System.out.println(dealer.showCard(0));
        System.out.println(dealer.showCard(1));

    }

}
