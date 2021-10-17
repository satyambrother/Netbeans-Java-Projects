import java.util.*;
import java.sql.*;

public class PraparedStatementDeleteDemo 
{
    public static void main(String args[]) throws Exception
    {
        String sql_query="delete  employee where eno = ?";
        Class.forName("oracle.jdbc.OracleDriver");
        Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","satyam1998");
        
        PreparedStatement pst=con.prepareStatement(sql_query);
        Scanner sc=new Scanner(System.in);
        while(true)
        {
            System.out.print("Enter employee eno which you want to remove: ");
            int eno=sc.nextInt();
            pst.setInt(1, eno);
            pst.executeUpdate();
            System.out.print("if you want to delete more record type [yes] other wise [no]  ");
            String option=sc.next();
            if(option.equalsIgnoreCase("no"))
            {
                break;
            }
            
        }
        con.close();
    }
    
}
