package ru.mirea.task2.shape;
import java.lang.*;
public class Shape {
    private String color;
    private int size;

    Shape(String c, int s){
        this.color = c;
        this.size = s;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public int getSize() {
        return size;
    }

    public String getColor() {
        return color;
    }

    @Override
    public String toString() {
        return "{ color = '" + color + '\'' +
                ", size = " + size +
                " } ";
    }
}
