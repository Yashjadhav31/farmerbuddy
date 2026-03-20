package farmerbuddy;
import javax.swing.*;
import java.awt.*;
import static java.awt.Color.WHITE;
import javax.swing.border.*;
import java.awt.event.*;
import java.sql.*;
import java.awt.event.AWTEventListener;
import java.awt.event.ActionEvent;

public class Forestsoil extends JFrame implements ActionListener {
    JButton back,back1,translate;
   

    
    
    Forestsoil() {
       
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
       
     JTextArea lblusername = new JTextArea("*Forest Soil: The Lifeblood of Ecosystems*\n" +
"Forest soil, also known as woodland soil, is a crucial component of terrestrial ecosystems. \n" +
"It forms the foundation for the rich and diverse communities of plants, animals, and microorganisms that inhabit the world's forests. \n" +
"Understanding the unique properties of forest soil is essential for appreciating its ecological significance and the vital role it \n" +
"plays in supporting both the forest ecosystem and human well-being.\n" +
"*Composition of Forest Soil:*\n" +
"Forest soil differs from typical agricultural soil in several ways. It is rich in organic matter,\n" +
" consisting of decomposed leaves, branches, twigs, and other plant debris. This organic layer, known as the O-horizon, \n" +
"provides a continuous source of nutrients as it decomposes. Below this layer, you'll find the A-horizon, which contains \n" +
"a mix of organic and mineral materials, followed by the B-horizon, which is primarily composed of leached minerals and clay.\n" +
" The C-horizon, deep underground, is often bedrock or unweathered parent material.\n" +
"*Functions and Importance:*\n" +
"1. *Nutrient Cycling:* Forest soil is a hub for nutrient cycling. The decomposition of organic matter releases nutrients like nitrogen,\n" +
" phosphorus, and potassium, making them available for plant uptake. This nutrient recycling supports the growth of trees and understory vegetation.\n" +
"2. *Carbon Storage:* Forest soil is a significant carbon reservoir. The accumulation of organic matter in the O-horizon helps store vast amounts of carbon. \n" +
"This is crucial for mitigating climate change, as it prevents carbon from being released into the atmosphere as carbon dioxide.\n" +
"3. *Water Regulation:* Forest soil plays a vital role in regulating water flow and preventing soil erosion.\n" +
" Its spongy structure absorbs and holds rainwater, reducing the risk of flooding and providing a gradual release of water downstream.\n" +
"4. *Biodiversity Support:* The diverse microbial communities in forest soil, along with mycorrhizal fungi, \n" +
"support the growth of a wide variety of plants, including many rare and endemic species. \n" +
"This rich biodiversity is essential for the overall health and resilience of forest ecosystems.\n" +
"*Non-Timber Forest Products (NTFPs):*\n" +
"While forest soil is primarily conserved to maintain forest ecosystems, certain non-timber forest products (NTFPs) \n" +
"can be harvested sustainably for income without causing long-term harm to the forest. These include:\n" +
"1. *Mushrooms:* Edible and medicinal mushrooms like chanterelles, morels, and reishi are found in forests and can be collected for sale.\n" +
"2. *Edible Plants:* Various forested regions yield edible plants such as berries, nuts, and herbs that can be gathered and sold.\n" +
"3. *Medicinal Herbs:* Certain forest herbs and plants have medicinal properties and can be harvested for herbal medicine.\n" +
"4. *Decorative Plants:* Ornamental plants like ferns, mosses, and rhododendrons can be sustainably harvested for the horticulture and landscaping industries.\n" +
"*Fertilizers and Irrigation:*");
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
            new Forestsoil1();
            } else  if (ae.getSource() == translate){
                setVisible(false);
            new Forestsoiltranslate(); }
           }
    
     public static void main(String[] args) {
        new Forestsoil();
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == back){
                setVisible(false);
            new Addsoildeatails();
            }else if (ae.getSource() == back1){
                setVisible(false);
            new Forestsoil1();
            }else  if (ae.getSource() == translate){
                setVisible(false);
            new Forestsoiltranslate(); }
    }
}

        
 
    



