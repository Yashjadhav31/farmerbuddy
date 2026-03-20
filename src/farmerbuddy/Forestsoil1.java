package farmerbuddy;
import javax.swing.*;
import java.awt.*;
import static java.awt.Color.WHITE;
import javax.swing.border.*;
import java.awt.event.*;
import java.sql.*;
import java.awt.event.AWTEventListener;
import java.awt.event.ActionEvent;

public class Forestsoil1 extends JFrame implements ActionListener {
    JButton back,back1,translate;
   

    
    
    Forestsoil1() {
       
         setBounds(0, 0, 1600, 1000);
        getContentPane().setBackground(Color.white);
        setLayout(null);
        
         JPanel p1 = new JPanel();
       p1.setBackground(new Color(0, 50, 130));
       p1.setBounds(0,0,1600,1000);
       p1.setLayout(null);
       add(p1);
       
      
       
       back = new JButton("<");
       back.setBounds(350, 750, 130, 30);
       back.setBackground(new Color(133, 193, 233));
       back.setForeground(Color.white);
       back.setBorder(new LineBorder(new Color(133, 193, 233)));
        back.addActionListener(this);
       
       p1.add(back);
       
        
       back1 = new JButton(">");
       back1.setBounds(1100, 750, 130, 30);
       back1.setBackground(new Color(133, 193, 233));
       back1.setForeground(Color.white);
       back1.setBorder(new LineBorder(new Color(133, 193, 233)));
        back1.addActionListener(this);
       
       p1.add(back1);
       
        translate = new JButton("Translate");
       translate.setBounds(750, 750, 130, 30);
       translate.setBackground(new Color(133, 193, 233));
       translate.setForeground(Color.white);
       translate.setBorder(new LineBorder(new Color(133, 193, 233)));
        translate.addActionListener(this);
       
       p1.add(translate);
       
     JTextArea lblusername = new JTextArea("Unlike agricultural practices, forest soil does not require external fertilization or irrigation. \n" +
"The natural decomposition of organic matter continually enriches the soil with nutrients. \n" +
"The forest ecosystem is adapted to rely on the self-sustaining nutrient cycling processes.\n" +
" Irrigation is also unnecessary since forests rely on precipitation to meet their water needs.\n" +
"*Challenges and Conservation:*\n" +
"\n" +
"Despite its importance, forest soil faces various threats, including deforestation, \n" +
"urban development, and soil erosion. Clear-cutting or improper logging can disrupt the forest ecosystem, leading to soil degradation. \n" +
"Conservation efforts, including sustainable forest management practices and protected areas, \n" +
"are essential for preserving forest soil's integrity and the health of entire forest ecosystems.\n" +
"\n" +
"In conclusion, forest soil is a dynamic and essential component of forest ecosystems.\n" +
" Its unique composition and functions support the incredible biodiversity and ecological services that forests provide. \n" +
"While income can be generated from non-timber forest products,\n" +
" the primary value of forest soil lies in its role in maintaining healthy forests and mitigating climate change. \n" +
"Proper conservation and sustainable management are vital to protect this precious resource and the ecosystems it sustains.");
       lblusername.setBounds(0, 0, 1600, 780);
       lblusername.setFont(new Font("Tahoma", Font.BOLD, 15));
       p1.add(lblusername);
       
       
           
    
       setVisible(true);
    }
    public void actionperformed(ActionEvent ae) {
         if (ae.getSource() == back){
                setVisible(false);
            new Addsoildeatails();
            }else if (ae.getSource() == back1){
                setVisible(false);
            new Forestsoil1();
            } else  if (ae.getSource() == translate){
                setVisible(false);
            new Forestsoiltranslate(); }
           }
    
     public static void main(String[] args) {
        new Forestsoil1();
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == back){
                setVisible(false);
            new Forestsoil();
            }else if (ae.getSource() == back1){
                setVisible(false);
            new Addsoildeatails();
            }else  if (ae.getSource() == translate){
                setVisible(false);
            new Forestsoiltranslate(); }
    }
}

        
 
    



