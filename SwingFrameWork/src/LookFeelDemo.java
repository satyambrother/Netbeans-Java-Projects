import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.plaf.*;

public class LookFeelDemo extends JFrame implements ItemListener
{   
    Container c;
    JButton jb;
    JCheckBox cb;
    JRadioButton rb1,rb2,rb3;
    JTextField ta;
    ButtonGroup bg;
    String msg="";
    
    LookFeelDemo()
    {
        c=this.getContentPane();
        c.setLayout(null);
        
        jb=new JButton("Button");
        
        cb=new JCheckBox("CheckBox");
        
        ta=new JTextField("TextField",15);
        
        rb1=new JRadioButton("Metal");
        rb2=new JRadioButton("Motif");
        rb2=new JRadioButton("Windows");
        
        bg=new ButtonGroup();
        bg.add(rb1);
        bg.add(rb2);
        bg.add(rb3);
        
        
        jb.setBounds(100,50,75,40);
        cb.setBounds(100,100,100,40);
        ta.setBounds(100,150,100,40);
        rb1.setBounds(50,250,100,30);
        rb2.setBounds(150,250,100,30);
        rb3.setBounds(250,250,100,30);
        
        
        c.add(jb);
        c.add(cb);
        c.add(rb1);
        c.add(rb2);
        c.add(rb3);
        c.add(ta);
        
        rb1.addItemListener(this);
        rb2.addItemListener(this);
        rb3.addItemListener(this);

    }   
 public void itemStateChanged(ItemEvent e) 
 {   try
    {if(rb1.getModel().isSelected())
    {UIManager.setLookAndFeel("Javax.Swing.plaf.metal.MetalLookAndFeel");}
     if(rb2.getModel().isSelected())
     { UIManager.setLookAndFeel("com.sun.java.Swing.plaf.motif.MotifLookAndFeel");}
     if(rb3.getModel().isSelected())
     {UIManager.setLookAndFeel("com.sun.java.Swing.plaf.windows.WindowsLookAndFeel");}
     SwingUtilities.updateComponentTreeUI(c);
    }
    catch(Exception ae){}
 }
 
    public static void main(String args[])
    {
        LookFeelDemo obj=new LookFeelDemo();
        obj.setTitle("LookFeel");
        obj.setSize(600,400);
        obj.setVisible(true);
    }
        
}       
        
}
    

