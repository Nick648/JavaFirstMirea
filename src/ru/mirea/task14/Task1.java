package ru.mirea.task14;

import java.util.Stack;
import java.util.Scanner;

public class Task1 {
    public static int counter = 0;

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Player 1: ");
        Stack<Integer> first = new Stack<>();
        for(int i = 0; i < 5; i++)
            first.push(scan.nextInt());

        System.out.print("Player 2: ");
        Stack<Integer> second = new Stack<>();
        for(int i = 0; i < 5; i++)
            second.push(scan.nextInt());

        while(!first.empty() && !second.empty()){
            int f = first.get(0);
            int s = second.get(0);
            if ( (f < s) || ((f == 9) && (s == 0)) ){
                second.push(first.get(0));
                second.push(second.get(0));
                first.remove(0);
                second.remove(0);
            }
            else{
                first.push(second.get(0));
                first.push(first.get(0));
                second.remove((0));
                first.remove((0));
            }
            //System.out.println("First: " + first + " Second: " + second + " Counter: " + counter);
            if (counter >= 106)
            {
                System.out.println("botva");
                break;
            }
            counter++;
        }
        if(first.empty()){
            System.out.println("second " + counter);
        }
        else if (second.empty()){
            System.out.println("first " + counter);
        }
    }
}
