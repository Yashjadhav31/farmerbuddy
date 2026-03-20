
package farmerbuddy;


import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Weather extends JFrame implements ActionListener {
    Weather(){
        
        setBounds(0,0,1600,1000);
        JEditorPane pane1 = new JEditorPane();
        pane1.setEditable(false);   

        try {
            pane1.setPage("https://www.ndtv.com/topic/maharashtra-weather");
        }catch (Exception e) {
            pane1.setContentType("text/html");
            pane1.setText("<html>Could not load,Error 404</html>");
        } 

        JScrollPane scrollPane = new JScrollPane(pane1);     
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        getContentPane().add(scrollPane);
        setPreferredSize(new Dimension(800,600));
        
        JButton back=new JButton("Back");
        back.setBounds(610, 20, 80, 40);
        back.addActionListener(this);       pane1.add(back);
        setVisible(true);
    }
     public void actionPerformed(ActionEvent ae) {
          {
                setVisible(false);
            new Dashboard();}
           }
     
    public static void main(String[] args){
        new Weather().setVisible(true);
    }
}