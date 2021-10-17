import javax.swing.*;
import java.awt.*;

public class DisplayTextOnFrame extends JFrame
{
    DisplayTextOnFrame()
    {
        Container c=this.getContentPane();
        c.setLayout(new FlowLayout());
        c.setBackground(Color.yellow);
        JLabel lb=new JLabel("AAM AADMI PARTY");
        lb.setFont(new Font("Helvetica",Font.BOLD,20));
        lb.setForeground(Color.red);
        c.add(lb);
    }
    public static void main(String args[])
    {
        DisplayTextOnFrame obj=new DisplayTextOnFrame();
        obj.setTitle("Text Display");
        obj.setSize(400, 400);
        obj.setVisible(true);
        //obj.getDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
}
