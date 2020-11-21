import java.util.ArrayList;

public class Dealer {

    private ArrayList<Card> hand;

    public Dealer() {
        this.hand = new ArrayList<>();
    }

    public int cardCount(){
        return this.hand.size();
    }


}
