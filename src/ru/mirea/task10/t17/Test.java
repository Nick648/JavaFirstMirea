package ru.mirea.task10.t17;
import java.util.Scanner;

public class Test {
    private static int maxi(int n){
        Scanner in = new Scanner(System.in);
        System.out.print("Number: ");
        int n1 = in.nextInt();
        if (n1 == 0){
            return n;
        }
        else if (n1 > n){
            return maxi(n1);
        }
        return maxi(n);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Number: ");
        int n = in.nextInt();
        n = maxi(n);
        System.out.println("Максимальное число: " + n);
    }
}
