package ru.mirea.task5.dog;

public class TestDog {
    public static void main(String[] args) {
        Shepherd d1 = new Shepherd("Jack", 45, "12", 5);
        d1.dispInfo();
        Dachshunds d2 = new Dachshunds("Bob", 13, "5", 7, "0.5");
        d2.dispInfo();
    }
}
