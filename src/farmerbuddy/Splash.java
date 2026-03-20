package farmerbuddy;

import javax.swing.*;
import java.awt.*;


public class Splash extends JFrame implements Runnable {
    Thread thread;
    Splash () {
        //setSize(1200,600);
        //setLocation(200,100);
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/spash.jpg"));
        Image i2 = i1.getImage().getScaledInstance(1000, 700, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        add(image);
        
        setVisible(true);
        thread = new Thread(this);
        thread.start();
        
        }
           
        public void run() {
            try {
                Thread.sleep(3000);
                // new login();
                setVisible(false);
            new Login();
                
            } catch (Exception e){
        }
        }
            public static void main(String[] arsg) {
             Splash frame = new Splash();
            int x = 1;
            for(int i =1; i<=700; x+=7, i+=6) {
                frame.setLocation(420 - (x +1)/2, 420 - (i/2));
                frame.setSize(x + i, i);
            try{
                Thread.sleep(5);
                
            } 
            catch (InterruptedException e){ 
                
            }
             
            }
            
            }
}