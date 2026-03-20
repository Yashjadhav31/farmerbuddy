package farmerbuddy;

import java.awt.*;
import javax.swing.*;
//import com.toedter.calendar.JDateChooser;
import java.util.*;
import java.awt.event.*;

public class Booking extends JFrame implements ActionListener{
    
    Random ran = new Random();
    int number = ran.nextInt(999999);
    
    JTextField tfname, tfsname, tfaddress, tfphone, tfaadhar, tfemail, tfeducation, tfdesignation, tfdate;
   // JDateChooser dcdob;
   // JComboBox ccrop;
    JLabel lblempId;
    JButton add, back,checkprice,back2;
   Choice ccrops;
    
    Booking() {
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);
        
        JLabel heading = new JLabel("Booking Section");
        heading.setBounds(350, 30, 500, 50);
       // heading.setBackground(new Color(0, 0, 102));
       //heading.setForeground(Color.white);
        heading.setFont(new Font("SAN_SERIF", Font.BOLD, 30));
        add(heading);
        
        JLabel labelname = new JLabel("Name");
        labelname.setBounds(50, 150, 150, 30);
         labelname.setBackground(new Color(0, 0, 102));
       labelname.setForeground(Color.white);
        labelname.setFont(new Font("serif", Font.PLAIN, 20));
        add(labelname);
        
        tfname = new JTextField();
        tfname.setBounds(200, 150, 150, 30);
        add(tfname);
        
        JLabel labelfname = new JLabel("Last Name");
        labelfname.setBounds(400, 150, 150, 30);
        labelfname.setBackground(new Color(0, 0, 102));
       labelfname.setForeground(Color.white);
        labelfname.setFont(new Font("serif", Font.PLAIN, 20));
        add(labelfname);
        
        tfsname = new JTextField();
        tfsname.setBounds(600, 150, 150, 30);
        add(tfsname);
        
        JLabel labeldob = new JLabel("Date ");
        labeldob.setBounds(50, 200, 150, 30);
        labeldob.setBackground(new Color(0, 0, 102));
       labeldob.setForeground(Color.white);
        labeldob.setFont(new Font("serif", Font.PLAIN, 20));
        add(labeldob);
        
         tfdate = new JTextField();
        tfdate.setBounds(200, 200, 150, 30);
        add(tfdate);
        
     //   dcdob = new JDateChooser();
     //   dcdob.setBounds(200, 200, 150, 30);
    //    add(dcdob);
     //ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/sheti.jpeg"));
      // Image i2 = i1.getImage().getScaledInstance(800, 200, Image.SCALE_DEFAULT);
       //ImageIcon i3 = new ImageIcon(i2);
       //JLabel icon = new JLabel(i3);
       //icon.setBounds(100, 450, 700, 200);
      // add(icon);
    
        
        JLabel labelsalary = new JLabel("product name");
        labelsalary.setBounds(400, 200, 150, 30);
        labelsalary.setBackground(new Color(0, 0, 102));
       labelsalary.setForeground(Color.white);
        labelsalary.setFont(new Font("serif", Font.PLAIN, 20));
        add(labelsalary);
        
       //String crops[] = {"Axe ", "Shovel ", "Rake ", "Sickle", "Sprayers", "Bolo", "Mattock", "Tracktor","Wheelbarrow","Cultivator",
       //"Plough","Pruning saw","Hand trovel","Pruning saw","Crowbar","Cultivator2","baler","Rotavator","Vermicompost","nitrobenzene",
       //"urea","Bio-ferilizer"
       //,"npk chemical","organic fertilizer","biindhi seeds","sunflower seeds","green mator",
       //"tomato seeds","onion seeds","watermelonseeds","andromed seeds","capsicum seeds","Blackwheaterseeds","red gram seeds","bitter seeds"
       //,"urja seeds","Farming-b","Chaft cutter","brush cutter","vasudhairri",
       //"Agriculturepump","Dripper","Solarpump","watermotor","agriculturalseed","muliseeds","powertiller","Bringleseeds"};
       
        
        
