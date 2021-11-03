package ru.mirea.task11.opt2;
import java.awt.*;
import java.lang.*;
import javax.swing.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class Test {
    private static final int WIDTH = 500;
    private static final int HEIGHT = 250;

    private static final JPanel center = new JPanel();
    private static final JPanel north = new JPanel();
    private static final JPanel south = new JPanel();
    private static final JPanel west = new JPanel();
    private static final JPanel east = new JPanel();

    public static void main(String[] args) {
        Dimension labelSize = new Dimension(120, 120);
        JFrame frame = new JFrame("App");
        JPanel panel = new JPanel(new BorderLayout());

        setMouseListener(center, "CENTER");
        setMouseListener(north, "NORTH");
        setMouseListener(south, "SOUTH");
        setMouseListener(west, "WEST");
        setMouseListener(east, "EAST");

        center.setPreferredSize(new Dimension(WIDTH, HEIGHT));
        north.setPreferredSize(new Dimension(WIDTH, HEIGHT / 2));
        south.setPreferredSize(new Dimension(WIDTH, HEIGHT / 2));
        west.setPreferredSize(new Dimension(WIDTH / 2, HEIGHT));
        east.setPreferredSize(new Dimension(WIDTH / 2, HEIGHT));

        center.setBackground(new Color(200,200,200));
        south.setBackground(new Color(255,100,100));
        west.setBackground(new Color(255,135,50));
        east.setBackground(new Color(117,42,182));
        north.setBackground(new Color(100,200,255));

        panel.add(center, BorderLayout.CENTER);
        panel.add(north, BorderLayout.NORTH);
        panel.add(south, BorderLayout.SOUTH);
        panel.add(west, BorderLayout.WEST);
        panel.add(east, BorderLayout.EAST);

        Font font = new Font("TCentury Gothic", Font.BOLD, 18);
        JLabel cen = new JLabel("CENTER");
        cen.setVerticalAlignment(JLabel.CENTER);
        cen.setHorizontalAlignment(JLabel.CENTER);
        cen.setPreferredSize(labelSize);
        cen.setFont(font);
        JLabel sou = new JLabel("SOUTH");
        sou.setVerticalAlignment(JLabel.CENTER);
        sou.setHorizontalAlignment(JLabel.CENTER);
        sou.setPreferredSize(labelSize);
        sou.setFont(font);
        JLabel wes = new JLabel("WEST");
        wes.setVerticalAlignment(JLabel.CENTER);
        wes.setHorizontalAlignment(JLabel.CENTER);
        wes.setPreferredSize(labelSize);
        wes.setFont(font);
        JLabel eas = new JLabel("EAST");
        eas.setVerticalAlignment(JLabel.CENTER);
        eas.setHorizontalAlignment(JLabel.CENTER);
        eas.setPreferredSize(labelSize);
        eas.setFont(font);
        JLabel nor = new JLabel("NORTH");
        nor.setVerticalAlignment(JLabel.CENTER);
        nor.setHorizontalAlignment(JLabel.CENTER);
        nor.setPreferredSize(labelSize);
        nor.setFont(font);
        center.add(cen);
        south.add(sou);
        west.add(wes);
        east.add(eas);
        north.add(nor);

        frame.add(panel);

        frame.setLocation(500, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //определение действия при завершении программы
        frame.pack();
        frame.setVisible(true);
    }
    private static void setMouseListener(JPanel panel, String text) {
        panel.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {

            }

            @Override
            public void mousePressed(MouseEvent e) {

            }

            @Override
            public void mouseReleased(MouseEvent e) {

            }

            public void mouseEntered(MouseEvent mouseEvent) {
                JOptionPane.showMessageDialog(panel, "Добро пожаловать в " + text);
            }

            @Override
            public void mouseExited(MouseEvent e) {

            }
        });
    }
}
