import java.util.Scanner;

import static java.lang.Integer.parseInt;

public class Runner {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Deck deck = new Deck();
        Dealer dealer = new Dealer(deck);

        System.out.println("Welcome to BlackJack game!");

        System.out.println("Player, enter your name: ");
        String playerName = scanner.next();
        Player player = new Player();
        player.setName(playerName);

        Game game = new Game(player, dealer);

        dealer.populatedDeck(deck);
        game.dealTwoToPlayer();
        game.dealTwoToDealer();

        System.out.println(String.format("%s's hand:", player.getName()));
        for(int i = 0; i < player.cardCount(); i ++){
            System.out.println(player.showCard(i));
        }
        System.out.println(String.format("%s's total: %s", player.getName(), player.handTotal()));

        System.out.println( "Dealer's hand: ");
        System.out.println( dealer.showCard(0));
//        System.out.println(String.format("Dealer's and total: %s", dealer.handTotal()));

        player.setTwist(false);
        while (player.getTwist().equals(false) && player.handTotal() <= 21) {
            System.out.println(String.format("%s, do you want to twist? y/n", player.getName()));
            String playerTwist = scanner.next();
            if (playerTwist.equals("y")){
                player.setTwist(true);
                game.playerTwist();
                player.setTwist(false);
                System.out.println(player.showCard(player.cardCount()-1));
                System.out.println(String.format("%s's total: %s", player.getName(), player.handTotal()));
            } else if( playerTwist.equals("n")){
                player.setTwist(true);
            }
        }

        while (dealer.handTotal() < 16 ) {
            game.dealerTwist();
        }

        System.out.println(String.format("Dealer's hand:"));
        for(int i = 0; i < dealer.cardCount(); i ++){
            System.out.println(dealer.showCard(i));
        }
        System.out.println(String.format(game.compareHands()));
        System.out.println(String.format("Dealer's total: %s", dealer.handTotal()));
        System.out.println(String.format("%s's total: %s", player.getName(), player.handTotal()));

    }
}
