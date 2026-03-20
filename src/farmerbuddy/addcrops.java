package farmerbuddy;

import java.awt.*;
import javax.swing.*;
//import com.toedter.calendar.JDateChooser;
import java.util.*;
import java.awt.event.*;

public class addcrops extends JFrame implements ActionListener{
    
    Random ran = new Random();
    int number = ran.nextInt(999999);
    
    JTextField tfname, tfsname, tfaddress, tfphone, tfaadhar, tfemail, tfsalary, tfdesignation, tfdate;
   // JDateChooser dcdob;
    JComboBox cbeducation,ccrop,cseasons;
    JLabel lblempId;
    JButton add, back;
    
    addcrops() {
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);
        
        JLabel heading = new JLabel("ADD crops deatails");
        heading.setBounds(320, 30, 500, 50);
        heading.setFont(new Font("SAN_SERIF", Font.BOLD, 25));
        add(heading);
        
        JLabel labelname = new JLabel("Name");
        labelname.setBounds(50, 150, 150, 30);
        labelname.setFont(new Font("serif", Font.PLAIN, 20));
        add(labelname);
        
        tfname = new JTextField();
        tfname.setBounds(200, 150, 150, 30);
        add(tfname);
        
        JLabel labelfname = new JLabel("sir Name");
        labelfname.setBounds(400, 150, 150, 30);
        labelfname.setFont(new Font("serif", Font.PLAIN, 20));
        add(labelfname);
        
        tfsname = new JTextField();
        tfsname.setBounds(600, 150, 150, 30);
        add(tfsname);
        
        JLabel labeldob = new JLabel("Date ");
        labeldob.setBounds(50, 200, 150, 30);
        labeldob.setFont(new Font("serif", Font.PLAIN, 20));
        add(labeldob);
        
         tfdate = new JTextField();
        tfdate.setBounds(200, 200, 150, 30);
        add(tfdate);
        
     //   dcdob = new JDateChooser();
     //   dcdob.setBounds(200, 200, 150, 30);
    //    add(dcdob);
     ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/soils.jpg"));
       Image i2 = i1.getImage().getScaledInstance(900, 200, Image.SCALE_DEFAULT);
       ImageIcon i3 = new ImageIcon(i2);
       JLabel icon = new JLabel(i3);
       icon.setBounds(0, 450, 900, 200);
       add(icon);
    
        
        JLabel labelsalary = new JLabel("crop names");
        labelsalary.setBounds(400, 200, 150, 30);
        labelsalary.setFont(new Font("serif", Font.PLAIN, 20));
        add(labelsalary);
        
       String crops[] = {"WHEAT ", "MAIZE ", "RICE ", "LEGUME ", "COTTON", "SUGERCANE", "SORGHUM", "MILLETS","RAGI","GINGER","SESAME","TURMERIC","SUNFLOWER","PADDY","BRINJAL","TOMATO",};
       
        ccrop = new JComboBox(crops);
        ccrop.setBackground(Color.WHITE);
        ccrop.setBounds(600, 200, 150, 30);
        add(ccrop);
        
        JLabel labeladdress = new JLabel("Seasons");
        labeladdress.setBounds(50, 250, 150, 30);
        labeladdress.setFont(new Font("serif", Font.PLAIN, 20));
        add(labeladdress);
        
        String seasons[] = { "Kharif", "Rabi", "Zaid",};
        cseasons = new JComboBox(seasons);
        cseasons.setBackground(Color.WHITE);
        cseasons.setBounds(200, 250, 150, 30);
        add(cseasons);
        
        JLabel labelphone = new JLabel("Phone");
        labelphone.setBounds(400, 250, 150, 30);
        labelphone.setFont(new Font("serif", Font.PLAIN, 20));
        add(labelphone);
        
        tfphone = new JTextField();
        tfphone.setBounds(600, 250, 150, 30);
        add(tfphone);
        
        JLabel labelemail = new JLabel("Email");
        labelemail.setBounds(50, 300, 150, 30);
        labelemail.setFont(new Font("serif", Font.PLAIN, 20));
        add(labelemail);
        
        tfemail = new JTextField();
        tfemail.setBounds(200, 300, 150, 30);
        add(tfemail);
        
        JLabel labeleducation = new JLabel("soil type");
        labeleducation.setBounds(400, 300, 150, 30);
        labeleducation.setFont(new Font("serif", Font.PLAIN, 20));
        add(labeleducation);
        
        String soils[] = {"Chernozem soil", "Alluvial soil", "red&yellow", "Laterite soil", "Forest soil", "Desert soil", "Alkaline soil", "Marshy soil",};
        cbeducation = new JComboBox(soils);
        cbeducation.setBackground(Color.WHITE);
        cbeducation.setBounds(600, 300, 150, 30);
        add(cbeducation);
        
        JLabel labeldesignation = new JLabel("state_name");
        labeldesignation.setBounds(50, 350, 150, 30);
        labeldesignation.setFont(new Font("serif", Font.PLAIN, 20));
        add(labeldesignation);
        
        tfdesignation = new JTextField();
        tfdesignation.setBounds(200, 350, 150, 30);
        add(tfdesignation);
        
        JLabel labelaadhar = new JLabel("Aadhar Number");
        labelaadhar.setBounds(400, 350, 150, 30);
        labelaadhar.setFont(new Font("serif", Font.PLAIN, 20));
        add(labelaadhar);
        
        tfaadhar = new JTextField();
        tfaadhar.setBounds(600, 350, 150, 30);
        add(tfaadhar);
        
        JLabel labelempId = new JLabel("Registration Number");
        labelempId.setBounds(50, 400, 250, 30);
        labelempId.setFont(new Font("serif", Font.PLAIN, 20));
        add(labelempId);
        
        lblempId = new JLabel("" + number);
        lblempId.setBounds(250, 400, 150, 30);
        lblempId.setFont(new Font("serif", Font.PLAIN, 20));
        add(lblempId);
        
        
        add = new JButton("Submit");
        add.setBounds(250, 550, 150, 40);
        add.addActionListener(this);
        add.setBackground(Color.BLACK);
        add.setForeground(Color.WHITE);
        add(add);
        
        back = new JButton("Back");
        back.setBounds(450, 550, 150, 40);
        back.addActionListener(this);
        back.setBackground(Color.BLACK);
        back.setForeground(Color.WHITE);
        add(back);
        
        setSize(900, 700);
        setLocation(300, 50);
        setVisible(true);
    }
    
    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == add) {
            String name = tfname.getText();
            String sname = tfsname.getText();
            String date = tfdate.getText();
            String cropname = (String) ccrop.getSelectedItem();
            String season = (String) cseasons.getSelectedItem();
            String phone = tfphone.getText();
            String email = tfemail.getText();
            String soils = (String) cbeducation.getSelectedItem();
            String statename = tfdesignation.getText();
            String aadhar = tfaadhar.getText();
            String registrationNo = lblempId.getText();
             JOptionPane.showMessageDialog(null, "Details added successfully");
            try {
                Conn c = new Conn();
                String query = "insert into registrations values('"+name+"', '"+sname+"', '"+date+"', '"+cropname+"', '"+season+"', '"+phone+"', '"+email+"', '"+soils+"', '"+statename+"', '"+aadhar+"', '"+registrationNo+"')";
                c.s.executeUpdate(query);
               
                setVisible(false);
                new Dashboard();
            } catch (Exception e) {
                e.printStackTrace();
            }
        } else {
            setVisible(false);
            new Dashboard();
        }
    }

    public static void main(String[] args) {
        new addcrops();
    }
}