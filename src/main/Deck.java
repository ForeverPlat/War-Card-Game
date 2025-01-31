package main;

import java.util.ArrayList;
import java.util.Collections;

public class Deck {
    private ArrayList<Card> deck;
    private static String[] suites = {"♠", "♣" , "♦" , "♥"};

    public Deck () {
        deck = new ArrayList<>();

        for (int cardValue = 2; cardValue <= 14; cardValue++) {
            for (String suite : suites) {
                deck.add(new Card(cardValue, suite));
            }

        }

    }

   public void shuffle() {
       Collections.shuffle(deck);
   }

    public ArrayList<Card> getDeck() {
        return deck;
    }

}