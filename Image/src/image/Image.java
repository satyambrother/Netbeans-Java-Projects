
package image;
import java.awt.*;
import java.awt.event.*;

import java.awt.Graphics;
import java.awt.Toolkit;


public class Image extends Frame{ 
  Image()
  { 
    img=Toolkit.getDefaultToolkit().getImage("sat.jpg");
   MediaTracker track=new MediaTracker(this);
   Track.addImage(img,0);
   try{
   track.waitForId(0);
   }catch(InterruptedException ie){}
   
   public void paint(Graphics g)
   {g.drawImage(img,50,50,null);
   }




}
    
    
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}
