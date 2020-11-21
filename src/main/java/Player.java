import java.util.ArrayList;

public class Player {

    private String name;
    private ArrayList<Card> hand;


    public Player(){
        this.name = name;
        this.hand = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public int cardCount(){
        return this.hand.size();
    }

    public void addCardToHand(Deck deck){
       this.hand.add(deck.dealOne());
    }

}

