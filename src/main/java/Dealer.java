import java.util.ArrayList;
import java.util.Collections;

public class Dealer {

    private ArrayList<Card> deck;
    private ArrayList<Card> hand;

    public Dealer(Deck deck) {
        this.deck = new ArrayList<>();
        this.hand = new ArrayList<>();
    }

    public ArrayList<Card> getHand() {
        return hand;
    }

    public void populatedDeck(Deck deck) {
        this.deck = deck.populateDeck();
        deck.shuffleDeck();
    }

    public int deckCount() {
        return this.deck.size();
    }

    public int cardCount(){
        return this.hand.size();
    }

    public Card dealOne() {
        return this.deck.remove(0);
    }

    public void takeCard(Card card) {
        this.hand.add(card);
    }

    public String showCard(int index){
        return this.hand.get(index).getCardName();
    }

    public int handTotal() {
        int total = 0;
        for (Card card : this.hand) {
            total += card.getValueRank();
        }
        return total;
    }

    public void twist(Card card){
        if (handTotal() < 16 ) {
            takeCard(card);
        }
    }
}
