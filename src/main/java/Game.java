public class Game {

    Dealer dealer;
    Player player;

    public Game(Player player, Dealer dealer) {
        this.player = player;
        this.dealer = dealer;
    }

    public void dealTwoToPlayer() {
        for (int i =0; i<2; i++) {
            Card card = dealer.dealOne();
            this.player.takeCard(card);
        }
    }

    public void dealTwoToDealer() {
        for (int i =0; i<2; i++) {
            Card card = dealer.dealOne();
            this.dealer.takeCard(card);
        }
    }

}
