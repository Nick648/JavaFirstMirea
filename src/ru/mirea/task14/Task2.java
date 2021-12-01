package ru.mirea.task14;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Task2 {
    public static int counter = 0;

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Player 1: ");
        Queue<Integer> first = new LinkedList<>();
        for(int i = 0; i < 5; i++)
            first.offer(scan.nextInt());

        System.out.print("Player 2: ");
        Queue<Integer> second = new LinkedList<>();
        for(int i = 0; i < 5; i++)
            second.offer(scan.nextInt());

        while(!first.isEmpty() && !second.isEmpty()){
            int f = first.peek();
            int s = second.peek();
            if ( (f < s) || ((f == 9) && (s == 0)) ){
                second.offer(first.poll());
                second.offer(second.poll());
            }
            else {
                first.offer(second.poll());
                first.offer(first.poll());
            }
            //System.out.println("First: " + first + " Second: " + second + " Counter: " + counter);
            if (counter >= 106)
            {
                System.out.println("botva");
                break;
            }
            counter++;
        }
        if(first.isEmpty()){
            System.out.println("second " + counter);
        }
        else if (second.isEmpty()){
            System.out.println("first " + counter);
        }
    }
}
