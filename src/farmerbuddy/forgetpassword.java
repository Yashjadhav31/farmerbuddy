package farmerbuddy;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;

   public class forgetpassword extends JFrame implements ActionListener {
    JTextField tfusername,tfname, tfsecurity,tfanswer,tfpassword;
    JButton Search,retrieve,back;
    
   forgetpassword() {
        setBounds(350, 200, 980, 400);
        getContentPane().setBackground(Color.white);
       setLayout(null);
       
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/ForgetPassword.jpg"));
       Image i2 = i1.getImage().getScaledInstance(250, 250, Image.SCALE_DEFAULT);
       ImageIcon i3 = new ImageIcon(i2);
       JLabel image = new JLabel(i3);
       image.setBounds(580, 50, 320, 250);
       add(image);
       
       JPanel p1 = new JPanel();
       p1.setBounds(30,30,500,300);
       p1.setLayout(null);
       add(p1);
       
       JLabel lblusername = new JLabel("USERNAME");
       lblusername.setBounds(50, 20, 125, 25);
       lblusername.setFont(new Font("Tahoma", Font.BOLD, 20));
       p1.add(lblusername);
       
         tfusername = new JTextField();
       tfusername.setBounds(180, 20, 200, 30);
       tfusername.setBorder(BorderFactory.createEmptyBorder());
       p1.add(tfusername);
       
      Search = new JButton("Search");
        Color black = null;
      Search.setBackground(black);
        Color white = null;
      Search.setForeground(white);
      Search.setBounds(380, 20, 100, 30);
      Search.addActionListener(this);
      p1.add(Search);
      
      JLabel lblname = new JLabel("NAME");
       lblname.setBounds(50, 60, 125, 25);
       lblname.setFont(new Font("Tahoma", Font.BOLD, 20));
       p1.add(lblname);
       
         tfname = new JTextField();
       tfname.setBounds(180, 60, 200, 30);
       tfname.setBorder(BorderFactory.createEmptyBorder());
       p1.add(tfname);
       
      JLabel lblsecurity = new JLabel("SECURITY QUESION");
        lblsecurity.setBounds(50, 100, 125, 25);
       lblsecurity.setFont(new Font("SAN_SERIF", Font.BOLD, 20));
       p1.add(lblsecurity);
       
        tfsecurity = new JTextField();
        tfsecurity.setBounds(180, 100, 200, 30);
        tfsecurity.setBorder(BorderFactory.createEmptyBorder());
       p1.add( tfsecurity);
       
        JLabel lblanswer = new JLabel("Answer");
        lblanswer.setBounds(50, 140, 125, 25);
       lblanswer.setFont(new Font("SAN_SERIF", Font.BOLD, 20));
       p1.add( lblanswer);
       
        tfanswer = new JTextField();
       tfanswer.setBounds(180, 140, 200, 30);
       tfanswer.setBorder(BorderFactory.createEmptyBorder());
       p1.add(tfanswer);
       
      retrieve = new JButton("RETRIEVE");  
      retrieve.setBackground(black);
      retrieve.setForeground(white);
      retrieve.setBounds(380, 140, 100, 30);
      retrieve.addActionListener(this);
      p1.add(retrieve); 
      
      JLabel lblpassword = new JLabel("PASSWORD");
        lblpassword.setBounds(50, 180, 125, 25);
       lblpassword.setFont(new Font("SAN_SERIF", Font.BOLD, 20));
       p1.add( lblpassword);
       
        tfpassword = new JTextField();
      tfpassword.setBounds(180, 180, 200, 30);
       tfpassword.setBorder(BorderFactory.createEmptyBorder());
       p1.add(tfpassword);
      
      back  = new JButton("BACK");  
      back.setBackground(black);
      back.setForeground(white);
      back.setBounds(200, 230, 120, 40);
      back.addActionListener(this);
      p1.add(back); 
       
       
       
       setVisible(true);
   }
   
    public void actionPerformed(ActionEvent ae){
            if (ae.getSource() == Search) {
                try {
                   String query = "select * from yash where username = '"+tfusername.getText()+"'";
                   Conn c = new Conn();
                   
                   ResultSet rs = c.s.executeQuery(query);
                   while(rs.next()) {
                       tfname.setText(rs.getString("name"));
                       tfsecurity.setText(rs.getString("security"));
                    }
                } catch (Exception  e){
                    e.printStackTrace();
                }
             
         } else if (ae.getSource() == retrieve) {
            try {
                   String query = "select * from yash where answer = '"+tfanswer.getText()+"' AND username = '"+tfusername.getText()+"'";
                   Conn c = new Conn();
                   
                   ResultSet rs = c.s.executeQuery(query);
                   while(rs.next()) {
                       tfpassword.setText(rs.getString("password"));
                       
                    }
                } catch (Exception  e){
                    e.printStackTrace();
                }  
         } else {
              setVisible(false);
              new Login();
             
         }
    }
    
    
     public static void main(String[] args) {
        new forgetpassword();
    }

}