package ru.mirea.task10.t2;
import java.util.Scanner;

public class Task2 {
    private static void posl(int k, int n){
        if (k > n)
            return;
        else {
            System.out.print(k + " ");
            posl(k + 1, n);
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Number: ");
        int n = in.nextInt();
        posl(1, n);
    }

}
