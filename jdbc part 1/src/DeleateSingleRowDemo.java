
import java.sql.*;
public class DeleateSingleRowDemo {

  
    public static void main(String[] args) throws Exception 
    {
        String sql_query="delete employee1 where address='gzp'";
         
        Class.forName("oracle.jdbc.OracleDriver");
        Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","1998");
        Statement st=con.createStatement();
        st.executeUpdate(sql_query);
       
        { System.out.println("row delete successfully");  
        
        }
        con.close();
    }
}


