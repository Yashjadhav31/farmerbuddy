package farmerbuddy;
import java.awt.Color;
import static java.awt.Color.WHITE;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

import javax.swing.JFrame;


public class irrigation extends JFrame implements ActionListener{
    JButton viewsoil,soil,red,Laterite,Forest,Desert,Alkaline,Marshy,redyea;
    irrigation() {
        
         setBounds(0, 0, 1600, 1000);
        getContentPane().setBackground(Color.white);
        setLayout(null);
        
         JPanel p1 = new JPanel();
       p1.setBackground(new Color(0, 50, 130));
       p1.setBounds(0,0,1600,780);
       p1.setLayout(null);
       add(p1);
       
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/precision.jpg"));
       Image i2 = i1.getImage().getScaledInstance(1600, 780, Image.SCALE_DEFAULT);
       ImageIcon i3 = new ImageIcon(i2);
       JLabel icon = new JLabel(i3);
       icon.setBounds(0, 0, 1600, 780);
       p1.add(icon);
       
       
       
       
        viewsoil = new JButton("Drip Irrigation");
       viewsoil.setBounds(50, 100, 300, 60);
       viewsoil.setBackground(new Color(0, 0, 150));
       viewsoil.setForeground(Color.white);
       viewsoil.setFont(new Font("Tahoma", Font.PLAIN,20));
               viewsoil.addActionListener(this);

       p1.add(viewsoil);
       
       
         JPanel p2 = new JPanel();
       p2.setBackground(new Color(0, 50, 130));                                             
       p2.setBounds(0,0,800,250);
       p2.setLayout(null);
       add(p2);
       
      
       
                                         
         soil = new JButton("Subirrigation");
       soil.setBounds(430, 100, 300, 60);
       soil.setBackground(new Color(0, 0, 150));
       soil.setForeground(Color.white);
       soil.setFont(new Font("Tahoma", Font.PLAIN,20));
               soil.addActionListener(this);

       p2.add(soil);
       
       JPanel p3 = new JPanel();
       p3.setBackground(new Color(0, 50, 130));                                             
       p3.setBounds(0,0,1200,250);
       p3.setLayout(null);
       add(p3);
       
        red = new JButton("Center-pivot irrigation");
       red.setBounds(820, 100, 300, 60);
       red.setBackground(new Color(0, 0, 150));
       red.setForeground(Color.white);
       red.setFont(new Font("Tahoma", Font.PLAIN,20));
               red.addActionListener(this);

       p3.add(red);
       
       
       JPanel p4 = new JPanel();
       p4.setBackground(new Color(0, 50, 130));                                             
       p4.setBounds(0,0,1600,250);
       p4.setLayout(null);
       add(p4);
       
        Laterite = new JButton("Irrigation Sprinkler");
       Laterite.setBounds(1200, 100, 300, 60);
       Laterite.setBackground(new Color(0, 0, 150));
       Laterite.setForeground(Color.white);
       Laterite.setFont(new Font("Tahoma", Font.PLAIN,20));
               Laterite.addActionListener(this);

       p4.add(Laterite);
       
       
        redyea = new JButton(" X");
       redyea.setBounds(1480, 0, 50, 40);
       redyea.setBackground(new Color(150, 0, 10));
       redyea.setForeground(Color.white);
       redyea.setFont(new Font("Tahoma", Font.PLAIN,15));
        redyea.addActionListener(this);

       p4.add(redyea);
       
       
       
        JPanel p5 = new JPanel();
       p5.setBackground(new Color(0, 50, 130));                                             
       p5.setBounds(0,500,1600,250);
       p5.setLayout(null);
       add(p5);
        
         Forest = new JButton("Textile Irrigation");
       Forest.setBounds(50, 100, 300, 60);
       Forest.setBackground(new Color(0, 0, 150));
       Forest.setForeground(Color.white);
       Forest.setFont(new Font("Tahoma", Font.PLAIN,20));
               Forest.addActionListener(this);

       p5.add(Forest);
       
       Desert = new JButton("Deficit Irrigation");
       Desert.setBounds(430, 100, 300, 60);
       Desert.setBackground(new Color(0, 0, 150));
       Desert.setForeground(Color.white);
       Desert.setFont(new Font("Tahoma", Font.PLAIN,20));
               Desert.addActionListener(this);

       p5.add(Desert);
       
        Alkaline = new JButton("Manual Irrigation");
       Alkaline.setBounds(830, 100, 300, 60);
       Alkaline.setBackground(new Color(0, 0, 150));
       Alkaline.setForeground(Color.white);
       Alkaline.setFont(new Font("Tahoma", Font.PLAIN,20));
               Alkaline.addActionListener(this);

       p5.add(Alkaline);
       
        Marshy = new JButton("Sub Irrigation");
       Marshy.setBounds(1200, 100, 300, 60);
       Marshy.setBackground(new Color(0, 0, 150));
       Marshy.setForeground(Color.white);
       Marshy.setFont(new Font("Tahoma", Font.PLAIN,20));
               Marshy.addActionListener(this);

       p5.add(Marshy);
       
       
        JPanel p6 = new JPanel();
       p6.setBackground(new Color(0, 50, 150));                                             
       p6.setBounds(0,250,1600,250);
       p6.setLayout(null);
       add(p6);
       
       
        
       
       
       
       
       
       
       
       
       
       setVisible(true);
       

    }
    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == redyea){
                setVisible(false);
            new Dashboard();
            }if (ae.getSource() == viewsoil){
                setVisible(false);
            new Dripirrigation();
            } else if (ae.getSource() == soil){
                setVisible(false);
            new Subirrigation(); }
     else if (ae.getSource() == red){
                setVisible(false);
            new Center(); }
      else if (ae.getSource() == Laterite){
                setVisible(false);
            new Irrigationspiker(); }
            else if (ae.getSource() == Forest){
                setVisible(false);
            new Textile(); }
           
     else if (ae.getSource() == Desert){
                setVisible(false);
            new Deficit(); }
           
            else if (ae.getSource() == Alkaline){
                setVisible(false);
            new Manual(); }
           else if (ae.getSource() == Marshy){
                setVisible(false);
            new Sub(); }
        
    }
     public static void main(String[] args) {
        
        new irrigation();
    }
    
}
 
 
       
       
      
       
        
       
       
       
       
       
       
       
       