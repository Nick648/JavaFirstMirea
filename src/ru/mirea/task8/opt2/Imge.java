package ru.mirea.task8.opt2;

import javax.swing.*;
import java.awt.*;
import java.util.Scanner;

public class Imge extends JPanel{
    public static final int WIDTH = 800;
    public static final int HEIGHT = 600;

    public static void Launch(){

        JFrame xF = new JFrame("Image");
        Scanner sc = new Scanner(System.in);
        xF.setLocationRelativeTo(null); //Окно расположит по центру экрана
        String s = sc.nextLine();
        s = "src/ru/mirea/task8/opt2/" + s;
        xF.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        xF.setResizable(false);
        xF.setVisible(true); //сделать окно видимым
        xF.setSize(WIDTH,HEIGHT);
        xF.setLocationRelativeTo(null);
        Panel panel = new Panel();
        panel.add(new JLabel(new ImageIcon(s)));
        xF.add(panel/*, BorderLayout.CENTER*/);
        //xF.add(new JLabel(new ImageIcon(s)));
        xF.show();
    }

    public static void main(String[] args){

        Launch();

    }
}
