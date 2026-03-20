package farmerbuddy;
import javax.swing.*;
import java.awt.*;
import static java.awt.Color.WHITE;
import javax.swing.border.*;
import java.awt.event.*;
import java.sql.*;
import java.awt.event.AWTEventListener;
import java.awt.event.ActionEvent;

public class Diammoniumfertilizer extends JFrame implements ActionListener {
    JButton back,back1,translate;
   

    
    
    Diammoniumfertilizer() {
       
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
       
     JTextArea lblusername = new JTextArea("Diammonium phosphate, often abbreviated as DAP, is a widely used fertilizer in agriculture. It is a highly efficient source of nitrogen and phosphorus, \n" +
"two essential nutrients for plant growth. This fertilizer consists of two major components: ammonium and phosphate,\n" +
" both of which play crucial roles in promoting plant health and increasing crop yields.\n" +
"\n" +
"Diammonium phosphate contains two vital nutrients: nitrogen and phosphorus. Nitrogen is necessary for leafy green growth and overall plant vigor.\n" +
" Phosphorus is essential for root development, flowering, and fruiting. The combination of these two elements in DAP makes \n" +
"it an ideal choice for a variety of crops, from grains and oilseeds to fruits and vegetables.\n" +
"\n" +
"One of the primary advantages of DAP is its high nutrient content. It typically contains around 18% nitrogen and 46% phosphorus by weight. \n" +
"These nutrients are in a water-soluble form, which means they can be quickly taken up by plants. This fast nutrient availability \n" +
"makes DAP particularly valuable for crops that require an immediate nutrient boost.\n" +
"\n" +
"DAP is a versatile fertilizer suitable for various soil types and crops. It can be applied as a broadcast, side-dress, \n" +
"or deep-placed fertilizer, depending on the specific needs of the crop and the soil conditions. \n" +
"Its versatility and compatibility with various application methods make it a popular choice for both large-scale agriculture and smaller garden plots.\n" +
"\n" +
"DAP's high phosphorus content is especially beneficial for plants during their early growth stages. Phosphorus promotes strong root development,\n" +
" which is crucial for establishing healthy and productive plants. Additionally, it aids in the transfer of energy within the plant,\n" +
" enhancing its overall growth and productivity.\n" +
"\n" +
"DAP can be used as a stand-alone fertilizer or as part of a blended fertilizer mix. Blending DAP with other\n" +
" fertilizers allows growers to customize nutrient ratios to match the specific requirements of their crops. This flexibility is vital for achieving optimal crop results.\n" +
"\n" +
"The pH of DAP is relatively low, making it acidic. This can help reduce soil pH, which is beneficial \n" +
"for crops that prefer slightly acidic conditions. However, it's important to monitor soil pH to prevent over-acidification, which could be detrimental to some plants.\n" +
"\n" +
"It's crucial to handle DAP with care, as it can be harmful if ingested, inhaled, or in direct contact with the skin. \n" +
"Safety precautions and proper storage are necessary to prevent accidents. DAP should be stored in a cool, dry place away from incompatible materials.\n" +
"\n" +
"In conclusion, diammonium phosphate (DAP) is a popular and effective fertilizer in agriculture. Its high nutrient content,\n" +
" especially nitrogen and phosphorus, makes it a valuable choice for promoting plant growth and increasing crop yields. \n" +
"DAP's versatility, compatibility with various application methods, and the ability to customize nutrient ratios through\n" +
" blending make it a versatile and widely used fertilizer in modern farming practices. However, \n" +
"handling and storage of DAP should be done with safety precautions in mind to prevent accidents.");
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
            new Diammoniumfertilizertranslate(); }
           }
    
     public static void main(String[] args) {
        new Diammoniumfertilizer();
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == back){
                setVisible(false);
            new fertilizers();
            
            }else  if (ae.getSource() == translate){
                setVisible(false);
            new Diammoniumfertilizertranslate(); }
    }
}

   
