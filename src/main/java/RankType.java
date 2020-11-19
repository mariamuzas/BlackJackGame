public enum RankType {
    ACE(1),//ace is an instance of RankType class with value of 1, they are mini objects.
    TWO(2),//etc
    THREE(3),//etc
    FOUR(4),//etc
    FIVE(5),
    SIX(6),
    SEVEN(7),
    EIGHT(8),
    NINE(9),
    TEN(10),
    JACK(10),
    QUEEN(10),
    KING(10);

    private final int value;//final used as it will never change and noone can change value of the card ie king can't be 3

    RankType(int value){//constructor
        this.value = value;
    }

    public int getValue(){
        return this.value;
    }
}
