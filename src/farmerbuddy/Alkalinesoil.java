package farmerbuddy;
import javax.swing.*;
import java.awt.*;
import static java.awt.Color.WHITE;
import javax.swing.border.*;
import java.awt.event.*;
import java.sql.*;
import java.awt.event.AWTEventListener;
import java.awt.event.ActionEvent;

public class Alkalinesoil extends JFrame implements ActionListener {
    JButton back,back1,translate;
   

    
    
    Alkalinesoil() {
       
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
       
     JTextArea lblusername = new JTextArea("Generating Income from Alkaline Soil:\n" +
"1. Soil Testing: The first step in income generation from alkaline soil is to conduct a soil test.\n" +
" This will determine the exact pH level and other nutrient contents, allowing you to plan effectively.\n" +
"2. Soil Amendment: To lower the soil's pH, you can amend alkaline soil with organic matter like compost, \n" +
"peat moss, or well-rotted manure. These materials help increase the soil's acidity, making it more suitable for a wider range of crops.\n" +
"Fertilizers for Alkaline Soil:\n" +
"1. Nitrogen-Based Fertilizers: Alkaline soils often lack nitrogen, \n" +
"so applying nitrogen-based fertilizers like ammonium sulfate or ammonium nitrate can help improve plant growth.\n" +
"2. Phosphorus and Potassium: Balanced fertilizers containing phosphorus and potassium are crucial for alkaline soils.\n" +
" These nutrients support root development and overall plant health.\n" +
"3. Micronutrients: Alkaline soil may be deficient in micronutrients such as iron and manganese. \n" +
"Chelated micronutrient fertilizers can correct these deficiencies and enhance crop yields.\n" +
"Crops Suited for Alkaline Soil:\n" +
"1. Barley: Barley is a hardy cereal crop that can thrive in alkaline soils. It is often used for livestock feed, brewing, and human consumption.\n" +
"2. Alfalfa: Alfalfa is a perennial forage crop that grows well in alkaline soils. It is rich in nutrients and commonly used for animal fodder.\n" +
"3. Beets: Sugar beets and red beets can be cultivated in alkaline soils. They are a valuable source of sugar and provide numerous culinary uses.\n" +
"4. Cotton: Cotton plants can tolerate alkaline soils and are grown for their fibers used in the textile industry.\n" +
"Irrigation Methods for Alkaline Soil:\n" +
"1. Drip Irrigation: Drip irrigation delivers water directly to the root zone, minimizing soil contact. \n" +
"This method helps prevent the buildup of alkalinity on the soil surface.\n" +
"2. Mulching: Applying organic mulch around plants conserves soil moisture and shields the soil from direct sunlight, \n" +
"reducing the risk of evaporation and alkalinity buildup.\n" +
"3. Rainwater Harvesting: Collecting and using rainwater for irrigation can help maintain soil pH, as rainwater is naturally slightly acidic.\n" +
"4. Proper Drainage: Ensuring good drainage in alkaline soil is essential to prevent waterlogging, which can exacerbate soil alkalinity.\n" +
"In conclusion, generating income from alkaline soil requires careful management. Soil testing, soil amendment, \n" +
"and the use of appropriate fertilizers are crucial steps. Selecting the right crops and employing effective irrigation methods will \n" +
"contribute to successful agricultural practices in alkaline soil. By following these guidelines, farmers and gardeners can make the \n" +
"most of this type of soil and ensure a bountiful harvest.");
       lblusername.setBounds(0, 0, 1600, 780);
       lblusername.setFont(new Font("Tahoma", Font.BOLD, 15));
       p1.add(lblusername);
       
       
           
    
       setVisible(true);
    }
    public void actionperformed(ActionEvent ae) {
         if (ae.getSource() == back){
                setVisible(false);
            new Addsoildeatails();
            }else if (ae.getSource() == back1){
                setVisible(false);
            new Alluvialsoil1();
            } else  if (ae.getSource() == translate){
                setVisible(false);
            new Alluvialsoiltranslate(); }
           }
    
     public static void main(String[] args) {
        new Alkalinesoil();
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == back){
                setVisible(false);
            new Addsoildeatails();
            }else if (ae.getSource() == back1){
                setVisible(false);
            new Alluvialsoil1();
            }else  if (ae.getSource() == translate){
                setVisible(false);
            new Alkalinesoiltranslate(); }
    }
}

        
 
    


