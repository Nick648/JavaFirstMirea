package ru.mirea.task8.opt3;
import javax.swing.*;
import java.awt.*;

public class Test {
    private static Thread th;
    ImageIcon images;
    JFrame frame;
    private static JLabel lbl;

    public static void main(String[] args) {
        Test tst = new Test();
    }
    public Test() {
        JFrame frame = new JFrame("GIF");
        th = new Thread();
        lbl = new JLabel();
        Panel panel = new Panel();
        panel.add(lbl);
        frame.add(panel, BorderLayout.CENTER);
        frame.setSize(500, 550);
        panel.setBackground(Color.black); //установить цвет очищения области
        frame.setResizable(false); //Растягивать окно
        frame.setVisible(true); //сделать окно видимым
        frame.setLocationRelativeTo(null); //Окно расположит по центру экрана
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //определение действия при завершении программы

        while (true){
            swingAnimator();
        }

    }

    public static void swingAnimator() {
        try {
            for (int i = 1; i <= 14; i++) {
                ImageIcon images;
                images = new ImageIcon("src/ru/mirea/task8/opt3/animation/Duck (" + i + ").jpg");
                lbl.setIcon(images);
                th.sleep(60);
            }
        } catch (InterruptedException e) {}
    }
}

