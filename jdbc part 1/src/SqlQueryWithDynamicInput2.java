import java.util.*;
public class SqlQueryWithDynamicInput2
{  
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("please enter employee number ");
        int eno=sc.nextInt();
        
        System.out.println("please enter employee name ");
        String ename=sc.next();
        
        System.out.println("please enter employee salary ");
        Double esalary=sc.nextDouble();
        
        System.out.println("please enter employee address ");
        String eaddress=sc.next();
        
        String sql_query=String.format("insert into employee values(%d,'%s',%f,'%s')",eno,ename,esalary,eaddress);
        System.out.println("Hello query with dynamic input is:");
        System.out.println(sql_query
        );
    }
    
}

