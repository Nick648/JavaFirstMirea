package ru.mirea.task2.shape;

public class TestShape {
    public static void main(String[] args) {
        Shape sh1 = new Shape("Red", 12);
        System.out.println("Shape1: color = " + sh1.getColor() + "; size = " + sh1.getSize());
        sh1.setColor("Green");
        sh1.setSize(15);
        System.out.println("Shape1: " + sh1);
    }
}
