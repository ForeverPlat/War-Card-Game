package main;

import java.util.ArrayList;

public class Battlefield extends Deck{
    private ArrayList<Card> inPlay;

    public Battlefield(ArrayList<Card> userHand, ArrayList<Card> enemyHand, Card userTopCard, Card enemyTopCard) {
        inPlay = new ArrayList<>();
        play(userHand, enemyHand, userTopCard, enemyTopCard);
        //System.out.println("in play: " + inPlay);

    }

    public void play(ArrayList<Card> userHand, ArrayList<Card> enemyHand, Card userTopCard, Card enemyTopCard) {
        inPlay = new ArrayList<>();

        inPlay.add(userTopCard);
        inPlay.add(enemyTopCard);
        userHand.remove(userTopCard);
        enemyHand.remove(enemyTopCard);

    }


    public void userWin(ArrayList<Card> userHand) {
        for (Card card : inPlay) {
            userHand.add(card);
        }

    }

    public void enemyWin(ArrayList<Card> enemyHand) {
        for (Card card : inPlay) {
            enemyHand.add(card);
        }

    }

    public void war(ArrayList<Card> userHand, ArrayList<Card> enemyHand, Card userTopCard, Card enemyTopCard) {
        Card newUserTopCard;
        Card newEnemyTopCard;

        System.out.println("war: "+inPlay);
        for (int i = 0; i <= 3; i++) {
            newUserTopCard = userHand.get(i);
            newEnemyTopCard = enemyHand.get(i);
            play(userHand, enemyHand, newUserTopCard,newEnemyTopCard );

            inPlay.add(userTopCard);
            inPlay.add(enemyTopCard);

            System.out.println("user top card: " + newUserTopCard + " enemy top card: " + newEnemyTopCard);
        }

        if  (newUserTopCard.getValue() > newEnemyTopCard.getValue()) {
            userWin(userHand);

        } else if (newUserTopCard.getValue() < newEnemyTopCard.getValue()) {
           enemyWin(enemyHand);

        } else if (userTopCard.getValue() == enemyTopCard.getValue()) {
            war(userHand, enemyHand, newUserTopCard, newEnemyTopCard);
        }


    }

}
