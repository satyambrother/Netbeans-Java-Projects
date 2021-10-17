import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class JColorChooserDemo extends JFrame implements ActionListener
{
    JButton b;
    Container c;
    JColorChooserDemo()
    {
        c=this.getContentPane();
        c.setLayout(new FlowLayout());
        
        b=new JButton("Select a color");
        c.add(b);
        
        b.addActionListener(this);
    }
    public void actionPerformed(ActionEvent e)
    {
        Color selectedcolor=null;
        
        Color color=JColorChooser.showDialog(this,"select a color",selectedcolor);
        if(color != null)
        {
            selectedcolor=color;
        }
        c.setBackground(color);
        
    }
    public static void main(String args[])
    {
        JColorChooserDemo obj=new JColorChooserDemo();
        obj.setTitle("toggle button");
        obj.setSize(400,400);
        obj.setVisible(true);
    }


}
