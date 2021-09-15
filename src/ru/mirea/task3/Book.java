package ru.mirea.task3;

public class Book {
    private String author;
    private int age;
    private String name;
    private int price;

    public Book(String n, String au, int a, int p){
        this.age = a;
        this.author = au;
        this.name = n;
        this.price = p;
    }

    public int getAge() {
        return age;
    }
    public int getPrice() {
        return price;
    }
    public String getAuthor() {
        return author;
    }
    public String getName() {
        return name;
    }

    public void setAge(int age) {
        this.age = age;
    }
    public void setAuthor(String author) {
        this.author = author;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Book{ " +
                "author = '" + author + '\'' +
                ", age = " + age +
                ", name = '" + name + '\'' +
                ", price = " + price +
                "$ }";
    }
}
