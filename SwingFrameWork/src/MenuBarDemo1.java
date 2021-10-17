import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
public class MenuBarDemo1 extends JFrame implements ActionListener
{   
    JMenuBar mb;
    JMenu file,edit,font;
    JMenuItem op,sa,cl,cp,pt,f1,f2;
    JCheckBoxMenuItem pr;
    
    
    MenuBarDemo1()
    {
        Container c=this.getContentPane();
        c.setLayout(new BorderLayout());
        
        mb=new JMenuBar();
        c.add("North",mb);
        
        file=new JMenu("File");
        edit=new JMenu("Edit");
        mb.add(file);
        mb.add(edit);
        
        op=new JMenuItem("open");
        sa=new JMenuItem("Save");
        cl=new JMenuItem("Close");
        cp=new JMenuItem("Copy");
        pt=new JMenuItem("Past");
        
        file.add(op);
        file.add(sa);
        file.add(cl);
        edit.add(cp);
        edit.add(pt);
  
        cl.setEnabled(false);
        
        pr=new JCheckBoxMenuItem("Print");
        file.add(pr);
        
        file.addSeparator();
        
        font=new JMenu("Font");
        file.add(font);
        
        f1=new JMenuItem("Arial");
        f2=new JMenuItem("Times New Roman");
        
        font.add(f1);
        font.add(f2);
        
        op.addActionListener(this);
        sa.addActionListener(this);
        cl.addActionListener(this);
        cp.addActionListener(this);
        pt.addActionListener(this);
        pr.addActionListener(this);
        f1.addActionListener(this);
        f2.addActionListener(this);
        
    }
 public void actionPerformed(ActionEvent e)
 {
     if(op.isArmed()) System.out.println("Open is selected");
     if(sa.isArmed()) System.out.println("save is selected");
     if(cl.isArmed()) System.out.println("close is selected");
     if(cp.isArmed()) System.out.println("copy is selected");
     if(pt.isArmed()) System.out.println("Past is selected");
     
     if(pr.getModel().isSelected()) System.out.println("Printing on");
     else System.out.println("printing off");
     
     if(f1.isArmed()) System.out.println("Arial Font is selected");
     if(f2.isArmed()) System.out.println("Times new Roman is selected");
 }
     public static void main(String args[])
    {
        MenuBarDemo1 obj=new MenuBarDemo1();
        obj.setTitle("JCombo list");
        obj.setSize(400,400);
        obj.setVisible(true);
    }
             
            
    
}
