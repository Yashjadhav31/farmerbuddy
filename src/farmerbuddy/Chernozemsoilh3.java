package farmerbuddy;
import javax.swing.*;
import java.awt.*;
import static java.awt.Color.WHITE;
import javax.swing.border.*;
import java.awt.event.*;
import java.sql.*;
import java.awt.event.AWTEventListener;
import java.awt.event.ActionEvent;

public class Chernozemsoilh3 extends JFrame implements ActionListener {
    JButton back3,back1,redy;
   

    
    
    Chernozemsoilh3() {
        setBounds(0, 0, 1600, 1000);
        getContentPane().setBackground(Color.white);
        setLayout(null);
        
         JPanel p1 = new JPanel();
       p1.setBackground(new Color(0, 0, 0));
       p1.setBounds(0,0,1600,1000);
       p1.setLayout(null);
       add(p1);
       
       ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/char3.png"));
       Image i2 = i1.getImage().getScaledInstance(1500, 740, Image.SCALE_DEFAULT);
       ImageIcon i3 = new ImageIcon(i2);
       JLabel icon = new JLabel(i3);
       icon.setBounds(0, 0, 1500, 740);
       p1.add(icon);
       
      
       
       back3 = new JButton("<");
       back3.setBounds(350, 750, 130, 30);
       back3.setBackground(new Color(133, 193, 233));
       back3.setForeground(Color.white);
       back3.setBorder(new LineBorder(new Color(133, 193, 233)));
        back3.addActionListener(this);
       
       p1.add(back3);
       
        
       back1 = new JButton(">");
       back1.setBounds(1100, 750, 130, 30);
       back1.setBackground(new Color(133, 193, 233));
       back1.setForeground(Color.white);
       back1.setBorder(new LineBorder(new Color(133, 193, 233)));
        back1.addActionListener(this);
       
       p1.add(back1);
       
           
    
         

       
    
      
      
       setVisible(true);
    }
    public void actionperformed(ActionEvent ae) {
         if (ae.getSource() == back3){
                setVisible(false);
            new Chernozemsoilh2();
            } else  if (ae.getSource() == back1){
                setVisible(false);
            new Chernozemsoil();
            } 
           }
    
     public static void main(String[] args) {
        new Chernozemsoilh3();
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == back3){
                setVisible(false);
            new Chernozemsoilh2();
            } else  if (ae.getSource() == back1){
                setVisible(false);
            new Chernozemsoil();
            } 
    }
}



