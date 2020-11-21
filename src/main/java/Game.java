public class Game {

    Deck deck;
    Dealer dealer;
    Player player;

    public Game(Deck deck) {
        this.deck = deck;
    }

    public void dealTwoToPlayer(Player player) {
        player.addCardToHand(deck);
    }

}
