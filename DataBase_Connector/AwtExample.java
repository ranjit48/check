package DataBase_Connector;
import java.awt.*;
import javax.swing.*;
import javax.swing.border.Border;

public class AwtExample {
    AwtExample(){
        JFrame frame = new JFrame();
       //frame.setUndecorated(true); // for hiding the title bar
        UIManager.put(" ", Color.decode("#292d2e"));
        ImageIcon img = new ImageIcon("C:\\Users\\Windows 10\\IdeaProjects\\Intellij_Project\\src\\DataBase_Connector\\Calculator_512.png");
        frame.setIconImage(img.getImage());

        Border border = BorderFactory.createLineBorder(Color.decode("#292d2e"));
        frame.setBackground(Color.BLACK);
        JPanel panel = new JPanel();
        panel.setBackground(Color.decode("#1d2021"));
        panel.setLayout(null);
        // Text field
        JTextField j1 = new JTextField();
        j1.setBounds(10,30,230,40);
        // Text label
        JLabel l1 = new JLabel("Enter the Number : ");
        l1.setForeground(Color.WHITE);
        l1.setBounds(10,2,140,20);
        // text label
           // lable first row
       JLabel one = new JLabel("MC");
        one.setForeground(Color.WHITE);
        one.setBounds(30,75,140,20);

        // label1 first row
        JLabel two = new JLabel("MR");
        two.setForeground(Color.WHITE);
        two.setBounds(90,75,140,20);

        // label2 first row
        JLabel three = new JLabel("M+");
        three.setForeground(Color.WHITE);
        three.setBounds(150,75,140,20);

        // lable3 first row
        JLabel four = new JLabel("MS");
        four.setForeground(Color.WHITE);
        four.setBounds(200,75,140,20);

        // first row button
        JButton jb = new JButton("1");
        jb.setBackground(Color.decode("#292d2e"));
        jb.setForeground(Color.WHITE);
        jb.setBorder(border);
        jb.setFont(new Font("Elephant",Font.BOLD,15));
        jb.setBounds(10,100,50,30);
        JButton jb1 = new JButton("2");
        jb1.setBackground(Color.decode("#292d2e"));
        jb1.setForeground(Color.WHITE);
        jb1.setBorder(border);
        jb1.setFont(new Font("Elephant",Font.BOLD,15));
        jb1.setBounds(70,100,50,30);
        JButton jb2 = new JButton("3");
        jb2.setBackground(Color.decode("#292d2e"));
        jb2.setForeground(Color.WHITE);
        jb2.setBorder(border);
        jb2.setFont(new Font("Elephant",Font.BOLD,15));
        jb2.setBounds(130,100,50,30);
        JButton jbx = new JButton("+");
        jbx.setBackground(Color.decode("#292d2e"));
        jbx.setForeground(Color.WHITE);
        jbx.setBorder(border);
        jbx.setFont(new Font("Elephant",Font.BOLD,15));
        jbx.setBounds(190,100,50,30);
        // second row
        JButton jb11 = new JButton("4");
        jb11.setBackground(Color.decode("#292d2e"));
        jb11.setForeground(Color.WHITE);
        jb11.setBorder(border);
        jb11.setFont(new Font("Elephant",Font.BOLD,15));
        jb11.setBounds(10,140,50,30);
        JButton jb12 = new JButton("5");
        jb12.setBackground(Color.decode("#292d2e"));
        jb12.setForeground(Color.WHITE);
        jb12 .setBorder(border);
        jb12.setFont(new Font("Elephant",Font.BOLD,15));
        jb12.setBounds(70,140,50,30);
        JButton jb13 = new JButton("6");
        jb13.setBackground(Color.decode("#292d2e"));
        jb13.setForeground(Color.WHITE);
        jb13.setBorder(border);
        jb13.setFont(new Font("Elephant",Font.BOLD,15));
        jb13.setBounds(130,140,50,30);
        JButton jb111 = new JButton("-");
        jb111.setBackground(Color.decode("#292d2e"));
        jb111.setForeground(Color.WHITE);
        jb111.setBorder(border);
        jb111.setFont(new Font("Elephant",Font.BOLD,15));
        jb111.setBounds(190,140,50,30);
        // third row
        JButton jb21 = new JButton("7");
        jb21.setBackground(Color.decode("#292d2e"));
        jb21.setForeground(Color.WHITE);
        jb21.setBorder(border);
        jb21.setFont(new Font("Elephant",Font.BOLD,15));
        jb21.setBounds(10,180,50,30);
        JButton jb22 = new JButton("8");
        jb22.setBackground(Color.decode("#292d2e"));
        jb22.setForeground(Color.WHITE);
        jb22.setBorder(border);
        jb22.setFont(new Font("Elephant",Font.BOLD,15));
        jb22.setBounds(70,180,50,30);
        JButton jb23 = new JButton("9");
        jb23.setBackground(Color.decode("#292d2e"));
        jb23.setForeground(Color.WHITE);
        jb23.setBorder(border);
        jb23.setFont(new Font("Elephant",Font.BOLD,15));
        jb23.setBounds(130,180,50,30);
        JButton jb233 = new JButton("*");
        jb233.setBackground(Color.decode("#292d2e"));
        jb233.setForeground(Color.WHITE);
        jb233.setBorder(border);
        jb233.setFont(new Font("Elephant",Font.BOLD,15));
        jb233.setBounds(190,180,50,30);
        // fourth row
        JButton jb31 = new JButton(".");
        jb31.setBackground(Color.decode("#292d2e"));
        jb31.setForeground(Color.WHITE);
        jb31.setBorder(border);
        jb31.setFont(new Font("Elephant",Font.BOLD,20));
        jb31.setBounds(10,220,50,30);
        JButton jb32 = new JButton("0");
        jb32.setBackground(Color.decode("#292d2e"));
        jb32.setForeground(Color.WHITE);
        jb32.setBorder(border);
        jb32.setFont(new Font("Elephant",Font.BOLD,15));
        jb32.setBounds(70,220,50,30);
        JButton jb33 = new JButton("=");
        jb33.setBackground(Color.decode("#292d2e"));
        jb33.setForeground(Color.WHITE);
        jb33.setBorder(border);
        jb33.setFont(new Font("Elephant",Font.BOLD,17));
        jb33.setBounds(130,220,50,30);
        JButton jb114 = new JButton("/");
        jb114.setBackground(Color.decode("#292d2e"));
        jb114.setForeground(Color.WHITE);
        jb114.setBorder(border);
        jb114.setFont(new Font("Elephant",Font.BOLD,15));
        jb114.setBounds(190,220,50,30);
        // Fifth row
        JButton jb51 = new JButton("M+");
        jb51.setBackground(Color.decode("#292d2e"));
        jb51.setForeground(Color.WHITE);
        jb51.setBorder(border);
        jb51.setFont(new Font("Elephant",Font.BOLD,20));
        jb51.setBounds(10,260,50,30);
        JButton jb52 = new JButton("M-");
        jb52.setBackground(Color.decode("#292d2e"));
        jb52.setForeground(Color.WHITE);
        jb52.setBorder(border);
        jb52.setFont(new Font("Elephant",Font.BOLD,15));
        jb52.setBounds(70,260,50,30);
        JButton jb53 = new JButton("CE");
        jb53.setBackground(Color.decode("#292d2e"));
        jb53.setForeground(Color.WHITE);
        jb53.setBorder(border);
        jb53.setFont(new Font("Elephant",Font.BOLD,17));
        jb53.setBounds(130,260,50,30);
        JButton jb115 = new JButton("%");
        jb115.setBackground(Color.decode("#292d2e"));
        jb115.setForeground(Color.WHITE);
        jb115.setBorder(border);
        jb115.setFont(new Font("Elephant",Font.BOLD,15));
        jb115.setBounds(190,260,50,30);


        // panel area
      
        panel.add(jb51);
        panel.add(jb52);
        panel.add(jb53);
        panel.add(jb115);

        panel.add(two);
        panel.add(three);
        panel.add(four);
        
        panel.add(jb31);
        panel.add(jb32);
        panel.add(jb33);
        panel.add(jb233);

        panel.add(jb21);
        panel.add(jb22);
        panel.add(jb23);
        panel.add(jb114);

        panel.add(jb11);
        panel.add(jb12);
        panel.add(jb13);
        panel.add(jb111);

        panel.add(jbx);
        panel.add(jb2);
        panel.add(jb);
        panel.add(jb1);

        panel.add(one);
        panel.add(l1);
        panel.add(j1);
        frame.add(panel);

        frame.setSize(265 , 345);
        frame.setLocationRelativeTo(null);
        frame.setResizable(false); // maximize button disable
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
    public static void main(String s[]) {  
        new AwtExample();


    }  
}  