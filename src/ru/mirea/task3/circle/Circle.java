package ru.mirea.task3.circle;

import java.lang.*;

public class Circle {
    private int radius;
    private String color;

    public Circle(int r){
        this.radius = r;
        this.color = "White";
    }
    public Circle(int r, String color){
        this.radius = r;
        this.color = color;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    @Override
    public String toString() {
        return "Circle{ " +
                "radius=" + radius +
                ", color='" + color + '\'' +
                " }";
    }
}
