package farmerbuddy;
import javax.swing.*;
import java.awt.*;
import static java.awt.Color.WHITE;
import javax.swing.border.*;
import java.awt.event.*;
import java.sql.*;
import java.awt.event.AWTEventListener;
import java.awt.event.ActionEvent;

public class Forestsoiltranslate extends JFrame implements ActionListener {
    JButton back,back1;
   

    
    
    Forestsoiltranslate() {
       setSize(900, 400);
       setLocation(350, 200);
       setLayout(null);
       getContentPane().setBackground(Color.black);
       
       JPanel p1 = new JPanel();
       p1.setBackground(new Color(131, 200, 233));
       p1.setBounds(0,0,900,400);
       p1.setLayout(null);
       add(p1);
       
       
      
       
       back = new JButton("Marathi");
       back.setBounds(300, 250, 130, 50);
       back.setBackground(new Color(193, 113, 133));
       back.setForeground(Color.white);
       back.setBorder(new LineBorder(new Color(133, 193, 233)));
        back.addActionListener(this);
       
       p1.add(back);
       
       back1 = new JButton("Hindi");
       back1.setBounds(460, 250, 130, 50);
       back1.setBackground(new Color(193, 115, 133));
       back1.setForeground(Color.white);
       back1.setBorder(new LineBorder(new Color(133, 193, 233)));
        back1.addActionListener(this);
       
       p1.add(back1);
       
           
     JLabel heading = new JLabel("Translate");
       heading.setBounds(320, 20, 320, 80);
       heading.setFont(new Font("Tahoma", Font.BOLD, 50));
       heading.setForeground(WHITE);
       p1.add(heading);
       
       
         

       
    
      
      
       setVisible(true);
    }
    public void actionperformed(ActionEvent ae) {
         if (ae.getSource() == back){
                setVisible(false);
            new queries();
            }
           }
    
     public static void main(String[] args) {
        new Forestsoiltranslate();
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == back){
                setVisible(false);
            new Forestsoilm1();
            } else  if (ae.getSource() == back1){
                setVisible(false);
            new Forestsoilh1(); }
    }
}
