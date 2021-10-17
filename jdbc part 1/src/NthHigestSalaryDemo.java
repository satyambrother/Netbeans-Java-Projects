import java.util.*;
import java.sql.*;
public class NthHigestSalaryDemo{
    
    public static void main(String[] args) throws Exception 
    {
        Class.forName("oracle.jdbc.OracleDriver");
        Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","satyam1998");
        Statement st=con.createStatement();
        Scanner sc=new Scanner(System.in);
        System.out.println("enter number");
        int n=sc.nextInt();
        String sql_query="select * from(select eno,ename, esalary,eaddress rank() over (order by esalary desc) ranking from employee) where ranking="+n;
        ResultSet rs=st.executeQuery(sql_query);
        while(rs.next())
        { System.out.println(rs.getInt(1)+"\t"+rs.getString(2)+"\t"+rs.getDouble(3)+"\t"+rs.getString(4));
         }
        
        con.close();
    }
}
