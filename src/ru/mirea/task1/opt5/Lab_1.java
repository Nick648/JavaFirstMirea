package ru.mirea.task1.opt5;

public class Lab_1 {
    public static void main(String[] args) {
        for(int i = 1; i <= 10; i++){
            String str = String.format("%.3f", 1.0/i);
            System.out.println(str);
        }
    }
}