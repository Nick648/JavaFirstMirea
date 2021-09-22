package ru.mirea.task3.human;

public class Human {
    public static void main(String[] args) {
        Leg l1 = new Leg(42, "Left");
        System.out.println("This is " + l1.getSide() + " leg");
        l1.move();
        Leg r1 = new Leg(38, "Right");
        System.out.println("Leg2: " + r1);
    }
}
