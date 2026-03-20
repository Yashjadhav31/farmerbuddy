package farmerbuddy;
import javax.swing.*;
import java.awt.*;
import static java.awt.Color.WHITE;
import javax.swing.border.*;
import java.awt.event.*;
import java.sql.*;
import java.awt.event.AWTEventListener;
import java.awt.event.ActionEvent;

public class Sub extends JFrame implements ActionListener {
    JButton back,back1,translate;
   

    
    
    Sub() {
       
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
       
       // translate = new JButton("Translate");
       //translate.setBounds(750, 750, 130, 30);
       //translate.setBackground(new Color(133, 193, 233));
       //translate.setForeground(Color.white);
      // translate.setBorder(new LineBorder(new Color(133, 193, 233)));
       // translate.addActionListener(this);
       
      // p1.add(translate);
       
     JTextArea lblusername = new JTextArea("Subirrigation, also known as sub-surface irrigation or seepage irrigation, is an irrigation method in which water is delivered beneath the soil\n" +
" surface to provide moisture directly to the root zone of plants. Unlike surface irrigation, where water is applied over the soil, \n" +
"subirrigation is a more controlled and efficient technique that offers various benefits. Here, we'll explore subirrigation in detail.\n" +
"*Key Features and Benefits:*\n" +
"1. *Water Conservation:* Subirrigation is known for its efficiency in water use. By delivering water directly to the root zone, \n" +
"it minimizes losses due to evaporation and runoff, making it an environmentally responsible choice.\n" +
"2. *Reduced Weed Growth:* Since water is applied beneath the soil surface, it can help reduce weed growth by depriving weed seeds of the moisture they need to germinate.\n" +
" This is particularly beneficial for weed control.\n" +
"3. *Minimized Soil Erosion:* Subirrigation is gentle on the soil and minimizes erosion because there is no surface water flow to dislodge topsoil particles.\n" +
"4. *Salt Leaching:* It's an effective method for leaching excess salts from the root zone, which can be a common issue in some soils.\n" +
" This is important for maintaining soil quality and plant health.\n" +
"5. *Consistent Moisture:* Subirrigation ensures a consistent moisture level in the root zone, which can lead to more stable and healthier plant growth.\n" +
" It's especially useful for moisture-sensitive crops.\n" +
"6. *Controlled Nutrient Delivery:* Subirrigation systems can be designed to also deliver nutrients to the root zone,\n" +
" allowing for precise control of fertilizer application.\n" +
"7. *Energy Efficiency:* Subirrigation typically requires less energy compared to some other irrigation methods. It can be an energy-efficient choice, \n" +
"particularly when using gravity-based systems.\n" +
"*Methods of Subirrigation:*\n" +
"1. *Capillary Matting:* In horticultural applications, capillary matting is often used. Water is supplied to a mat beneath potted plants, \n" +
"and the plants draw up water through capillary action.\n" +
"2. *Subsurface Drip Irrigation (SDI):* SDI systems involve buried pipes or tubes with emitters that deliver water directly to the root zone. \n" +
"This method is often used in agriculture.\n" +
"3. *Tile Drainage:* In some agricultural contexts, subirrigation is achieved by installing underground drainage tiles with controlled outlets.\n" +
" Excess water can be drained during wet periods, and the system can be used for controlled watering during dry periods.\n" +
"*Challenges and Considerations:*\n" +
"\n" +
"1. *Initial Installation Cost:* Setting up subirrigation systems can be costly, primarily due to the installation of buried pipes or drainage systems.\n" +
"\n" +
"2. *Management and Maintenance:* Proper management is essential to prevent waterlogging, which can occur if the system is overused or not adequately controlled.\n" +
"\n" +
"3. *Crop Suitability:* Not all crops are suitable for subirrigation. It's more commonly used for high-value crops like greenhouse vegetables, ornamental plants, and some field crops.\n" +
"\n" +
"In conclusion, subirrigation is a valuable irrigation technique that offers water conservation, precise moisture control, and reduced environmental impact. \n" +
"It is particularly useful in situations where water efficiency and soil management are crucial, such as in horticulture, greenhouse production,\n" +
" and select agricultural applications. While initial setup costs can be a consideration, the long-term benefits of subirrigation make it a sustainable choice for many growers..");
       lblusername.setBounds(0, 0, 1600, 780);
       lblusername.setFont(new Font("Tahoma", Font.BOLD, 15));
       p1.add(lblusername);
       
       
           
    
       setVisible(true);
    }
    public void actionperformed(ActionEvent ae) {
         if (ae.getSource() == back){
                setVisible(false);
            new irrigation();
            }
             
           }
    
     public static void main(String[] args) {
        new Irrigationspiker();
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == back){
                setVisible(false);
            new Sub();
            }
           
    }
}

        
 
    





