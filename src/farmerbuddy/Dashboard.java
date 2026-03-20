
package farmerbuddy;
import java.awt.Color;
import static java.awt.Color.WHITE;
import java.awt.Component;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.*;

public class Dashboard extends JFrame implements ActionListener{
     JButton viewsoil,fertilizers,crops,wepondeatails,irrigition,FARMMARKET,booking,vieworder,govtscheme,queries,help,logout,viewcrops,logout1,logout2 ;
    Dashboard() {
       setBounds(0, 0, 1600, 1000);
        getContentPane().setBackground(Color.white);
        setLayout(null);
        
        JPanel p1 = new JPanel();
         
        p1.setBackground(new Color(0, 0, 100));
       p1.setBounds(0,0,1600,65);
       p1.setLayout(null);
       add(p1);
       
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/sandesh.jpg"));
       Image i2 = i1.getImage().getScaledInstance(70, 70, Image.SCALE_DEFAULT);
       ImageIcon i3 = new ImageIcon(i2);
       JLabel icon = new JLabel(i3);
       icon.setBounds(5, 0, 70, 70);
       p1.add(icon);
        
       
        JLabel heading = new JLabel("Dashboard");
       heading.setBounds(100, 10, 400, 40);
       heading.setFont(new Font("Tahoma", Font.BOLD, 30));
       heading.setForeground(WHITE);
       p1.add(heading);
       
         JPanel p2 = new JPanel();
       p2.setBackground(new Color(0, 0, 100));
       p2.setBounds(0,65,300,900);
       p2.setLayout(null);
       add(p2);
       
       
      viewsoil = new JButton(" VIEW SOIL DEATAILS");
       viewsoil.setBounds(0, 0, 300, 60);
       viewsoil.setBackground(new Color(0, 0, 102));
       viewsoil.setForeground(Color.white);
       viewsoil.setFont(new Font("Tahoma", Font.PLAIN,20));
       viewsoil.addActionListener(this);
       p2.add(viewsoil);
       
       
       
       fertilizers = new JButton(" FERTILIZERS");
       fertilizers.setBounds(0, 50, 300, 60);
       fertilizers.setBackground(new Color(0, 0, 102));
       fertilizers.setForeground(Color.white);
       fertilizers.setFont(new Font("Tahoma", Font.PLAIN,20));
       fertilizers.addActionListener(this);
       p2.add(fertilizers);
       
       
       
       crops = new JButton("ADD CROPS INFO");
       crops.setBounds(0, 100, 300, 60);
       crops.setBackground(new Color(0, 0, 102));
       crops.setForeground(Color.white);
       crops.setFont(new Font("Tahoma", Font.PLAIN,20));
       crops.addActionListener(this);
       p2.add(crops);
       
      viewcrops = new JButton("VIEW CROPS DEATAILS");
       viewcrops.setBounds(0, 150, 300, 60);
       viewcrops.setBackground(new Color(0, 0, 102));
       viewcrops.setForeground(Color.white);
       viewcrops.setFont(new Font("Tahoma", Font.PLAIN,20));
      viewcrops.addActionListener(this);
       p2.add(viewcrops);
       
       wepondeatails = new JButton("Weather DEATAILS");
       wepondeatails.setBounds(0, 200, 300, 60);
       wepondeatails.setBackground(new Color(0, 0, 102));
       wepondeatails.setForeground(Color.white);
       wepondeatails.setFont(new Font("Tahoma", Font.PLAIN,20));
       wepondeatails.addActionListener(this);
       p2.add(wepondeatails);
       
        irrigition = new JButton("IRRIGATION");
       irrigition.setBounds(0, 250, 300, 60);
       irrigition.setBackground(new Color(0, 0, 102));
       irrigition.setForeground(Color.white);
       irrigition.setFont(new Font("Tahoma", Font.PLAIN,20));
       irrigition.addActionListener(this);
       p2.add(irrigition);
      
        FARMMARKET = new JButton("FARM MARKET");
       FARMMARKET.setBounds(0, 300, 300, 60);
       FARMMARKET.setBackground(new Color(0, 0, 102));
       FARMMARKET.setForeground(Color.white);
       FARMMARKET.setFont(new Font("Tahoma", Font.PLAIN,20));
       FARMMARKET.addActionListener(this);
       p2.add(FARMMARKET);
       
         booking = new JButton("BOOKING ORDER");
       booking.setBounds(0, 350, 300, 60);
       booking.setBackground(new Color(0, 0, 102));
       booking.setForeground(Color.white);
       booking.setFont(new Font("Tahoma", Font.PLAIN,20));
       booking.addActionListener(this);
       p2.add(booking);
       
         vieworder = new JButton("VIEW ORDER");
       vieworder.setBounds(0, 400, 300, 60);
       vieworder.setBackground(new Color(0, 0, 102));
       vieworder.setForeground(Color.white);
       vieworder.setFont(new Font("Tahoma", Font.PLAIN,20));
       
       vieworder.addActionListener(this);
       p2.add(vieworder);
       
        govtscheme = new JButton("GOVT SCHEME");
       govtscheme.setBounds(0, 450, 300, 60);
       govtscheme.setBackground(new Color(0, 0, 102));
       govtscheme.setForeground(Color.white);
       govtscheme.setFont(new Font("Tahoma", Font.PLAIN,20));
       govtscheme.addActionListener(this);
       p2.add(govtscheme);
       
         queries = new JButton("Payment");
      queries.setBounds(0, 500, 300, 60);
       queries.setBackground(new Color(0, 0, 102));
       queries.setForeground(Color.white);
       queries.setFont(new Font("Tahoma", Font.PLAIN,20));
      queries.addActionListener(this);
       p2.add(queries);
       
       
          help = new JButton("HELP");
       help.setBounds(0, 550, 300, 60);
       help.setBackground(new Color(0, 0, 102));
       help.setForeground(Color.white);
       help.setFont(new Font("Tahoma", Font.PLAIN,20));
       help.addActionListener(this);
       p2.add(help);
       
          logout = new JButton("LOG OUT");
       logout.setBounds(0, 600, 300, 60);
       logout.setBackground(new Color(0, 0, 102));
       logout.setForeground(Color.white);
       logout.setFont(new Font("Tahoma", Font.PLAIN,20));
       logout.addActionListener(this);
         Component add = p2.add(logout);
         
         logout1 = new JButton("LOG OUT");
       logout1.setBounds(0, 600, 300, 60);
       logout1.setBackground(new Color(0, 0, 102));
       logout1.setForeground(Color.white);
       logout1.setFont(new Font("Tahoma", Font.PLAIN,20));
       logout1.addActionListener(this);
          add = p2.add(logout1);
          
           logout2 = new JButton("Suggestion");
       logout2.setBounds(0, 650, 300, 60);
       logout2.setBackground(new Color(0, 0, 102));
       logout2.setForeground(Color.white);
       logout2.setFont(new Font("Tahoma", Font.PLAIN,20));
       logout2.addActionListener(this);
          add = p2.add(logout2);
       
       ImageIcon i8 = new ImageIcon(ClassLoader.getSystemResource("icons/sunny.jpg"));
       Image i9 = i8.getImage().getScaledInstance(1200, 800, Image.SCALE_DEFAULT);
       ImageIcon i10 = new ImageIcon(i9);
       JLabel image = new JLabel(i10);
       image.setBounds(310, 120, 1220,600);
       add(image);
       
       
       
       
       
       
       
       
       
        
        setVisible(true);
        
        
    
}
    
