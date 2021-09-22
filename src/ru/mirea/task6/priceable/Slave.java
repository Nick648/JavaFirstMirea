package ru.mirea.task6.priceable;

public class Slave implements Priceable{
    private String name;
    private int age;
    private int price;

    Slave(String name, int age, int price){
        this.name = name;
        this.age = age;
        this.price = price;
    }

    public void getPrice() {
        System.out.println("\nИмя человека: " + name + "; Возвраст: " + age + "; Стоит: " + price + "$");
        System.out.println("Но рабов ОФИЦИАЛЬНО нельзя иметь с 1861 года!!!");
    }
}
