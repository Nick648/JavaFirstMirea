package ru.mirea.task1.opt6;

import java.util.Random;
import java.util.Scanner;

public class Lab_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        System.out.println("Кол-во элементов: ");
        int n = sc.nextInt();
        int sum = 0, r;
        int[] arr1 = new int[n];
        int[] arr2 = new int[n];
        double a;
        System.out.println("Array1: ");
        for(int i = 0; i < n; i++){
            a = Math.random() * 10;
            r = (int) Math.round(a);
            arr1[i] = r;
            System.out.print(arr1[i] + " ");
        }
        System.out.println("\nArray2: ");
        for(int i = 0; i < n; i++){
            arr2[i] = rand.nextInt(100);
            System.out.print(arr2[i] + " ");
        }
        System.out.println("\n");
        for (int i = 0; i < n-1; i++) {
            for (int j = i+1; j < n; j++) {
                if (arr1[j] < arr1[i]) {
                    int temp = arr1[j];
                    arr1[j] = arr1[i];
                    arr1[i] = temp;
                }
                if (arr2[j] < arr2[i]) {
                    int temp = arr2[j];
                    arr2[j] = arr2[i];
                    arr2[i] = temp;
                }
            }
        }
        System.out.println("Array1 Sorted: ");
        for(int i = 0; i < n; i++){
            System.out.print(arr1[i] + " ");
        }
        System.out.println("\nArray2 Sorted: ");
        for(int i = 0; i < n; i++){
            System.out.print(arr2[i] + " ");
        }
        System.out.println("\n");
    }
}