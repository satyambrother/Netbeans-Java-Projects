
public class MyThread7 extends Thread
{
     public void start()
    {  super.start();
       System.out.println("start method");
    }
    public void run() 
    {
      System.out.println("run method");
    }
}
class ThreadDemo7
{
   public static void main(String[] args)
  {
     MyThread7 t=new MyThread7();
     t.start();
     System.out.println("main method");
}
}