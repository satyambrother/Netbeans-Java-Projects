import java.awt.*;
import java.awt.event.*;
class Demo extends Frame
{      
       Demo()
       {  
         setSize(500,600);
         setBackground(Color.yellow);
         setForeground(Color.black);
         setLayout(null);
         setTitle("graphics");
         setVisible(true);
    
         this.addWindowListener(new WindowAdapter(){
         public void windowClosing(WindowEvent e){
                 System.exit(0);
             }
         });
      }
      
    public void paint(Graphics g)
    {
       g.setColor(Color.green);
       g.drawRect(50,50,400,400);
       g.drawOval(90,70,80,80);
    }
         
       public static void main(String[] args)
       { Demo g=new Demo();
     
       }

   }
