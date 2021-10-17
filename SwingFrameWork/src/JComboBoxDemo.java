import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class JComboBoxDemo extends JFrame implements ItemListener
{   
    
    JComboBox box;
    JLabel lbl;
    JComboBoxDemo()
    {
        Container c=this.getContentPane();
        c.setLayout(null);
        
        box=new JComboBox();
        box.addItem("india");
        box.addItem("america");
        box.addItem("germeny");
        box.addItem("japan");
        box.addItem("France");
        
        box.setBounds(100,50,100,40);
        
        c.add(box);
        lbl=new JLabel();
        lbl.setBounds(100,200,200,40);
        
        c.add(lbl);
        
        box.addItemListener(this);
    }
    public void itemStateChanged(ItemEvent e)
    {
        String str=(String)box.getSelectedItem();
        lbl.setText("you selected  "+str);
    }
    public static void main(String args[])
    {
        JComboBoxDemo obj=new JComboBoxDemo();
        obj.setTitle("JTree");
        obj.setSize(400,400);
        obj.setVisible(true);
    }
    
}
