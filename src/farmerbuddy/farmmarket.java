package farmerbuddy;
import java.awt.Color;
import static java.awt.Color.WHITE;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

import javax.swing.JFrame;
import javax.swing.border.LineBorder;


public class farmmarket extends JFrame implements ActionListener {
    JButton viewsoil,soil,red,Laterite,Forest,Desert,Alkaline,Marshy,redy,yash,sandesh,aditya,tukaram,quesion24,quesion25;
    farmmarket() {
        
         setBounds(0, 0, 1600, 1000);
        getContentPane().setBackground(Color.white);
        setLayout(null);
        
         JPanel p1 = new JPanel();
       p1.setBackground(new Color(0, 0, 0));
       p1.setBounds(0,0,400,200);
       p1.setLayout(null);
       add(p1);
       
      ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/1.png"));
       Image i2 = i1.getImage().getScaledInstance(400, 150, Image.SCALE_DEFAULT);
       ImageIcon i3 = new ImageIcon(i2);
       JLabel icon = new JLabel(i3);
       icon.setBounds(0, 0, 400, 150);
       p1.add(icon);
       
       
        viewsoil = new JButton(" Axe");
       viewsoil.setBounds(120, 150, 150, 30);
       viewsoil.setBackground(new Color(00, 150, 150));
       viewsoil.setForeground(Color.white);
       viewsoil.setFont(new Font("Tahoma", Font.PLAIN,20));
        viewsoil.addActionListener(this);
       p1.add(viewsoil);
       
       
         JPanel p2 = new JPanel();
       p2.setBackground(new Color(0, 0, 0));                                             
       p2.setBounds(400,0,400,200);
       p2.setLayout(null);
       
       add(p2);
       
       ImageIcon i4 = new ImageIcon(ClassLoader.getSystemResource("icons/2.png"));
       Image i5 = i4.getImage().getScaledInstance(400, 150, Image.SCALE_DEFAULT);
       ImageIcon i6= new ImageIcon(i5);
       JLabel i = new JLabel(i6);
       i.setBounds(0, 0, 400, 150);
       p2.add(i);
       
       
       soil = new JButton(" Shovel");
       soil.setBounds(120, 150, 150, 30);
       soil.setBackground(new Color(0, 150, 150));
       soil.setForeground(Color.white);
       soil.setFont(new Font("Tahoma", Font.PLAIN,20));
        soil.addActionListener(this);
       p2.add(soil);
       
       JPanel p3 = new JPanel();
       p3.setBackground(new Color(0, 0, 0));                                             
       p3.setBounds(800,0,400,200);
       p3.setLayout(null);
       add(p3);
       
        ImageIcon i7= new ImageIcon(ClassLoader.getSystemResource("icons/3.png"));
       Image i8 = i7.getImage().getScaledInstance(400, 150, Image.SCALE_DEFAULT);
       ImageIcon i9= new ImageIcon(i8);
       JLabel y= new JLabel(i9);
       y.setBounds(0, 0, 400, 150);
       p3.add(y);
       
       
        red = new JButton("Rake");
       red.setBounds(120, 150, 150, 30);
       red.setBackground(new Color(0, 150, 150));
       red.setForeground(Color.white);
       red.setFont(new Font("Tahoma", Font.PLAIN,20));
        red.addActionListener(this);
       p3.add(red);
       
      
       
        redy = new JButton(" X");
       redy.setBounds(1480, 0, 50, 40);
       redy.setBackground(new Color(150, 0, 10));
       redy.setForeground(Color.white);
       redy.setFont(new Font("Tahoma", Font.PLAIN,15));
        redy.addActionListener(this);

       p1.add(redy);
       
       
       JPanel p4 = new JPanel();
       p4.setBackground(new Color(0, 0, 0));                                             
       p4.setBounds(1200,0,400,200);
       p4.setLayout(null);
       add(p4);
       
       ImageIcon i10= new ImageIcon(ClassLoader.getSystemResource("icons/4.png"));
       Image i11 = i10.getImage().getScaledInstance(400, 150, Image.SCALE_DEFAULT);
       ImageIcon i12= new ImageIcon(i11);
       JLabel g= new JLabel(i12);
       g.setBounds(0, 0, 400, 150);
       p4.add(g);
       
       
        Laterite = new JButton("Sickle");
       Laterite.setBounds(120, 150, 150, 30);
       Laterite.setBackground(new Color(0, 150, 150));
       Laterite.setForeground(Color.white);
       Laterite.setFont(new Font("Tahoma", Font.PLAIN,20));
        Laterite.addActionListener(this);
       p4.add(Laterite);
       
       
        JPanel p5 = new JPanel();
       p5.setBackground(new Color(0, 0, 0));                                             
       p5.setBounds(0,250,400,200);
       p5.setLayout(null);
       add(p5);
       
       ImageIcon i13= new ImageIcon(ClassLoader.getSystemResource("icons/5.png"));
       Image i14 = i13.getImage().getScaledInstance(400, 150, Image.SCALE_DEFAULT);
       ImageIcon i15= new ImageIcon(i14);
       JLabel j= new JLabel(i15);
       j.setBounds(0, 0, 400, 150);
       p5.add(j);
        
         Forest = new JButton("Sprayers");
       Forest.setBounds(120, 150, 150, 30);
       Forest.setBackground(new Color(0, 150, 150));
       Forest.setForeground(Color.white);
       Forest.setFont(new Font("Tahoma", Font.PLAIN,20));
        Forest.addActionListener(this);
       p5.add(Forest);
       
        JPanel p6 = new JPanel();
       p6.setBackground(new Color(0, 0, 0));                                             
       p6.setBounds(400,250,400,200);
       p6.setLayout(null);
       add(p6);
       
        ImageIcon i16= new ImageIcon(ClassLoader.getSystemResource("icons/6.png"));
       Image i17 = i16.getImage().getScaledInstance(400, 150, Image.SCALE_DEFAULT);
       ImageIcon i18= new ImageIcon(i17);
       JLabel t= new JLabel(i18);
       t.setBounds(0, 0, 400, 150);
       p6.add(t);
       
       Desert = new JButton("Bolo");
       Desert.setBounds(120, 150, 150, 30);
       Desert.setBackground(new Color(0, 150, 150));
       Desert.setForeground(Color.white);
       Desert.setFont(new Font("Tahoma", Font.PLAIN,20));
        Desert.addActionListener(this);
       p6.add(Desert);
       
        JPanel p7 = new JPanel();
       p7.setBackground(new Color(0, 0, 0));                                             
       p7.setBounds(800,250,400,200);
       p7.setLayout(null);
       add(p7);
       
       ImageIcon i19= new ImageIcon(ClassLoader.getSystemResource("icons/7.png"));
       Image i20 = i19.getImage().getScaledInstance(400, 150, Image.SCALE_DEFAULT);
       ImageIcon i21= new ImageIcon(i20);
       JLabel s= new JLabel(i21);
       s.setBounds(0, 0, 400, 150);
       p7.add(s);
       
        Alkaline = new JButton("Mattock");
       Alkaline.setBounds(120, 150, 150, 30);
       Alkaline.setBackground(new Color(0, 150, 150));
       Alkaline.setForeground(Color.white);
       Alkaline.setFont(new Font("Tahoma", Font.PLAIN,20));
        Alkaline.addActionListener(this);
       p7.add(Alkaline);
       
       JPanel p8 = new JPanel();
       p8.setBackground(new Color(0, 0, 0));                                             
       p8.setBounds(1200,250,400,200);
       p8.setLayout(null);
       add(p8);
       
       ImageIcon i22= new ImageIcon(ClassLoader.getSystemResource("icons/8.png"));
       Image i23 = i22.getImage().getScaledInstance(400, 150, Image.SCALE_DEFAULT);
       ImageIcon i24= new ImageIcon(i23);
       JLabel a= new JLabel(i24);
       a.setBounds(0, 0, 400, 150);
       p8.add(a);
       
        Marshy = new JButton("Tracktor");
       Marshy.setBounds(120, 150, 150, 30);
       Marshy.setBackground(new Color(0, 150, 150));
       Marshy.setForeground(Color.white);
       Marshy.setFont(new Font("Tahoma", Font.PLAIN,20));
        Marshy.addActionListener(this);
       p8.add(Marshy);
       
       
         JPanel p9 = new JPanel();
       p9.setBackground(new Color(0, 0, 0));                                             
       p9.setBounds(0,500,400,200);
       p9.setLayout(null);
       add(p9);
       
       ImageIcon i25= new ImageIcon(ClassLoader.getSystemResource("icons/13.png"));
       Image i26 = i25.getImage().getScaledInstance(400, 150, Image.SCALE_DEFAULT);
       ImageIcon i27= new ImageIcon(i26);
       JLabel k= new JLabel(i27);
       k.setBounds(0, 0, 400, 150);
       p9.add(k);
        
         yash = new JButton("Wheelbarrow");
       yash.setBounds(120, 150, 150, 30);
       yash.setBackground(new Color(0, 150, 150));
       yash.setForeground(Color.white);
       yash.setFont(new Font("Tahoma", Font.PLAIN,20));
        yash.addActionListener(this);
       p9.add(yash);
       
        JPanel p10 = new JPanel();
       p10.setBackground(new Color(0, 0, 0));                                             
       p10.setBounds(400,500,400,200);
       p10.setLayout(null);
       add(p10);
       
        ImageIcon i28= new ImageIcon(ClassLoader.getSystemResource("icons/10.png"));
       Image i29 = i28.getImage().getScaledInstance(400, 150, Image.SCALE_DEFAULT);
       ImageIcon i30= new ImageIcon(i29);
       JLabel b= new JLabel(i30);
       b.setBounds(0, 0, 400, 150);
       p10.add(b);
       
       sandesh = new JButton("Cultivator");
       sandesh.setBounds(120, 150, 150, 30);
       sandesh.setBackground(new Color(0, 150, 150));
       sandesh.setForeground(Color.white);
       sandesh.setFont(new Font("Tahoma", Font.PLAIN,20));
        sandesh.addActionListener(this);
       p10.add(sandesh);
       
        JPanel p11 = new JPanel();
       p11.setBackground(new Color(0, 0, 0));                                             
       p11.setBounds(800,500,400,200);
       p11.setLayout(null);
       add(p11);
       
       ImageIcon i31= new ImageIcon(ClassLoader.getSystemResource("icons/11.png"));
       Image i32 = i31.getImage().getScaledInstance(400, 150, Image.SCALE_DEFAULT);
       ImageIcon i33= new ImageIcon(i32);
       JLabel d= new JLabel(i33);
       d.setBounds(0, 0, 400, 150);
       p11.add(d);
       
        tukaram = new JButton("Plough");
       tukaram.setBounds(120, 150, 150, 30);
       tukaram.setBackground(new Color(0, 150, 150));
       tukaram.setForeground(Color.white);
       tukaram.setFont(new Font("Tahoma", Font.PLAIN,20));
        tukaram.addActionListener(this);
       p11.add(tukaram);
       
       JPanel p12 = new JPanel();
       p12.setBackground(new Color(0, 0, 0));                                             
       p12.setBounds(1200,500,400,200);
       p12.setLayout(null);
       add(p12);
       
       ImageIcon i34= new ImageIcon(ClassLoader.getSystemResource("icons/12.png"));
       Image i35 = i34.getImage().getScaledInstance(400, 150, Image.SCALE_DEFAULT);
       ImageIcon i36= new ImageIcon(i35);
       JLabel e= new JLabel(i36);
       e.setBounds(0, 0, 400, 150);
       p12.add(e);
       
        aditya = new JButton("Pruning saw");
       aditya.setBounds(120, 150, 150, 30);
       aditya.setBackground(new Color(0, 150, 150));
       aditya.setForeground(Color.white);
       aditya.setFont(new Font("Tahoma", Font.PLAIN,20));
        aditya.addActionListener(this);
       p12.add(aditya);
       
       JPanel p13 = new JPanel();
       p13.setBackground(new Color(1, 0, 3));
       p13.setBounds(0,0,1600,1000);
       p13.setLayout(null);
       add(p13);
       
       
         quesion24= new JButton(">");
       quesion24.setBounds(1000, 730, 80, 40);
       quesion24.setBackground(new Color(0, 150, 150));
       quesion24.setForeground(Color.white);
       quesion24.setBorder(new LineBorder(new Color(173, 183, 233)));
        quesion24.addActionListener(this);
    
       p13.add(quesion24);
       
      quesion25= new JButton("<");
       quesion25.setBounds(500, 730, 80, 40);
       quesion25.setBackground(new Color(0, 150, 150));
       quesion25.setForeground(Color.white);
       quesion25.setBorder(new LineBorder(new Color(173, 183, 233)));
        quesion25.addActionListener(this);
    
       p13.add(quesion25);
       
       
        //ImageIcon i38= new ImageIcon(ClassLoader.getSystemResource("icons/spash.jpg"));
       //Image i39 = i38.getImage().getScaledInstance(1600, 1000, Image.SCALE_DEFAULT);
      // ImageIcon i40= new ImageIcon(i39);
       //JLabel f= new JLabel(i40);
      // f.setBounds(0, 0, 1600, 1000);
      // p13.add(f);
       
       
       
       
       
       
       
       
       
       
       
       setVisible(true);
        
    }
    
