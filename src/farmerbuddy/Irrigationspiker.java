package farmerbuddy;
import javax.swing.*;
import java.awt.*;
import static java.awt.Color.WHITE;
import javax.swing.border.*;
import java.awt.event.*;
import java.sql.*;
import java.awt.event.AWTEventListener;
import java.awt.event.ActionEvent;

public class Irrigationspiker extends JFrame implements ActionListener {
    JButton back,back1,translate;
   

    
    
    Irrigationspiker() {
       
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
       
     JTextArea lblusername = new JTextArea("Irrigation sprinklers are an essential component of modern agriculture, landscaping, and gardening. These systems efficiently distribute water \n" +
"over a specified area, promoting healthy plant growth while conserving water resources. There are various types of irrigation sprinklers,\n" +
" each designed for specific purposes and environments. \n" +
"\n" +
"One common type is the stationary or fixed spray sprinkler. These are often used in residential gardens and small lawns. \n" +
"They emit water in a fixed pattern and are suitable for rectangular or square areas.\n" +
"\n" +
"Rotary sprinklers, on the other hand, are ideal for covering larger, irregularly shaped spaces. \n" +
"They have rotating arms that disperse water in a circular pattern, ensuring even coverage.\n" +
"\n" +
"Impact sprinklers are known for their distinctive \"ch-ch\" sound as they oscillate back and forth. \n" +
"They are versatile and can cover a wide area, making them suitable for agricultural fields and large lawns.\n" +
"\n" +
"Drip irrigation is another popular method, particularly in water-conscious regions.\n" +
" Drip systems deliver water directly to the root zone of plants, reducing water wastage and promoting efficient use.\n" +
"\n" +
"When selecting a sprinkler system, factors like water pressure, coverage area, and the specific needs of the plants must be considered.\n" +
" Modern irrigation systems often come with programmable timers, allowing users to set watering schedules, further enhancing water efficiency.\n" +
"\n" +
"The environmental benefits of irrigation sprinklers are noteworthy. They reduce water runoff, minimize soil erosion, \n" +
"and help maintain healthy landscapes and crops. In agriculture, \n" +
"irrigation is vital for crop growth and can significantly impact yields and overall food production.\n" +
"\n" +
"Efficiency in water usage is a primary concern, especially in regions with water scarcity. \n" +
"Smart sprinkler systems with weather-based controllers can adjust watering schedules based on real-time weather conditions,\n" +
" reducing water wastage and saving money in the process.\n" +
"\n" +
"Regular maintenance is essential to ensure the longevity of sprinkler systems. This includes checking for clogs, leaks, \n" +
"and adjusting the direction and range of the nozzles. Winterization is crucial in colder climates to prevent damage from freezing temperatures.\n" +
"\n" +
"In conclusion, irrigation sprinklers play a crucial role in modern agriculture and landscaping, \n" +
"promoting efficient water distribution and plant growth. Choosing the right type of sprinkler and \n" +
"maintaining it properly are key factors in achieving optimal results while conserving water resources. \n" +
"As technology continues to advance, smart irrigation systems will likely become even more prevalent, \n" +
"further enhancing water efficiency and environmental sustainability.");
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
        new Irrigationspiker();
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == back){
                setVisible(false);
            new irrigation();
            }
           
    }
}

        
 
    




