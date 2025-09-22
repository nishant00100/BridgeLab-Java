// DeckOfCards.java
// Initialize deck, shuffle (Fisher-Yates), distribute n cards to x players and print

import java.util.Scanner;

public class DeckOfCards {

    public static String[] initializeDeck() {
        String[] suits = {"Hearts", "Diamonds", "Clubs", "Spades"};
        String[] ranks = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace"};
        String[] deck = new String[suits.length * ranks.length];
        int idx = 0;
        for (String s : suits) {
            for (String r : ranks) {
                deck[idx++] = r + " of " + s;
            }
        }
        return deck;
    }

    public static void shuffleDeck(String[] deck) {
        int n = deck.length;
        for (int i = 0; i < n; i++) {
            int randomCardNumber = i + (int) (Math.random() * (n - i));
            String temp = deck[i];
            deck[i] = deck[randomCardNumber];
            deck[randomCardNumber] = temp;
        }
    }

    public static String[][] distributeCards(String[] deck, int cardsToDeal, int players) {
        if (cardsToDeal > deck.length) throw new IllegalArgumentException("Not enough cards in deck.");
        if (cardsToDeal % players != 0) throw new IllegalArgumentException("Cards cannot be equally distributed.");
        int perPlayer = cardsToDeal / players;
        String[][] hands = new String[players][perPlayer];
        int index = 0;
        for (int p = 0; p < players; p++) {
            for (int c = 0; c < perPlayer; c++) {
                hands[p][c] = deck[index++];
            }
        }
        return hands;
    }

    public static void printHands(String[][] hands) {
        for (int i = 0; i < hands.length; i++) {
            System.out.println("Player " + (i + 1) + " cards:");
            for (String card : hands[i]) {
                System.out.println("  " + card);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            String[] deck = initializeDeck();
            System.out.println("Deck initialized with " + deck.length + " cards.");
            shuffleDeck(deck);
            System.out.print("Enter number of cards to deal: ");
            int n = sc.nextInt();
            System.out.print("Enter number of players: ");
            int players = sc.nextInt();

            String[][] hands = distributeCards(deck, n, players);
            printHands(hands);

        } catch (IllegalArgumentException e) {
            System.out.println("Input error: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Unexpected error: " + e.getMessage());
        } finally {
            sc.close();
        }
    }
}