      public void actionPerformed(ActionEvent ae) {
           if (ae.getSource() == viewsoil){
                setVisible(false);
            new Addsoildeatails();
            } else if (ae.getSource() == fertilizers){
                setVisible(false);
            new fertilizers();
               
           }else if (ae.getSource() == irrigition){
                setVisible(false);
            new irrigation();
           }else if (ae.getSource() == crops){
               setVisible(false);
            new addcrops();
           } 
                    else  if (ae.getSource() == wepondeatails){
                       setVisible(false);
            new Weather(); 
                   }else  if (ae.getSource() == FARMMARKET){
                       setVisible(false);
            new farmmarket(); 
                   }else if (ae.getSource() == booking){
                       setVisible(false);
            new Booking(); 
                   }else if (ae.getSource() == vieworder){
                       setVisible(false);
            new vieworder(); 
                   }else if (ae.getSource() == govtscheme){
                        setVisible(false);
            new govtscheme(); 
                   
                   }else if (ae.getSource() == help){
                       setVisible(false);
            new help(); 
                   }else if (ae.getSource() == logout){
                        setVisible(false);
            new logout(); 
                   }else if (ae.getSource() == viewcrops){
               setVisible(false);
            new viewcrops();}else if (ae.getSource() == queries){
               setVisible(false);
            new Payment();}else if (ae.getSource() == logout2){
                        setVisible(false);
            new Suggestion();
                   }
      }
    
    
       public static void main(String[] args) {
        
        new Dashboard();
    }

   
    
}

    