        ccrops = new Choice ();
       ccrops.add("Axe");
       ccrops.add("shovel");
       ccrops.add("Rake");
       ccrops.add("Sickle");
       ccrops.add("Sprayers");
       ccrops.add("Bolo");
       ccrops.add("Mattock");
       ccrops.add("Tracktor");
       ccrops.add("Wheelbarrow");
       ccrops.add("Cultivator");
       ccrops.add("Plough");
       ccrops.add("Pruning saw");
       ccrops.add("Hand trovel");
       ccrops.add("Pruning saw");
       ccrops.add("Crowbar");
       ccrops.add("Cultivator2");
       ccrops.add("baler");
       ccrops.add("Rotavator");
       ccrops.add("Vermicompost");
       ccrops.add("nitrobenzene");
       ccrops.add("urea");
       ccrops.add("Bio-ferilizer");
       ccrops.add("npk chemical");
       ccrops.add("organic fertilizer");
       ccrops.add("biindhi seeds");
       ccrops.add("sunflower seeds");
       ccrops.add("green mator");
       ccrops.add("tomato seeds");
       ccrops.add("onion seeds");
       ccrops.add("watermelonseeds");
       ccrops.add("andromed");
       ccrops.add("capsicum seeds");
       ccrops.add("Blackwheaterseeds");
       ccrops.add("red gram seeds");
       ccrops.add("bitter seeds");
       ccrops.add("urja seeds");
       ccrops.add("Farming-b");
       ccrops.add("Chaft cutter");
       ccrops.add("brush cutter");
       ccrops.add("vasudhairri");
       ccrops.add("Agriculturepump");
       ccrops.add("Dripper");
       ccrops.add("Solarpump");
       ccrops.add("watermotor");
       ccrops.add("agriculturalseed");
       ccrops.add("muliseeds");
       ccrops.add("powertiller");
       ccrops.add("Bringleseeds");

       ccrops.setBounds(600, 200, 150, 30);
        add(ccrops);
        
        JLabel labeladdress = new JLabel("qutofprod");
        labeladdress.setBounds(50, 250, 150, 30);
        labeladdress.setBackground(new Color(0, 0, 102));
       labeladdress.setForeground(Color.white);
        labeladdress.setFont(new Font("serif", Font.PLAIN, 20));
        add(labeladdress);
        
        
        tfaddress = new JTextField("1");
        tfaddress.setBounds(200, 250, 150, 30);
        add(tfaddress);
        
        JLabel labelphone = new JLabel("Phone");
        labelphone.setBounds(400, 250, 150, 30);
        labelphone.setBackground(new Color(0, 0, 102));
       labelphone.setForeground(Color.white);
        labelphone.setFont(new Font("serif", Font.PLAIN, 20));
        add(labelphone);
        
        tfphone = new JTextField();
        tfphone.setBounds(600, 250, 150, 30);
        add(tfphone);
        
        JLabel labelemail = new JLabel("Email");
        labelemail.setBounds(50, 300, 150, 30);
        labelemail.setBackground(new Color(0, 0, 102));
       labelemail.setForeground(Color.white);
        labelemail.setFont(new Font("serif", Font.PLAIN, 20));
        add(labelemail);
        
        tfemail = new JTextField();
        tfemail.setBounds(200, 300, 150, 30);
        add(tfemail);
        
        JLabel labeleducation = new JLabel("Total price");
        labeleducation.setBounds(400, 300, 150, 30);
        labeleducation.setBackground(new Color(0, 0, 102));
       labeleducation.setForeground(Color.white);
        labeleducation.setFont(new Font("serif", Font.PLAIN, 20));
        add(labeleducation);
        
        tfeducation = new JTextField();
        tfeducation.setBounds(600, 300, 150, 30);
        add(tfeducation);
        
        JLabel labeldesignation = new JLabel("state_name");
        labeldesignation.setBounds(50, 350, 150, 30);
        labeldesignation.setBackground(new Color(0, 0, 102));
       labeldesignation.setForeground(Color.white);
        labeldesignation.setFont(new Font("serif", Font.PLAIN, 20));
        add(labeldesignation);
        
        tfdesignation = new JTextField();
        tfdesignation.setBounds(200, 350, 150, 30);
        add(tfdesignation);
        
        JLabel labelaadhar = new JLabel("Aadhar Number");
        labelaadhar.setBounds(400, 350, 150, 30);
        labelaadhar.setBackground(new Color(0, 0, 102));
       labelaadhar.setForeground(Color.white);
        labelaadhar.setFont(new Font("serif", Font.PLAIN, 20));
        add(labelaadhar);
        
