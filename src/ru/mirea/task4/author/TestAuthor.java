package ru.mirea.task4.author;
import java.lang.*;

public class TestAuthor {
    public static void main(String[] args){
        Author a1 = new Author("Katerina", "MarSue@gman.comm", 'f');
        System.out.println(a1);
        System.out.println(a1.getName() + " " + a1.getEmail() + " " + a1.getGender());
    }
}
