package ru.mirea.task3;

public class BookTest {
    public static void main(String[] args) {
        Book b1 = new Book("Book_1", "Author_1", 12, 130);
        b1.setAge(13);
        System.out.println("Цена книги " + b1.getName() + ": " + b1.getPrice() + "$");
        Book b2 = new Book("Book_2", "Author_2", 40, 210);
        System.out.println(b1);
        System.out.println(b2);
        b2.setPrice(230);
        System.out.println("Цена книги " + b2.getName() + ": " + b2.getPrice() + "$");
    }
}
