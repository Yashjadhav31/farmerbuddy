package farmerbuddy;
import javax.swing.*;
import java.awt.*;
import static java.awt.Color.WHITE;
import javax.swing.border.*;
import java.awt.event.*;
import java.sql.*;
import java.awt.event.AWTEventListener;
import java.awt.event.ActionEvent;

public class Dripirrigation extends JFrame implements ActionListener {
    JButton back,back1,translate;
   

    
    
    Dripirrigation() {
       
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
       
     JTextArea lblusername = new JTextArea("Drip irrigation, also known as trickle or micro-irrigation, involves the slow and precise application of water directly to the plant's root zone. \n" +
"This method minimizes water wastage through evaporation and runoff, making it an environmentally friendly and cost-effective choice.\n" +
"Key components of a drip irrigation system include:\n" +
"\n" +
"1. Emitters: These are small devices that regulate the flow of water from the main supply line to individual plants.\n" +
" Emitters can be adjustable, pressure-compensating, or non-pressure-compensating, depending on the specific needs of the plants.\n" +
"2. Tubing: Drip tubing or hoses transport water from the water source to the emitters. They come in various sizes and materials, such as polyethylene or PVC.\n" +
"3. Filters: Filters are essential to prevent clogging of emitters due to debris and sediments in the water. Screen or disc filters are commonly used in drip systems.\n" +
"\n" +
"4. Pressure Regulators: Maintaining the correct pressure is crucial for consistent water flow. Pressure regulators help ensure that each plant\n" +
" receives the right amount of water.\n" +
"5. Valves and Timers: Automated valves and timers control when and how long the system operates,\n" +
" providing flexibility and efficiency in managing water distribution.\n" +
"Drip irrigation offers numerous advantages:\n" +
"1. Water Efficiency: Drip irrigation can reduce water usage by up to 50% compared to traditional watering methods, \n" +
"as it delivers water directly to the root zone, minimizing waste.\n" +
"2. Improved Plant Health: By delivering water and nutrients directly to the roots, plants experience less stress, resulting in healthier and more productive crops.\n" +
"3. Weed and Disease Control: Drip irrigation reduces moisture on plant leaves and soil surfaces, minimizing weed growth and the spread of diseases.\n" +
"4. Precision: Farmers and gardeners can precisely control the amount of water and nutrients delivered to each plant, optimizing growth and yield.\n" +
"5. Reduced Labor: Automation and timers make drip irrigation systems relatively low-maintenance, saving time and labor costs.\n" +
"\n" +
"6. Soil Erosion Prevention: Drip irrigation reduces soil erosion by preventing excessive surface runoff.\n" +
"\n" +
"However, there are some considerations:\n" +
"\n" +
"1. Initial Investment: Setting up a drip irrigation system can be costly due to the purchase of components and installation.\n" +
"\n" +
"2. Clogging: Emitters and filters may require periodic maintenance to prevent clogging, especially in areas with sediment-rich water.\n" +
"\n" +
"3. Design Complexity: Proper design and layout are essential to ensure uniform water distribution and coverage.\n" +
"\n" +
"In conclusion, drip irrigation is a highly efficient and environmentally responsible method of delivering water to plants.\n" +
" Whether used in large-scale agriculture or residential gardening, it offers numerous benefits in terms of water conservation,\n" +
" plant health, and crop yield. Proper planning and maintenance are critical to harness the full potential of drip irrigation systems and promote sustainable water use.");
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
        new Dripirrigation();
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == back){
                setVisible(false);
            new irrigation();
            }
           
    }
}

        
 
    



