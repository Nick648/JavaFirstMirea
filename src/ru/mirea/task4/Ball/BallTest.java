package ru.mirea.task4.Ball;
import java.lang.*;

public class BallTest {
    public static void main(String[] args) {
        Ball b1 = new Ball();
        Ball b2 = new Ball(2,4);
        b1.setXY(1,4);
        System.out.println("Ball1: " + b1);
        b2.setX(5);
        System.out.println("Ball2: x = " + b2.getX() + " y = " + b2.getY());
        b2.move(2, 4);
        System.out.println("Ball2: " + b2);
    }
}
