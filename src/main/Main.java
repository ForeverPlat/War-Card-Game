package main;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        Deck deck = new Deck();
        deck.shuffle();

        Hands user = new Hands("user", deck.getDeck());
        Hands enemy = new Hands("enemy", deck.getDeck());

        ArrayList<Card> userHand = user.getUserHand();
        ArrayList<Card> enemyHand = enemy.getEnemyHand();



        System.out.println("users hand: " + userHand);
        System.out.println("enemy hand: " + enemyHand);

        int b = 0;
        //while (!userHand.isEmpty() || !enemyHand.isEmpty())
        while (b < 5){
            Card userTopCard = userHand.get(0);
            Card enemyTopCard = enemyHand.get(0);


            Battlefield battlefield = new Battlefield(userHand, enemyHand, userTopCard, enemyTopCard);

            if (userTopCard.getValue() > enemyTopCard.getValue()) {
                battlefield.userWin(userHand);

            } else if (userTopCard.getValue() < enemyTopCard.getValue()) {
                battlefield.enemyWin(enemyHand);

            } else if (userTopCard.getValue() == enemyTopCard.getValue()) {
                battlefield.war(userHand, enemyHand, userTopCard, enemyTopCard);
            }

            System.out.println("users hand: " + userHand);
            System.out.println("enemy hand: " + enemyHand);

            b++;

        }


    }
}
