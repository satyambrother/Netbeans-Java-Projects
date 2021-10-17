import java.awt.*;
import java.awt.event.*;

public class GraphicsDemo7 extends Frame  implements ActionListener,ItemListener,AdjustmentListener
{ 
  Button b1,b2,b3,b4;
  Checkbox c1,c2,c3;
  Choice ch;
  Scrollbar sc;
  String s="";
  
  GraphicsDemo7()
  {  
      setLayout(null);
      b1=new Button("yellow");
      b2=new Button("red");
      b3=new Button("pink");
      b4=new Button("next");
      ch=new Choice();
      
      b1.setBounds(100,100,50,20);
      b2.setBounds(250,100,50,20);
      b3.setBounds(350,100,50,20);
      b4.setBounds(50,100,50,20);
      ch.setBounds(100,550,90,30);

      sc=new Scrollbar(Scrollbar.VERTICAL,0,50,0,700);
      sc.setBounds(450, 0, 30, 700);
      
      c1=new Checkbox("Bold",true);
      c2=new Checkbox("Italic");
      c3=new Checkbox("Underline");
      
      c1.setBounds(100, 350,50, 20);
      c2.setBounds(250, 350,50, 20);
      c3.setBounds(350, 350,50, 20);
      
            
      setSize(500,1000);
      setVisible(true);
       
      add(b1);
      add(b2);
      add(b3);
      add(b4);
      add(c1);
      add(c2);
      add(c3);
      ch.add("satyam");
      ch.add("shivam");
      ch.add("sundram");
      ch.add("dhan ji");
      ch.add("virat");
      ch.add("shubh ji");
      add(ch);
      add(sc);
      addWindowListener(new WindowAdapter(){ public void windowClosing(WindowEvent e){ System.exit(0);}});
       
      b1.addActionListener(this);
      b2.addActionListener(this); //link java button with action listener
      b3.addActionListener(this);
      b4.addActionListener(this);
       
      sc.addAdjustmentListener(this);
       
      c1.addItemListener(this);
      c2.addItemListener(this);  // link checkbox with itemListener
      c3.addItemListener(this);
      ch.addItemListener(this);
       
  }
     
public void actionPerformed(ActionEvent e)
{
   String s=e.getActionCommand();
   if(s.equals("yellow"))
   {setBackground(Color.yellow);}
   if(s.equals("red"))
   {setBackground(Color.red);}
   if(s.equals("pink"))
   {setBackground(Color.pink);}
   if(s.equals("next")) 
   { Mix m=new Mix();}
}
  
public void itemStateChanged(ItemEvent e)
{ 
    repaint();
} 
  
public void paint(Graphics g)
{
    g.drawString("CURRENT STATE: ", 50, 400);
    s="Bold:"+c1.getState();
    g.drawString(s, 50, 420);
    g.drawString("italic "+c2.getState(), 50, 440);
    g.drawString("underline"+c3.getState(), 50, 460);
    
    g.drawString("select language", 50, 600);
    g.drawString(ch.getSelectedItem(), 50, 650);
    
    g.drawString("scroll bar ",100,250);
    s+=sc.getValue();
    g.drawString(s,100,275); 
    s="";
 }
public void adjustmentValueChanged(AdjustmentEvent ae)
{  repaint(); }
//public void paint(Graphics g)
//{ g.drawString("scroll bar ",100,250);
//  g.drawString(sc.getValue(),100,275); }
//  public static void main(String[] args) {
//  Demo ac=new Demo();
//}
}
class Mix extends Frame implements ActionListener
{   Button b;
    Mix()
    { 
        setSize(500,400);
        setLayout(null);
        setVisible(true);
        b=new Button("close");
        b.setBounds(100,300,90,50);
        b.addActionListener(this);
        addWindowListener(new WindowAdapter(){ public void windowClosing(WindowEvent e){ System.exit(0);}});
        add(b);
    }   
    
public void actionPerformed(ActionEvent e)
{
    //String s=e.getActionCommand();
    //if(s.equals("close"))
    //{ this.dipose(); }
    this.dispose();
        }
}
class test 
{  public static void main(String args[])
  { GraphicsDemo7 d=new GraphicsDemo7();
    //Mix m=new Mix();
  }

}
