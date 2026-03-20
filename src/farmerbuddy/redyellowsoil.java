package farmerbuddy;
import javax.swing.*;
import java.awt.*;
import static java.awt.Color.WHITE;
import javax.swing.border.*;
import java.awt.event.*;
import java.sql.*;
import java.awt.event.AWTEventListener;
import java.awt.event.ActionEvent;

public class redyellowsoil extends JFrame implements ActionListener {
    JButton back,back1,translate;
   

    
    
    redyellowsoil() {
       
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
       
     JTextArea lblusername = new JTextArea("*Red and Yellow Soil: Harnessing Agricultural Potential for Income Generation*\n" +
"Red and yellow soils are widespread soil types in various regions around the world. \n" +
"These soils have their unique characteristics, and knowing how to utilize them effectively can be a key factor \n" +
"in generating income through agriculture. In this comprehensive guide, we will explore the income-generating opportunities, suitable crops,\n" +
" recommended fertilizers, and irrigation methods for red and yellow soils.\n" +
"*Income Generation from Red and Yellow Soil:*\n" +
"1. *Crop Cultivation:* Red and yellow soils offer a range of income opportunities through crop cultivation. \n" +
"These soils are known for their ability to support diverse crops. Farmers can generate income by growing both food crops and cash crops.\n" +
"2. *Cash Crops:* Many regions with red and yellow soils are well-suited for cash crops like cotton,\n" +
" groundnuts, and oilseeds, which can provide a stable source of income.\n" +
"3. *Sustainable Agriculture:* Implementing sustainable agricultural practices, \n" +
"such as organic farming or agroforestry, can help generate income while preserving soil health and the environment.\n" +
"*Fertilizers Used in Red and Yellow Soil:*\n" +
"To optimize soil fertility and crop productivity in red and yellow soils, appropriate fertilizers are essential:\n" +
"1. *Organic Matter:* Incorporating organic matter through compost and manure helps improve soil structure and enhances nutrient availability.\n" +
"2. *Inorganic Fertilizers:* Red and yellow soils may require the application of inorganic fertilizers containing nitrogen (N), \n" +
"phosphorus (P), and potassium (K) in varying proportions, based on crop and soil nutrient requirements.\n" +
"3. *Micronutrients:* In some cases, micronutrients like iron, zinc, and boron may be added to address specific nutrient deficiencies.\n" +
"*Crops Suited for Red and Yellow Soil:*\n" +
"Red and yellow soils support a range of crops, making them versatile for farming:\n" +
"1. *Millets:* Pearl millet, sorghum, and finger millet are well-suited for these soils and offer income opportunities, especially in semi-arid regions.\n" +
"2. *Pulses:* Crops like chickpeas, pigeon peas, and lentils thrive in red and yellow soils, providing a source of income for farmers.\n" +
"3. *Groundnuts:* Red and yellow soils are ideal for groundnut cultivation, which is an important cash crop.\n" +
"4. *Cotton:* Cotton cultivation is a significant income-generating activity in regions with these soils.\n" +
"5. *Oilseeds:* Soybeans, sunflower, and other oilseeds can be cultivated in red and yellow soils to generate income.\n" +
"*Irrigation Methods for Red and Yellow Soil:*\n" +
"Selecting appropriate irrigation methods is crucial for maximizing crop yields in red and yellow soils:\n" +
"1. *Drip Irrigation:* Drip irrigation is efficient, conserves water, and ensures precise water distribution, \n" +
"making it suitable for regions with limited water resources.\n" +
"2. *Sprinkler Irrigation:* This method evenly distributes water over the crops, mimicking natural rainfall.\n" +
"3. *Furrow Irrigation:* Furrow irrigation is commonly used, where water is directed along channels between crop rows,"
             + "\n ensuring efficient water utilization."
             + "\n" +
"4. *Rainfed Agriculture:* In some regions with adequate rainfall, rainfed agriculture is a sustainable method for income "
             + "\n generation without the need for artificial irrigation.\n" +
"In conclusion, red and yellow soils offer abundant opportunities for income generation through crop cultivation, "
             + "\n especially when matched with suitable fertilizers and irrigation methods."
             + "\n Understanding the specific requirements of these soils and selecting the right crops and "
             + "\n practices can lead to successful and profitable agricultural ventures. By harnessing the potential of red and yellow soils, "
             + "\n farmers and agricultural entrepreneurs can contribute to food security and economic development.");
       lblusername.setBounds(0, 0, 1600, 780);
       lblusername.setFont(new Font("Tahoma", Font.BOLD, 15));
       p1.add(lblusername);
       
       
           
    
       setVisible(true);
    }
    public void actionperformed(ActionEvent ae) {
         if (ae.getSource() == back){
                setVisible(false);
            new Addsoildeatails();
            }
             else  if (ae.getSource() == translate){
                setVisible(false);
            new Alluvialsoiltranslate(); }
           }
    
     public static void main(String[] args) {
        new redyellowsoil();
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == back){
                setVisible(false);
            new Addsoildeatails();
            }
            else  if (ae.getSource() == translate){
                setVisible(false);
            new redyellowsoiltranslate(); }
    }
}

        
 
    


