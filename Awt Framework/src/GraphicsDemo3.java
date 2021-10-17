import java.awt.*;
import java.awt.event.*;

class Loginpage
{     
    public static void main(String[] args)
    {
      
        Frame f=new Frame();
        f.setSize(600,700);
        f.setTitle("login page");
        f.setBackground(Color.yellow);
        f.setForeground(Color.red);
        f.setVisible(true);
        f.setLayout(null);
        
        //Font f1=new Font("Arail",Font.BOLD,20);
        //f.setFont(f1);
      
        f.addWindowListener(new WindowAdapter()
        {  public void windowClosing(WindowEvent arg0)
        {   System.exit(0);
                               }
        });
        
       Label l1=new Label("USER NAME");
       l1.setBounds(50, 100, 120, 20);
       f.add(l1);
      
       TextField a1=new TextField(30);
       a1.setBounds(190, 100,150,30);
       f.add(a1);
     
       Label l2=new Label("PASSWORD");
       l2.setBounds(50, 150, 120, 20);
       f.add(l2);
      
       TextField a2=new TextField(30);
       a2.setBounds(190, 150, 150, 20);
       f.add(a2);
       a2.setEchoChar('*');
      
       Button b=new Button("LOGIN");
       b.setBounds(190, 200, 90, 20);
       f.add(b);
     
       Label l3=new Label("ROOM PARTNER");
       l3.setBounds(50,250,150,20);
       
       CheckboxGroup cbg=new CheckboxGroup();
       
       Checkbox cb1=new Checkbox("satyam",cbg,true);
       Checkbox cb2=new Checkbox("deepak",cbg,false);
       Checkbox cb3=new Checkbox("shubham",cbg,false);
       Checkbox cb4=new Checkbox("harshit",cbg,false);
     
       cb1.setBounds(200, 250, 75, 20);
       cb2.setBounds(300, 250, 75, 20);
       cb3.setBounds(200, 300, 75, 20);
       cb4.setBounds(300, 300, 90, 20);
       f.add(l3);
       f.add(cb1);
       f.add(cb2);
       f.add(cb3);
       f.add(cb4);
       
    }
}
