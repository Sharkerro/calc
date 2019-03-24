import Model.MyButton;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyPanel extends JFrame implements ActionListener {




    public static void main(String[] args) {
        MyPanel  myPanel=new MyPanel();
        myPanel.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        myPanel.setVisible(true);

    }
    public MyPanel() {
        setSize(592, 585);
        setTitle("Calculator");
        setLayout(null);
        JTextArea textArea = new JTextArea();
        JScrollPane scrollPane=new JScrollPane(textArea);
        scrollPane.setBounds(0, 10, 425, 480);
        add(scrollPane);
        JList jList=new JList();
        jList.setBounds(430,10,145,480);
        add(jList);
        JTextField textField= new JTextField();
        textField.setBounds(0,500,425,20);
        add(textField);
        JMenuBar menuBar=new JMenuBar();
        JMenu   menu=new JMenu("Options");
        JMenuItem menuItem=new JMenuItem("Reset");
        JMenuItem menuItem1=new JMenuItem("Exit");
        menu.add(menuItem);
        menu.add(menuItem1);
        setJMenuBar(menuBar);
        menuBar.add(menu);

    }
    @Override
    public void actionPerformed(ActionEvent e) {

    }
}

