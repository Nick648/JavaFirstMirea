package ru.mirea.task8.opt1;
import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class Test {
        private static final int width = 500;
        private static final int height = 500;
        public static void main(String[]args) {
        JFrame frame = new JFrame();
        frame.add(new Panel(width, height));
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setSize(600, 600);
        frame.setVisible(true);
    }
}
