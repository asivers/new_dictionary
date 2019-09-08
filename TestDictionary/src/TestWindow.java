/*
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.IOException;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Date;
import java.util.Scanner;

public class TestWindow extends JFrame {

    //переменные java swing - основное окно

    private JPanel mainPanel;

    private JPanel topPanel;
    private JComboBox lang1Box;
    private JButton reverseButton;
    private JComboBox lang2Box;

    private JPanel centralPanel;

    private JPanel leftPanel;
    private JTextField inputText;
    private JLabel marginLabel;
    private JTextArea transText;
    private JTextArea resultText;

    private JPanel rightPanel;
    private JButton clearButton;
    private JButton memoryButton;
    private JButton ownButton;
    private JButton testButton;




    public TestWindow() {

        //задаем основное окно
        setBounds(400, 200, 600, 500);
        setTitle("Test Chat");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        mainPanel = new JPanel();
        mainPanel.setLayout(new BoxLayout(mainPanel, BoxLayout.Y_AXIS));

        topPanel = new JPanel();
        topPanel.setLayout(new BoxLayout(topPanel, BoxLayout.X_AXIS));
        topPanel.setBorder(BorderFactory.createEmptyBorder(10,10,10,10));
        lang1Box = new JComboBox();
        lang1Box.setBorder(BorderFactory.createEmptyBorder(0,0,0,10));
        topPanel.add(lang1Box);
        reverseButton = new JButton("⇄");
        topPanel.add(reverseButton);
        lang2Box = new JComboBox();
        lang2Box.setBorder(BorderFactory.createEmptyBorder(0,10,0,0));
        topPanel.add(lang2Box);
        mainPanel.add(topPanel);

        centralPanel = new JPanel();
        centralPanel.setLayout(new BoxLayout(centralPanel, BoxLayout.X_AXIS));

        leftPanel = new JPanel();
        leftPanel.setLayout(new BoxLayout(leftPanel, BoxLayout.Y_AXIS));
        leftPanel.setBorder(BorderFactory.createEmptyBorder(0,10,10,10));
        inputText = new JTextField("111111");
        inputText.setMaximumSize(new Dimension(5000,30));
        inputText.setBorder(BorderFactory.createEmptyBorder(3,3,3,3));
        leftPanel.add(inputText);
        marginLabel = new JLabel(" ");
        leftPanel.add(marginLabel);
        transText = new JTextArea("222222222");
        transText.setBorder(BorderFactory.createEmptyBorder(3,3,3,3));
        leftPanel.add(transText);
        resultText = new JTextArea("Последнее запомненное слово: test\nВарианты перевода: test, test, test, test, test");
        resultText.setBackground(new Color(240,240,240));
        resultText.setMaximumSize(new Dimension(5000,100));
        resultText.setBorder(BorderFactory.createEmptyBorder(10,3,5,3));
        leftPanel.add(resultText);
        centralPanel.add(leftPanel);

        rightPanel = new JPanel();
        rightPanel.setLayout(new GridLayout(4,1,10,10));
        rightPanel.setBorder(BorderFactory.createEmptyBorder(0,10,10,10));
        clearButton = new JButton("Очистить");
        rightPanel.add(clearButton);
        memoryButton = new JButton("Запомнить");
        rightPanel.add(memoryButton);
        ownButton = new JButton("Свой перевод");
        rightPanel.add(ownButton);
        testButton = new JButton("Тестирование");
        rightPanel.add(testButton);
        centralPanel.add(rightPanel, BorderLayout.EAST);

        mainPanel.add(centralPanel);

        add(mainPanel);

//        textAreaMsg.setEditable(false);
//        textAreaMsg.setLineWrap(true);
//        scrollPane = new JScrollPane(textAreaMsg);
//        mainPanel.add(scrollPane, BorderLayout.CENTER);



//        getRootPane().setDefaultButton(testButton);
//        testButton.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent e) {
//
//            }
//        });
//
//        textFieldMsg = new JTextField("Please input your message");
//        textFieldMsg.addFocusListener(new FocusAdapter() {
//            @Override
//            public void focusGained(FocusEvent e) {
//                textFieldMsg.setText("");
//            }
//        });

        setVisible(true);

    }

}
*/
