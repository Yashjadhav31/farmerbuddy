
package farmerbuddy;
import javax.swing.*;
import java.awt.*;
import static java.awt.Color.WHITE;
import javax.swing.border.*;
import java.awt.event.*;
import java.sql.*;
import java.awt.event.AWTEventListener;
import java.awt.event.ActionEvent;

public class Alluvialsoil1 extends JFrame implements ActionListener {
    JButton back,back1,translate;
   

    
    
    Alluvialsoil1() {
       
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
       
     JTextArea lblusername = new JTextArea("*Crops Suited for Alluvial Soil:*\n" +
"\n" +
"Alluvial soil is highly versatile and supports the growth of a wide range of crops:\n" +
"\n" +
"1. *Rice:* Alluvial soil is well-known for its suitability for rice cultivation. "
             + "\n It is the primary crop in many regions with alluvial soil.\n" +
"\n" +
"2. *Wheat:* Wheat is another staple crop that thrives in alluvial soil.\n" +
"\n" +
"3. *Cotton:* Alluvial soil's excellent drainage properties make it ideal for cotton cultivation.\n" +
"\n" +
"4. *Sugarcane:* The high organic matter content in alluvial soil provides optimal conditions for sugarcane growth.\n" +
"\n" +
"5. *Maize:* Maize can be grown with success in alluvial soil, offering a source of income for farmers.\n" +
"\n" +
"6. *Fruits and Vegetables:* A variety of fruits and vegetables like citrus, mangoes, and tomatoes can be cultivated,"
             + "\n providing economic opportunities for horticulturists.\n" +
"\n" +
"*Irrigation Methods for Alluvial Soil:*\n" +
"\n" +
"Proper irrigation is crucial for crop success in alluvial soil:\n" +
"\n" +
"1. *Surface Irrigation:* This method involves flooding the fields with water. "
             + "\n It's common in regions with access to abundant water resources.\n" +
"\n" +
"2. *Drip Irrigation:* Drip irrigation is efficient and conserves water."
             + "\n It's suitable for areas with limited water availability and helps in precise water distribution.\n" +
"\n" +
"3. *Sprinkler Irrigation:* This method mimics natural rainfall, evenly distributing water over the crops.\n" +
"\n" +
"4. *Subsurface Drip Irrigation:* It delivers water directly to the root zone of plants, reducing water wastage.\n" +
"\n" +
"In conclusion, alluvial soil offers immense income-generating opportunities through crop cultivation, commercial agriculture, horticulture, and more. "
             + "\n By using appropriate fertilizers and irrigation methods, "
             + "\n farmers and entrepreneurs can unlock the full potential of this fertile soil type and contribute to global food security and economic growth.");
       lblusername.setBounds(0, 0, 1600, 780);
       lblusername.setFont(new Font("Tahoma", Font.BOLD, 15));
       p1.add(lblusername);
       
       
           
    
       setVisible(true);
    }
    public void actionperformed(ActionEvent ae) {
         if (ae.getSource() == back){
                setVisible(false);
            new Alluvialsoil();
            }else if (ae.getSource() == back1){
                setVisible(false);
            new Addsoildeatails();
            } else  if (ae.getSource() == translate){
                setVisible(false);
            new Chernozemsoiltranslate(); }
           }
    
     public static void main(String[] args) {
        new Alluvialsoil1();
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == back){
                setVisible(false);
            new Alluvialsoil();
            }else if (ae.getSource() == back1){
                setVisible(false);
            new Addsoildeatails();
            }else  if (ae.getSource() == translate){
                setVisible(false);
            new Chernozemsoiltranslate(); }
    }
}

        
 
    


