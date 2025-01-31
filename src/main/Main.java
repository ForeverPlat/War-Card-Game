package main;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class Main {

    public static void main(String[] args) {

        System.out.println("Welcome to the War Card Game");
        System.out.println();

        Deck deck = new Deck();

        System.out.println(deck.getDeck());
        System.out.println(deck.getDeck().size());
        deck.shuffle();
        System.out.println("Shuffling the deck...");
        System.out.println();

        Hands user = new Hands("user", deck.getDeck());
        Hands enemy = new Hands("enemy", deck.getDeck());
        System.out.println("Dealing the cards...");
        ArrayList<Card> userHand = user.getUserHand();
        ArrayList<Card> enemyHand = enemy.getEnemyHand();
        System.out.println();

        System.out.println("Starting game");

        int b = 0;
        while (!userHand.isEmpty() || !enemyHand.isEmpty()) {
            Scanner input = new Scanner(System.in);

            System.out.println("Click enter to draw and place a card");
            String draw = input.nextLine();

            if (draw.isEmpty()) {
                Card userTopCard = userHand.get(0);
                Card enemyTopCard = enemyHand.get(0);

                System.out.println("You drew a " + userTopCard);
                System.out.println("Enemy drew a " + enemyTopCard);
                System.out.println();

                Battlefield battlefield = new Battlefield(userHand, enemyHand, userTopCard, enemyTopCard);

                if (userTopCard.getValue() > enemyTopCard.getValue()) {
                    System.out.println("You take the " + userTopCard + " " + enemyTopCard);
                    battlefield.userWin(userHand);

                } else if (userTopCard.getValue() < enemyTopCard.getValue()) {
                    System.out.println("Enemy takes the " + userTopCard + " " + enemyTopCard);
                    battlefield.enemyWin(enemyHand);


                } else if (userTopCard.getValue() == enemyTopCard.getValue()) {
                    battlefield.war(userHand, enemyHand, userTopCard, enemyTopCard);
                }

                System.out.println();
                // delete these two later
                System.out.println("users hand: " + userHand);
                System.out.println("enemy hand: " + enemyHand);
                System.out.println("You have " + userHand.size() + " cards");
                System.out.println("Enemy has " + enemyHand.size() + " cards");

                System.out.println();

                //System.out.println("\u000C"); //clear the console

            } else {
                System.out.println("Not expected input");
            }

        }


    }
}
