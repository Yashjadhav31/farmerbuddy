package farmerbuddy;
import javax.swing.*;
import java.awt.*;
import static java.awt.Color.WHITE;
import javax.swing.border.*;
import java.awt.event.*;
import java.sql.*;
import java.awt.event.AWTEventListener;
import java.awt.event.ActionEvent;

public class Lateritesoilm1 extends JFrame implements ActionListener {
    JButton back2,back1,redy;
   

    
    
    Lateritesoilm1() {
        setBounds(0, 0, 1600, 1000);
        getContentPane().setBackground(Color.white);
        setLayout(null);
        
         JPanel p1 = new JPanel();
       p1.setBackground(new Color(0, 0, 0));
       p1.setBounds(0,0,1600,1000);
       p1.setLayout(null);
       add(p1);
       
       ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/char15.png"));
       Image i2 = i1.getImage().getScaledInstance(1500, 740, Image.SCALE_DEFAULT);
       ImageIcon i3 = new ImageIcon(i2);
       JLabel icon = new JLabel(i3);
       icon.setBounds(0, 0, 1500, 740);
       p1.add(icon);
       
      
       
       back2 = new JButton("<");
       back2.setBounds(350, 750, 130, 30);
       back2.setBackground(new Color(133, 193, 233));
       back2.setForeground(Color.white);
       back2.setBorder(new LineBorder(new Color(133, 193, 233)));
        back2.addActionListener(this);
       
       p1.add(back2);
       
        
       back1 = new JButton(">");
       back1.setBounds(1100, 750, 130, 30);
       back1.setBackground(new Color(133, 193, 233));
       back1.setForeground(Color.white);
       back1.setBorder(new LineBorder(new Color(133, 193, 233)));
        back1.addActionListener(this);
       
       p1.add(back1);
       
           
     redy = new JButton(" X");
       redy.setBounds(1480, 0, 50, 40);
       redy.setBackground(new Color(150, 0, 10));
       redy.setForeground(Color.white);
       redy.setFont(new Font("Tahoma", Font.PLAIN,15));
        redy.addActionListener(this);
       
         

       
    
      
      
       setVisible(true);
    }
    public void actionperformed(ActionEvent ae) {
         if (ae.getSource() == back2){
                setVisible(false);
            new Lateritesoil();
            } else  if (ae.getSource() == back1){
                setVisible(false);
            new Lateritesoilm2();
            } else  if (ae.getSource() == redy){
                setVisible(false);
            new Chernozemsoilh3(); }
           }
    
     public static void main(String[] args) {
        new Lateritesoilm1();
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == back2){
                setVisible(false);
            new Lateritesoil();
            } else  if (ae.getSource() == back1){
                setVisible(false);
            new Lateritesoilm2();
            } else  if (ae.getSource() == redy){
                setVisible(false);
            new Chernozemsoilh3(); }
    }
}

