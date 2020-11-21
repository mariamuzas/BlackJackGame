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
}

