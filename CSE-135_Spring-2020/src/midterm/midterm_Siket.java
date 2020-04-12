package midterm;

import java.util.Random;

class CardSelect {
    public static void main(String[] args) {
        Random rand = new Random();

        String[] cardRank = { "Ace", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten", "Jack", "Queen", "King" };
        String[] cardSuit = { "Clubs", "Diamonds", "Spades", "Hearts" };

        int randNum = rand.nextInt(52);
        int rank = randNum % 13;
        int suit = randNum / 13;

        System.out.println(cardRank[rank] + " of " + cardSuit[suit]);

    }
}