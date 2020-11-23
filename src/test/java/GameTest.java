import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GameTest {

    Player player;
    Dealer dealer;
    Deck deck;
    Game game;
    Card card;
    Card card1;
    Card card2;
    Card card3;
    Card card4;
    Card card5;

    @Before
    public void before() {
        player = new Player();
        dealer = new Dealer(deck);
        deck = new Deck();
        game = new Game(player, dealer);
        dealer.populatedDeck(deck);
        card = new Card(SuitType.SPADES, RankType.ACE);
        card1 = new Card(SuitType.HEARTS, RankType.THREE);
        card2 = new Card(SuitType.HEARTS, RankType.TWO);
        card3 = new Card(SuitType.HEARTS, RankType.FIVE);
        card4 = new Card(SuitType.HEARTS, RankType.NINE);
        card5 = new Card(SuitType.HEARTS, RankType.TEN);
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
    public void canCompareDraw() {
        dealer.takeCard(card);
        dealer.takeCard(card1);
        player.takeCard(card);
        player.takeCard(card1);
        assertEquals("Draw", game.compareHands());
    }

    @Test
    public void playerCanWin() {
        dealer.takeCard(card2);
        dealer.takeCard(card1);
        player.takeCard(card);
        player.takeCard(card3);
        assertEquals("Player wins", game.compareHands());
    }

    @Test
    public void playerNotBustWithAces() {
        player.takeCard(card4);
        player.takeCard(card5);
        player.takeCard(card);
        player.takeCard(card);
        dealer.takeCard(card4);
        assertEquals("Player wins", game.compareHands());
    }

    @Test
    public void dealerNotBustWithAces() {
        dealer.takeCard(card4);
        dealer.takeCard(card5);
        dealer.takeCard(card);
        dealer.takeCard(card);
        player.takeCard(card4);
        assertEquals("Dealer wins", game.compareHands());
    }
}
