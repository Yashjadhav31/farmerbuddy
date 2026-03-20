
package farmerbuddy;


import javax.swing.*;
import java.awt.*;
import static java.awt.Color.BLUE;
import static java.awt.Color.RED;
import static java.awt.Color.cyan;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;



public class Powertiller extends JFrame implements ActionListener {
    
    JButton govtscheme;
    
    Powertiller() {
        setBounds(450, 200, 900, 600);
        getContentPane().setBackground(Color.black);
        
        JTabbedPane tab = new JTabbedPane();
        
         JPanel p1 = new JPanel();
         
        p1.setBackground(Color.white);
         p1.setLayout(null);
        
        JTextArea heading = new JTextArea("Vijay 10 HP Powertiller for Agriculture Purpose");
       heading.setBounds(50, 05, 800, 20);
       heading.setForeground(BLUE);
       heading.setFont(new Font("Tahoma", Font.BOLD, 20));
      
       p1.add(heading);
       
        JTextArea heading2 = new JTextArea("Powertiller for Agriculture Purpose ");
       heading2.setBounds(30, 60, 800, 30);
       heading2.setFont(new Font("Tahoma", Font.BOLD, 20));
heading2.setForeground(RED);     
p1.add(heading2); 
       
       JTextArea heading3 = new JTextArea("Brand:\n" +
"Made in India ");
       heading3.setBounds(30, 110, 800, 50);
       heading3.setFont(new Font("Tahoma", Font.BOLD, 15));
heading3.setForeground(BLUE);      
p1.add(heading3);
       
       JTextArea heading4 = new JTextArea("The Powertiller has a multi-speed power take-off (PTO), enhancing its functionality and versatility. ");
       heading4.setBounds(30, 180, 800, 40);
       heading4.setFont(new Font("Tahoma", Font.BOLD, 15));
heading.setForeground(RED);
p1.add(heading4);

JTextArea heading5 = new JTextArea("With 460 mm of ground clearance, it offers stability and the capacity to navigate rocky terrain.  ");
       heading5.setBounds(30, 240, 800, 50);
       heading5.setFont(new Font("Tahoma", Font.BOLD, 15));
heading5.setForeground(BLUE);
p1.add(heading5);

ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/48.png"));
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
       
       JTextArea heading7 = new JTextArea("Rs 300000/-");
       heading7.setBounds(200, 360, 300, 30);
       heading7.setForeground(cyan);
       heading7.setFont(new Font("Tahoma", Font.BOLD, 30));
      
       p1.add(heading7);
       
       
       
      
       
       tab.addTab("Powertiller", null,p1);
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
        
        new Powertiller();
    }
}


