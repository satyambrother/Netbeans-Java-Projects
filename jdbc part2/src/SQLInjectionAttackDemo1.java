import java.util.*;
import java.sql.*;
public class SQLInjectionAttackDemo1
{
    public static void main(String args[]) throws Exception
    {
      
        Class.forName("oracle.jdbc.OracleDriver");
        Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","1998");
        Statement st=con.createStatement();
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter username ");
        String username=sc.next();
        System.out.print("Enter possword ");
        String pwd=sc.next();
        String sql_query="select count(*) from users where username='"+username+"' and pwd='"+pwd+"' ";
        ResultSet rs=st.executeQuery(sql_query);
        int c=0;
       // System.out.println(rs.getInt(1));
        if(rs.next())
        {  
            c=rs.getInt(1);
            System.out.println(c);
        }
        
        if(c==0)
        {
            System.out.println("Invalid Credential");
        }   
        else
        {
             System.out.println("Valid Credential");
        }    
        con.close();
    }
    
    
}
