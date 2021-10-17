import javax.swing.*;
import java.awt.*;
public class JTabbedPaneDemo extends JFrame
{
    JTabbedPaneDemo()
    {
        Container c=this.getContentPane();
        
        JTabbedPane jtp=new JTabbedPane();
        jtp.addTab("Capital",new CapitalPanel());
        jtp.addTab("State",new StatePanel());
        
        add(jtp);
    }
    
    public static void main(String args[])
    {
        JTabbedPaneDemo obj=new JTabbedPaneDemo();
        obj.setTitle("JTabbed pane");
        obj.setSize(400,400);
        obj.setVisible(true);
    }
    
}
class CapitalPanel extends JPanel
{
    CapitalPanel()
    {
        JButton jb1=new JButton("lucnow");
        JButton jb2=new JButton("patana");
        JButton jb3=new JButton("bhopal");
        
        add(jb1);
        add(jb2);
        add(jb3);
     }
}
class StatePanel extends JPanel
{
    StatePanel()
    {
        JCheckBox cb1=new JCheckBox("uttar pradesh");
        JCheckBox cb2=new JCheckBox("bihar");
        JCheckBox cb3=new JCheckBox("madhya pradesh");
        
        add(cb1);
        add(cb2);
        add(cb3);
        
    }
}