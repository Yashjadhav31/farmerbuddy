package farmerbuddy;
import java.awt.Color;
import static java.awt.Color.WHITE;
import static java.awt.Color.BLACK;

import java.awt.Component;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.*;


public class Addsoildeatails extends JFrame implements ActionListener {
    JButton vsoil,soil,red,Laterite,Forest,Desert,Alkaline,Marshy,redy;
    Addsoildeatails() {
        
         setBounds(0, 0, 1600, 1000);
        getContentPane().setBackground(Color.BLACK);
        setLayout(null);
        
         JPanel p1 = new JPanel();
       p1.setBackground(new Color(0, 50, 130));
       p1.setBounds(0,0,1600,780);
       p1.setLayout(null);
       add(p1);
       
      ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/soils.jpg"));
       Image i2 = i1.getImage().getScaledInstance(1600, 780, Image.SCALE_DEFAULT);
      ImageIcon i3 = new ImageIcon(i2);
      JLabel icon = new JLabel(i3);
       icon.setBounds(0, 0, 1600, 780);
       p1.add(icon);
       
       
        vsoil = new JButton(" Chernozem soil");
       vsoil.setBounds(50, 100, 300, 60);
       vsoil.setBackground(new Color(0, 0, 150));
       vsoil.setForeground(Color.white);
       vsoil.setFont(new Font("Tahoma", Font.PLAIN,20));
       vsoil.addActionListener(this);
       p1.add(vsoil);
       
       
         JPanel p2 = new JPanel();
       p2.setBackground(new Color(0, 50, 130));                                             
       p2.setBounds(0,0,800,250);
       p2.setLayout(null);
       add(p2);
       
      
       
                                         
         soil = new JButton(" Alluvial soil");
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
       
        red = new JButton("Red & Yellow Soil");
       red.setBounds(820, 100, 300, 60);
       red.setBackground(new Color(0, 0, 150));
       red.setForeground(Color.white);
       red.setFont(new Font("Tahoma", Font.PLAIN,20));
       red.addActionListener(this);
       p3.add(red);
       
      
       
        redy = new JButton("X");
       redy.setBounds(1480, 0, 50, 40);
       redy.setBackground(new Color(150, 0, 10));
       redy.setForeground(Color.white);
       redy.setFont(new Font("Tahoma", Font.PLAIN,15));
        redy.addActionListener(this);
        p1.add(redy);
        
        
       JPanel p4 = new JPanel();
       p4.setBackground(new Color(0, 50, 130));                                             
       p4.setBounds(0,0,1600,250);
       p4.setLayout(null);
       add(p4);
       
        Laterite = new JButton("Laterite Soil");
       Laterite.setBounds(1200, 100, 300, 60);
       Laterite.setBackground(new Color(0, 0, 150));
       Laterite.setForeground(Color.white);
       Laterite.setFont(new Font("Tahoma", Font.PLAIN,20));
       Laterite.addActionListener(this);
       p4.add(Laterite);
       
       
        JPanel p5 = new JPanel();
       p5.setBackground(new Color(0, 50, 130));                                             
       p5.setBounds(0,500,1600,250);
       p5.setLayout(null);
       add(p5);
        
         Forest = new JButton("Forest Soil");
       Forest.setBounds(50, 100, 300, 60);
       Forest.setBackground(new Color(0, 0, 150));
       Forest.setForeground(Color.white);
       Forest.setFont(new Font("Tahoma", Font.PLAIN,20));
       Forest.addActionListener(this);
       p5.add(Forest);
       
       Desert = new JButton("Desert Soil");
       Desert.setBounds(430, 100, 300, 60);
       Desert.setBackground(new Color(0, 0, 150));
       Desert.setForeground(Color.white);
       Desert.setFont(new Font("Tahoma", Font.PLAIN,20));
       Desert.addActionListener(this);
       p5.add(Desert);
       
        Alkaline = new JButton("Alkaline Soil");
       Alkaline.setBounds(830, 100, 300, 60);
       Alkaline.setBackground(new Color(0, 0, 150));
       Alkaline.setForeground(Color.white);
       Alkaline.setFont(new Font("Tahoma", Font.PLAIN,20));
       Alkaline.addActionListener(this);
       p5.add(Alkaline);
       
        Marshy = new JButton("Marshy Soil");
       Marshy.setBounds(1200, 100, 300, 60);
       Marshy.setBackground(new Color(0, 0, 150));
       Marshy.setForeground(Color.white);
       Marshy.setFont(new Font("Tahoma", Font.PLAIN,20));
       Marshy.addActionListener(this);
       p5.add(Marshy);
       
       
       
        
       
       
       
       
       
       
       
       
       
       
       
       setVisible(true);
        
    }
    
     public void actionPerformed(ActionEvent ae) {
           if (ae.getSource() == vsoil){
                setVisible(false);
            new Chernozemsoil();
            } else if (ae.getSource() == redy){
                setVisible(false);
            new Dashboard();
      }else if (ae.getSource() == soil){
                setVisible(false);
            new Alluvialsoil(); }
     else if (ae.getSource() == red){
                setVisible(false);
            new redyellowsoil(); }
      else if (ae.getSource() == Laterite){
                setVisible(false);
            new Lateritesoil(); }
            else if (ae.getSource() == Forest){
                setVisible(false);
            new Forestsoil(); }
           
     else if (ae.getSource() == Desert){
                setVisible(false);
            new Desertsoil(); }
           
            else if (ae.getSource() == Alkaline){
                setVisible(false);
            new Alkalinesoil(); }
           else if (ae.getSource() == Marshy){
                setVisible(false);
            new Marshysoil(); }
}
    
    
       public static void main(String[] args) {
        
        new Addsoildeatails();
    }

   
    
}
