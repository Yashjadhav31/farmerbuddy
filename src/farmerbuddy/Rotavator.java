
package farmerbuddy;


import javax.swing.*;
import java.awt.*;
import static java.awt.Color.BLUE;
import static java.awt.Color.RED;
import static java.awt.Color.cyan;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;



public class Rotavator extends JFrame implements ActionListener {
    
    JButton govtscheme;
    
    Rotavator() {
        setBounds(450, 200, 900, 600);
        getContentPane().setBackground(Color.black);
        
        JTabbedPane tab = new JTabbedPane();
        
         JPanel p1 = new JPanel();
         
        p1.setBackground(Color.white);
         p1.setLayout(null);
        
        JTextArea heading = new JTextArea("NINE TINE RIGID Rotavator (CK9TRC)");
       heading.setBounds(50, 05, 800, 20);
       heading.setForeground(BLUE);
       heading.setFont(new Font("Tahoma", Font.BOLD, 20));
      
       p1.add(heading);
       
        JTextArea heading2 = new JTextArea("CROPKING PROFILE RIGID TILLER\n" +
"RIFID Rotavator ");
       heading2.setBounds(30, 60, 300, 50);
       heading2.setFont(new Font("Tahoma", Font.BOLD, 20));
heading2.setForeground(RED);     
p1.add(heading2); 
       
       JTextArea heading3 = new JTextArea("Made in India ");
       heading3.setBounds(30, 110, 800, 30);
       heading3.setFont(new Font("Tahoma", Font.BOLD, 15));
heading3.setForeground(BLUE);      
p1.add(heading3);
       
       JTextArea heading4 = new JTextArea("is is generally use for farming purpose");
       heading4.setBounds(30, 150, 800, 30);
       heading4.setFont(new Font("Tahoma", Font.BOLD, 15));
heading.setForeground(RED);
p1.add(heading4);

JTextArea heading5 = new JTextArea("The company’s manufacturing base in Jalandhar has put it as a bright spot \n on the World map of machine tool manufacturers. ");
       heading5.setBounds(30, 200, 600, 50);
       heading5.setFont(new Font("Tahoma", Font.BOLD, 15));
heading5.setForeground(BLUE);
p1.add(heading5);

ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/19.png"));
       Image i2 = i1.getImage().getScaledInstance(400, 200, Image.SCALE_DEFAULT);
       ImageIcon i3 = new ImageIcon(i2);
       JLabel icon = new JLabel(i3);
       icon.setBounds(500, 320, 400, 200);
       p1.add(icon);
       
       JTextArea heading6 = new JTextArea("Book now");
       heading6.setBounds(80, 300, 300, 30);
       heading6.setForeground(RED);
       heading6.setFont(new Font("Tahoma", Font.BOLD, 30));
      
       p1.add(heading6);
       
       JTextArea heading7 = new JTextArea("Rs 45000/-");
       heading7.setBounds(200, 360, 300, 30);
       heading7.setForeground(cyan);
       heading7.setFont(new Font("Tahoma", Font.BOLD, 30));
      
       p1.add(heading7);
       
       
       
      
       
       tab.addTab("Cultivator", null,p1);
       add(tab);
       
        govtscheme = new JButton("BOOK NOW");
       govtscheme.setBounds(80, 430, 300, 30);
       govtscheme.setBackground(new Color(0, 0, 102));
       govtscheme.setForeground(Color.white);
       govtscheme.setFont(new Font("Tahoma", Font.PLAIN,20));
       govtscheme.addActionListener(this);
       p1.add(govtscheme);
       
       setVisible(true);
    }
      public void actionPerformed(ActionEvent ae) {
           if (ae.getSource() == govtscheme){
                setVisible(false);
            new Booking();}
           }
    public static void main(String[] args) {
        
        new Rotavator();
    }
}
