package farmerbuddy;
import javax.swing.*;
import java.awt.*;
import static java.awt.Color.WHITE;
import javax.swing.border.*;
import java.awt.event.*;
import java.sql.*;
import java.awt.event.AWTEventListener;
import java.awt.event.ActionEvent;

public class potassiumferilizer extends JFrame implements ActionListener {
    JButton back,back1,translate;
   

    
    
    potassiumferilizer() {
       
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
       
     JTextArea lblusername = new JTextArea("Potassium fertilizer, often referred to as potash, plays a vital role in supporting plant growth and overall crop health. \n" +
"Potassium (K) is one of the three primary macronutrients essential for plants, alongside nitrogen (N) and phosphorus (P). \n" +
"It's responsible for numerous critical functions within plants, making it a key element in agricultural practices.\n" +
"*Functions of Potassium in Plants:*\n" +
"1. *Osmoregulation:* Potassium helps regulate the water content within plant cells. \n" +
"It's responsible for maintaining turgor pressure, which keeps cells firm and upright, supporting the structure of the plant.\n" +
"2. *Nutrient Uptake:* Potassium aids in the uptake of other essential nutrients, making it important for overall nutrient efficiency in plants.\n" +
"3. *Photosynthesis:* Potassium is involved in the opening and closing of stomata, \n" +
"the small pores on plant leaves. This process affects gas exchange and, in turn, influences photosynthesis.\n" +
"4. *Enzyme Activation:* Many enzymes within plants require potassium for activation.\n" +
" Enzymes are essential for various biochemical reactions, including those involved in plant growth and stress responses.\n" +
"5. *Disease Resistance:* Adequate potassium levels can enhance a plant's resistance to diseases and stresses such as drought and cold.\n" +
"Potassium fertilizers are available in various forms, including potassium chloride (muriate of potash), potassium sulfate, \n" +
"and potassium nitrate. Each form has its specific advantages and is suited to different agricultural practices.\n" +
"*Key Types of Potassium Fertilizers:*\n" +
"1. *Potassium Chloride (KCl):* This is the most commonly used potassium fertilizer. It contains a high percentage of potassium and \n" +
"is relatively cost-effective. However, it may not be suitable for crops sensitive to chloride ions, such as tobacco and some fruits.\n" +
"2. *Potassium Sulfate (K2SO4):* This fertilizer provides potassium without introducing chloride ions. \n" +
"It's a preferred option for chloride-sensitive crops and in areas where soil salinity is a concern.\n" +
"3. *Potassium Nitrate (KNO3):* This fertilizer combines potassium and nitrogen. \n" +
"It's particularly suitable for crops that need both nutrients simultaneously. \n" +
"Potassium nitrate is also used in fertigation systems for precise nutrient application.\n" +
"*Application of Potassium Fertilizer:*\n" +
"Proper application of potassium fertilizer is crucial to ensure that plants receive the necessary \n" +
"nutrients without causing imbalances or environmental issues. Key considerations include:\n" +
"- *Soil Testing:* Soil tests can determine the existing potassium levels, helping in making informed decisions about fertilizer application rates.\n" +
"- *Timing:* The timing of potassium application varies depending on the crop and the soil's potassium supply. \n" +
"Some crops benefit from split applications to ensure a steady supply of potassium throughout the growing season.\n" +
"- *Placement:* Applying potassium near the root zone of the plants ensures efficient uptake. This can be done through broadcasting, \n" +
"banding, or side-dressing.\n" +
"- *Compatibility:* Potassium fertilizers should be compatible with other fertilizers or chemicals used in the same application.\n" +
"In summary, potassium fertilizer is a critical component of modern agriculture, supporting plant growth,\n" +
" crop quality, and overall agricultural productivity. Proper management and application of potassium fertilizers\n" +
" help ensure that crops receive the essential nutrients they need to thrive while minimizing potential negative environmental impacts.");
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
            new potassiumferilizertranslate(); }
           }
    
     public static void main(String[] args) {
        new potassiumferilizer();
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == back){
                setVisible(false);
            new fertilizers();
            
            }else  if (ae.getSource() == translate){
                setVisible(false);
            new potassiumferilizertranslate(); }
    }
}

        
 
    



