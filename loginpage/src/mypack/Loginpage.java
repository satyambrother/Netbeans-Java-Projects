package mypack;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
class Loginpage {
   
    public static void main(String[] args) {
      Frame f=new Frame();
      f.setSize(600,700);
      f.setTitle("login page");
      f.setBackground(Color.yellow);
      f.setForeground(Color.red);
      f.setVisible(true);
      f.setLayout(null);
       // Font f1=new Font("Arail",Font.BOLD,20);
     //f.setFont(f1);
      f.addWindowListener(new WindowAdapter()
      {  public void windowClosing(WindowEvent arg0)
        {   System.exit(0);
                               }
        });
      Label l1=new Label("user name");
       l1.setBounds(50, 100, 120, 20);
      f.add(l1);
      
        TextField a1=new TextField(30);
       a1.setBounds(190, 100,150,30);
       f.add(a1);
     
       Label l2=new Label("possword");
       l2.setBounds(50, 150, 120, 20);
       f.add(l2);
      
      TextField a2=new TextField(30);
       a2.setBounds(190, 150, 150, 20);
      f.add(a2);
       a2.setEchoChar('*');
      
       Button b=new Button("login");
       b.setBounds(190, 200, 90, 20);
       f.add(b);
     
       Label l3=new Label("room partner");
       l3.setBounds(50,250,90,20);
       
     Checkbox cb1=new Checkbox("satyam");
     Checkbox cb2=new Checkbox("deepak");
     Checkbox cb3=new Checkbox("shubham");
     Checkbox cb4=new Checkbox("harshit");
     
      cb1.setBounds(150, 250, 90, 20);
     cb2.setBounds(250, 250, 90, 20);
      cb3.setBounds(350, 250, 90, 20);
     cb4.setBounds(450, 250, 90, 20);
      f.add(l3);
     f.add(cb1);
     f.add(cb2);
     f.add(cb3);
     f.add(cb4);
     f.add(g);
    }
}
