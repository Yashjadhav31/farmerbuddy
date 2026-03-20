package farmerbuddy;
import javax.swing.*;
import java.awt.*;
import static java.awt.Color.WHITE;
import javax.swing.border.*;
import java.awt.event.*;
import java.sql.*;
import java.awt.event.AWTEventListener;
import java.awt.event.ActionEvent;

public class query1 extends JFrame implements ActionListener {
    JButton back;
   

    
    
    query1() {
       setSize(900, 400);
       setLocation(350, 200);
       setLayout(null);
       getContentPane().setBackground(Color.white);
       
       JPanel p1 = new JPanel();
       p1.setBackground(new Color(131, 200, 233));
       p1.setBounds(0,0,900,400);
       p1.setLayout(null);
       add(p1);
       
       
      
       
       back = new JButton("BACK");
       back.setBounds(360, 250, 130, 30);
       back.setBackground(new Color(133, 193, 233));
       back.setForeground(Color.white);
       back.setBorder(new LineBorder(new Color(133, 193, 233)));
        back.addActionListener(this);
       
       p1.add(back);
       
           
     JLabel heading = new JLabel("ANSWER");
       heading.setBounds(340, 20, 320, 50);
       heading.setFont(new Font("Tahoma", Font.BOLD, 30));
       heading.setForeground(WHITE);
       p1.add(heading);
       
       
         

       
     JLabel yash = new JLabel("yash");
       yash.setBounds(20, 80, 400, 50);
       yash.setFont(new Font("Tahoma", Font.BOLD, 30));
       yash.setForeground(WHITE);
       p1.add(yash);
      
      
       setVisible(true);
    }
    public void actionperformed(ActionEvent ae) {
         if (ae.getSource() == back){
                setVisible(false);
            new queries();
            }
           }
    
     public static void main(String[] args) {
        new query1();
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == back){
                setVisible(false);
            new queries();
            }
    }
}

        
 
    

