package farmerbuddy;
import javax.swing.*;
import java.awt.*;
import static java.awt.Color.WHITE;
import javax.swing.border.*;
import java.awt.event.*;
import java.sql.*;
import java.awt.event.AWTEventListener;
import java.awt.event.ActionEvent;

public class govtscheme extends JFrame implements ActionListener {
    JButton back,back1,translate;
   

    
    
    govtscheme() {
       
         setBounds(0, 0, 1600, 1000);
        getContentPane().setBackground(Color.white);
        setLayout(null);
        
         JPanel p1 = new JPanel();
       p1.setBackground(new Color(0, 50, 130));
       p1.setBounds(0,0,1600,1000);
       p1.setLayout(null);
       add(p1);
       
      
       
       back = new JButton("<");
       back.setBounds(350, 750, 130, 30);
       back.setBackground(new Color(133, 193, 233));
       back.setForeground(Color.white);
       back.setBorder(new LineBorder(new Color(133, 193, 233)));
        back.addActionListener(this);
       
       p1.add(back);
       
        
       back1 = new JButton(">");
       back1.setBounds(1100, 750, 130, 30);
       back1.setBackground(new Color(133, 193, 233));
       back1.setForeground(Color.white);
       back1.setBorder(new LineBorder(new Color(133, 193, 233)));
        back1.addActionListener(this);
       
       p1.add(back1);
       
       
       
     JTextArea lblusername = new JTextArea("1. Pradhan Mantri Jan Dhan Yojana (PMJDY)\n" +
"2. Pradhan Mantri Mudra Yojana (PMMY)\n" +
"3. Pradhan Mantri Awas Yojana (PMAY)\n" +
"4. Pradhan Mantri Ujjwala Yojana (PMUY)\n" +
"5. Swachh Bharat Abhiyan\n" +
"6. Pradhan Mantri Fasal Bima Yojana (PMFBY)\n" +
"7. Ayushman Bharat - Pradhan Mantri Jan Arogya Yojana (AB-PMJAY)\n" +
"8. Make in India\n" +
"9. Skill India\n" +
"10. Digital India\n" +
"11. Beti Bachao, Beti Padhao\n" +
"12. Atal Pension Yojana (APY)\n" +
"13. Deen Dayal Upadhyaya Gram Jyoti Yojana (DDUGJY)\n" +
"14. One Nation One Ration Card (ONORC)\n" +
"15. Pradhan Mantri Kisan Samman Nidhi (PM-Kisan)\n" +
"16. Swadesh Darshan Yojana\n" +
"17. Pradhan Mantri Krishi Sinchai Yojana (PMKSY)\n" +
"18. National Rural Employment Guarantee Act (NREGA)\n" +
"19. Rashtriya Swasthya Bima Yojana (RSBY)\n" +
"20. Pradhan Mantri Kaushal Vikas Yojana (PMKVY)\n" +
"21. Atal Mission for Rejuvenation and Urban Transformation (AMRUT)\n" +
"22. Pradhan Mantri Matru Vandana Yojana (PMMVY)\n" +
"23. Pradhan Mantri Gram Sadak Yojana (PMGSY)\n" +
"24. Pradhan Mantri Suraksha Bima Yojana (PMSBY)\n" +
"25. Pradhan Mantri Vaya Vandana Yojana (PMVVY)\n" +
"26. Pradhan Mantri Jeevan Jyoti Bima Yojana (PMJJBY)\n" +
"27. Digital India\n" +
"28. Sukanya Samriddhi Yojana\n" +
"29. National Digital Health Mission (NDHM)\n" +
"30. Pradhan Mantri Kisan Maan-Dhan Yojana");
       lblusername.setBounds(0, 0, 1600, 780);
       lblusername.setFont(new Font("Tahoma", Font.BOLD, 20));
       p1.add(lblusername);
       
       JTextArea lblusernamee = new JTextArea("31. Pradhan Mantri Garib Kalyan Yojana (PMGKY)\n" +
"32. Pradhan Mantri Kisan Credit Card (PM-KCC)\n" +
"33. Pradhan Mantri Bhartiya Jan Aushadhi Pariyojana (PMBJP)\n" +
"34. Stand Up India\n" +
"35. Namami Gange Programme\n" +
"36. Pradhan Mantri Awas Yojana (Urban) - Credit Linked Subsidy Scheme (CLSS)\n" +
"37. Udaan - Special Industry Initiative for Jammu & Kashmir\n" +
"38. National Skill Development Mission\n" +
"39. Pradhan Mantri Swasthya Suraksha Yojana (PMSSY)\n" +
"40. Van Dhan Yojana\n" +
"41. Pradhan Mantri Van Dhan Yojana\n" +
"42. Shyama Prasad Mukherji Rurban Mission\n" +
"43. Pradhan Mantri Rojgar Protsahan Yojana (PMRPY)\n" +
"44. Mission Indradhanush\n" +
"45. Pradhan Mantri Awaas Yojana (Gramin) - PMAY-G\n" +
"46. Rashtriya Gram Swaraj Abhiyan (RGSA)\n" +
"47. Pradhan Mantri Vaya Vandana Yojana (PMVVY)\n" +
"48. Deen Dayal Upadhyaya Antyodaya Yojana (DAY)\n" +
"49. Swadesh Darshan Yojana\n" +
"50. Atal Bhujal Yojana (ABHY)\n" +
"51. Pradhan Mantri Shram Yogi Maan-Dhan (PM-SYM)\n" +
"52. Pradhan Mantri Annadata Aay Sanrakshan Abhiyan (PM-AASHA)\n" +
"53. Swachh Bharat Mission (Gramin)\n" +
"54. National Mission on Clean Ganga (NMCG)\n" +
"55. Pradhan Mantri Jan Vikas Karyakram (PMJVK)\n" +
"56. Atal Bhujal Yojana (ABHY)\n" +
"57. Rashtriya Kishore Swasthya Karyakram (RKSK)\n" +
"58. Deendayal Upadhyaya Grameen Kaushalya Yojana (DDU-GKY)\n" +
"59. Rashtriya Uchchatar Shiksha Abhiyan (RUSA)\n" +
"60. Pradhan Mantri Bhartiya Janaushadhi Pariyojana (PMBJP)");
       lblusernamee.setBounds(780, 0, 1600, 780);
       lblusernamee.setFont(new Font("Tahoma", Font.BOLD, 20));
       p1.add(lblusernamee);
       
       
           
    
       setVisible(true);
    }
    public void actionperformed(ActionEvent ae) {
         if (ae.getSource() == back){
                setVisible(false);
            new Dashboard();
            
            } 
           }
    
     public static void main(String[] args) {
        new govtscheme();
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == back){
                setVisible(false);
            new Dashboard();
            
            }if (ae.getSource() == back1){
                setVisible(false);
            new govtscheme1();}
    }
}

        
 
    


