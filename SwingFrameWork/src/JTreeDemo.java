import java.awt.*;
import javax.swing.*;
import javax.swing.event.*;
import javax.swing.tree.*;

public class JTreeDemo extends JFrame implements TreeSelectionListener
{   
    DefaultMutableTreeNode root,dir1,dir2,file1,file2,file3;
    JTree tree;
    Container c;
    String msg="";
    JTextArea ta;
    
    JTreeDemo()
    {
         c=this.getContentPane();
         c.setLayout(new BorderLayout());
         
         root=new DefaultMutableTreeNode("D:\\");
         
         dir1=new DefaultMutableTreeNode("Java program");
         dir2 =new DefaultMutableTreeNode("Other program");
         file1=new DefaultMutableTreeNode("JButton.java");
         file2=new DefaultMutableTreeNode("satyam.java");
         file3=new DefaultMutableTreeNode("abc.c");
         
         root.add(dir1);
         
         dir1.add(file1);
         dir1.add(file2);
         dir1.add(dir2);
         
         dir2.add(file3);
         
         tree=new JTree(root);
         c.add("North",tree);
         
         ta=new JTextArea();
         c.add("South",ta);
         
         tree.addTreeSelectionListener(this);
    }

public void valueChanged(TreeSelectionEvent tse)
{
    TreePath tp=tse.getNewLeadSelectionPath();
    msg +="\n path of selected component ="+ tp;
    
    Object comp=tp.getLastPathComponent();
    msg +="\n component selected ="+ comp;
    
    int n=tp.getPathCount();
    msg +="\n Level of component ="+n;
    
    ta.setText(msg);
    msg="";
}

 public static void main(String args[])
    {
        JTreeDemo obj=new JTreeDemo();
        obj.setTitle("JTree");
        obj.setSize(400,400);
        obj.setVisible(true);
    }
    
    

}

