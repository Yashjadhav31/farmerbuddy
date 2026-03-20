package farmerbuddy;
import javax.swing.*;
import java.awt.*;
import static java.awt.Color.WHITE;
import javax.swing.border.*;
import java.awt.event.*;
import java.sql.*;
import java.awt.event.AWTEventListener;
import java.awt.event.ActionEvent;

public class Lateritesoil extends JFrame implements ActionListener {
    JButton back,back1,translate;
   

    
    
    Lateritesoil() {
       
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
       
     JTextArea lblusername = new JTextArea("*Laterite Soil: Nurturing Prosperity through Unique Agriculture*\n" +
"Laterite soil, often characterized by its reddish appearance, \n" +
"is a distinct soil type found in many tropical and subtropical regions. \n" +
"Understanding the potential of laterite soil and how to utilize it \n" +
"effectively can be pivotal in generating income through agriculture. In this comprehensive guide,\n" +
" we will explore income-generating opportunities, suitable crops, recommended fertilizers, and irrigation methods for laterite soil.\n" +
"\n" +
"*Income Generation from Laterite Soil:*\n" +
"1. *Crop Cultivation:* Laterite soil, though challenging, offers income opportunities through crop cultivation.\n" +
" While it has limitations, its unique properties can be harnessed for certain crops.\n" +
"2. *Cash Crops:* Some regions with laterite soil are suitable for cash crops like cashew, oilseeds, and groundnuts, \n" +
"which can provide a stable source of income.\n" +
"3. *Horticulture:* Growing fruit trees like mangoes and cashew trees can be a profitable venture in laterite soil regions.\n" +
"4. *Terracing:* In hilly or sloping areas with laterite soil, terracing can be employed to cultivate crops like tea, coffee, \n" +
"and spices, generating income through specialty crops.\n" +
"*Fertilizers Used in Laterite Soil:*\n" +
"\n" +
"To make the most of laterite soil's potential, the judicious use of fertilizers is crucial:\n" +
"\n" +
"1. *Organic Matter:* Incorporating organic matter through compost, green manure, and farmyard manure can enhance soil structure and improve its moisture-holding capacity.\n" +
"\n" +
"2. *Micronutrients:* As laterite soil often has low nutrient content, micronutrients like iron, manganese, and zinc may need to be supplemented to rectify nutrient deficiencies.\n" +
"\n" +
"3. *Slow-Release Fertilizers:* Slow-release fertilizers can help sustain crop nutrient requirements over a more extended period, minimizing the need for frequent applications.\n" +
"\n" +
"*Crops Suited for Laterite Soil:*");
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
            new Lateritesoil1();
            } else  if (ae.getSource() == translate){
                setVisible(false);
            new Lateritesoiltranslate(); }
           }
    
     public static void main(String[] args) {
        new Lateritesoil();
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == back){
                setVisible(false);
            new Addsoildeatails();
            }else if (ae.getSource() == back1){
                setVisible(false);
            new Lateritesoil1();
            }else  if (ae.getSource() == translate){
                setVisible(false);
            new Lateritesoiltranslate(); }
    }
}

        
 
    


