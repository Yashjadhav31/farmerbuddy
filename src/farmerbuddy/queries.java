
package farmerbuddy;
import javax.swing.*;
import java.awt.*;
import static java.awt.Color.WHITE;
import javax.swing.border.*;
import java.awt.event.*;
import java.sql.*;
import java.awt.event.AWTEventListener;
import java.awt.event.ActionEvent;

public class queries extends JFrame implements ActionListener {
    JButton yes,no,quesion3,quesion4,quesion5,quesion6,quesion7,quesion8,quesion9,quesion10,quesion11,quesion12,quesion13,quesion14,quesion15,quesion16,quesion17,quesion18,quesion19,quesion20,quesion21,quesion22,quesion23,quesion24,quesion25;
   

    
    
    queries() {
       setSize(1600, 1000);
       setLocation(0, 0);
       setLayout(null);
       getContentPane().setBackground(Color.white);
       
       JPanel p1 = new JPanel();
       p1.setBackground(new Color(131, 200, 233));
       p1.setBounds(0,0,1600,1000);
       p1.setLayout(null);
       add(p1);
       
      
        
      
       
       yes = new JButton("1)what is your name?");
       yes.setBounds(0, 60, 1600, 40);
       yes.setBackground(new Color(133, 193, 233));
       yes.setForeground(Color.white);
       yes.setBorder(new LineBorder(new Color(133, 193, 233)));
        yes.addActionListener(this);
       
       p1.add(yes);
       
        no = new JButton("whats your birthplace?");
       no.setBounds(0, 90, 1600, 40);
       no.setBackground(new Color(133, 193, 233));
       no.setForeground(Color.white);
       no.setBorder(new LineBorder(new Color(133, 193, 233)));
        no.addActionListener(this);
    
       p1.add(no);
       
        quesion3 = new JButton("wh?");
       quesion3.setBounds(0, 120, 1600, 40);
       quesion3.setBackground(new Color(133, 193, 233));
       quesion3.setForeground(Color.white);
       quesion3.setBorder(new LineBorder(new Color(133, 193, 233)));
        quesion3.addActionListener(this);
    
       p1.add(quesion3);
       
        quesion4= new JButton("wh?");
       quesion4.setBounds(0, 150, 1600, 40);
       quesion4.setBackground(new Color(133, 193, 233));
       quesion4.setForeground(Color.white);
       quesion4.setBorder(new LineBorder(new Color(133, 193, 233)));
        quesion4.addActionListener(this);
    
       p1.add(quesion4);
       
         quesion4= new JButton("wh?");
       quesion4.setBounds(0, 180, 1600, 40);
       quesion4.setBackground(new Color(133, 193, 233));
       quesion4.setForeground(Color.white);
       quesion4.setBorder(new LineBorder(new Color(133, 193, 233)));
        quesion4.addActionListener(this);
    
       p1.add(quesion4);
       
          quesion5= new JButton("wh?");
       quesion5.setBounds(0, 210, 1600, 40);
       quesion5.setBackground(new Color(133, 193, 233));
       quesion5.setForeground(Color.white);
       quesion5.setBorder(new LineBorder(new Color(133, 193, 233)));
        quesion5.addActionListener(this);
    
       p1.add(quesion5);
       
       
       quesion6= new JButton("wh?");
       quesion6.setBounds(0, 240, 1600, 40);
       quesion6.setBackground(new Color(133, 193, 233));
       quesion6.setForeground(Color.white);
       quesion6.setBorder(new LineBorder(new Color(133, 193, 233)));
        quesion6.addActionListener(this);
    
       p1.add(quesion6);
       
       quesion7= new JButton("wh?");
       quesion7.setBounds(0, 270, 1600, 40);
       quesion7.setBackground(new Color(133, 193, 233));
       quesion7.setForeground(Color.white);
       quesion7.setBorder(new LineBorder(new Color(133, 193, 233)));
        quesion7.addActionListener(this);
    
       p1.add(quesion7);
       
        quesion8= new JButton("wh?");
       quesion8.setBounds(0, 300, 1600, 40);
       quesion8.setBackground(new Color(133, 193, 233));
       quesion8.setForeground(Color.white);
       quesion8.setBorder(new LineBorder(new Color(133, 193, 233)));
        quesion8.addActionListener(this);
    
       p1.add(quesion8);
       
       
        quesion9= new JButton("wh?");
       quesion9.setBounds(0, 330, 1600, 40);
       quesion9.setBackground(new Color(133, 193, 233));
       quesion9.setForeground(Color.white);
       quesion9.setBorder(new LineBorder(new Color(133, 193, 233)));
        quesion9.addActionListener(this);
    
       p1.add(quesion9);
       
        quesion10= new JButton("wh?");
       quesion10.setBounds(0, 360, 1600, 40);
       quesion10.setBackground(new Color(133, 193, 233));
       quesion10.setForeground(Color.white);
       quesion10.setBorder(new LineBorder(new Color(133, 193, 233)));
        quesion10.addActionListener(this);
    
       p1.add(quesion10);
       
       quesion11= new JButton("wh?");
       quesion11.setBounds(0, 390, 1600, 40);
       quesion11.setBackground(new Color(133, 193, 233));
       quesion11.setForeground(Color.white);
       quesion11.setBorder(new LineBorder(new Color(133, 193, 233)));
        quesion11.addActionListener(this);
    
       p1.add(quesion11);
       
       
       quesion12= new JButton("wh?");
       quesion12.setBounds(0, 420, 1600, 40);
       quesion12.setBackground(new Color(133, 193, 233));
       quesion12.setForeground(Color.white);
       quesion12.setBorder(new LineBorder(new Color(133, 193, 233)));
        quesion12.addActionListener(this);
    
       p1.add(quesion12);
       
       quesion13= new JButton("wh?");
       quesion13.setBounds(0, 450, 1600, 40);
       quesion13.setBackground(new Color(133, 193, 233));
       quesion13.setForeground(Color.white);
       quesion13.setBorder(new LineBorder(new Color(133, 193, 233)));
        quesion13.addActionListener(this);
    
       p1.add(quesion13);
       
       quesion14= new JButton("wh?");
       quesion14.setBounds(0, 480, 1600, 40);
       quesion14.setBackground(new Color(133, 193, 233));
       quesion14.setForeground(Color.white);
       quesion14.setBorder(new LineBorder(new Color(133, 193, 233)));
        quesion14.addActionListener(this);
    
       p1.add(quesion14);
       
       quesion15= new JButton("wh?");
       quesion15.setBounds(0, 510, 1600, 40);
       quesion15.setBackground(new Color(133, 193, 233));
       quesion15.setForeground(Color.white);
       quesion15.setBorder(new LineBorder(new Color(133, 193, 233)));
        quesion15.addActionListener(this);
    
       p1.add(quesion15);
       
       quesion16= new JButton("wh?");
       quesion16.setBounds(0, 540, 1600, 40);
       quesion16.setBackground(new Color(133, 193, 233));
       quesion16.setForeground(Color.white);
       quesion16.setBorder(new LineBorder(new Color(133, 193, 233)));
        quesion11.addActionListener(this);
    
       p1.add(quesion16);
       
       quesion17= new JButton("wh?");
       quesion17.setBounds(0, 570, 1600, 40);
       quesion17.setBackground(new Color(133, 193, 233));
       quesion17.setForeground(Color.white);
       quesion17.setBorder(new LineBorder(new Color(133, 193, 233)));
        quesion17.addActionListener(this);
    
       p1.add(quesion17);
       
       quesion18= new JButton("wh?");
       quesion18.setBounds(0, 600, 1600, 40);
       quesion18.setBackground(new Color(133, 193, 233));
       quesion18.setForeground(Color.white);
       quesion18.setBorder(new LineBorder(new Color(133, 193, 233)));
        quesion18.addActionListener(this);
    
       p1.add(quesion18);
       
       quesion19= new JButton("wh?");
       quesion19.setBounds(0, 630, 1600, 40);
       quesion19.setBackground(new Color(133, 193, 233));
       quesion19.setForeground(Color.white);
       quesion19.setBorder(new LineBorder(new Color(133, 193, 233)));
        quesion19.addActionListener(this);
    
       p1.add(quesion19);
       
       quesion20= new JButton("wh?");
       quesion20.setBounds(0, 660, 1600, 40);
       quesion20.setBackground(new Color(133, 193, 233));
       quesion20.setForeground(Color.white);
       quesion20.setBorder(new LineBorder(new Color(133, 193, 233)));
        quesion20.addActionListener(this);
    
       p1.add(quesion20);
       
       quesion21= new JButton("wh?");
       quesion21.setBounds(0,690, 1600, 40);
       quesion21.setBackground(new Color(133, 193, 233));
       quesion21.setForeground(Color.white);
       quesion21.setBorder(new LineBorder(new Color(133, 193, 233)));
        quesion21.addActionListener(this);
    
       p1.add(quesion21);
       quesion22= new JButton("wh?");
       quesion22.setBounds(0, 720, 1600, 40);
       quesion22.setBackground(new Color(133, 193, 233));
       quesion22.setForeground(Color.white);
       quesion22.setBorder(new LineBorder(new Color(133, 193, 233)));
        quesion22.addActionListener(this);
    
       p1.add(quesion22);
       quesion23= new JButton("wh?");
       quesion23.setBounds(0, 750, 1600, 40);
       quesion23.setBackground(new Color(133, 193, 233));
       quesion23.setForeground(Color.white);
       quesion23.setBorder(new LineBorder(new Color(133, 193, 233)));
        quesion23.addActionListener(this);
    
       p1.add(quesion23);
       
       
        quesion24= new JButton(">");
       quesion24.setBounds(1000, 10, 80, 40);
       quesion24.setBackground(new Color(133, 0, 3));
       quesion24.setForeground(Color.white);
       quesion24.setBorder(new LineBorder(new Color(173, 183, 233)));
        quesion24.addActionListener(this);
    
       p1.add(quesion24);
       
      quesion25= new JButton("<");
       quesion25.setBounds(500, 10, 80, 40);
       quesion25.setBackground(new Color(133, 0, 3));
       quesion25.setForeground(Color.white);
       quesion25.setBorder(new LineBorder(new Color(173, 183, 233)));
        quesion25.addActionListener(this);
    
       p1.add(quesion25);
     
       
       
         

       
     JLabel heading = new JLabel("Queries");
       heading.setBounds(700, 0, 400, 50);
       heading.setFont(new Font("Tahoma", Font.BOLD, 50));
       heading.setForeground(WHITE);
       p1.add(heading);
      
      
       setVisible(true);
    }
    public void actionperformed(ActionEvent ae) {
         if (ae.getSource() == yes){
                setVisible(false);
            new query1();
            } else if (ae.getSource() == no){
                setVisible(false);
            new Dashboard();
               
           } else if (ae.getSource() == quesion25){
                setVisible(false);
            new Dashboard();
               
           }
        
        
    }
        
      

        
 
    public static void main(String[] args) {
        new queries();
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == yes){
                setVisible(false);
            new query1();
            } else if (ae.getSource() == no){
                setVisible(false);
            new Dashboard();
               
           }else if (ae.getSource() == quesion25){
                setVisible(false);
            new Dashboard();
               
           } else if (ae.getSource() == quesion24){
                setVisible(false);
            new queries1();
               
           }
        
        
    }

}
