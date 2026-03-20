package farmerbuddy;
import java.awt.Color;
import static java.awt.Color.WHITE;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

import javax.swing.JFrame;


public class fertilizers extends JFrame implements ActionListener {
    JButton viewsoil,soil,red,Laterite,Forest,Desert,Alkaline,Marshy,redye;
    fertilizers() {
        
         setBounds(0, 0, 1600, 1000);
        getContentPane().setBackground(Color.white);
        setLayout(null);
        
         JPanel p1 = new JPanel();
       p1.setBackground(new Color(0, 50, 130));
       p1.setBounds(0,0,1600,780);
       p1.setLayout(null);
       add(p1);
       
       ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/fertilizer.jpg"));
       Image i2 = i1.getImage().getScaledInstance(1600, 780, Image.SCALE_DEFAULT);
       ImageIcon i3 = new ImageIcon(i2);
       JLabel icon = new JLabel(i3);
       icon.setBounds(0, 0, 1600, 780);
       p1.add(icon);
       
       
       
       
        viewsoil = new JButton("manure fertilizer");
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
       
      
       
                                         
         soil = new JButton(" potassium ferilizer");
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
       
        red = new JButton("calcium amonium nitrate");
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
       
        Laterite = new JButton("vermicompost fertilizer");
       Laterite.setBounds(1200, 100, 300, 60);
       Laterite.setBackground(new Color(0, 0, 150));
       Laterite.setForeground(Color.white);
       Laterite.setFont(new Font("Tahoma", Font.PLAIN,20));
        Laterite.addActionListener(this);
       p4.add(Laterite);
       
         redye = new JButton(" X");
       redye.setBounds(1480, 0, 50, 40);
       redye.setBackground(new Color(150, 0, 10));
       redye.setForeground(Color.white);
       redye.setFont(new Font("Tahoma", Font.PLAIN,15));
        redye.addActionListener(this);

       p4.add(redye);
       
       
       
        JPanel p5 = new JPanel();
       p5.setBackground(new Color(0, 50, 130));                                             
       p5.setBounds(0,500,1600,250);
       p5.setLayout(null);
       add(p5);
        
         Forest = new JButton("compost fertilizer");
       Forest.setBounds(50, 100, 300, 60);
       Forest.setBackground(new Color(0, 0, 150));
       Forest.setForeground(Color.white);
       Forest.setFont(new Font("Tahoma", Font.PLAIN,20));
        Forest.addActionListener(this);
       p5.add(Forest);
       
       Desert = new JButton("Diammonium phosphate");
       Desert.setBounds(430, 100, 300, 60);
       Desert.setBackground(new Color(0, 0, 150));
       Desert.setForeground(Color.white);
       Desert.setFont(new Font("Tahoma", Font.PLAIN,20));
        Desert.addActionListener(this);
       p5.add(Desert);
       
        Alkaline = new JButton("Ammonium nitrate");
       Alkaline.setBounds(830, 100, 300, 60);
       Alkaline.setBackground(new Color(0, 0, 150));
       Alkaline.setForeground(Color.white);
       Alkaline.setFont(new Font("Tahoma", Font.PLAIN,20));
        Alkaline.addActionListener(this);
       p5.add(Alkaline);
       
        Marshy = new JButton("calcium nitrate");
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


        
    
    
     public static void main(String[] args) {
        
        new fertilizers();
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == redye){
                setVisible(false);
            new Dashboard();
            } if (ae.getSource() == viewsoil){
                setVisible(false);
            new manureferilizer();
        
    } if (ae.getSource() == soil){
                setVisible(false);
            new potassiumferilizer();
    } if (ae.getSource() == red){
                setVisible(false);
            new calciumferilizer();}
    
    if (ae.getSource() == Laterite){
                setVisible(false);
            new vermicompostferilizer();}
    if (ae.getSource() == Forest){
                setVisible(false);
            new compostfertilizer();}
    if (ae.getSource() == Desert){
                setVisible(false);
            new Diammoniumfertilizer();}
    if (ae.getSource() == Alkaline){
                setVisible(false);
            new Ammoniumfertilizer();}
    if (ae.getSource() == Marshy){
                setVisible(false);
            new nitratefertilizer();}

    } 
    
} 

