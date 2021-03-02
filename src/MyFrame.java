import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyFrame extends JFrame implements ActionListener{
    JButton button;
    JButton button1;
    JButton button2;

    MyFrame(){
        Icon icon = new ImageIcon("/icons/Close.png");

        button = new JButton(icon);
        button.setBounds(1200, 50, 150, 70);
        button.addActionListener(this);
        button.setText("Exit");
        button.setFocusable(false);
        button.setHorizontalTextPosition(JButton.CENTER);
        button.setVerticalTextPosition(JButton.BOTTOM);
        button.setFont(new Font("Comic Sans", Font.ITALIC, 25));//шрифт

        button1 = new JButton(icon);
        button1.setBounds(1000, 50, 150, 70);
        button1.addActionListener(this);
        button1.setText("Professor");
        button1.setFocusable(false);
        button1.setHorizontalTextPosition(JButton.CENTER);
        button1.setVerticalTextPosition(JButton.BOTTOM);
        button1.setFont(new Font("Comic Sans", Font.ITALIC, 25));

        button2 = new JButton(icon);
        button2.setBounds(800, 50, 150, 70);
        button2.addActionListener(this);
        button2.setText("Student");
        button2.setFocusable(false);
        button2.setHorizontalTextPosition(JButton.CENTER);
        button2.setVerticalTextPosition(JButton.BOTTOM);
        button2.setFont(new Font("Comic Sans", Font.ITALIC, 25));

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(null);
        this.setSize(1377,786);
        this.setVisible(true);
        this.add(button);
        this.add(button1);
        this.add(button2);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==button){
            System.out.println("exit");
        }
        if(e.getSource()==button1){
            System.out.println("professor");
        }
        if(e.getSource()==button2){
            System.out.println("student");
        }
    }
}

