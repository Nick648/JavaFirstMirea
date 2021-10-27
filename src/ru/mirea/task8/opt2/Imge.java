package ru.mirea.task8.opt2;

import javax.swing.*;
import java.util.Scanner;

public class Imge extends JPanel{
    public static final int WIDTH = 800;
    public static final int HEIGHT = 800;

    public static void Launch(){

        JFrame xF = new JFrame("Image");
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        s = "src/ru/mirea/task8/opt2/" + s;
        xF.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        xF.setResizable(false);
        xF.setVisible(true);
        xF.setSize(WIDTH,HEIGHT);
        xF.setLocationRelativeTo(null);
        xF.add(new JLabel(new ImageIcon(s)));
        xF.show();
    }

    public static void main(String[] args){

        Launch();

    }
}
