import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class JSplitPaneDemo extends JFrame implements ActionListener
{   JButton jb;
    JTextArea ja;
    JSplitPane jsp;
    String str="my name is satyam I am proud to be INDIAN";
    
    JSplitPaneDemo()
    {
        Container c=this.getContentPane();
        c.setLayout(new BorderLayout());
        
        jb=new JButton("My Button");
        ja=new JTextArea();
        
        ja.setLineWrap(true);
        
        jsp=new JSplitPane(JSplitPane.HORIZONTAL_SPLIT,jb,ja);
        jsp.setDividerLocation(300);
        
        c.add("Center",jsp);
        jb.addActionListener(this);
    }
    
    public void actionPerformed(ActionEvent e)
    {
        ja.setText(str);
    }
     public static void main(String args[])
    {
        JSplitPaneDemo obj=new JSplitPaneDemo();
        obj.setTitle("JSplit pane");
        obj.setSize(400,400);
        obj.setVisible(true);
    }
    
    
}
