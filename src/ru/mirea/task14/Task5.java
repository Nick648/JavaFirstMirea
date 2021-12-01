package ru.mirea.task14;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Stack;

public class Task5 {
    private static final int NUMBER_OF_COLUMNS_FIELD = 20;
    private static final int CARDS = 10;

    private static final JTextField firstPlayerField = new JTextField(NUMBER_OF_COLUMNS_FIELD);
    private static final JTextField secondPlayerField = new JTextField(NUMBER_OF_COLUMNS_FIELD);
    private static final JLabel gameResultLabel = new JLabel("Result:");


    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setLocationRelativeTo(null);
        JPanel mainPanel = new JPanel(new BorderLayout());
        JButton resetButton = new JButton("Input");
        JLabel firstPlayerLabel = new JLabel("Start cards for the first player");
        JLabel secondPlayerLabel = new JLabel("Start cards for the second player");

        firstPlayerLabel.setPreferredSize(new Dimension(100, 40));
        secondPlayerLabel.setPreferredSize(new Dimension(100, 40));

        firstPlayerField.setMaximumSize(new Dimension(100, 40));
        secondPlayerField.setMaximumSize(new Dimension(100, 40));
        firstPlayerLabel.setLabelFor(firstPlayerField);
        secondPlayerLabel.setLabelFor(secondPlayerField);
        resetButton.setPreferredSize(new Dimension(150,100));
        resetButton.addActionListener(actionEvent -> {
            boolean isValid;
            try {
                boolean firstTrue = firstPlayerField.getText().split(" ").length == 5;
                boolean secondTrue = secondPlayerField.getText().split(" ").length == 5;
                isValid = firstTrue && secondTrue;
            } catch(Exception ex) {
                isValid = false;
            }
            if (isValid) {
                gameLogic();
            } else {
                JOptionPane.showMessageDialog(
                        frame,
                        "First string: " + firstPlayerField.getText() + "\nSecond string: " + secondPlayerField.getText(),
                        "Invalid input",
                        JOptionPane.ERROR_MESSAGE
                );
            }
        });
        resetButton.setVisible(true);
        gameResultLabel.setPreferredSize(new Dimension(200, 40));


        //mainPanel.add(secondPlayerLabel, BorderLayout.LINE_START);
        mainPanel.add(firstPlayerField, BorderLayout.LINE_START);
        mainPanel.add(secondPlayerField, BorderLayout.LINE_END);
        mainPanel.add(resetButton, BorderLayout.PAGE_START);
        mainPanel.add(gameResultLabel, BorderLayout.PAGE_END);
        //mainPanel.add(firstPlayerLabel, BorderLayout.BEFORE_FIRST_LINE);
        frame.add(mainPanel);

        frame.pack();
        frame.setResizable(false); //Растягивать окно
        frame.setVisible(true); //сделать окно видимым
        frame.setLocationRelativeTo(null); //Окно расположит по центру экрана
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //определение действия при завершении программы
    }

    private static void gameLogic() {
        Stack<Integer> first = new Stack<>();
        Stack<Integer> second = new Stack<>();

        String[] playerOneDeck = firstPlayerField.getText().split(" ");
        String[] playerTwoDeck = secondPlayerField.getText().split(" ");

        for (int i = 0; i < CARDS / 2; ++i) {
            first.add(0, Integer.parseInt(playerOneDeck[i]));
        }
        for (int i = 0; i < CARDS / 2; ++i) {
            second.add(0, Integer.parseInt(playerTwoDeck[i]));
        }

        int counter = 0;
        while (!first.empty() && !second.empty()) {
            if (counter >= 106) {
                gameResultLabel.setText("Ladies and gentlemen, we have a draw! botwa");
                break;
            }
            counter = doTurn(first, second, counter);
            //System.out.println("First: " + first + " Second: " + second + " Counter: " + counter);
        }

        if (first.empty()) {
            gameResultLabel.setText("Win: second! Number of parties: " + counter);
        }
        else if (second.empty()) {
            gameResultLabel.setText("Win: first! Number of parties:  " + counter);
        }
    }

    static int doTurn(Stack<Integer> first, Stack<Integer> second, int counter) {
        int f = first.pop();
        int s = second.pop();

        if ( (f < s) || (f == 9 && s == 0)) {
            second.add(0, f);
            second.add(0, s);
        } else {
            first.add(0, s);
            first.add(0, f);
        }
        counter++;
        return counter;
    }
}
