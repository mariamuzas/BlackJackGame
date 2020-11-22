import java.util.ArrayList;

public class Player {

    private String name;
    private ArrayList<Card> hand;
    private boolean twist;

    public Player(){
        this.name = name;
        this.hand = new ArrayList<>();
        this.twist = twist;
    }

    public String getName() {
        return this.name;
    }

    public ArrayList<Card> getHand() {
        return hand;
    }

    public Boolean getTwist() {
        return this.twist;
    }

    public void setTwist(boolean twist) {
        this.twist = twist;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int cardCount(){
        return getHand().size();
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

    public void playerTwist(Card card) {
        if (getTwist()) {
            takeCard(card);
        }
    }

}

