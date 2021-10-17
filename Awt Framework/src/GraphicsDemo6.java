import java.awt.*;
import java.awt.event.*;
import java.awt.Graphics;
import java.awt.Toolkit;

 class Images extends Frame
 { 
     static Image img;
     Images()
     { 
       img=Toolkit.getDefaultToolkit().getImage("satyam.jpg");
       MediaTracker track=new MediaTracker(this);
       track.addImage(img,0);
       try
       {
         track.waitForID(0); }
     
       catch(InterruptedException ie){}
       addWindowListener(new WindowAdapter(){ public void windowClosing(WindowEvent e){ System.exit(0);}});
     }
   public void paint(Graphics g)
   {g.drawImage(img,50,50,null); } 

public static void main(String[] args)
{
     Images i=new Images();
     i.setSize(500,500);
     i.setTitle("my image");
     i.setIconImage(img);
     i.setVisible(true);
    
}
    
}
