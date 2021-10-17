class Display
{
    public synchronized void wish(String name)
    {
      for(int i=0;i<5;i++)
      {
      System.out.print("good morning:");
      try
      {
       Thread.sleep(1000);
       }
      catch (InterruptedException e)
      {}
      System.out.println(name);
      }
    }
}
class MyThreadSynchronized extends Thread
{
    Display d;
    String name;
    MyThreadSynchronized(Display d,String name)
    {
      this.d=d;
      this.name=name;
    }
   public void run()
   { 
     d.wish(name);
    }
}
class SynchronizedDemo
{
    public static void main(String[] args)
   {
    Display d1=new Display();
    MyThreadSynchronized t1=new MyThreadSynchronized(d1,"dhoni");
    MyThreadSynchronized t2=new MyThreadSynchronized(d1,"yuvaraj");
    t1.start();
    t2.start();
   }
}