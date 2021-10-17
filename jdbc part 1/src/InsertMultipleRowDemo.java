import java.sql.*;
import java.util.*;
public class InsertMultipleRowDemo
{ public static void main(String args[]) throws Exception
  {
    String username="system";
    String pwd="1998";
    
        Class.forName("oracle.jdbc.OracleDriver");
        Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE",username,pwd);
        System.out.println("connect");
        Statement st=con.createStatement();
        Scanner sc=new Scanner(System.in);
        while(true)
        {
             
        System.out.println("please enter employee number ");
        int no=sc.nextInt();
        
        System.out.println("please enter employee name ");
        String name=sc.next();
        
        System.out.println("please enter employee salary ");
        Double salary=sc.nextDouble();
        
        System.out.println("please enter employee address ");
        String address=sc.next();
        
        String sql_query=String.format("insert into employee1 values(%d,'%s',%f,'%s')",no,name,salary,address);
        st.executeUpdate(sql_query);
        System.out.println("data inserted successfully");
        System.out.println("if you want to insert more record[yes/no] ");
        String option=sc.next();
        if(option.equalsIgnoreCase("no"))
        { break; }
        }    
     
    
}      
    
}
