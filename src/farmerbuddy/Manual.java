package farmerbuddy;
import javax.swing.*;
import java.awt.*;
import static java.awt.Color.WHITE;
import javax.swing.border.*;
import java.awt.event.*;
import java.sql.*;
import java.awt.event.AWTEventListener;
import java.awt.event.ActionEvent;

public class Manual extends JFrame implements ActionListener {
    JButton back,back1,translate;
   

    
    
    Manual() {
       
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
       
     JTextArea lblusername = new JTextArea("Manual irrigation, also known as hand watering or traditional irrigation, is a fundamental and labor-intensive method of supplying water to plants,\n" +
" gardens, and agricultural fields. This technique relies on human effort to distribute water directly to the root zones of plants. \n" +
"Despite the advent of automated irrigation systems, manual irrigation remains widely practiced and has its own set of advantages and applications.\n" +
"\n" +
"1. *Precision Control:* Manual irrigation allows for precise control over the amount of water delivered to each plant.\n" +
" This control is particularly beneficial for plants with varying water needs, as it ensures that individual plants receive the appropriate amount of water.\n" +
"\n" +
"2. *Low Cost:* Manual irrigation is cost-effective because it doesn't require the investment in irrigation infrastructure, \n" +
"such as pipes, pumps, or timers. It's an accessible option for small-scale farmers, home gardeners, and individuals with limited budgets.\n" +
"\n" +
"3. *Versatility:* Manual irrigation can be used in a variety of settings, from small home gardens to larger agricultural plots.\n" +
" It's a flexible method that can adapt to different crop types and sizes.\n" +
"\n" +
"4. *Water Conservation:* With manual irrigation, there's minimal water wastage. Water is applied directly to the base of the plants, \n" +
"reducing the risk of runoff and evaporation. This makes it an environmentally friendly option.\n" +
"\n" +
"5. *Awareness:* Manual irrigation allows individuals to closely interact with their plants. Gardeners can observe plant health,\n" +
" detect issues early, and make real-time adjustments to watering based on plant condition.\n" +
"\n" +
"6. *Drought Tolerance:* In regions with erratic or limited water availability, manual irrigation can help conserve water during periods of drought.\n" +
" It allows growers to prioritize water usage for essential plants.\n" +
"\n" +
"7. *Weed Control:* By directing water only to the plant roots and avoiding wetting the surrounding soil, manual irrigation can reduce weed growth and competition for resources.\n" +
"\n" +
"8. *Skill Development:* Manual irrigation requires skill and knowledge of plant water needs. \n" +
"It provides an opportunity for individuals to learn about the specific requirements of different plant species.\n" +
"\n" +
"9. *Challenges:* Despite its advantages, manual irrigation has some challenges. It is time-consuming, especially for larger areas. \n" +
"It also demands physical effort, which can be a limitation for individuals with health issues or in situations where labor is costly.\n" +
"\n" +
"10. *Tools and Techniques:* Various tools are used for manual irrigation, such as watering cans, hoses, buckets, \n" +
"and even simple furrow or basin methods. The choice of tools and techniques depends on the scale and specific requirements of the irrigation task.\n" +
"\n" +
"In summary, manual irrigation is a traditional and cost-effective method of delivering water to plants. It offers precision control,\n" +
" water conservation, and a hands-on approach to plant care. While automated systems have gained popularity, \n" +
"manual irrigation remains a valuable technique, especially for small-scale farming and gardening, and it promotes a deeper connection between the grower and their plants..");
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
        new Manual();
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == back){
                setVisible(false);
            new irrigation();
            }
           
    }
}

        
 
    





