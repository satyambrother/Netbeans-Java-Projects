
public class MyThread6 extends Thread
{
     public void start()
    { 
       System.out.println("start method");
    }
    public void run() 
    {
      System.out.println("run method");
    }
}
class ThreadDemo6
{
   public static void main(String[] args)
  {
     MyThread6 t=new MyThread6();
     t.start();
     System.out.println("main method");
}
}