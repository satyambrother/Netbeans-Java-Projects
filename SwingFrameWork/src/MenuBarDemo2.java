import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.io.*;
public class MenuBarDemo2 extends JFrame implements ActionListener
{   
    JMenuBar mb;
    JMenu file,edit,font;
    JMenuItem op,sa,cl,cp,pt,f1,f2;
    JCheckBoxMenuItem pr;
    
    
    MenuBarDemo2()
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
     if(op.isArmed()) this.openFile();
     if(sa.isArmed()) //this.saveFile();
     if(cl.isArmed()) System.out.println("close is selected");
     if(cp.isArmed()) System.out.println("copy is selected");
     if(pt.isArmed()) System.out.println("Past is selected");
     
     if(pr.getModel().isSelected()) System.out.println("Printing on");
     else System.out.println("printing off");
     
     if(f1.isArmed()) System.out.println("Arial Font is selected");
     if(f2.isArmed()) System.out.println("Times new Roman is selected");
 }
          
    void openFile()
    {
        JFileChooser fc=new JFileChooser();
        int i=fc.showOpenDialog(this);
        
        if(i==JFileChooser.APPROVE_OPTION){
            File f=fc.getSelectedFile();
            
            String fname=f.getPath();
            OpenFrame of=new OpenFrame(fname);
            of.setSize(500,400);
            of.setVisible(true);
        }
    }
     public static void main(String args[])
    {
        MenuBarDemo2 obj=new MenuBarDemo2();
        obj.setTitle("JTree");
        obj.setSize(400,400);
        obj.setVisible(true);
    }
}
class OpenFrame extends JFrame
{
        OpenFrame(String fname)
        {
            Container c=this.getContentPane();
            c.setLayout(new FlowLayout());
            
            JTextArea ta= new JTextArea(22,60);
            c.add(ta);
            
            String str1="";
            String str2="";
            try{
                BufferedReader br=new BufferedReader(new FileReader(fname));
                while((str1 = br.readLine()) != null)
                    str2+=str1+"\n";
                    ta.setText(str2);
                    br.close();
            }
            catch(Exception e){}
                    
        }
    }
        
 

