package farmerbuddy;
import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.border.*;
import java.awt.*;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JProgressBar;


public class Loading extends JFrame implements Runnable {
    Thread t;
    JProgressBar bar;
    String username;
    
    public void run(){
        try {
            for(int i = 1; i<=100; i++){
            int max = bar.getMaximum(); //100
            int value = bar.getValue();
            
            
            
            if(value < max) {
                bar.setValue(bar.getValue() + 1);
            } else {
                setVisible(false);

                // new class object 
                            }
            Thread.sleep(50);
            
             
            }
            setVisible(false);
                              new Dashboard();

        }  catch (Exception e){
            e.printStackTrace();
        
 
        }
    }
    Loading(String username) {
        this .username = username;
        
        t = new Thread(this);
        setBounds(500, 200, 650, 400);
        getContentPane().setBackground(Color.black);
        setLayout(null);
        
        JLabel  text = new JLabel ("              FARM AGRO        ");
        text.setBounds(50, 10, 600, 40);
        text.setForeground(Color.white);
        text.setFont(new Font("Raleway", Font.BOLD, 35));
        add(text);
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/tukaram.jpg"));
       Image i2 = i1.getImage().getScaledInstance(300, 300, Image.SCALE_DEFAULT);
       ImageIcon i3 = new ImageIcon(i2);
       JLabel image = new JLabel(i3);
       image.setBounds(0, 0, 600, 400);
       add(image);
       
          bar = new JProgressBar();
         bar.setBounds(150,330,300,25);
         bar.setStringPainted(true);
         add(bar);
         
          JLabel loading = new JLabel ("Loading, Please Wait");
        loading.setBounds(230, 130, 150, 30);
        loading.setForeground(Color.red);
        loading.setFont(new Font("Raleway", Font.BOLD, 16));
        add(loading);
        
        
         JLabel lblusername= new JLabel ("Welcome "  + username);
        lblusername.setBounds(20, 310, 400, 40);
        lblusername.setForeground(Color.white);
        lblusername.setFont(new Font("Raleway", Font.BOLD, 16));
        add(lblusername);
        
          t.start();       
        setVisible(true);
                

    
    }
    
    public static void main(String[] args) {
        
        new Loading("");
    }
    
}
