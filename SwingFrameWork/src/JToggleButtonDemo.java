import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class JToggleButtonDemo extends JFrame implements ActionListener
{
    JToggleButton but;
    ImageIcon img1;
    
    JToggleButtonDemo()
    {
            Container c=this.getContentPane();
            c.setLayout(new FlowLayout());
            
            img1=new ImageIcon("spider.gif");
            but=new JToggleButton("Start/Stop",img1);
            
            c.add(but);
            but.addActionListener(this);
    }
    public void actionPerformed(ActionEvent e)
    {
        ImageIcon img2 = new ImageIcon("satyam.jpg");
        if(but.isSelected())
        but.setIcon(img2);
        else but.setIcon(img1);
    }
    
    public static void main(String args[])
    {
        JToggleButtonDemo obj=new JToggleButtonDemo();
        obj.setTitle("toggle button");
        obj.setSize(400,400);
        obj.setVisible(true);
    }
}
