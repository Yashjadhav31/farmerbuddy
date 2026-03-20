package farmerbuddy;
import javax.swing.*;
import java.awt.*;
import static java.awt.Color.WHITE;
import javax.swing.border.*;
import java.awt.event.*;
import java.sql.*;
import java.awt.event.AWTEventListener;
import java.awt.event.ActionEvent;

public class Textile extends JFrame implements ActionListener {
    JButton back,back1,translate;
   

    
    
    Textile() {
       
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
       
       // translate = new JButton("Translate");
       //translate.setBounds(750, 750, 130, 30);
       //translate.setBackground(new Color(133, 193, 233));
       //translate.setForeground(Color.white);
      // translate.setBorder(new LineBorder(new Color(133, 193, 233)));
       // translate.addActionListener(this);
       
      // p1.add(translate);
       
     JTextArea lblusername = new JTextArea("Textile irrigation, also known as geotextile irrigation or capillary irrigation, is an innovative and sustainable method of providing water to plants,\n" +
" especially in arid and water-scarce regions. This approach harnesses the capillary action of textiles to efficiently deliver water directly to plant roots. \n" +
"Here's a detailed overview of textile irrigation:\n" +
"*Principle of Textile Irrigation:*\n" +
"Textile irrigation relies on the principle of capillarity. Capillarity is the ability of water to flow in narrow spaces against gravity. \n" +
"Geotextiles, which are engineered fabrics with capillary properties, are used to transport water from a water source to the root zone of plants.\n" +
"*Components of Textile Irrigation:*\n" +
"1. *Geotextile Tubes:* These are typically porous fabric tubes that are buried in the soil with one end connected to a water source.\n" +
" The geotextile material draws water up from the source and releases it into the soil as needed.\n" +
"2. *Water Reservoir:* This can be a water tank, pond, or any water source connected to the geotextile tubes. \n" +
"The reservoir provides a continuous supply of water to the textile irrigation system.\n" +
"3. *Distribution Network:* Pipes or tubing are used to connect the water source to the geotextile tubes, allowing for controlled water distribution.\n" +
"*Advantages of Textile Irrigation:*\n" +
"1. *Water Efficiency:* Textile irrigation is highly efficient, as it delivers water directly to plant roots, reducing water wastage through evaporation and surface runoff.\n" +
"2. *Energy Savings:* Unlike traditional irrigation methods that require energy for water pumps and distribution, \n" +
"textile irrigation relies on gravity and capillarity, making it an energy-efficient solution.\n" +
"3. *Reduced Water Contamination:* Since water is delivered below the soil surface, there is a lower risk of water contamination from fertilizers and chemicals.\n" +
"4. *Suitable for Challenging Environments:* Textile irrigation is particularly useful in arid and sandy soils where traditional irrigation may be less effective.\n" +
"5. *Reduced Labor and Maintenance:* Once installed, textile irrigation systems require minimal maintenance and reduce the need for manual watering.\n" +
"*Applications of Textile Irrigation:*\n" +
"1. *Agriculture:* Textile irrigation is widely used in agriculture to cultivate crops, especially in regions with water scarcity or irregular rainfall.\n" +
"2. *Landscaping:* It's a popular choice for maintaining green spaces in parks, golf courses, and gardens.\n" +
"3. *Revegetation:* Textile irrigation aids in restoring degraded landscapes and promoting vegetation growth in ecological restoration projects.\n" +
"4. *Nurseries:* It's an efficient method for nurturing plants in nurseries and greenhouses.\n" +
"5. *Erosion Control:* Textile irrigation helps control soil erosion by stabilizing the root zone of plants.\n" +
"*Challenges and Considerations:*\n" +
"\n" +
"Proper installation and design are crucial for the success of textile irrigation systems. Factors such as soil type, plant water requirements, \n" +
"and climate must be taken into account. Additionally, the initial cost of installing geotextile irrigation systems may be higher than traditional methods\n" +
", but the long-term benefits in water savings and plant health often outweigh the initial investment.\n" +
"\n" +
"In conclusion, textile irrigation is an eco-friendly and water-efficient technique that has gained popularity in various applications.\n" +
" Its ability to provide targeted and efficient water distribution makes it a promising solution for \n" +
"sustainable agriculture, landscaping, and land restoration in water-scarce regions..");
       lblusername.setBounds(0, 0, 1600, 780);
       lblusername.setFont(new Font("Tahoma", Font.BOLD, 15));
       p1.add(lblusername);
       
       
           
    
       setVisible(true);
    }
    public void actionperformed(ActionEvent ae) {
         if (ae.getSource() == back){
                setVisible(false);
            new irrigation();
            }
             
           }
    
     public static void main(String[] args) {
        new Textile();
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == back){
                setVisible(false);
            new irrigation();
            }
           
    }
}

        
 
    




