package ru.mirea.task1.opt3;
import java.lang.*;
import java.util.Scanner;

public class Lab_1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        int[] arr = new int[n];

        for(int i = 0; i < n; i++) {
            int num = sc.nextInt();
            arr[i] = num;
            sum += num;
        }
        System.out.println("With participation 'for': " + sum);

        int i = 0;
        sum = 0;
        while(i < n){
            sum += arr[i];
            i++;
        }
        System.out.println("With participation 'while': " + sum);

        i = 0; sum = 0;
        do{
            sum += arr[i];
            i++;
        }while(i < n);
        System.out.println("With participation 'do while': " + sum);
    }
}
