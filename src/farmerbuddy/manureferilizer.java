package farmerbuddy;
import javax.swing.*;
import java.awt.*;
import static java.awt.Color.WHITE;
import javax.swing.border.*;
import java.awt.event.*;
import java.sql.*;
import java.awt.event.AWTEventListener;
import java.awt.event.ActionEvent;

public class manureferilizer extends JFrame implements ActionListener {
    JButton back,back1,translate;
   

    
    
    manureferilizer() {
       
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
       
     JTextArea lblusername = new JTextArea("Manure fertilizer is a natural and valuable source of nutrients for plants. It has been used for centuries in agriculture to\n" +
" improve soil fertility and enhance crop yields. Manure, which consists of animal waste and bedding materials, \n" +
"contains essential nutrients like nitrogen, phosphorus, and potassium. These nutrients are vital for plant growth and development.\n" +
"One of the key benefits of using manure as fertilizer is its organic nature. Organic fertilizers, like manure, \n" +
"improve soil structure and increase its water-holding capacity. They also promote beneficial microbial activity in the soil, \n" +
"which can help plants access nutrients more efficiently.\n" +
"Manure fertilizer can be categorized into different types based on the animal source:\n" +
"1. *Cow Manure:* Cow manure is widely used in agriculture. It is rich in organic matter and contains a good balance of nutrients. \n" +
"It's particularly beneficial for improving soil texture.\n" +
"2. *Chicken Manure:* Chicken manure is high in nitrogen, making it an excellent choice for leafy green vegetables and crops that need a nitrogen boost.\n" +
"3. *Horse Manure:* Horse manure is lower in nitrogen compared to chicken manure but is still a valuable source of nutrients.\n" +
"4. *Pig Manure:* Pig manure is another nutrient-rich option, especially when properly composted to reduce its strong odor.\n" +
"5. *Sheep and Goat Manure:* These manures are often used in smaller-scale agriculture and gardening.\n" +
"\n" +
"To make the most of manure fertilizer, it's essential to follow proper application practices. Here are some considerations:\n" +
"\n" +
"- *Composting:* Composting manure helps reduce potential pathogens and odor while creating a more stable and nutrient-rich product.\n" +
"\n" +
"- *Application Rate:* Determining the right application rate is crucial to avoid nutrient imbalances and over-fertilization, \n" +
"which can harm plants and the environment.\n" +
"\n" +
"- *Timing:* Applying manure at the appropriate time in the growing season is vital to ensure that plants can utilize the nutrients effectively.\n" +
"\n" +
"- *Safety:* Properly handling and storing manure is essential to prevent contamination and health risks.\n" +
"It's also important to be aware of the potential downsides of using manure as fertilizer. \n" +
"These include the risk of nutrient runoff, weed seeds in the manure, and the presence of pathogens. \n" +
"To mitigate these risks, many farmers choose to compost or age manure before application.\n" +
"In conclusion, manure fertilizer is a valuable and sustainable option for enriching soil and enhancing crop productivity.\n" +
" When used correctly, it can be an essential component of organic and sustainable farming practices, \n" +
"promoting healthy and nutrient-rich soils for the benefit of both the environment and agriculture.");
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
            new manurefertilizerstranslate(); }
           }
    
     public static void main(String[] args) {
        new manureferilizer();
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == back){
                setVisible(false);
            new fertilizers();
            
            }else  if (ae.getSource() == translate){
                setVisible(false);
            new manurefertilizerstranslate(); }
    }
}

        
 
    


