public class Card {
    private SuitType suit;//property
    private RankType rank;

    public Card(SuitType suit, RankType rank){//constructor method
        //if suit is in ...
        this.suit = suit;
        this.rank = rank;
    }

    public SuitType getSuit(){//get method
        return this.suit;
    }

    public RankType getRank(){
        return this.rank;
    }

    public int getValueRank(){
        return this.rank.getValue();
    }
    
    
}
