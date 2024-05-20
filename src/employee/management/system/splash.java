package employee.management.system;

import java.awt.Image;

import javax.swing.ImageIcon;
//import javax.swing.ImageIcon;
//import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class splash extends JFrame{
    splash()
    {
        ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource(("icons/front.gif")));
         
        Image i2=i1.getImage().getScaledInstance(1170,960,Image.SCALE_DEFAULT);
         ImageIcon i3=ImageIcon(i2);
         JLabel image =new JLabel(i3);
         image.setBounds(0,0,1170,960);
         add(image);

        setSize(1170,960);
        setLocation(200,50);
        setLayout(null);
        setVisible(true);
    }

    public static void main(String args[])
    {
        new splash();

    }

}