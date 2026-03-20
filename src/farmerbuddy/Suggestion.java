package farmerbuddy;
import javax.swing.*;
import java.awt.*;
import javax.swing.border.*;
import java.awt.event.*;
import java.sql.*;
import java.awt.event.AWTEventListener;
import java.awt.event.ActionEvent;
import javax.swing.JCheckBox;
import javax.swing.JPasswordField;

public class Suggestion extends JFrame implements ActionListener {
    JButton Login,signup,Password;
    JTextField tfpassword,tfusername;
      private boolean isPasswordVisible = false;
     JCheckBox showPasswordCheckBox;
    

    
    
    Suggestion() {
       setSize(900, 400);
       setLocation(350, 200);
       setLayout(null);
       getContentPane().setBackground(Color.white);
       
       JPanel p1 = new JPanel();
       p1.setBackground(Color.white);
       p1.setBounds(0,0,400,400);
       p1.setLayout(null);
       add(p1);
       
       ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/sugg.jpg"));
       Image i2 = i1.getImage().getScaledInstance(300, 300, Image.SCALE_DEFAULT);
       ImageIcon i3 = new ImageIcon(i2);
       JLabel image = new JLabel(i3);
       image.setBounds(100, 40, 300, 300);
       p1.add(image);
        
       JPanel p2 = new JPanel();
       p2.setBackground(new Color(101, 200, 233));
       p2.setBounds(400,30,400,400);
       p2.setLayout(null);
       add(p2); 
       
       JLabel lblusername = new JLabel("Suggestion");
       lblusername.setBounds(60, 20, 150, 25);
       lblusername.setFont(new Font("SAN_SERIF", Font.BOLD, 20));
       p2.add(lblusername);
        
       tfusername = new JTextField();
       tfusername.setBounds(60, 60, 300, 60);
       tfusername.setBorder(BorderFactory.createEmptyBorder());
       p2.add(tfusername);
        
      
       signup = new JButton("Back");
       signup.setBounds(60, 250, 130, 30);
       signup.setBackground(new Color(103, 153, 233));
       signup.setForeground(Color.white);
       signup.setBorder(new LineBorder(new Color(133, 193, 233)));
       signup.addActionListener(this);
       p2.add(signup);
       
       Password = new JButton("Post");
       Password.setBounds(220, 250, 150, 30);
       Password.setBackground(new Color(103, 153, 233));
       Password.setForeground(Color.white);
       Password.setBorder(new LineBorder(new Color(133, 193, 233)));
       Password.addActionListener(this);
       p2.add(Password);
       
       
       
         

       
      
      
       setVisible(true);
    }
    public void actionperformed(ActionEvent ae) {
        
      

        if (ae.getSource() == Password) {
            try {
                String username = tfusername.getText();
               
                
                String query = "select * from jadhavy where username = '"+username+"'";
                Conn c = new Conn();
                  ResultSet rs = c.s.executeQuery(query);
                  if (rs.next()) {
                      setVisible(false);
                      new Dashboard();
                      
                  }   else {
                      JOptionPane.showMessageDialog(null, "Thank you");
                      
                      
                  }             
            } catch (Exception e) {
                e.printStackTrace();
            }
        } else if (ae.getSource() == signup) {
            setVisible(false);
            new Dashboard();
            
           }  
      }
 
    public static void main(String[] args) {
        new Suggestion();
    }

    @Override
    public void actionPerformed(ActionEvent ae){
      if (ae.getSource() == Password) {
        String username = tfusername.getText();
        
            JOptionPane.showMessageDialog(null, "Thank you");
       
       try {
           Conn c = new Conn();
            String query = "INSERT into jadhavy values('"+username+"')";
           c.s.executeUpdate(query);
           
            
           
           setVisible(false);
           new Dashboard();
       } catch (Exception e) {
           e.printStackTrace();
       }
                  }
            
         else if (ae.getSource() == signup) {
            setVisible(false);
            new Dashboard();
            
           }  
         
    
     System.out.println("Button clicked");
    }
}

