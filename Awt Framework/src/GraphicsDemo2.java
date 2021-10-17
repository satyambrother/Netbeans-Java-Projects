import java.awt.*;
import java.awt.event.*;  
class Railway
{
      public static void main(String[] args)
      {
        Frame f=new Frame();
        f.setSize(700,700);
        f.setTitle("reservation system");
        f.setLocation(0,0);
        f.setBackground(Color.yellow);
        f.setForeground(Color.red);
        f.setVisible(true);
        f.setLayout(null);
        f.addWindowListener(new WindowAdapter()
        {  public void windowClosing(WindowEvent e)
        { System.exit(0);
                }
        });
        Label l1=new Label("INDIAN RAILWAY RESERVATION SYSTEM");
        l1.setBounds(100,40,1000,50);
        f.add(l1);
        Font f1=new Font("Arail",Font.BOLD,20);
        l1.setFont(f1);
        
        Label l2=new Label("USER ID");
        l2.setBounds(150,150,90,20);
        
        TextField a1=new TextField(30);
        a1.setBounds(250,150,90,20);
     
        Label l3=new Label("PASSWORD");
        l3.setBounds(150,200,90,20);
        
        TextField a2=new TextField(30);
        a2.setBounds(250,200,90,20);
        a2.setEchoChar('*');
        
        Button b=new Button("LOGIN");
        b.setBounds(250,300,90,20);
        
        Label l4=new Label("citizen");
        l4.setBounds(150,250,90,20);
        
        
        CheckboxGroup cg=new CheckboxGroup();
        Checkbox cb=new Checkbox("indian",cg,true);
        cb.setBounds(250, 250, 90, 20);
        Checkbox cb1=new Checkbox("NRI",cg,false);
        cb1.setBounds(350, 250, 90, 20);
         
         
        Button b1=new Button("PNR INQUERY");
        b1.setBounds(100,350,100,50);
       
        Button b2=new Button("spot the train");
        b2.setBounds(400,350,100,50);
        Button b3=new Button("yellow");
        Button b4=new Button("red");
        Button b5=new Button("pink");
         
        b3.setBounds(100,500,50,20);
        b4.setBounds(250,500,50,20);
        b5.setBounds(350,500,50,20);
        
        f.add(l2);
        f.add(a1);
        f.add(l3);
        f.add(a2);
        f.add(l4);
        f.add(cb);
        f.add(cb1);
         
        f.add(b);
        f.add(b1);
        f.add(b2);
        f.add(b3);
        f.add(b4);
        f.add(b5);
        

      
      
      } 
}
   