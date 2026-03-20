package farmerbuddy;
import javax.swing.*;
import java.awt.*;
import static java.awt.Color.WHITE;
import javax.swing.border.*;
import java.awt.event.*;
import java.sql.*;
import java.awt.event.AWTEventListener;
import java.awt.event.ActionEvent;

public class Lateritesoil1 extends JFrame implements ActionListener {
    JButton back,back1,translate;
   

    
    
    Lateritesoil1() {
       
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
       
     JTextArea lblusername = new JTextArea("*Crops Suited for Laterite Soil:*\n" +
"\n" +
"Laterite soil may pose challenges, but it can support specific crops:\n" +
"\n" +
"1. *Cashew:* Laterite soil is particularly well-suited for cashew cultivation. Cashew trees thrive in the well-drained and slightly acidic conditions offered by this soil.\n" +
"\n" +
"2. *Oilseeds:* Groundnut, soybean, and sunflower are among the oilseeds that can be cultivated in laterite soil to generate income.\n" +
"\n" +
"3. *Fruit Trees:* Mangoes, cashew, and guava trees can be grown profitably in laterite soil, offering economic opportunities for horticulturists.\n" +
"\n" +
"4. *Tea and Coffee:* In hilly areas with laterite soil, terraced cultivation of tea and coffee can generate income through specialty crops.\n" +
"\n" +
"*Irrigation Methods for Laterite Soil:*\n" +
"\n" +
"Selecting appropriate irrigation methods is vital for maximizing crop yields in laterite soil:\n" +
"\n" +
"1. *Drip Irrigation:* Drip irrigation is efficient, conserves water, and ensures precise water distribution, making it suitable for regions with limited water resources.\n" +
"\n" +
"2. *Sprinkler Irrigation:* Sprinkler systems can be employed for uniform water distribution, particularly in larger-scale farming.\n" +
"\n" +
"3. *Rainfed Agriculture:* In regions with adequate rainfall, rainfed agriculture can be a sustainable method for income generation without the need for artificial irrigation.\n" +
"\n" +
"4. *Terracing:* In hilly areas with laterite soil, terracing can help manage water resources effectively, preventing soil erosion and retaining moisture for crops.\n" +
"\n" +
"In conclusion, laterite soil, with its unique characteristics, can present both challenges and opportunities for income generation through agriculture.  "
             + "\nBy understanding the specific requirements of this soil type and selecting the right crops and practices, \n farmers and agricultural entrepreneurs can successfully harness its potential. While laterite soil may require extra care and attention,"
             + "\n it can contribute to local food security and economic development when managed effectively.");
       lblusername.setBounds(0, 0, 1600, 780);
       lblusername.setFont(new Font("Tahoma", Font.BOLD, 15));
       p1.add(lblusername);
       
       
           
    
       setVisible(true);
    }
    public void actionperformed(ActionEvent ae) {
         if (ae.getSource() == back){
                setVisible(false);
            new Lateritesoil();
            }else if (ae.getSource() == back1){
                setVisible(false);
            new Addsoildeatails();
            } else  if (ae.getSource() == translate){
                setVisible(false);
            new Lateritesoiltranslate(); }
           }
    
     public static void main(String[] args) {
        new Lateritesoil1();
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == back){
                setVisible(false);
            new Lateritesoil();
            }else if (ae.getSource() == back1){
                setVisible(false);
            new Addsoildeatails();
            }else  if (ae.getSource() == translate){
                setVisible(false);
            new Lateritesoiltranslate(); }
    }
}

        
 
    


