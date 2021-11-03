package ru.mirea.task10.t1;
import java.util.Scanner;
public class Task1 {
    private static void treg(int k, int n){
        if (k > n)
            return;
        else{
            for(int i = 1; i <= k; i++){
                System.out.print(k + " ");
            }
            treg(k + 1, n);
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Number: ");
        int n = in.nextInt();
        treg(1, n);
    }
}
