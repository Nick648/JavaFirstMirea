package ru.mirea.task6.nameable;
import java.lang.*;
public class Test {
    public static void main(String[] args) {
        Planet p1 = new Planet("Mars", 4);
        Human h1 = new Human("John","Jonson", 42);
        p1.getName();
        h1.getName();
    }
}