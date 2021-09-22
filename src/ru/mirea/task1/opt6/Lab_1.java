package ru.mirea.task1.opt6;
import java.lang.*;
import java.util.Scanner;

public class Lab_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0, r;
        int[] arr = new int[n];
        double a;
        System.out.println("Array1: ");
        for(int i = 0; i < n; i++){
            a = Math.random() * 10;
            r = (int) Math.round(a);
            arr[i] = r;
            System.out.print(arr[i] + " ");
        }
        System.out.println("\n");
        for (int i = 0; i < n-1; i++) {
            for (int j = i+1; j < n; j++) {
                if (arr[j] < arr[i]) {
                    int temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;
                }
            }
        }
        System.out.println("Array1 Sorted: ");
        for(int i = 0; i < n; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println("\n");
    }
}