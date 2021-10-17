import java.util.*;
public class NewClass 
{
    public static void main(String args[])
    {
        Inventory[] inv = new Inventory[4];
        Inventory[] res = new Inventory[4];
        Scanner scan=new Scanner(System.in);
        for(int i=0;i<4;i++)
        {
            String id=scan.nextLine();
            int a=scan.nextInt(); scan.nextLine();
            int b=scan.nextInt(); scan.nextLine();
            int c=scan.nextInt(); scan.nextLine();
            
            inv[i]=new Inventory(id,a,b,c);
        }
        int limit = scan.nextInt();
        res=result(limit,inv);
        for(int j=0;j<4;j++)
        {
            if(inv[j].getStatus()!=null)
            {
                System.out.println(inv[j].getId() + " " + inv[j].getStatus());
            }
        }
    }
    public static Inventory[] result(int limit, Inventory[] inv)
    {
        for(int i=0;i<4;i++)
        {
            if(inv[i].getC()<=limit)
            {
                if(inv[i].getC()<75)
                {
                    inv[i].setStatus("Critical");
                }
                else if(inv[i].getC()<49 && inv[i].getC()>74)
                {
                    inv[i].setStatus("Moderate");
                }
                else
                {
                    inv[i].setStatus("Non-Critical");
                }
            }
        }
        return inv;
    }
}
class Inventory
{
    Inventory(String id,int a,int b,int c)
    {
        this.id=id;
        this.a=a;
        this.b=b;
        this.c=c;
                
    }        
    private String id,status;
    private int a,b,c;
    public void setId(String id)
    {
        this.id=id;
    }
    public void setStatus(String status)
    {
        this.status=status;
    }
    public void setA(int a)
    {
        this.a=a;
    }
    public void setB(int b)
    {
        this.b=b;
    }
    public void setC(int c)
    {
        this.c=c;
    }
    public String getId()
    {
        return id;
    }
    public String getStatus()
    {
        return status;
    }
    public int getA()
    {
        return a;
    }
    public int getB()
    {
        return b;
    }
     public int getC()
    {
        return c;
    }
}


