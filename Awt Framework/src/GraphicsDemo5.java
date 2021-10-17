import java.awt.*;
import java.awt.event.*;
 
class Smile extends Frame
{
    Smile()
      {  
        setSize(500,600);
        setBackground(Color.yellow);
        setForeground(Color.black);
        setLayout(null);
        setTitle("Smile");
        setVisible(true);
        setLayout(null); 
         
        this.addWindowListener(new WindowAdapter(){
        public void windowClosing(WindowEvent e){
         System.exit(0);}
        });
      }
     
    public void paint(Graphics g)
    {
       g.setColor(Color.red);
       g.drawRect(50,50,400,400);
       g.setColor(Color.pink);
       g.fillRect(50,50,400,400);
       g.setColor(Color.yellow);
       g.fillOval(175,150,150,150);
       g.setColor(Color.black);
       g.fillOval(215, 175, 25, 25);
       g.fillOval(260, 175, 25, 25);
       g.drawLine(250,175,250,225);
       g.setColor(Color.red);
       g.fillArc(200,225,100,40,0,-180);
       Font f=new Font("Arial",Font.BOLD+Font.ITALIC,50);
       g.setFont(f);
       
       g.drawString("satyam singh",100,350);
    
    }
    public static void main(String[] args)
    {
        Smile s=new Smile();
    }
    
}
