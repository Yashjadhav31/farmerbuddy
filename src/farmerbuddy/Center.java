package farmerbuddy;
import javax.swing.*;
import java.awt.*;
import static java.awt.Color.WHITE;
import javax.swing.border.*;
import java.awt.event.*;
import java.sql.*;
import java.awt.event.AWTEventListener;
import java.awt.event.ActionEvent;

public class Center extends JFrame implements ActionListener {
    JButton back,back1,translate;
   

    
    
    Center() {
       
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
       
     JTextArea lblusername = new JTextArea("Center-pivot irrigation, also known as a center-pivot system, is an automated method of irrigating crops. \n" +
"It consists of a series of towers, wheels, and pipes connected to a central pivot point. The entire system spans a circular or\n" +
" semi-circular area, providing consistent water distribution to crops.\n" +
"\n" +
"Key components of a center-pivot irrigation system include:\n" +
"1. Central Pivot Point: This is the anchor point from which the entire system pivots.\n" +
" It is usually positioned at the center of the field and may be powered by electric motors, hydraulic systems, or engines.\n" +
"2. Towers: A series of towers, evenly spaced along the irrigation line, \n" +
"support the system's main pipeline and provide clearance for the rotating sprinklers.\n" +
"3. Wheels: Each tower is equipped with wheels that move along the field on a set of tracks. These wheels facilitate the system's circular motion.\n" +
"4. Overhead Pipeline: The pipeline extends from the central pivot point to the end tower, \n" +
"supplying water to the sprinkler heads that are mounted on the pipeline.\n" +
"5. Sprinklers: Sprinklers are attached to the overhead pipeline at regular intervals. As the system rotates, \n" +
"these sprinklers evenly distribute water over the crops below.\n" +
"Advantages of center-pivot irrigation:\n" +
"\n" +
"1. Water Efficiency: Center-pivot systems are designed to minimize water wastage through efficient water distribution directly to the root zone, \n" +
"reducing evaporation and runoff.\n" +
"2. Precision: The system can be programmed to deliver a specific amount of water to each section of the field,\n" +
" allowing for precise control and optimization of water use.\n" +
"3. Labor Savings: Center-pivot irrigation is largely automated, reducing the need for manual labor compared to traditional surface irrigation methods.\n" +
"4. Increased Crop Yields: Consistent and controlled water application can lead to improved crop yields and overall plant health.\n" +
"5. Versatility: These systems can be adapted for a variety of crops, including grains, vegetables, and forage crops.\n" +
"6. Land Utilization: Center-pivot systems can be used on irregularly shaped fields, optimizing land use.\n" +
"Considerations for center-pivot irrigation:\n" +
"1. Initial Cost: The installation of a center-pivot system can be expensive, including the cost of equipment, power sources, and infrastructure.\n" +
"\n" +
"2. Energy Consumption: These systems often require significant energy inputs, which can contribute to operating costs.\n" +
"\n" +
"3. Maintenance: Regular maintenance is necessary to ensure the system operates efficiently, including maintaining the motors, wheels, and pipelines.\n" +
"\n" +
"4. Environmental Impact: Proper management is required to prevent over-irrigation and minimize groundwater contamination.\n" +
"\n" +
"Center-pivot irrigation is a highly effective method for irrigating large agricultural fields. \n" +
"It maximizes water use efficiency, reduces labor, and enhances crop production. Properly designed\n" +
" and maintained systems are key to reaping the full benefits of this technology, and they play a vital role in \n" +
"modern agriculture, particularly in regions with water scarcity or large-scale farming operations.");
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
        new Center();
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == back){
                setVisible(false);
            new irrigation();
            }
           
    }
}

        
 
    





