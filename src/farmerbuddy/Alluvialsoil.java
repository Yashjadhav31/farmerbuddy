package farmerbuddy;
import javax.swing.*;
import java.awt.*;
import static java.awt.Color.WHITE;
import javax.swing.border.*;
import java.awt.event.*;
import java.sql.*;
import java.awt.event.AWTEventListener;
import java.awt.event.ActionEvent;

public class Alluvialsoil extends JFrame implements ActionListener {
    JButton back,back1,translate;
   

    
    
    Alluvialsoil() {
       
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
       
     JTextArea lblusername = new JTextArea("*Alluvial Soil: A Wealth of Agricultural Opportunities*\n" +
"\n" +
"Alluvial soil is a type of soil formed by the deposition of silt, clay, and sand carried by running water."
             + "\n It is one of the most fertile soil types and plays a crucial role in global agriculture,"
             + "\n offering a wide range of income-generating opportunities. This soil type is prevalent in river valleys, "
             + "\n floodplains, and delta regions, and its characteristics make it well-suited for various agricultural practices.\n" +
"\n" +
"*Income Generation from Alluvial Soil:*\n" +
"\n" +
"1. *Crop Cultivation:* The primary source of income from alluvial soil is crop cultivation. "
             + "\n Its rich composition of organic matter, essential minerals, and excellent drainage properties make it ideal for growing a wide variety of crops."
             + "\n Farmers can generate income by cultivating both staple and cash crops.\n" +
"\n" +
"2. *Commercial Agriculture:* Many alluvial soil regions are highly suitable for commercial agriculture. "
             + "\n Entrepreneurs and large-scale farmers can generate substantial income by investing in modern farming techniques and machinery.\n" +
"\n" +
"3. *Horticulture:* Alluvial soil is excellent for horticultural activities. "
             + "\n Fruit orchards and flower cultivation can provide a consistent source of income.\n" +
"\n" +
"*Fertilizers Used in Alluvial Soil:*\n" +
"\n" +
"To maximize crop yields and maintain soil fertility, various fertilizers can be used in alluvial soil:\n" +
"\n" +
"1. *Organic Fertilizers:* Compost, manure, and crop residues are commonly used to improve soil structure and enrich the organic matter content.\n" +
"\n" +
"2. *Inorganic Fertilizers:* Alluvial soil may require the addition of inorganic fertilizers such as nitrogen (N), "
             + "\n phosphorus (P), and potassium (K), depending on the specific nutrient needs of the crops.\n" +
"\n" +
"3. *Micronutrients:* Trace elements like iron, zinc, and copper may also be applied as micronutrient fertilizers to rectify nutrient deficiencies.\n" +
"\n" +
"*Crops Suited for Alluvial Soil:*\n" +
"\n" +
"Alluvial soil is highly versatile and supports the growth of a wide range of crops:");
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
            new Alluvialsoil1();
            } else  if (ae.getSource() == translate){
                setVisible(false);
            new Alluvialsoiltranslate(); }
           }
    
     public static void main(String[] args) {
        new Alluvialsoil();
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == back){
                setVisible(false);
            new Addsoildeatails();
            }else if (ae.getSource() == back1){
                setVisible(false);
            new Alluvialsoil1();
            }else  if (ae.getSource() == translate){
                setVisible(false);
            new Alluvialsoiltranslate(); }
    }
}

        
 
    


