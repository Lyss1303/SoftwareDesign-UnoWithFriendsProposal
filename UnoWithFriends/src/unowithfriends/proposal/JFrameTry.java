package unowithfriends.proposal; 

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.Border;

public class JFrameTry implements ActionListener {

    private JFrame frame1; 
    private JPanel panel1;
    private JButton button1;
    private JButton button2; 
    private JLabel label1; 
    private JLabel label2; 
    private int b1Count;
    private int b2Count; 
    


    public JFrameTry(){
        frame1 = new JFrame("new jframe title"); 
        frame1.setSize(800, 800);


        //Reference: https://www.youtube.com/watch?v=5o3fMLPY7qY&t=138s
        //panel
        panel1 = new JPanel();
        panel1.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        panel1.setLayout(new GridLayout(0,1)); 

        //button
        button1 = new JButton("click me"); 
        panel1.add(button1); 
        button1.addActionListener(this); 

        //jlabel 
        label1= new JLabel("number of clicks = 0"); 
        label1.setHorizontalAlignment(SwingConstants.CENTER);
        panel1.add(label1); //add label to panel

        //button2
        button2 = new JButton("play a game?"); 
        panel1.add(button2);  
        button2.addActionListener(this);

        //label2 
        label2 = new JLabel("lets play 0 time(s)"); 
        label2.setHorizontalAlignment(SwingConstants.CENTER);
        panel1.add(label2); //add label to panel



        frame1.add(panel1, BorderLayout.CENTER);   
        frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
        frame1.setVisible(true);

        /*  //jlabel 
        JLabel label1= new JLabel("label 1: serving cunt"); 

        frame1.add(label1);
        
        frame1.setSize(800, 800); */

    }


    public static void main(String[] args) throws Exception {
        JFrameTry jObject1 = new JFrameTry(); 

    }

    //Reference: https://www.youtube.com/watch?v=W3tJhB8O0Bg 
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == button1){
            b1Count++; 
            label1.setText("number of clicks = " + b1Count);
        }
        else{
            b2Count++;
            label2.setText("lets play " + b2Count + " time(s)"); 
        }
        
        
        throw new UnsupportedOperationException("Unimplemented method 'actionPerformed'");
    }
}

