package farmerbuddy;
import javax.swing.*;
import java.awt.*;
import static java.awt.Color.WHITE;
import javax.swing.border.*;
import java.awt.event.*;
import java.sql.*;
import java.awt.event.AWTEventListener;
import java.awt.event.ActionEvent;

public class Marshysoil extends JFrame implements ActionListener {
    JButton back,back1,translate;
   

    
    
    Marshysoil() {
       
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
       
     JTextArea lblusername = new JTextArea("*Generating Income from Marshy Soil:*\n" +
"Earning income from marshy soil can be achieved through various means, including agriculture, aquaculture, and ecological services.\n" +
" Below, we delve into these approaches:\n" +
"*1. Agriculture:* \n" +
"Marshy soil can be used for rice cultivation, as it provides an ideal environment for this water-loving crop. Additionally, \n" +
"cranberry and taro cultivation are viable options. These crops thrive in marshy conditions and can be sold to generate income.\n" +
"*2. Aquaculture:*\n" +
"Marshy areas are often conducive for fish farming. By constructing fish ponds or raising other aquatic organisms such as shrimp, \n" +
"income can be generated from the sale of these products.\n" +
"*3. Ecological Services:*\n" +
"In some regions, marshy areas may be preserved for their ecological value. Income can be generated through eco-tourism, \n" +
"guided wildlife tours, or by selling services such as water purification, carbon sequestration, and flood control that marshes naturally provide.\n" +
"*Fertilizers for Marshy Soil:*\n" +
"Marshy soil, like any other soil, requires proper nutrition for optimal crop growth. Commonly used fertilizers for marshy soil include organic matter, \n" +
"nitrogen, phosphorus, and potassium. Organic matter improves soil structure and moisture retention, while the NPK nutrients are essential for plant growth.\n" +
" Regular soil testing is advisable to determine specific nutrient requirements.\n" +
"*Suitable Crops for Marshy Soil:*\n" +
"Choosing the right crops for marshy soil is crucial. Here are some options:\n" +
"*1. Rice:*\n" +
"Rice is a staple crop for marshy soil due to its ability to thrive in flooded conditions. \n" +
"Varieties like 'deepwater rice' are specifically adapted to such environments.\n" +
"*2. Cranberries:*\n" +
"Cranberries are another profitable option. These berries grow in waterlogged conditions and are in high demand, particularly in the food industry.\n" +
"*3. Taro:*\n" +
"Taro, a root crop, grows well in marshy soils. It is a valuable source of income, especially in regions where it is popular.\n" +
"*Irrigation Methods for Marshy Soil:*\n" +
"Effective irrigation is crucial for marshy soil, as it already has high moisture levels. Proper management can enhance crop yields and prevent waterlogging. \n" +
"Consider the following irrigation methods:\n" +
"*1. Controlled Flooding:*\n" +
"For rice cultivation, controlled flooding is practiced. Fields are deliberately submerged and drained at specific growth stages, ensuring water is managed efficiently.\n" +
"*2. Raised Beds:*\n" +
"In some cases, raised beds are created to improve drainage and prevent waterlogging. This method can be effective for crops like taro.\n" +
"*3. Drip Irrigation:*\n" +
"Drip irrigation systems can be employed for crops like cranberries. These systems provide water directly to the plant roots while minimizing excess moisture in the soil.\n" +
"*4. Water Management Infrastructure:*\n" +
"In aquaculture, constructing ponds with proper water management infrastructure is essential. " +
"This ensures a consistent supply of water to the fish or shrimp while preventing flooding.\n" +
"In conclusion, generating income from marshy soil is possible through various   agricultural," +
" aquacultural, and ecological approaches. \n Choosing the right crops, using appropriate fertilizers, " +
"and implementing efficient irrigation methods are keys to success. Proper land management and environmental \n" +
"stewardship can turn marshy soil into a valuable resource for income generation while preserving its ecological significance.");
       lblusername.setBounds(0, 0, 1600, 780);
       lblusername.setFont(new Font("Tahoma", Font.BOLD, 15));
       p1.add(lblusername);
       
       
           
    
       setVisible(true);
    }
    public void actionperformed(ActionEvent ae) {
         if (ae.getSource() == back){
                setVisible(false);
            new Addsoildeatails();
            
            } else  if (ae.getSource() == translate){
                setVisible(false);
            new Alluvialsoiltranslate(); }
           }
    
     public static void main(String[] args) {
        new Marshysoil();
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == back){
                setVisible(false);
            new Addsoildeatails();
            
            }else  if (ae.getSource() == translate){
                setVisible(false);
            new Marshysoiltranslate(); }
    }
}

        
 
    


