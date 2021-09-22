package ru.mirea.task5.dish;
import java.lang.*;
public abstract class Dish {
    private String type;
    private String color;
    private int cost;

    public Dish(String type){
        this.type = type;
        this.color = "White";
        this.cost = 2;
    }

    public Dish(String type, String color, int cost){
        this.type = type;
        this.color = color;
        this.cost= cost;
    }

    public String getType() {
        return type;
    }
    public String getColor() {
        return color;
    }
    public int getCost() {
        return cost;
    }

    public void setColor(String color) {
        this.color = color;
    }
    public void setCost(int cost) {
        this.cost = cost;
    }
    public void setType(String type) {
        this.type = type;
    }

    public abstract void findDish();
}