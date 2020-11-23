import java.util.ArrayList;

public class Game {

    Dealer dealer;
    Player player;
    Card card;
    RankType rank;
    SuitType suit;

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

        //        check hands if there is any Ace
//        while value > 21 {for each Ace : totalhand { total hand -21}}

        int playerHand = player.handTotal();
        for (Card card : player.getHand()) {
            if (card.getRank() == RankType.ACE && playerHand > 21) {
                playerHand -= 10;
            }
        }

        int dealerHand = dealer.handTotal();
        for (Card card : dealer.getHand()) {
            if (card.getRank() == RankType.ACE && dealerHand > 21) {
                dealerHand -= 10;
            }
        }

        if (playerHand < dealer.handTotal() || playerHand > 21) {
            return "Dealer wins";
        } else if (playerHand > dealer.handTotal() || dealer.handTotal() > 21) {
            return "Player wins";
        } else {
            return "Draw";
        }
    }

    public void playerTwist() {
        Card card = dealer.dealOne();
        player.playerTwist(card);
    }

    public void dealerTwist() {
        Card card = dealer.dealOne();
        dealer.twist(card);
    }





}
