import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class CheckRadioDemo extends JFrame implements ActionListener
{
    JCheckBox cb1,cb2;
    JRadioButton rb1,rb2;
    JTextArea ta;
    ButtonGroup bg;
    String msg="";
    
    CheckRadioDemo()
    {
        Container c=this.getContentPane();
        c.setLayout(new FlowLayout());
        
        cb1=new JCheckBox("JAVA",true);
        cb2=new JCheckBox("PYTHON");
        
        ta=new JTextArea(10,20);
        
        rb1=new JRadioButton("MALE",false);
        rb2=new JRadioButton("FEMALE");
        
        bg=new ButtonGroup();
        bg.add(rb1);
        bg.add(rb2);
        
        c.add(cb1);
        c.add(cb2);
        c.add(rb1);
        c.add(rb2);
        c.add(ta);
        
        cb1.addActionListener(this);
        cb2.addActionListener(this);
        rb1.addActionListener(this);
        rb2.addActionListener(this);
       
    }   
 public void actionPerformed(ActionEvent e)
 {
     if(cb1.getModel().isSelected()) msg+="\nJAVA";
     if(cb2.getModel().isSelected()) msg+="\nPYTHON";
     if(rb1.getModel().isSelected()) msg+="\nMALE";
     else msg+="\nFEMALE";
     
     ta.setText(msg);
     msg="";
    }
         
    public static void main(String args[])
    {
        CheckRadioDemo obj=new CheckRadioDemo();
        obj.setTitle("CheckRadio");
        obj.setSize(600,400);
        obj.setVisible(true);
    }
        
        
        
}
    

