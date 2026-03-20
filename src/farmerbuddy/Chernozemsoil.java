package farmerbuddy;
import javax.swing.*;
import java.awt.*;
import static java.awt.Color.WHITE;
import javax.swing.border.*;
import java.awt.event.*;
import java.sql.*;
import java.awt.event.AWTEventListener;
import java.awt.event.ActionEvent;

public class Chernozemsoil extends JFrame implements ActionListener {
    JButton back,back1,translate;
   

    
    
    Chernozemsoil() {
       
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
       
       JTextArea lblusername = new JTextArea("Certainly, I can provide you with information about Chernozem soil.\n" +
"\n" +
"1) *Crops and Vegetation*: Chernozem soil is known for its fertility and is excellent for agricultural purposes."
               + " It is capable of supporting a wide variety of crops,\n "
               + "including wheat, corn, barley, sunflowers, and various other grains and oilseeds.\n"
               + " Additionally, it is suitable for cultivating vegetables like potatoes, beets, and legumes. \n"
               + "The soil's rich nutrient content and good water retention make it ideal for these crops.\n" +"\n" +"2) *Increasing Income from Chernozem Soil*:\n" +"\n" +
"   a) *Crop Rotation*: Implementing a crop rotation system can help maintain soil health and productivity.\n"
               + " Rotate different crops each season to prevent nutrient depletion and reduce the risk of diseases and pests.\n" +
"\n" +
"   b) *Fertilization*: Regularly adding organic matter, such as compost or well-rotted manure, can enhance the soil's fertility.\n"
               + " Additionally, applying commercial fertilizers based on soil nutrient tests can optimize nutrient levels.\n" +
"\n" +
"   c) *Soil Testing*: Conduct periodic soil tests to understand its nutrient content. "
               + "This allows for precise fertilization and helps in avoiding overuse or underuse of fertilizers.\n" +
"\n" +
"   d) *Conservation Practices*: Adopt soil conservation practices like no-till farming and cover cropping. "
               + "These methods help reduce erosion, maintain soil structure, and conserve moisture.\n" +
"\n" +
"   e) *Precision Agriculture*: Utilize modern farming technologies and precision agriculture techniques to optimize planting, irrigation,\n "
               + "and pest management. This can lead to higher yields and reduced input costs.\n" +
"\n" +
"   f) *Diversify Crops*: Consider diversifying the crops you plant to reduce risk and maximize income.\n "
               + "Crop diversity can also help improve soil health.\n" +
"\n" +
"By implementing these strategies, you can enhance the productivity and income potential of Chernozem soil.\n" +
"\n" +
"Chernozem soil is well-suited for a variety of crops due to its high fertility and nutrient content. "
               + "Some of the crops that thrive in Chernozem soil include:\n" +
"\n" +
"1. *Wheat*: Both winter and spring wheat varieties grow well in Chernozem soil. "
               + "It's a major crop in regions with this soil type.\n" +
"\n" +
"2. **Corn (Maize)**: Corn is another staple crop that can produce high yields in Chernozem soil.\n" +
"\n" +
"3. *Barley*: Barley is a cereal grain that grows successfully in this type of soil.\n" +
"\n" +
"4. *Sunflowers*: Chernozem soil is particularly suitable for sunflower cultivation, and sunflower oil is a valuable product from this crop.\n" +
"\n" +
"5. *Soybeans*: Soybean cultivation can be profitable in Chernozem soil, given the right climate and management.\n" +
"\n" +"6. *Canola*: Canola, used for oil production, can also be grown in this fertile soil.\n" +
"\n" +
"7. *Potatoes*: Chernozem soil is excellent for potato farming due to its well-drained, nutrient-rich qualities.");
       lblusername.setBounds(0, 0, 1600, 780);
       lblusername.setFont(new Font("Tahoma", Font.BOLD, 14));
       p1.add(lblusername);
       
       
           
    
       setVisible(true);
    }
    public void actionperformed(ActionEvent ae) {
         if (ae.getSource() == back){
                setVisible(false);
            new Addsoildeatails();
            }else if (ae.getSource() == back1){
                setVisible(false);
            new Chernozemsoil1();
            } else  if (ae.getSource() == translate){
                setVisible(false);
            new Chernozemsoiltranslate(); }
           }
    
     public static void main(String[] args) {
        new Chernozemsoil();
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == back){
                setVisible(false);
            new Addsoildeatails();
            }else if (ae.getSource() == back1){
                setVisible(false);
            new Chernozemsoil1();
            }else  if (ae.getSource() == translate){
                setVisible(false);
            new Chernozemsoiltranslate(); }
    }
}

        
 
    


