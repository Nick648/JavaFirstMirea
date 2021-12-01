package ru.mirea.task14;

import java.util.*;

public class Task4 {
    private static final int CARDS = 10;
    private static final Scanner reader = new Scanner(System.in);
    public static int counter = 0;

    public static void main(String[] args) {
        List<Integer> first = new LinkedList<>();
        List<Integer> second = new LinkedList<>();

        System.out.print("Player 1: ");
        String[] playerOneDeck = reader.nextLine().split(" ");
        System.out.print("Player 2: ");
        String[] playerTwoDeck = reader.nextLine().split(" ");

        for (int i = 0; i < CARDS / 2; ++i) {
            first.add(Integer.parseInt(playerOneDeck[i]));
        }
        for (int i = 0; i < CARDS / 2; ++i) {
            second.add(Integer.parseInt(playerTwoDeck[i]));
        }

        while (!first.isEmpty() && !second.isEmpty()) {
            if (counter >= 106) {
                System.out.println("botva");
                break;
            }
            int f = first.remove(0);
            int s = second.remove(0);
            if ( (f < s) || (f == 9 && s == 0) ) {
                second.add(f);
                second.add(s);
            } else {
                first.add(s);
                first.add(f);
            }
            //System.out.println("First: " + first + " Second: " + second + " Counter: " + counter);
            counter++;
        }
        if (first.isEmpty()) {
            System.out.println("second " + counter);
        }
        else if (second.isEmpty()) {
            System.out.println("first " + counter);
        }
    }
}
