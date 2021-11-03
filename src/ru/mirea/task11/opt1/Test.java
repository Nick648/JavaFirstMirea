package ru.mirea.task11.opt1;
import java.awt.*;
import java.util.Random;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Test {
    int attempt = 3;
    Random rand = new Random();
    private int randnum;
    public Test() {
        randnum = rand.nextInt(20);
        JFrame frame = new JFrame("GuessIt");
        //frame.setLocationRelativeTo(null); //Окно расположит по центру экрана
        frame.setLocation(500, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //определение действия при завершении программы
        frame.getContentPane().setBackground(Color.cyan);
        frame.setSize(800, 600);

        JButton but1 = new JButton("Try");
        but1.setBounds(325, 500, 150, 30);
        frame.setLayout(null);
        frame.add(but1);

        JLabel labelTry = new JLabel("Осталось попыток: 3");
        labelTry.setBounds(325, 100, 150, 150);
        frame.add(labelTry);

        JLabel labelInfo = new JLabel("Угадайте число от 1 до 20.");
        labelInfo.setBounds(325, 50, 200, 150);
        frame.add(labelInfo);

        JLabel labelHelper = new JLabel("");
        labelHelper.setBounds(325, 150, 200, 150);
        frame.add(labelHelper);

        JTextField Input = new JTextField(10);
        Input.setBounds(325,400,150,30);
        frame.add(Input);

        JButton but2 = new JButton("Restart game");
        but2.setBounds(50, 50, 150, 30);
        frame.add(but2);

        frame.setVisible(true);
        but1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                try {
                    int x1 = Integer.parseInt(Input.getText().trim());
                    Input.setText(null);
                    if(x1 > randnum){
                        attempt--;
                        labelHelper.setText("Ваш номер " + x1 + " больше нужного");
                        labelTry.setText("Осталось попыток: " + attempt);
                        but1.setBackground(Color.yellow);
                    }
                    else if(x1 < randnum){
                        attempt--;
                        labelHelper.setText("Ваш номер " + x1 + " меньше нужного");
                        labelTry.setText("Осталось попыток: " + attempt);
                        but1.setBackground(Color.yellow);
                    }
                    else {
                        JOptionPane.showMessageDialog(null, "You Win!", "Congratulation", JOptionPane.INFORMATION_MESSAGE);
                        attempt = 3;
                        randnum = rand.nextInt(20);
                        labelTry.setText("Осталось попыток: " + attempt);
                        labelHelper.setText("");
                        but1.setBackground(Color.green);
                    }
                    if(attempt == 0){
                        but1.setBackground(Color.red);
                        JOptionPane.showMessageDialog(null, "Попытки закончились! Правильный номер: " +randnum, "Alert", JOptionPane.ERROR_MESSAGE);
                        but1.setBackground(Color.white);
                        attempt = 3;
                        randnum = rand.nextInt(20);
                        labelTry.setText("Осталось попыток: " + attempt);
                        labelHelper.setText("");
                    }
                } catch (Exception e) {
                    but1.setBackground(Color.red);
                    JOptionPane.showMessageDialog(null, "Error in Numbers!", "Alert", JOptionPane.ERROR_MESSAGE);
                }
            }
        });

        but2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent a) {
                attempt = 3;
                randnum = rand.nextInt(20);
                Input.setText(null);
                labelTry.setText("Осталось попыток: 3");
                labelHelper.setText("");
                but1.setBackground(Color.white);
            }
        });
    }

    public static void main (String[] args)
    {
        Test frame = new Test();
    }
}