        tfaadhar = new JTextField();
        tfaadhar.setBounds(600, 350, 150, 30);
        add(tfaadhar);
        
        JLabel labelempId = new JLabel("Registration Number");
        labelempId.setBounds(50, 400, 250, 30);
        labelempId.setBackground(new Color(0, 0, 102));
       labelempId.setForeground(Color.white);
        labelempId.setFont(new Font("serif", Font.PLAIN, 20));
        add(labelempId);
        
        lblempId = new JLabel("" + number);
        lblempId.setBounds(250, 400, 150, 30);
        lblempId.setBackground(new Color(0, 0, 102));
       lblempId.setForeground(Color.white);
        lblempId.setFont(new Font("serif", Font.PLAIN, 20));
        add(lblempId);
        
         ImageIcon i8 = new ImageIcon(ClassLoader.getSystemResource("icons/ma.jpg"));
       Image i9 = i8.getImage().getScaledInstance(890, 450, Image.SCALE_DEFAULT);
       ImageIcon i10 = new ImageIcon(i9);
       JLabel image = new JLabel(i10);
       image.setBounds(0, 80, 890,450);
       add(image);
        
        add = new JButton("Book pacakage");
        add.setBounds(150, 550, 150, 40);
        add.addActionListener(this);
        add.setBackground(Color.BLACK);
        add.setForeground(Color.WHITE);
          add.addActionListener(this);
        add(add);
        
         checkprice = new JButton("check price");
        checkprice.setBounds(550, 550, 150, 40);
        checkprice.addActionListener(this);
        checkprice.setBackground(Color.BLACK);
        checkprice.setForeground(Color.WHITE);
          checkprice.addActionListener(this);
        add(checkprice);
        
        back = new JButton("Back");
        back.setBounds(350, 550, 150, 40);
        back.addActionListener(this);
        back.setBackground(Color.BLACK);
        back.setForeground(Color.WHITE);
        back.addActionListener(this);
         add(back);
         
          back2 = new JButton("Pay");
        back2.setBounds(350, 600, 150, 40);
        back2.addActionListener(this);
        back2.setBackground(Color.BLACK);
        back2.setForeground(Color.WHITE);
        back2.addActionListener(this);
         add(back2);
        
        setSize(900, 700);
        setLocation(300, 50);
        
