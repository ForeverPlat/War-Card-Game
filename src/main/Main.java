package main;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {


        Deck deck = new Deck();

        System.out.println(deck.getDeck());

        deck.splitDeck();


        ArrayList<Card> userHand = deck.getUserHand();
        ArrayList<Card> enemyHand = deck.getEnemyHand();


        System.out.println(userHand);
        System.out.println(userHand.get(0));


        //while (!userHand.isEmpty() || !enemyHand.isEmpty()) {

           //if (userHand.get(0)


        //}


    }
}
