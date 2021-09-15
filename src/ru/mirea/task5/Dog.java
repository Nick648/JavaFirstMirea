package ru.mirea.task5;
import java.lang.*;

public abstract class Dog {
    private String name;
    private int weight;
    private String prize;

    public Dog(String name, int weight, String prize) {
        this.name = name;
        this.weight = weight;
        this.prize = prize;
    }
    public String getName() { return name; }
    public String getPrize() { return prize; }
    public int getWeight() { return weight; }

    public abstract void dispInfo();
}
