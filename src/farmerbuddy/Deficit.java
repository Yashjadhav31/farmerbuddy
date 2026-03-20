package farmerbuddy;
import javax.swing.*;
import java.awt.*;
import static java.awt.Color.WHITE;
import javax.swing.border.*;
import java.awt.event.*;
import java.sql.*;
import java.awt.event.AWTEventListener;
import java.awt.event.ActionEvent;

public class Deficit extends JFrame implements ActionListener {
    JButton back,back1,translate;
   

    
    
    Deficit() {
       
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
       
     JTextArea lblusername = new JTextArea("Deficit irrigation is a water management strategy that intentionally applies less water to crops than they need for maximum growth,\n" +
" with the aim of optimizing resource utilization and crop yield. This approach is particularly important in regions facing water \n" +
"scarcity and where sustainable water management is essential. Below, we will explore deficit irrigation in detail.\n" +
"\n" +
"1. *Water Scarcity Mitigation:* Deficit irrigation is an effective strategy in regions with limited water resources.\n" +
" By applying only a portion of the crop's full water requirements, it helps reduce water consumption while maintaining agricultural productivity.\n" +
"2. *Yield Optimization:* While deficit irrigation reduces water input, it doesn't necessarily lead to reduced crop yields. \n" +
"By carefully managing the timing and amount of water applied, it's possible to maintain or even optimize crop yields. \n" +
"This strategy is especially useful for drought-resistant crops.\n" +
"3. *Stress-Induced Effects:* Deficit irrigation can be used to induce mild water stress in plants, \n" +
"which can have positive effects on certain crops. Mild stress can lead to increased concentrations of solutes in plant tissues, \n" +
"potentially improving fruit quality and flavor.\n" +
"4. *Crop Selection:* The success of deficit irrigation depends on crop selection. \n" +
"Some crops are more tolerant of water stress, making them ideal candidates. For example, olive trees, grapevines, \n" +
"and certain types of grains are well-suited for deficit irrigation.\n" +
"\n" +
"5. *Precision Irrigation:* Deficit irrigation often involves precision irrigation techniques, such as drip or sprinkler systems,\n" +
" which allow for controlled and efficient water delivery. These methods ensure that water is distributed where it is most needed.\n" +
"\n" +
"6. *Monitoring and Control:* Proper implementation of deficit irrigation requires continuous monitoring of soil moisture,\n" +
" weather conditions, and plant health. This data helps in making informed decisions about when and how much water to apply.\n" +
"\n" +
"7. *Water Resource Conservation:* Deficit irrigation is a sustainable practice that conserves water resources. \n" +
"It reduces the environmental impact associated with excessive water use, such as waterlogging, nutrient leaching, and soil degradation.\n" +
"\n" +
"8. *Challenges:* While deficit irrigation offers many benefits, it also presents challenges. \n" +
"The risk of yield reduction if not managed correctly is a concern. Additionally, it demands precise control and monitoring, \n" +
"which can be labor-intensive and may require investment in irrigation infrastructure.\n" +
"\n" +
"9. *Research and Technology:* Ongoing research and advancements in technology are contributing to the success of deficit irrigation. \n" +
"Models and sensors are used to optimize irrigation schedules, ensuring that water is applied at the right time and in the right amount.\n" +
"\n" +
"In conclusion, deficit irrigation is a valuable water management strategy in regions where water resources are limited. \n" +
"It involves deliberate under-irrigation of crops to optimize water use efficiency and crop yield. When implemented with care and precision, \n" +
"deficit irrigation can help sustain agriculture in water-scarce areas while promoting resource conservation and environmental sustainability.");
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
        new Deficit();
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == back){
                setVisible(false);
            new irrigation();
            }
           
    }
}

        
 
    




