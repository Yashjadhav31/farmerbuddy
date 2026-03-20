package farmerbuddy;
import javax.swing.*;
import java.awt.*;
import static java.awt.Color.WHITE;
import javax.swing.border.*;
import java.awt.event.*;
import java.sql.*;
import java.awt.event.AWTEventListener;
import java.awt.event.ActionEvent;

public class nitratefertilizer extends JFrame implements ActionListener {
    JButton back,back1,translate;
   

    
    
    nitratefertilizer() {
       
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
       
     JTextArea lblusername = new JTextArea("Calcium is an essential nutrient for plants, and calcium fertilizers are used to address calcium deficiency in soils, \n" +
"which can lead to various growth and structural issues in plants. Calcium fertilizers are available in several forms,\n" +
" including calcium carbonate, calcium nitrate, and calcium sulfate, each with specific advantages and applications.\n" +
"\n" +
"1. *Calcium Importance*: Calcium plays a vital role in plant growth and development. It is a structural component of plant cell walls,\n" +
" helping to maintain cell integrity and shape. Calcium also aids in nutrient uptake and transport within the plant.\n" +
"\n" +
"2. *Calcium Carbonate*: Calcium carbonate, often in the form of agricultural lime, is a common calcium fertilizer.\n" +
" It is used to raise soil pH in acidic soils. By doing so, it helps to improve the availability of other essential nutrients and creates a more favorable\n" +
" environment for plant roots. It's especially beneficial for crops like legumes and certain fruits that prefer neutral to slightly alkaline soils.\n" +
"\n" +
"3. *Calcium Nitrate*: Calcium nitrate is a water-soluble calcium source that is often used in hydroponic systems and as a foliar spray. It provides an \n" +
"immediate source of calcium to plants. Additionally, it supplies nitrogen, making it a dual-purpose fertilizer. The fast nutrient availability of calcium \n" +
"nitrate is valuable for crops in need of quick correction for calcium deficiency.\n" +
"\n" +
"4. *Calcium Sulfate*: Calcium sulfate, in the form of gypsum, is another calcium fertilizer. It is used to improve soil structure and reduce soil compaction.\n" +
" Gypsum is particularly effective in clayey soils, as it enhances soil aeration and drainage, which, in turn, benefits plant root development.\n" +
"\n" +
"5. *Preventing Calcium Deficiency*: Calcium deficiency in plants can lead to issues like blossom end rot in tomatoes, tip burn in lettuce, and poor fruit development.\n" +
" Applying calcium fertilizers can help prevent these problems and promote healthy plant growth.\n" +
"\n" +
"6. *Application Methods*: Calcium fertilizers can be applied in various ways, depending on the specific needs of the crop and soil conditions. \n" +
"These methods include broadcasting, side-dressing, incorporation into the soil, and foliar sprays. The choice of application method depends on the \n" +
"crop's growth stage and the severity of the calcium deficiency.\n" +
"\n" +
"7. *Compatibility with Other Fertilizers*: Calcium fertilizers can be used in combination with other fertilizers to meet specific nutrient requirements of plants.\n" +
" For example, they can be blended with other fertilizers like NPK formulations to create custom nutrient mixes.\n" +
"\n" +
"8. *Environmental Considerations*: Proper application of calcium fertilizers is crucial to avoid over-application, which can lead to excessive soil calcium levels. \n" +
"Calcium can interfere with the uptake of other nutrients if applied in excess. Careful nutrient management and soil testing can help prevent these issues.\n" +
"\n" +
"In summary, calcium fertilizers are essential for addressing calcium deficiency in soils and promoting healthy plant growth. Different forms of calcium \n" +
"fertilizers offer various benefits, from improving soil structure to providing immediate calcium supply. The choice of calcium fertilizer and its \n" +
"application method should be based on the specific requirements of the crop and the soil conditions. Proper nutrient management \n" +
"is crucial to avoid over-application and potential nutrient imbalances");
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
            new nitratefertilizertranslate(); }
           }
    
     public static void main(String[] args) {
        new nitratefertilizer();
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == back){
                setVisible(false);
            new fertilizers();
            
            }else  if (ae.getSource() == translate){
                setVisible(false);
            new nitratefertilizertranslate(); }
    }
}

        
 
    


