package main;

import java.util.ArrayList;

public class Battlefield extends Deck{


    //use this for stacking logic (plz change the name later)

    //cards up for stake when war occurs
    private ArrayList<Card> warCards;
    private ArrayList<Card> battleField;
    private int stack;

    //this stuff will likely be callled in a while loop
    //it will create a new battlefield object each time

    public Battlefield(Card userCard, Card enemyCard) {
        battleField = new ArrayList<>();
        //battleField.add(userCard, enemyCard);

        super.userHand.remove(userCard);
        super.enemyHand.remove(enemyCard);

    }


    public String compareCards(Card userCard, Card enemyCard) {

        if (userCard.getValue() > enemyCard.getValue()) {

            return "user";

        } else if (userCard.getValue() < enemyCard.getValue()) {
            for (Card card: battleField) {
                super.enemyHand.add(card);
            }
            battleField.clear();

            return "enemy";
        } else if (userCard.getValue() == enemyCard.getValue()) {
            return war(userCard, enemyCard);
        }
        return "type";
        //compare cards can call battlefield
    }

    public String war(Card userCard, Card enemyCard) {

        //while (userCard.getValue() == enemyCard.getValue()) {
          //  battleField.add()
        //}

        return "type";
    }

    public void userWin () {
        for (Card card : battleField) {
            super.userHand.add(card);
        }
        battleField.clear();

    }

    public void enemyWin() {
        for (Card card : battleField) {
            super.enemyHand.add(card);
        }
        battleField.clear();

    }


}
