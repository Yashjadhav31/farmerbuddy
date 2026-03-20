package farmerbuddy;
import javax.swing.*;
import java.awt.*;
import static java.awt.Color.WHITE;
import javax.swing.border.*;
import java.awt.event.*;
import java.sql.*;
import java.awt.event.AWTEventListener;
import java.awt.event.ActionEvent;

public class compostfertilizer extends JFrame implements ActionListener {
    JButton back,back1,translate;
   

    
    
    compostfertilizer() {
       
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
       
     JTextArea lblusername = new JTextArea("Compost is a valuable and natural fertilizer created through the decomposition of organic matter, such as kitchen scraps, yard waste, and plant materials. \n" +
"It plays a crucial role in sustainable gardening and agriculture, offering a range of benefits for soil health and plant growth.\n" +
"Compost is rich in organic matter, which enhances soil structure. It improves soil aeration, making it easier for plant roots to access oxygen and nutrients.\n" +
" Additionally, it increases the soil's water-holding capacity, reducing the risk of drought stress for plants. \n" +
"This improved soil structure results in healthier and more robust plants.\n" +
"One of the key advantages of compost is its ability to enrich the soil with essential nutrients. As organic materials decompose, \n" +
"they release a variety of nutrients, including nitrogen, phosphorus, and potassium. These nutrients are released gradually, \n" +
"providing a sustainable source of nutrition for plants. Compost also contains micronutrients and trace elements necessary for plant growth.\n" +
"\n" +
"Compost serves as a beneficial addition to the soil by increasing its microbial activity. It provides a habitat for beneficial microorganisms,\n" +
" such as bacteria and fungi, which aid in nutrient cycling and break down organic matter further. \n" +
"These microorganisms promote a healthier and more balanced soil ecosystem, reducing the risk of soil-borne diseases.\n" +
"\n" +
"Furthermore, compost enhances the soil's cation exchange capacity (CEC). This means the soil can better retain and exchange essential nutrients, \n" +
"reducing the risk of nutrient leaching. As a result, plants can access the nutrients they need more efficiently.\n" +
"\n" +
"Compost is an eco-friendly option for waste management. It diverts organic waste from landfills, reducing methane emissions and soil pollution. \n" +
"By recycling kitchen scraps and yard waste into compost, you contribute to a more sustainable and environmentally friendly approach to waste disposal.\n" +
"\n" +
"Using compost is versatile, suitable for a wide range of gardening and agricultural applications. It can be incorporated into garden beds, \n" +
"used as a top dressing, or blended with potting soil. Compost can also be mixed with other soil amendments to create customized blends that meet specific plant needs.\n" +
"\n" +
"Compost is particularly valuable for organic gardening, as it replaces the need for synthetic fertilizers, \n" +
"which can have negative environmental impacts. It offers a natural and holistic approach to plant nutrition and soil improvement.\n" +
"\n" +
"To create compost, you can use a compost bin or pile. The process involves layering organic materials like food scraps, leaves,\n" +
" grass clippings, and wood chips. Over time, microorganisms break down these materials into nutrient-rich humus, which is the final product - compost.\n" +
"\n" +
"In conclusion, compost is an invaluable natural fertilizer that enhances soil fertility, promotes plant health,\n" +
" and supports sustainable gardening and agriculture. Its benefits include improved soil structure, enhanced nutrient availability,\n" +
" and a more robust and balanced soil ecosystem. By incorporating compost into your gardening practices, \n" +
"you contribute to a more sustainable and environmentally friendly approach to soil management and plant care.");
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
            new compostfertilizertraslate(); }
           }
    
     public static void main(String[] args) {
        new compostfertilizer();
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == back){
                setVisible(false);
            new fertilizers();
            
            }else  if (ae.getSource() == translate){
                setVisible(false);
            new compostfertilizertraslate(); }
    }
}

   
