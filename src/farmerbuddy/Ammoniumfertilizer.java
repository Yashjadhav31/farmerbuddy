package farmerbuddy;
import javax.swing.*;
import java.awt.*;
import static java.awt.Color.WHITE;
import javax.swing.border.*;
import java.awt.event.*;
import java.sql.*;
import java.awt.event.AWTEventListener;
import java.awt.event.ActionEvent;

public class Ammoniumfertilizer extends JFrame implements ActionListener {
    JButton back,back1,translate;
   

    
    
    Ammoniumfertilizer() {
       
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
       
     JTextArea lblusername = new JTextArea("Ammonium-based fertilizers are a group of nitrogen-rich fertilizers that provide a readily available source of nitrogen to plants. \n" +
"These fertilizers are essential for promoting vigorous plant growth and are widely used in agriculture and gardening. One of the key ammonium-based fertilizers is ammonium nitrate.\n" +
"\n" +
"Ammonium nitrate (NH4NO3) is a chemical compound that contains both ammonium and nitrate ions, making it a versatile source of nitrogen for plants. \n" +
"It is often used in granulated form and provides an immediate supply of nitrogen upon application. Here's a closer look at ammonium nitrate as a fertilizer:\n" +
"\n" +
"1. *High Nitrogen Content*: Ammonium nitrate typically contains a high percentage of nitrogen, usually around 34-35% by weight. \n" +
"This high nitrogen content makes it an excellent choice for crops that require a significant nitrogen boost during their growth stages.\n" +
"\n" +
"2. *Quick Nutrient Availability*: One of the primary advantages of ammonium nitrate is its rapid nutrient release. When applied to the soil, \n" +
"it quickly dissolves, and the nitrogen ions become available to plant roots. This immediate nutrient availability is beneficial for crops that \n" +
"need a rapid nitrogen supply for optimal growth.\n" +
"\n" +
"3. *Versatile Application*: Ammonium nitrate can be applied in various ways, such as broadcasting, side-dressing, or incorporation into the soil.\n" +
" It is also compatible with most application equipment, making it suitable for both large-scale agriculture and smaller garden applications.\n" +
"\n" +
"4. *Enhanced Plant Growth*: The nitrogen provided by ammonium nitrate is essential for various aspects of plant growth, including the formation of amino acids,\n" +
" proteins, and chlorophyll. It promotes lush, green foliage, robust stem and leaf development, and overall plant vigor.\n" +
"\n" +
"5. *Nitrate and Ammonium Forms*: Ammonium nitrate contains both nitrate (NO3-) and ammonium (NH4+) forms of nitrogen. \n" +
"This dual nitrogen source provides flexibility for crops as they can take up the form of nitrogen that best suits their growth stage and environmental conditions.\n" +
"\n" +
"6. *Safety Considerations*: It's essential to handle ammonium nitrate with care, as it can be potentially hazardous if not stored or handled properly. \n" +
"Due to safety concerns related to its use in explosive devices, its sale and use are regulated in many countries. Safety guidelines and regulations must be followed to prevent accidents.\n" +
"\n" +
"7. *Environmental Impact*: The nitrate component in ammonium nitrate can be susceptible to leaching if not managed properly.\n" +
" This can result in groundwater contamination and environmental concerns. Therefore, precise application and nutrient management practices are crucial when using ammonium nitrate.\n" +
"\n" +
"In summary, ammonium nitrate is a nitrogen-rich fertilizer commonly used in agriculture. Its high nitrogen content and \n" +
"quick nutrient availability make it a valuable resource for promoting plant growth and increasing crop yields. However,\n" +
" users must exercise caution and follow safety guidelines to handle it properly, given its potential hazards. Additionally,\n" +
" environmental considerations are vital to ensure that its use does not result in negative impacts on the environment, such as nitrate leaching.");
       lblusername.setBounds(0, 0, 1600, 780);
       lblusername.setFont(new Font("Tahoma", Font.BOLD, 15));
       p1.add(lblusername);
       
       
           
    
       setVisible(true);
    }
    public void actionperformed(ActionEvent ae) {
         if (ae.getSource() == back){
                setVisible(false);
            new fertilizers();
            
            } else  if (ae.getSource() == translate){
                setVisible(false);
            new Ammoniumfertilizertranslate(); }
           }
    
     public static void main(String[] args) {
        new Ammoniumfertilizer();
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == back){
                setVisible(false);
            new fertilizers();
            
            }else  if (ae.getSource() == translate){
                setVisible(false);
            new Ammoniumfertilizertranslate(); }
    }
}

   
