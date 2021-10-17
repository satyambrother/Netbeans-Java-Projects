import java.awt.*;
import java.awt.event.*;

class MyRadio extends Frame implements ItemListener
{  
    String msg="";
    CheckboxGroup cbg;
    
    MyRadio()
    { 
      setLayout(new FlowLayout());
      Checkbox y,n;
       cbg=new CheckboxGroup();
      y=new Checkbox("yes",cbg,true);
      n=new Checkbox("no",cbg,false);
      
      y.addItemListener(this);
      n.addItemListener(this);
    
      addWindowListener(new WindowAdapter(){ public void windowClosing(WindowEvent e){ System.exit(0);}});
      add(y);
      add(n);
    }
    public void itemStateChanged(ItemEvent e)
    {
        repaint();
    }
    public void paint(Graphics g)
    {
        msg="CURRENT SELLECTION: ";
        msg+=cbg.getSelectedCheckbox().getLabel();
        g.drawString(msg,100, 100);
    }
    public static void main(String args[])
    {
        MyRadio mr=new MyRadio();
        mr.setTitle("MY Radio Button");
        mr.setSize(400, 400);
        mr.setVisible(true);
    }
    
}
