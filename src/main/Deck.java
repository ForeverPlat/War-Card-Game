package main;

import java.util.ArrayList;

public class Deck {
    private ArrayList<Card> deck;
    public ArrayList<Card> userHand;
    public ArrayList<Card> enemyHand;
    public static String[] suites = {"♠", "♣" , "♦" , "♥"};

    //Want this to determine whether this is the players or enemies deck
    private String type;
    private  int capacity = 52;

    //---> might want to make it so that each constructor method does something different <--
    //ex: one focuses on making the main deck
    //then another does the splitting into hands
    public Deck() {
        deck = new ArrayList<>();

        for (int cardValue = 2; cardValue <= 13; cardValue++) {
            for (String suite : suites) {
                deck.add(new Card(cardValue, suite));
            }

        }
        //System.out.println("this is " + deck);
    }

    public Deck(String type) {
        if (type.equals("user")) {
            userHand = new ArrayList<>();

            for (int split = deck.size()/2; split > 0; split--) {
                int random = (int) (Math.random() * deck.size());

                userHand.add(deck.get(random));
                deck.remove(random);

            }

        } else if (type.equals("enemy")) {
            userHand = new ArrayList<>();
            for (Card card : deck) {

                enemyHand.add(card);

            }
        }


    }


    //using this to create hands
    public void splitDeck() {
        userHand = new ArrayList<>();
        enemyHand = new ArrayList<>();

        for (int split = deck.size()/2; split > 0; split--) {
            int random = (int) (Math.random() * deck.size());

            userHand.add(deck.get(random));
            deck.remove(random);

        }

        for (Card card : deck) {

            enemyHand.add(card);

        }
        //System.out.println(enemyHand + " Size: " + enemyHand.size());
        //System.out.println(userHand + " Size: " + userHand.size());

    }

    //don't think it's necessary
    public ArrayList<Card> getDeck() {
        return deck;
    }

    public ArrayList<Card> getUserHand() {
        return userHand;
    }

    public ArrayList<Card> getEnemyHand() {
        return enemyHand;
    }

    public void addCardToDeck(ArrayList<Card> deck, Card card) {
        deck.add(card);
    }

    public ArrayList<String> deckToString(ArrayList<Card> deck) {
        ArrayList<String> currDeck = new ArrayList<>();
        for (Card card: deck) {
            currDeck.add(card.toString());

        }
        return currDeck;
    }

    public int deckSize(ArrayList<String> deck) {
        return deck.size();
    }

}