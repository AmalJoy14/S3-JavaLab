import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.TextListener;
import javax.swing.*;

public class Login {
    public static void main(String[] args) {
        JFrame frame=new JFrame("Login");
        frame.setVisible(true);
        frame.setLayout(new FlowLayout());
        frame.setSize(350,350);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JLabel label1=new JLabel("Enter Username:");
        frame.add(label1);
        JTextField tf1=new JTextField(10);
        frame.add(tf1);
        JLabel label2=new JLabel("Enter Password :");
        frame.add(label2);
        JPasswordField tf2=new JPasswordField(10);
        frame.add(tf2);
        JButton b= new JButton(" Submit ");
        frame.add(b);

        b.addActionListener
                (
                        new ActionListener()
                        {   @Override
                        public void actionPerformed(ActionEvent e)
                            {
                               String text=tf1.getText();
                               JOptionPane.showMessageDialog(frame,"Welcome "+text);

                            }
                        }
                );
    }
}

