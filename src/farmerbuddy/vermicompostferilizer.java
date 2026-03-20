package farmerbuddy;
import javax.swing.*;
import java.awt.*;
import static java.awt.Color.WHITE;
import javax.swing.border.*;
import java.awt.event.*;
import java.sql.*;
import java.awt.event.AWTEventListener;
import java.awt.event.ActionEvent;

public class vermicompostferilizer extends JFrame implements ActionListener {
    JButton back,back1,translate;
   

    
    
    vermicompostferilizer() {
       
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
       
     JTextArea lblusername = new JTextArea("Vermicompost is a nutrient-rich organic fertilizer created through the process of vermicomposting, which involves using earthworms \n" +
"to decompose organic materials like kitchen scraps, garden waste, and manure. \n" +
"This natural fertilizer has gained popularity for its numerous benefits in gardening and agriculture.\n" +
"\n" +
"Vermicompost is known for its exceptional nutrient content. It's rich in essential plant nutrients such as nitrogen, phosphorus, \n" +
"potassium, and micronutrients. These nutrients are readily available to plants, making vermicompost a powerful soil conditioner. \n" +
"Additionally, it contains beneficial microorganisms that enhance soil health and promote plant growth.\n" +
"\n" +
"One of the key advantages of vermicompost is its ability to improve soil structure. It enhances soil aeration and water retention, which helps plants \n" +
"develop strong root systems and makes them more resilient to drought. Its fine texture also makes it easier to work with and distribute in the garden.\n" +
"\n" +
"The humic acids in vermicompost increase the cation exchange capacity (CEC) of the soil, allowing it to hold onto more nutrients. \n" +
"This reduces the risk of nutrient leaching, ensuring that plants receive a steady supply of the nutrients they need.\n" +
"\n" +
"Vermicompost is an eco-friendly choice, as it helps reduce organic waste going to landfills. It also lowers the need for chemical fertilizers,\n" +
" which can harm the environment and deplete natural resources. It's a sustainable way to recycle kitchen scraps and yard waste.\n" +
"\n" +
"This organic fertilizer is versatile and suitable for various gardening and farming applications. It can be used in potted plants, \n" +
"vegetable gardens, flowerbeds, and even on larger agricultural fields. Vermicompost can be applied as a top dressing, \n" +
"mixed into the soil, or used to create compost tea for foliar feeding.\n" +
"\n" +
"Its slow-release nature ensures that plants receive a steady supply of nutrients over an extended period, \n" +
"reducing the risk of nutrient imbalances. This leads to healthier, more productive plants.\n" +
"\n" +
"The microbial activity in vermicompost also suppresses certain plant diseases and pests, \n" +
"making it an excellent choice for organic farming. It creates a balanced and harmonious ecosystem in the soil.\n" +
"\n" +
"To produce vermicompost at home, you need a vermicomposting bin, a steady supply of organic materials, \n" +
"and a colony of composting worms, such as red wigglers. The worms consume the organic matter, and their castings (worm poop) are what make up the vermicompost.\n" +
"\n" +
"In conclusion, vermicompost is a sustainable, nutrient-rich, and eco-friendly fertilizer that offers a multitude of benefits for gardeners and farmers. \n" +
"Its ability to improve soil structure, enhance nutrient availability, and promote plant health has made it a valuable addition to sustainable agriculture\n" +
" and gardening practices. Consider incorporating vermicompost into your gardening routines for healthier, \n" +
"more vibrant plants and a more sustainable approach to organic waste disposal.");
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
            new vermicompostferilizertranslate(); }
           }
    
     public static void main(String[] args) {
        new vermicompostferilizer();
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == back){
                setVisible(false);
            new fertilizers();
            
            }else  if (ae.getSource() == translate){
                setVisible(false);
            new vermicompostferilizertranslate(); }
    }
}

        
 
    


