
public class AnonymousArray
{
    public static void main(String args[])
    {
        System.out.println(sum(new int[] {10,20,30,40}));
    }
    public static int sum(int[] x)
    {
        int total=0;
        for(int x1:x)
        {
            total=total+x1;
        }
        return total;
    }
}
