package farmerbuddy;
import javax.swing.*;
import java.awt.*;
import static java.awt.Color.WHITE;
import javax.swing.border.*;
import java.awt.event.*;
import java.sql.*;
import java.awt.event.AWTEventListener;
import java.awt.event.ActionEvent;

public class Subirrigation extends JFrame implements ActionListener {
    JButton back,back1,translate;
   

    
    
    Subirrigation() {
       
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
       
     JTextArea lblusername = new JTextArea("Subirrigation, also known as under-irrigation or seepage irrigation, is a technique where water is applied directly below the root zone of plants. \n" +
"This method is commonly used in greenhouse cultivation, container gardening, and in specific agricultural contexts. \n" +
"Subirrigation systems are designed to provide moisture from the bottom up, promoting plant health and efficient water use.\n" +
"Key components of a subirrigation system include:\n" +
"1. Subsurface Drains: These are pipes or tubes buried beneath the growing medium or soil, creating a network to distribute water.\n" +
"2. Water Reservoir: A water source or reservoir, often located below the growing area, is used to store and supply water to the subirrigation system.\n" +
"3. Capillary Mats or Wicks: These are materials that draw water from the reservoir to the root zone by capillary action.\n" +
"\n" +
"4. Sensors and Controls: Automated sensors and controls monitor moisture levels and regulate water delivery, ensuring optimal conditions for plant growth.\n" +
"Advantages of subirrigation:\n" +
"\n" +
"1. Water Efficiency: Subirrigation minimizes water loss through evaporation and runoff since the water is delivered directly to the root zone.\n" +
"\n" +
"2. Enhanced Plant Health: Consistent moisture at the root level reduces stress and enhances the growth and vitality of plants.\n" +
"\n" +
"3. Reduced Disease Spread: Subirrigation can reduce the likelihood of diseases spreading through contact with wet foliage, as is the case with surface irrigation methods.\n" +
"\n" +
"4. Nutrient Management: It allows for the precise delivery of nutrients and fertilizers directly to the root zone, optimizing plant nutrition.\n" +
"\n" +
"5. Space Efficiency: Subirrigation is suitable for various planting methods, including container gardening and vertical farming, making efficient use of limited space.\n" +
"\n" +
"6. Automation: Automated controls can regulate water and nutrient delivery, reducing labor and improving system efficiency.\n" +
"\n" +
"Considerations for subirrigation:\n" +
"\n" +
"1. Initial Investment: Setting up subirrigation systems can be costly due to the installation of drains, sensors, and controls.\n" +
"\n" +
"2. Maintenance: Regular maintenance is required to ensure that drains remain functional and free from clogs.\n" +
"\n" +
"3. Suitable Crops: Subirrigation is best suited for certain crops and situations, such as greenhouse cultivation, container gardening, and specific agricultural applications.\n" +
"\n" +
"4. Salinity Management: Proper management is essential to prevent the accumulation of salts in the root zone, which can occur with subirrigation.\n" +
"\n" +
"In conclusion, subirrigation is a water-efficient and plant-friendly method of delivering moisture to plants. \n" +
"It is particularly beneficial in controlled environments like greenhouses and for container gardening. \n" +
"This approach optimizes water use, reduces disease risks, and supports healthy plant growth. Proper design, \n" +
"installation, and maintenance are crucial to harness the full benefits of subirrigation systems and ensure sustainable and productive plant cultivation.");
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
        new Subirrigation();
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == back){
                setVisible(false);
            new irrigation();
            }
           
    }
}

        
 
    




