package ru.mirea.task6.nameable;

class Planet implements Nameable {
    private String name;
    private int number;

    Planet(String name, int number){
        this.name = name;
        this.number = number;
    }
    public void getName(){
        System.out.println("Planet: " + name + " is " + number + "-th in system.");
    }
}