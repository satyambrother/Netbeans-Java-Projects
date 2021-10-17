import java.util.*;
public class SqlQueryWithDynamicInput1
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
        
        String sql_query="insert into employee values("+eno+",'"+ename+"',"+esalary+","+eaddress+")";
        System.out.println("Hello query with dynamic input is:");
        System.out.println(sql_query
        );
    }
    
}
