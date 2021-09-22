package ru.mirea.task6.nameable;

class Human implements Nameable {
    private String name;
    private String surname;
    private int age;

    Human(String name, String surname, int age){
        this.name = name;
        this.surname = surname;
        this.age = age;
    }
    public void getName(){
        System.out.println("Name: " + name + " "+ surname + " and "+ age+" years old.");
    }
}
