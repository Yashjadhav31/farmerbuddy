package farmerbuddy;

import javax.swing.*;
import java.awt.*;
import java.sql.*;
import net.proteanit.sql.DbUtils;
import static java.awt.Color.WHITE;

import java.awt.event.*;

public class viewcrops extends JFrame implements ActionListener{

    JTable table;
    Choice cemployeeId;
    JButton search, print, update, back;
    
    viewcrops() {
        
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);
        
        JLabel searchlbl = new JLabel("Search by Registration Number");
        searchlbl.setBounds(20, 20, 150, 20);
        add(searchlbl);
        
        cemployeeId = new Choice();
        cemployeeId.setBounds(180, 20, 150, 20);
        add(cemployeeId);
        
        try {
            Conn c = new Conn();
            ResultSet rs = c.s.executeQuery("select * from registrations");
            while(rs.next()) {
                cemployeeId.add(rs.getString("registrationNo"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        table = new JTable();
        
        try {
            Conn c = new Conn();
            ResultSet rs = c.s.executeQuery("select * from registrations");
            table.setModel(DbUtils.resultSetToTableModel(rs));
        } catch (Exception e) {
            e.printStackTrace();
        }
         ImageIcon i8 = new ImageIcon(ClassLoader.getSystemResource("icons/soils.jpg"));
       Image i9 = i8.getImage().getScaledInstance(900, 500, Image.SCALE_DEFAULT);
       ImageIcon i10 = new ImageIcon(i9);
       JLabel image = new JLabel(i10);
       image.setBounds(0, 230, 900,500);
       add(image);
       
        JScrollPane jsp = new JScrollPane(table);
        jsp.setBounds(0, 100, 900, 600);
        add(jsp);
        
     
        
        search = new JButton("Search");
        search.setBounds(20, 70, 80, 20);
       
        search.addActionListener(this);
        add(search);
        
        print = new JButton("Print");
        print.setBounds(120, 70, 80, 20);
        print.addActionListener(this);
        add(print);
        
       //update = new JButton("Update");
        //update.setBounds(220, 70, 80, 20);
        //update.addActionListener(this);
        //add(update);
        
        back = new JButton("Back");
        back.setBounds(220, 70, 80, 20);
        back.addActionListener(this);
        add(back);
        
         
        
        setSize(900, 700);
        setLocation(300, 100);
        setVisible(true);
        
        
       
    }
    
    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == search) {
            String query = "select * from registrations where registrationNo = '"+cemployeeId.getSelectedItem()+"'";
            try {
                Conn c = new Conn();
                ResultSet rs = c.s.executeQuery(query);
                table.setModel(DbUtils.resultSetToTableModel(rs));
            } catch (Exception e) {
                e.printStackTrace();
            }
        } else if (ae.getSource() == print) {
            try {
                table.print();
            } catch (Exception e) {
                e.printStackTrace();
            } 
            
                   
                    }//else if (ae.getSource() == update) {
            //setVisible(false);
            //new UpdateRegistration(cemployeeId.getSelectedItem());}
         else {
            setVisible(false);
            new Dashboard();
        }
    }

    public static void main(String[] args) {
        new viewcrops();
    }
}