     public void actionperformed(ActionEvent ae) {
         if (ae.getSource() == quesion25){
                setVisible(false);
            new Dashboard();
            } else if (ae.getSource() == quesion24){
                setVisible(false);
            new farmmarket1();
            }else if (ae.getSource() == viewsoil){
                setVisible(false);
            new Axe(); }else if (ae.getSource() == soil){
                setVisible(false);
            new Shovel(); }
        
    }

    
     public static void main(String[] args) {
        
        new farmmarket();
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        
        
         if (ae.getSource() == quesion25){
                setVisible(false);
            new Dashboard();
            }  else if (ae.getSource() == quesion24){
                setVisible(false);
            new farmmarket1();
            }else if (ae.getSource() == viewsoil){
                setVisible(false);
            new Axe(); }else if (ae.getSource() == soil){
                setVisible(false);
            new Shovel(); }else if (ae.getSource() == Laterite){
                setVisible(false);
            new Sickle(); }else if (ae.getSource() == Forest){
                setVisible(false);
            new Sprayers(); }else if (ae.getSource() == Desert){
                setVisible(false);
            new Bolo(); }else if (ae.getSource() == Alkaline){
                setVisible(false);
            new Mattock(); }else if (ae.getSource() == Marshy){
                setVisible(false);
            new Tracktor(); }else if (ae.getSource() == yash){
                setVisible(false);
            new Wheelbarrow(); }else if (ae.getSource() == sandesh){
                setVisible(false);
            new Cultivator(); }else if (ae.getSource() == tukaram){
                setVisible(false);
            new Plough(); }else if (ae.getSource() == aditya){
                setVisible(false);
            new Pruningsaw(); }else if (ae.getSource() == red){
                setVisible(false);
            new Rake(); }else if (ae.getSource() == soil){
                setVisible(false);
            new Shovel(); }
        
        
        
    }

}
    

