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

    public String compareHands() {
        if ( player.handTotal() < dealer.handTotal() || player.handTotal() > 21) {
            return "Dealer wins";
        } else if ( player.handTotal() == dealer.handTotal()) {
            return "Draw";
        }else {
            return "Player wins";
        }
    }

    public void playerTwist() {
        Card card = dealer.dealOne();
        player.playerTwist(card);
    }





}
