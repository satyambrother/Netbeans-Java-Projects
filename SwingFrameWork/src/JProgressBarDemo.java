import java.awt.*;
import javax.swing.*;

public class JProgressBarDemo extends JFrame
{
     JProgressBar bar;
     JProgressBarDemo()
     {
         Container c=this.getContentPane();
         c.setLayout(new FlowLayout());
         
         bar=new JProgressBar(0,2000);
         bar.setForeground(Color.red);
         bar.setStringPainted(true);
         c.add(bar);
      }
void increase()
{
    for(int i=0;i<2000;i+=10)
    {
        bar.setValue(i);
        try{
            Thread.sleep(20);}
        catch(Exception e){}
        }
    }
public static void main(String args[])
    {
        JProgressBarDemo obj=new JProgressBarDemo();
        obj.setTitle("progress bar");
        obj.setSize(400,400);
        obj.setVisible(true);
    }
}


