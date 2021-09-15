package ru.mirea.task2.Book;
import java.lang.*;
public class Book {
    private String name;
    private String author;
    private int page;

    public Book(String n, String a, int p) {
        this.name = n;
        this.author = a;
        this.page = p;
    }

    public void setName(String n) {
        this.name = n;
    }

    public void setAuthor(String a) {
        this.author = a;
    }

    public void setPage(int p) {
        this.page = p;
    }

    public String getName() {
        return name;
    }

    public String getAuthor() {
        return author;
    }

    public int getPage() {
        return page;
    }

    @Override
    public String toString() {
        return "Book{" +
                "name = '" + name + '\'' +
                ", author = '" + author + '\'' +
                ", page = " + page +
                '}';
    }
}
