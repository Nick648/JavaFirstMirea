package ru.mirea.task15;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Objects;
import java.util.Scanner;

public class opt1 {
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);
        try(FileWriter writer = new FileWriter("C:\\Users\\Dima\\IdeaProjects\\src\\ru\\mirea\\task15\\try.txt", true))
        {
            System.out.print("Введите текст: ");
            String str = in.nextLine();
            writer.append('\n');
            writer.write(str);
            writer.append('\n');
            writer.flush();
            writer.close();
        }
        catch(IOException ex){
            System.out.println(ex.getMessage());
        }

        System.out.println("Ваш текст считаный из файла: ");
        try(FileReader reader = new FileReader("C:\\Users\\Dima\\IdeaProjects\\src\\ru\\mirea\\task15\\try.txt")) {
            int c;
            while( (c = reader.read() ) != -1){
                System.out.print((char)c);
            }
            reader.close();
        }
        catch(IOException ex){
            System.out.println(ex.getMessage());
        }

        FileWriter fwn = new FileWriter( "C:\\Users\\Dima\\IdeaProjects\\src\\ru\\mirea\\task15\\try.txt" );
        System.out.print("Введите текст: ");
        Scanner scwn = new Scanner(System.in);
        String strn = scwn.nextLine();
        fwn.write(strn);
        System.out.print("Добавочный текст: ");
        strn = scwn.nextLine();
        fwn.write(" " + strn);
        fwn.close();
    }
}
