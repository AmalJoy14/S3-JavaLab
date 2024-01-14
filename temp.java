import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.TextListener;
import javax.swing.*;

public class Temp  {
    public static void main(String[] args) {
        JFrame frame=new JFrame("Temp convertor");
        frame.setVisible(true);
        frame.setLayout(new FlowLayout());
        frame.setSize(350,350);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JLabel label1=new JLabel("Temp in celisus :");
        frame.add(label1);
        JTextField tf1=new JTextField(10);
        frame.add(tf1);
        JLabel label2=new JLabel("temp in fahreinheit :");
        frame.add(label2);
        JTextField tf2=new JTextField(10);
        frame.add(tf2);
        JButton b= new JButton("C to F");
        frame.add(b);

        b.addActionListener
        (
                new ActionListener()
                {   @Override
                    public void actionPerformed(ActionEvent e)
                    {
                        String text=tf1.getText();
                        int celicious=Integer.parseInt(text);
                        double fahreinheit=( celicious *(double)9/5)+32;
                        String text2=String.valueOf(fahreinheit);
                        tf2.setText(text2);
                    }
                }
        );
    }
}
