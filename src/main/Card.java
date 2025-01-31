package main;

public class Card {
    private int value;
    private String suit;

    public Card (int value, String suit){
        this.value = value;
        this.suit = suit;
    }

    public int getValue() {
        return value;
    }

    public String getSuit() {
        return suit;
    }

    public String toString() {
        switch (value) {
            case 11:
                return "J" + suit;
            case 12:
                return "Q" + suit;
            case 13:
                return "K" + suit;
            case 14:
                return "A" + suit;
            default:
                return value + suit;
        }
    }


    //will need a value to int method prob


}
