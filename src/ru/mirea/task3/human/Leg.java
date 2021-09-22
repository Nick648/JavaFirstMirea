package ru.mirea.task3.human;
import java.lang.*;

public class Leg {
    private int size;
    private String side;

    public Leg(int size, String side) {
        this.size = size;
        this.side = side;
    }

    public void setSide(String side) {
        this.side = side;
    }
    public void setSize(int size) {
        this.size = size;
    }

    public int getSize() {
        return size;
    }
    public String getSide() {
        return side;
    }

    void move(){
        System.out.println("Move only forward!");
    }

    @Override
    public String toString() {
        return "{ " +
                "size = " + size +
                ", side = '" + side + '\'' +
                " } ";
    }
}
