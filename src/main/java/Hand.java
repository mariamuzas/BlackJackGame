import java.util.ArrayList;

public class Hand {

    private ArrayList<Card>hand;

    public Hand(){
        this.hand = new ArrayList<>();
    }
    public int cardCount(){
        return this.hand.size();
    }

    public void addCardToHand(Deck deck){
       this.hand.add(deck.removeCardFromDeck());
    }

}

