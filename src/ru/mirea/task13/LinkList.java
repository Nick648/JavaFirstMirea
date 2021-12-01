package ru.mirea.task13;

import java.util.LinkedList;

public class LinkList {
    public static void main(String[] args) {
        String str1 = new String("mlp");
        String str2 = new String("zx");
        String str3 = new String("array");
        String str4 = new String("abc");

        LinkedList<String> list = new LinkedList<>();
        System.out.println("List: " + list);
        list.add(str3);
        System.out.println("List: " + list);
        list.add(1, str2);
        System.out.println("List: " + list);
        list.addFirst(str1);
        System.out.println("List: " + list);
        list.addLast(str4);
        System.out.println("List: " + list);
        list.remove(1);
        System.out.println("List after remove(1): " + list);

        System.out.println("First element of list: " + list.peekFirst());
        System.out.println("Last element of list: " + list.peekLast());

        list.set(0, "qwerty");
        System.out.println("List set(0): " + list);

        System.out.println("Number of elements: " + list.size());
        System.out.println("Index of 'abc': " + list.indexOf("abc"));
        System.out.println("Is 'abc' in list: " + list.contains("abc"));
        System.out.println("Is 'aft' in list: " + list.contains("aft"));

        System.out.println("String array:");
        String[] array = new String[list.size()];
        list.toArray(array);
        for(int i = 0; i < array.length; i++)
        {
            System.out.println(array[i]);
        }

    }
}
