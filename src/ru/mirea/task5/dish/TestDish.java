package ru.mirea.task5.dish;

public class TestDish {
    public static void main(String[] args){
        Knife k1 = new Knife("Knife", "gray", 10, "Ag");
        k1.findDish();
        Pan p2 = new Pan("Pan", "Black", 23, "round");
        p2.findDish();
    }
}
