package ru.mirea.task9;
import javax.swing.*;
import java.awt.*;

public class Test {
    private static int milanScore = 0;
    private static int madridScore = 0;
    private static boolean gameOver = false;
    private static int endScore = 5;

    private static final int screenWidth = 800;
    private static final int screenHeight = 600;


    public static void main(String[] args) {
        Font fnt = new Font("Times new roman",Font.BOLD,30);
        Font fnt1 = new Font("Times new roman",Font.BOLD,20);
        JFrame frame = new JFrame("Game");
/*
        Panel panel = new Panel();
        panel.setBackground(Color.LIGHT_GRAY);
        frame.add(panel, BorderLayout.CENTER);
        panel.setSize(800, 600);
*/
        JLabel label1 = new JLabel("Result: 0 X 0");
        label1.setHorizontalAlignment(JLabel.CENTER);
        label1.setFont(fnt);

        JLabel label2 = new JLabel("Last Scorer: N/A");
        label2.setHorizontalAlignment(JLabel.CENTER);
        label2.setFont(fnt1);

        Label text = new Label(" ");
        text.setAlignment(Label.CENTER);

        JButton button1 = new JButton("Milan");
        button1.setSize(screenWidth/3, 50);
        button1.setLocation(0, screenHeight/2 - 50);
        button1.addActionListener(actionEvent -> ChangeScore(button1, label1, label2, text, true));
        button1.setFont(fnt1);

        JButton button2 = new JButton("Madrid");
        button2.setSize(screenWidth/3, 50);
        button2.setLocation(screenWidth - screenWidth/3, screenHeight /2 - 50);
        button2.addActionListener(actionEvent -> ChangeScore(button2, label1, label2, text, false));
        button2.setFont(fnt1);

        frame.add(button1);
        frame.add(button2);
        frame.add(label1, BorderLayout.NORTH);
        frame.add(label2, BorderLayout.SOUTH);
        frame.add(text, BorderLayout.CENTER);


        frame.setSize(screenWidth, screenHeight);
        frame.setResizable(false); //Растягивать окно
        frame.setVisible(true); //сделать окно видимым
        frame.setLocationRelativeTo(null); //Окно расположит по центру экрана
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //определение действия при завершении программы
        button1.setBackground(new Color(248, 121, 74, 255));//255 прозрачность
        button2.setBackground(new Color(51, 102, 255));
        frame.getContentPane().setBackground(Color.cyan);

    }

    private static void ChangeScore(JButton button, JLabel label1, JLabel label2, Label text, boolean q){
        if(!gameOver){
            if(q){
                milanScore++;
                if(milanScore >= endScore){
                    text.setText("Game over! The winner is " + button.getText());
                    gameOver = true;
                }
            }
            else{
                madridScore++;
                if(madridScore >= endScore){
                    text.setText("Game over! The winner is " + button.getText());
                    gameOver = true;
                }
            }
            label1.setText("Final score: " + milanScore + " X " + madridScore);
            label2.setText("Last Scorer: " + button.getText());
        }
    }
}