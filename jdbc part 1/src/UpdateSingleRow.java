
import java.sql.*;
public class UpdateSingleRow {

  
    public static void main(String[] args) throws Exception 
    {
        String sql_query="update  employee set eaddress='gzb' where eno=2";
         
        Class.forName("oracle.jdbc.OracleDriver");
        Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","satyam1998");
        Statement st=con.createStatement();
        st.executeUpdate(sql_query);
       
        { System.out.println("row update successfully");  
        
        }
        con.close();
    }
}


