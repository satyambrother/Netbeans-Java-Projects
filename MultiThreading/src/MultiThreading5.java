
public class MultiThreading5 extends Thread
{
    public void run()
    {
        System.out.println("no arg method");
    }
    
    public void run(int i)
    {
        System.out.println("one arg method");
    }
}

class Test
{
    public static void main(String args[])
    {
        MultiThreading5  t=new MultiThreading5();
        t.start();
               
    }
}
