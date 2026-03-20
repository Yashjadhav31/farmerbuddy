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

public class Login extends JFrame implements ActionListener {
    JButton Login,signup,Password;
    JTextField tfpassword,tfusername;
      private boolean isPasswordVisible = false;
     JCheckBox showPasswordCheckBox;
    

    
    
    Login() {
       setSize(900, 400);
       setLocation(350, 200);
       setLayout(null);
       getContentPane().setBackground(Color.white);
       
       JPanel p1 = new JPanel();
       p1.setBackground(new Color(131, 200, 233));
       p1.setBounds(0,0,400,400);
       p1.setLayout(null);
       add(p1);
       
       ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/yash.jpg"));
       Image i2 = i1.getImage().getScaledInstance(200, 300, Image.SCALE_DEFAULT);
       ImageIcon i3 = new ImageIcon(i2);
       JLabel image = new JLabel(i3);
       image.setBounds(100, 120, 200, 200);
       p1.add(image);
        
       JPanel p2 = new JPanel();
       p2.setBackground(new Color(131, 200, 233));
       p2.setBounds(400,30,400,400);
       p2.setLayout(null);
       add(p2); 
       
       JLabel lblusername = new JLabel("Username");
       lblusername.setBounds(60, 20, 100, 25);
       lblusername.setFont(new Font("SAN_SERIF", Font.BOLD, 20));
       p2.add(lblusername);
        
       tfusername = new JTextField();
       tfusername.setBounds(60, 60, 300, 30);
       tfusername.setBorder(BorderFactory.createEmptyBorder());
       p2.add(tfusername);
        
       JLabel lblpassword = new JLabel("Password");
       lblpassword.setBounds(60, 120, 100, 25);
       lblpassword.setFont(new Font("SAN_SERIF", Font.BOLD, 20));
       p2.add(lblpassword);
        
       //tfpassword = new JTextField();
       //tfpassword.setBounds(60, 150, 300, 30);
       //tfpassword.setBorder(BorderFactory.createEmptyBorder());
       //p2.add(tfpassword);
       
         tfpassword = new JPasswordField();
        tfpassword.setBounds(60, 150, 300, 30);
        tfpassword.setBorder(BorderFactory.createEmptyBorder());
        p2.add(tfpassword);

       Login = new JButton("Login");
       Login.setBounds(60, 200, 130, 30);
       Login.setBackground(new Color(133, 193, 233));
       Login.setForeground(Color.white);
       Login.setBorder(new LineBorder(new Color(133, 193, 233)));
       Login.addActionListener(this);
       p2.add(Login);
       
       signup = new JButton("Signup");
       signup.setBounds(230, 200, 130, 30);
       signup.setBackground(new Color(133, 193, 233));
       signup.setForeground(Color.white);
       signup.setBorder(new LineBorder(new Color(133, 193, 233)));
       signup.addActionListener(this);
       p2.add(signup);
       
       Password = new JButton("Forgot Password");
       Password.setBounds(150, 250, 150, 30);
       Password.setBackground(new Color(133, 193, 233));
       Password.setForeground(Color.white);
       Password.setBorder(new LineBorder(new Color(133, 193, 233)));
       Password.addActionListener(this);
       p2.add(Password);
       
       
       
         

       
       JLabel text = new JLabel("Trouble in login...");
       text.setBounds(300, 250, 150, 20);
       text.setBackground(Color.red);
       
       p2.add(text);
      
       setVisible(true);
    }
    public void actionperformed(ActionEvent ae) {
        
      

        if (ae.getSource() == Login) {
            try {
                String username = tfusername.getText();
                String password = tfpassword.getText();
                
                String query = "select * from yash where username = '"+username+"' AND password = '"+password+"'";
                Conn c = new Conn();
                  ResultSet rs = c.s.executeQuery(query);
                  if (rs.next()) {
                      setVisible(false);
                      new Loading(username);
                      
                  }   else {
                      JOptionPane.showMessageDialog(null, "Incorrect username or password");
                      
                      
                  }             
            } catch (Exception e) {
                e.printStackTrace();
            }
        } else if (ae.getSource() == signup) {
            setVisible(false);
            new signup();
            
           }   else {
            setVisible(false);
            new forgetpassword();
        }    
      }
 
    public static void main(String[] args) {
        new Login();
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
         if (ae.getSource() == Login) {
              try {
                String username = tfusername.getText();
                String password = tfpassword.getText();
                
                 String query = "select * from yash where username = '"+username+"' AND password = '"+password+"'";
                Conn c = new Conn();
                  ResultSet rs = c.s.executeQuery(query);
                  if (rs.next()) {
                      setVisible(false);
                      new Loading(username);
                      
                  }   else {
                      JOptionPane.showMessageDialog(null, "Incorrect username or password");
                      
                      
                  }             
            } catch (Exception e) {
                e.printStackTrace();
            }
                  }
            
         else if (ae.getSource() == signup) {
            setVisible(false);
            new signup();
            
           }   else {
            setVisible(false);
            new forgetpassword();
        } 
    
     System.out.println("Button clicked");
    }
}
