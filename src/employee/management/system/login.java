package employee.management.system;

import java.awt.Color;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class login extends JFrame  implements ActionListener{
    JTextField tusername;
    JPasswordField tpassword;
    JButton login,back;


    login(){
        //to create username
        JLabel username=new JLabel("username");
        username.setBounds(40,20,100,30);
        add(username);
        //to create blank box

        tusername =new JTextField();
        tusername.setBounds(150,20,150,30);
        add(tusername);
        
        //to create password
       
        JLabel password=new JLabel("password");
        password.setBounds(40,70,100,30);
        add(password);
        //to create blank box
         tpassword=new JPasswordField();
         tpassword.setBounds(150,70,150,30);
         add(tpassword);
        //to create  login button
        login =new JButton("LOGIN");
        login.setBounds(150,140,150,30);
        login.setBackground(Color.BLACK);
        login.setForeground(Color.white);
        login.addActionListener(this);
        add(login);

        back =new JButton("BACK");
        back.setBounds(150,180,150,30);
        back.setBackground(Color.BLACK);
        back.setForeground(Color.WHITE);
        login.addActionListener(this);
        add(back);

        ImageIcon i11=new ImageIcon(ClassLoader.getSystemResource(("icons/second.jpg")));
        Image i22=i11.getImage().getScaledInstance(600,400,Image.SCALE_DEFAULT);
        ImageIcon i33= new ImageIcon(i22);
        JLabel img1=new JLabel(i33);
        img1.setBounds(450,30,600,400);
        add(img1);

        ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource(("icons/LoginB.jpg")));
        Image i2=i1.getImage().getScaledInstance(600,300,Image.SCALE_DEFAULT);
        ImageIcon i3= new ImageIcon(i2);
        JLabel img=new JLabel(i3);
        img.setBounds(0,0,600,300);
        add(img);





        setSize(680,300);
        setLocation(480,200);
        setLayout(null);
        setVisible(true);


    }
   
    public static void main(String[] args) {
        new login();
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        // TODO Auto-generated method stub
        if(e.getSource==login)
        {

        }
        elseIf(e.getSource==back)
        {
            System.exit(10);
        }
    }
    
}
