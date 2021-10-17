import javax.swing.*;
import java.awt.*;
import javax.swing.event.*;
public class JListDemo extends JFrame implements ListSelectionListener
{   
    
    JList lst;
    JLabel lbl;
    Object arr[];
    String msg="";
    JListDemo()
    {
        Container c=this.getContentPane();
        c.setLayout(null);
        String item[]={"india","pakistan","china","nepal","bhutan","mayamar","bangladesh"};
        
        lst=new JList(item);
        lst.setBounds(100,50,100,40);
        c.add(lst);
        
        lbl=new JLabel();
        lbl.setBounds(100,200,200,40);
        c.add(lbl);
        
        lst.addListSelectionListener(this);
    }
    public void valueChanged(ListSelectionEvent e)
    {
        arr=lst.getSelectedValues();
        for(int i=0;i<arr.length;i++)
            msg+=(String)arr[i];
            lbl.setText("selecte: "+msg);
            msg="";
        
    }
    public static void main(String args[])
    {
        JListDemo obj=new JListDemo();
        obj.setTitle("JCombo list");
        obj.setSize(400,400);
        obj.setVisible(true);
    }
    
}
