package ru.mirea.task10.t5;

import java.util.Scanner;

public class Task5 {
    private static int summa(int n){
        if (n == 0)
            return 0;
        else
            return ((n % 10) + summa(n / 10));
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Number: ");
        int n = in.nextInt();
        System.out.println("Сумма цифр: " + summa(n));
    }
}
