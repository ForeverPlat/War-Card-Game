package main;

import java.util.ArrayList;

public class Hands extends Deck{
    private String type;
    private ArrayList<Card> userHand;
    private ArrayList<Card> enemyHand;

    public Hands(String type, ArrayList<Card> shuffledDeck) {
        this.type = type;
        userHand = new ArrayList<>();
        enemyHand = new ArrayList<>();
        //ArrayList<Card> deck = super.getDeck();


        if (type.equals("user")) {

            for (int i = 0; i < shuffledDeck.size()/2; i++) {
                userHand.add(shuffledDeck.get(i));
            }

        } else if (type.equals("enemy")) {

            for (int i = shuffledDeck.size()/2; i < shuffledDeck.size(); i++) {
                enemyHand.add(shuffledDeck.get(i));
            }

        }

    }

    public String getType() {
        return type;
    }

    public ArrayList<Card> getUserHand() {
        return userHand;
    }

    public ArrayList<Card> getEnemyHand() {
        return enemyHand;
    }
}
