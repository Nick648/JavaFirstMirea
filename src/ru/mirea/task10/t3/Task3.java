package ru.mirea.task10.t3;

import java.util.Scanner;

public class Task3 {
    private static void pora_1(int a, int b){
        if (a < b)
            return;
        System.out.print(a + " ");
        pora_1(a - 1, b);
    }

    private static void pora(int a, int b){
        if (a > b)
            return;
        System.out.print(a + " ");
        pora(a + 1, b);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Number A: ");
        int a = in.nextInt();
        System.out.print("Number B: ");
        int b = in.nextInt();
        if(b >= a) {
            System.out.print("Ряд: ");
            pora(a, b);
        }
        else {
            System.out.print("Ряд: ");
            pora_1(a, b);
        }
    }
}
