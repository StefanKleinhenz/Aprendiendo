package Lambdas;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class MyFrame {

    public MyFrame(){
        JButton button = new JButton("Ich teste Lambdas.");
        JButton button2 = new JButton("Ich teste immer noch lambdas");
        button.setBounds(100, 100, 200, 200);
        button2.setBounds(100, 300, 100, 200);
        button.addActionListener((e)->{System.out.println("Oh hell yeah");});
        button2.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Yaaaa wey xD");
                
            }
            
        });
        JFrame frame = new JFrame();
        frame.setTitle("Hello");
        frame.setBounds(100,100, 500, 500);
        frame.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(button);
        frame.add(button2);
        frame.setVisible(true);
    }
    
}
class main{
    
    public static void main(String[] args) {
        MyFrame frame = new MyFrame();

    }
}