        setVisible(true);
    }
    
    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == add) {
            String name = tfname.getText();
            String Lastname = tfsname.getText();
            String date = tfdate.getText();
            String productname = (String) ccrops.getSelectedItem();
            String qutofpro = (String) tfaddress.getText();
            String phone = tfphone.getText();
            String email = tfemail.getText();
            String Totalprice = (String) tfeducation.getText();
            String statename = tfdesignation.getText();
            String aadhar = tfaadhar.getText();
            String registrationNo = lblempId.getText();
            
          
            
             JOptionPane.showMessageDialog(null, "Details added successfully");
            try {
                Conn c = new Conn();
                String query = "insert into Bookings values('"+name+"', '"+Lastname+"', '"+date+"', '"+productname+"', '"+qutofpro+"', '"+phone+"', '"+email+"', '"+Totalprice+"', '"+statename+"', '"+aadhar+"', '"+registrationNo+"')";
                c.s.executeUpdate(query);
               
                setVisible(false);
                new Dashboard();
            } catch (Exception e) {
                e.printStackTrace();
            }
        } if (ae.getSource()== checkprice){
             String pack1 = (String) ccrops.getSelectedItem();
             int cost = 0;
             if(pack1.equals("Axe")) {
                 cost += 970;
             }else if(pack1.equals("shovel")) {
                 cost += 399;
             }else if(pack1.equalsIgnoreCase("Rake")){
                 cost +=799;
             }else if (pack1.equalsIgnoreCase("Sickle")) {
                 cost +=299;
             }else if (pack1.equalsIgnoreCase("Bolo")) {
                 cost +=299;
             }else if (pack1.equalsIgnoreCase("Mattock")) {
                 cost +=399;
             }else if (pack1.equalsIgnoreCase("Tracktor")) {
                 cost +=500000;
             }else if (pack1.equalsIgnoreCase("Wheelbarrow")) {
                 cost +=499;
             }else if (pack1.equalsIgnoreCase("Cultivator")) {
                 cost +=45000;
             }else if (pack1.equalsIgnoreCase("Plough")) {
                 cost +=40000;
             }else if (pack1.equalsIgnoreCase("Pruning saw")) {
                 cost +=199;
             }else if (pack1.equalsIgnoreCase("Hand trovel")) {
                 cost +=400;
             }else if (pack1.equalsIgnoreCase("Pruning saw")) {
                 cost +=600;
             }else if (pack1.equalsIgnoreCase("Crowbar")) {
                 cost +=300;
             }else if (pack1.equalsIgnoreCase("Cultivator2")) {
                 cost +=35000;
             }else if (pack1.equalsIgnoreCase("baler")) {
                 cost +=500000;
             }else if (pack1.equalsIgnoreCase("Rotavator")) {
                 cost +=500000;
             }else if (pack1.equalsIgnoreCase("Vermicompost")) {
                 cost +=219;
             }else if (pack1.equalsIgnoreCase("nitrobenzene")) {
                 cost +=516;
             }else if (pack1.equalsIgnoreCase("urea")) {
                 cost +=423;
             }else if (pack1.equalsIgnoreCase("Bio-ferilizer")) {
                 cost +=600;
             }else if (pack1.equalsIgnoreCase("npk chemical")) {
                 cost +=500;
             }else if (pack1.equalsIgnoreCase("organic fertilizer")) {
                 cost +=66;
             }else if (pack1.equalsIgnoreCase("biindhi seeds")) {
                 cost +=150;
             }else if (pack1.equalsIgnoreCase("sunflower seeds")) {
                 cost +=100;
             }else if (pack1.equalsIgnoreCase("green mator")) {
                 cost +=299;
             }else if (pack1.equalsIgnoreCase("tomato seeds")) {
                 cost +=499;
             }else if (pack1.equalsIgnoreCase("onion seeds")) {
                 cost +=150;
             }else if (pack1.equalsIgnoreCase("watermelonseeds")) {
                 cost +=245;
             }else if (pack1.equalsIgnoreCase("andromed")) {
                 cost +=150;
             }else if (pack1.equalsIgnoreCase("capsicum seeds")) {
                 cost +=199;
             }else if (pack1.equalsIgnoreCase("Blackwheaterseeds")) {
                 cost +=199;
             }else if (pack1.equalsIgnoreCase("red gram seeds")) {
                 cost +=235;
             }else if (pack1.equalsIgnoreCase("bitter seeds")) {
                 cost +=175;
             }else if (pack1.equalsIgnoreCase("urja seeds")) {
                 cost +=245;
             }else if (pack1.equalsIgnoreCase("Farming-b")) {
                 cost +=780;
             }else if (pack1.equalsIgnoreCase("Chaft cutter")) {
                 cost +=4500;
             }else if (pack1.equalsIgnoreCase("brush cutter")) {
                 cost +=5500;
             }else if (pack1.equalsIgnoreCase("vasudhairri")) {
                 cost +=500;
             }else if (pack1.equalsIgnoreCase("Agriculturepump")) {
                 cost +=2500;
             }else if (pack1.equalsIgnoreCase("Dripper")) {
                 cost +=330;
             }else if (pack1.equalsIgnoreCase("Solarpump")) {
                 cost +=2500;
             }else if (pack1.equalsIgnoreCase("watermotor")) {
                 cost +=2500;
             }else if (pack1.equalsIgnoreCase("agriculturalseed")) {
                 cost +=145;
             }else if (pack1.equalsIgnoreCase("muliseeds")) {
                 cost +=145;
             }else if (pack1.equalsIgnoreCase("powertiller")) {
                 cost +=300000;
             }else if (pack1.equalsIgnoreCase("Bringleseeds")) {
                 cost +=1600;
             }else if (pack1.equalsIgnoreCase("Sprayers")) {
                 cost +=999;
             }
             
                 int qutofprod = Integer.parseInt(tfaddress.getText());
                 cost *= qutofprod;        
                 tfeducation.setText("Rs" +cost);
             
                 
             }else if (ae.getSource()== back){
                  setVisible(false);
            new Dashboard();
                 
         }
        else if (ae.getSource()== back2){
                  setVisible(false);
            new Payment();
                 
         }
      
     }
            
            
        
    
     
    public static void main(String[] args) {
        new Booking();
}
}
