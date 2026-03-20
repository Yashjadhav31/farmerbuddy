
package farmerbuddy;
import javax.swing.*;
import java.awt.*;
import static java.awt.Color.RED;
import javax.swing.border.*;
import java.awt.event.*;
import java.sql.*;
import java.awt.event.AWTEventListener;
import java.awt.event.ActionEvent;

public class logout extends JFrame implements ActionListener {
    JButton yes,no;
   

    
    
    logout() {
       setSize(900, 400);
       setLocation(350, 200);
       setLayout(null);
       getContentPane().setBackground(Color.white);
       
       JPanel p1 = new JPanel();
       p1.setBackground(Color.white);
       p1.setBounds(0,0,900,400);
       p1.setLayout(null);
       add(p1);
       
       ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/logout.png"));
       Image i2 = i1.getImage().getScaledInstance(250, 300, Image.SCALE_DEFAULT);
       ImageIcon i3 = new ImageIcon(i2);
       JLabel image = new JLabel(i3);
       image.setBounds(100, 40, 250, 300);
       p1.add(image);
        
      
       
       yes = new JButton("YES");
       yes.setBounds(460, 200, 130, 30);
       yes.setBackground(new Color(133, 193, 233));
       yes.setForeground(Color.white);
       yes.setBorder(new LineBorder(new Color(133, 193, 233)));
        yes.addActionListener(this);
       
       p1.add(yes);
       
        no = new JButton("NO");
       no.setBounds(600, 200, 130, 30);
       no.setBackground(new Color(133, 193, 233));
       no.setForeground(Color.white);
       no.setBorder(new LineBorder(new Color(133, 193, 233)));
        no.addActionListener(this);
    
       p1.add(no);
       
     
       
       
         

       
     JLabel heading = new JLabel("Are you sure");
       heading.setBounds(430, 80, 400, 50);
       heading.setFont(new Font("Tahoma", Font.BOLD, 50));
       heading.setForeground(RED);
       p1.add(heading);
      
      
       setVisible(true);
    }
    public void actionperformed(ActionEvent ae) {
         if (ae.getSource() == yes){
                setVisible(false);
            new Login();
            } else if (ae.getSource() == no){
                setVisible(false);
            new Dashboard();
               
           }
        
    }
        
      

        
 
    public static void main(String[] args) {
        new logout();
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == yes){
                setVisible(false);
            new Login();
            } else if (ae.getSource() == no){
                setVisible(false);
            new Dashboard();
               
           }
        
    }

}