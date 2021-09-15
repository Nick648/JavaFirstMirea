package ru.mirea.task1.opt7;
import java.lang.*;
import java.util.Scanner;
public class Lab_1 {
    public static int fRan(int i) {
        if(i == 2){
            return 2;
        }
        else{
            return (i * fRan(i-1));
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Факториал числа. Введите число:");
        if(sc.hasNextInt()){
            int i = sc.nextInt();
            int f = fRan(i);
            System.out.println("Факториал числа '"+i+"' = "+f);
        }
        else{
            System.out.println("Вы ввели не целое число!");
        }
    }
}
