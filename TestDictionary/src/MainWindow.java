import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.*;
import java.io.IOException;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Date;
import java.util.Scanner;

public class MainWindow extends JFrame {

    public MainWindow() {

        setBounds(500, 200, 500, 400);
        setTitle("Test Chat");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        Font notBold = new Font("Tahoma", Font.PLAIN, 12);

        JMenuBar menuBar = new JMenuBar();
        JMenu optMenu = new JMenu("Настройка");
        optMenu.setFont(notBold);
        JMenu colorMenu = new JMenu("Цветовая тема");
        colorMenu.setFont(notBold);
        optMenu.add(colorMenu);
        JMenuItem redItem = new JMenuItem("Красный");
        redItem.setFont(notBold);
        colorMenu.add(redItem);
        JMenuItem greenItem = new JMenuItem("Зеленый");
        greenItem.setFont(notBold);
        colorMenu.add(greenItem);
        JMenuItem blueItem = new JMenuItem("Синий");
        blueItem.setFont(notBold);
        colorMenu.add(blueItem);
        JMenuItem greyItem = new JMenuItem("Серый");
        greyItem.setFont(notBold);
        colorMenu.add(greyItem);
        JMenu limitMenu = new JMenu("Глубина перевода");
        limitMenu.setFont(notBold);
        optMenu.add(limitMenu);
        JMenuItem _1Item = new JMenuItem("1");
        _1Item.setFont(notBold);
        limitMenu.add(_1Item);
        JMenuItem _2Item = new JMenuItem("2");
        _2Item.setFont(notBold);
        limitMenu.add(_2Item);
        JMenuItem _3Item = new JMenuItem("3");
        _3Item.setFont(notBold);
        limitMenu.add(_3Item);
        JMenuItem _4Item = new JMenuItem("4");
        _4Item.setFont(notBold);
        limitMenu.add(_4Item);
        JMenuItem _5Item = new JMenuItem("5");
        _5Item.setFont(notBold);
        limitMenu.add(_5Item);
        JMenuItem _6Item = new JMenuItem("6");
        _6Item.setFont(notBold);
        limitMenu.add(_6Item);
        JMenuItem _7Item = new JMenuItem("7");
        _7Item.setFont(notBold);
        limitMenu.add(_7Item);
        JMenuItem _8Item = new JMenuItem("8");
        _8Item.setFont(notBold);
        limitMenu.add(_8Item);
        JMenuItem _9Item = new JMenuItem("9");
        _9Item.setFont(notBold);
        limitMenu.add(_9Item);
        JMenuItem _10Item = new JMenuItem("10");
        _10Item.setFont(notBold);
        limitMenu.add(_10Item);
        JMenu helpMenu = new JMenu("Справка");
        helpMenu.setFont(notBold);
        JMenuItem progMenu = new JMenuItem("О программе");
        progMenu.setFont(notBold);
        helpMenu.add(progMenu);
        menuBar.add(optMenu);
        menuBar.add(helpMenu);
        setJMenuBar(menuBar);

        JPanel mainPanel = new JPanel();
        mainPanel.setLayout(new BoxLayout(mainPanel, BoxLayout.Y_AXIS));

        JPanel topPanel = new JPanel();
        topPanel.setBackground(Colors.backColor);
        topPanel.setLayout(new BoxLayout(topPanel, BoxLayout.X_AXIS));
        topPanel.setBorder(BorderFactory.createEmptyBorder(10,10,10,10));
        JComboBox lang1Box = new JComboBox();
        lang1Box.setBorder(BorderFactory.createMatteBorder(0,0,0,10,Colors.backColor));
        topPanel.add(lang1Box);
        JButton reverseButton = new JButton("⇄");
        topPanel.add(reverseButton);
        JComboBox lang2Box = new JComboBox();
        lang2Box.setBorder(BorderFactory.createMatteBorder(0,10,0,0,Colors.backColor));
        topPanel.add(lang2Box);
        mainPanel.add(topPanel);

        JPanel centralPanel = new JPanel();
        centralPanel.setLayout(new BorderLayout());

        JPanel leftPanel = new JPanel();
        leftPanel.setBackground(Colors.backColor);
        leftPanel.setLayout(new BoxLayout(leftPanel, BoxLayout.Y_AXIS));
        leftPanel.setBorder(BorderFactory.createEmptyBorder(0,10,10,10));
        JTextField inputText = new JTextField("111111");
        inputText.setMaximumSize(new Dimension(5000,30));
        inputText.setBorder(BorderFactory.createEmptyBorder(3,3,3,3));
        leftPanel.add(inputText);
        JLabel marginLabel = new JLabel(" ");
        leftPanel.add(marginLabel);
        JTextArea transText = new JTextArea("222222222");
        transText.setEditable(false);
        transText.setLineWrap(true);
        transText.setBorder(BorderFactory.createEmptyBorder(3,3,3,3));
        leftPanel.add(transText);
        JTextArea resultText = new JTextArea("Последнее запомненное слово: test\nВарианты перевода: test, test, test, test, test");
        resultText.setEditable(false);
        resultText.setLineWrap(true);
        resultText.setBackground(Colors.backColor);
        resultText.setMaximumSize(new Dimension(5000,100));
        resultText.setBorder(BorderFactory.createEmptyBorder(10,3,5,3));
        leftPanel.add(resultText);
        centralPanel.add(leftPanel, BorderLayout.CENTER);

        JPanel rightPanel = new JPanel();
        rightPanel.setBackground(Colors.backColor);
        rightPanel.setLayout(new GridLayout(4,1,10,10));
        rightPanel.setBorder(BorderFactory.createEmptyBorder(0,0,10,10));
        JButton clearButton = new JButton("Очистить");
        clearButton.setBorder(new RoundedBorder(10));
        clearButton.setFont(notBold);
        rightPanel.add(clearButton);
        JButton memoryButton = new JButton("Запомнить");
        memoryButton.setBorder(new RoundedBorder(10));
        memoryButton.setFont(notBold);
        rightPanel.add(memoryButton);
        JButton ownButton = new JButton("Свой перевод");
        ownButton.setBorder(new RoundedBorder(10));
        ownButton.setFont(notBold);
        rightPanel.add(ownButton);
        JButton testButton = new JButton("Тестирование");
        testButton.setBorder(new RoundedBorder(10));
        testButton.setFont(notBold);
        rightPanel.add(testButton);
        centralPanel.add(rightPanel, BorderLayout.EAST);

        mainPanel.add(centralPanel);

        add(mainPanel);

        setVisible(true);

    }


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



//    public void buttonize(JButton button) {
//        button.setForeground(blueColor);
//        button.setBackground(blueColor);
//    }

}
