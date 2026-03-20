package farmerbuddy;
import javax.swing.*;
import java.awt.*;
import static java.awt.Color.WHITE;
import javax.swing.border.*;
import java.awt.event.*;
import java.sql.*;
import java.awt.event.AWTEventListener;
import java.awt.event.ActionEvent;

public class calciumferilizer extends JFrame implements ActionListener {
    JButton back,back1,translate;
   

    
    
    calciumferilizer() {
       
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
       
     JTextArea lblusername = new JTextArea("Calcium ammonium nitrate (CAN) fertilizer is a popular nitrogenous fertilizer that contains both ammonium nitrate and calcium carbonate.\n" +
" This dual nutrient composition makes it valuable for improving soil fertility and enhancing plant growth.\n" +
" CAN fertilizer is widely used in agriculture and horticulture for various crops due to its unique characteristics.\n" +
"*Key Features and Benefits of Calcium Ammonium Nitrate (CAN) Fertilizer:*\n" +
"1. *Balanced Nutrient Content:* CAN contains a combination of ammonium nitrogen (NH4+) and nitrate nitrogen (NO3-),\n" +
" providing a balanced source of nitrogen for plants. This combination allows for both rapid nitrogen uptake (ammonium)\n" +
" and sustained nitrogen supply (nitrate), benefiting plant growth throughout the growing season.\n" +
"2. *Calcium Enrichment:* The inclusion of calcium carbonate (CaCO3) in CAN not only provides an essential secondary nutrient\n" +
" but also helps in improving soil structure and pH balance. It can reduce soil acidity and enhance nutrient availability.\n" +
"3. *Low Hygroscopicity:* CAN has lower hygroscopicity compared to ammonium nitrate, meaning it is less prone \n" +
"to absorbing moisture from the atmosphere. This property makes it easier to store and handle.\n" +
"4. *Reduced Nitrogen Loss:* The combination of ammonium and nitrate nitrogen in CAN helps reduce nitrogen loss through volatilization and leaching.\n" +
" This contributes to higher nitrogen use efficiency.\n" +
"5. *Versatile Application:* CAN is suitable for a wide range of crops, including cereals, vegetables, fruits, \n" +
"and ornamental plants. It can be applied as a basal or top dressing fertilizer depending on crop requirements and local agricultural practices.\n" +
"*Application Guidelines for Calcium Ammonium Nitrate (CAN) Fertilizer:*\n" +
"1. *Soil Testing:* Conduct soil tests to determine the nutrient requirements of the specific crops you intend to cultivate. \n" +
"Soil testing helps in establishing the appropriate application rates for CAN.\n" +
"2. *Timing:* CAN fertilizer can be applied either as a pre-planting basal application or as a top dressing during the growing season. \n" +
"Timing depends on crop type and local growing conditions. Top dressing is often recommended to supply nitrogen during critical growth stages.\n" +
"3. *Application Rate:* The recommended application rate varies depending on the nitrogen requirements of the crop.\n" +
" It's essential to follow local agricultural extension guidelines or consult with agronomists for specific recommendations.\n" +
"4. *Spreading Techniques:* CAN fertilizer can be spread using various methods, such as broadcasting, banding, \n" +
"or incorporation into the soil, depending on the crop and soil conditions.\n" +
"5. *Storage:* Proper storage is crucial to maintain the quality of CAN fertilizer. Store it in a dry, cool, \n" +
"and well-ventilated area away from direct sunlight. Prevent contamination by keeping it separate from other chemicals or fertilizers.\n" +
"6. *Safety Precautions:* Handle CAN fertilizer with care and follow safety recommendations, including protecting skin, eyes, \n" +
"and respiratory pathways. It is essential to adhere to local safety regulations and guidelines.\n" +
"In conclusion, calcium ammonium nitrate (CAN) fertilizer is a versatile and effective choice for providing both nitrogen and calcium to a wide range of crops.\n" +
" Its balanced nutrient content, reduced nitrogen loss, and soil-improving qualities make it a valuable tool for modern agriculture. Proper application practices,\n" +
" including soil testing, timing, and rate determination, are key to maximizing its benefits while ensuring responsible and safe use.");
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
            new calciumfertilizerstranslate(); }
           }
    
     public static void main(String[] args) {
        new calciumferilizer();
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == back){
                setVisible(false);
            new fertilizers();
            
            }else  if (ae.getSource() == translate){
                setVisible(false);
            new calciumfertilizerstranslate(); }
    }
}

   