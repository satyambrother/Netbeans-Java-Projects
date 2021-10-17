import javafx.scene.paint.Color;
import javax.swing.*;
import java.awt.*;

public class FrameDemo
{
  public static void main(String args[])
  {
      JFrame jf=new JFrame();
      jf.setTitle("Frame");
      jf.setSize(400,400);
      Container c=jf.getContentPane();
      c.setBackground(java.awt.Color.RED);
      jf.setVisible(true);
  }
}
  
