import javax.swing.*;
import java.awt.*;
import javax.swing.border.*;

public class ButtonDemo extends JFrame
{   
    JButton b;
    
    ButtonDemo()
    { 
        Container c=this.getContentPane();
        c.setLayout(new FlowLayout());
        
        ImageIcon ic=new ImageIcon("spider.gif");
        
        b=new JButton("Click me",ic);
        
        b.setBackground(Color.yellow);
        b.setForeground(Color.red);
        
        
        b.setFont(new Font("Arial",Font.BOLD,20));
        
        Border bd=BorderFactory.createBevelBorder(BevelBorder.RAISED);
        b.setBorder(bd);
        
        b.setToolTipText("This is a button ");
        
        b.setMnemonic('c');
        
        c.add(b);
        
    }
    public static void main(String args[])
    {
        ButtonDemo obj=new ButtonDemo();
        obj.setTitle("BUTTON");
        obj.setSize(400,400);
        obj.setVisible(true);
    }
}    