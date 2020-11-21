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
        System.out.println(String.format("%s's hand:", player.getName()));
        for(int i = 0; i < player.cardCount(); i ++){
            System.out.println(player.showCard(i));
        }
        System.out.println(String.format("%s's total: %s", player.getName(), player.handTotal()));

        game.dealTwoToDealer();
        System.out.println( "Dealer's hand: ");
        System.out.println( dealer.showCard(0));
//        System.out.println(String.format("Dealer's and total: %s", dealer.handTotal()));

        System.out.println(String.format(game.compareHands()));
        System.out.println(String.format("Dealer's and total: %s", dealer.handTotal()));

    }
}
