import javax.swing.*;
import java.awt.*;
import javax.swing.border.*;
import java.awt.event.*;
public class ButtonDemo1 extends JFrame implements ActionListener
{   
    JButton b;
    JLabel lb;
    
    ButtonDemo1()
    { 
        Container c=this.getContentPane();
        c.setLayout(new FlowLayout());
        
        ImageIcon ic=new ImageIcon("spider.gif");
        
        b=new JButton("Click",ic);
        
        b.setBackground(Color.yellow);
        b.setForeground(Color.red);
        
        
        b.setFont(new Font("Arial",Font.BOLD,20));
        
        Border bd=BorderFactory.createBevelBorder(BevelBorder.RAISED);
        b.setBorder(bd);
        
        b.setToolTipText("This is a button ");
        
        b.setMnemonic('c');
        c.add(b);
        lb=new JLabel();
        c.add(lb);
        
        b.addActionListener(this);
        
    }
    public void actionPerformed(ActionEvent e)
    {   
        String s=e.getActionCommand();
        //if(s.equals("Click me"))
        //{    
          ImageIcon ic=new ImageIcon("spider.gif");
          lb.setIcon(ic);
         //}
    }    
    
    public static void main(String args[])
    {
        ButtonDemo1 obj=new ButtonDemo1();
        obj.setTitle("BUTTON");
        obj.setSize(400,400);
        obj.setVisible(true);
    }
 
}