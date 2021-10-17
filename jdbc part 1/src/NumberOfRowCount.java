
import java.sql.*;
public class NumberOfRowCount{

  
    public static void main(String[] args) throws Exception 
    {
        Class.forName("oracle.jdbc.OracleDriver");
        Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","1998");
        Statement st=con.createStatement();
        ResultSet rs=st.executeQuery("select count(*) from users");
        if(rs.next())
        { System.out.println("Total row present in table is:"+(rs.getInt(1)));
         
        }
        con.close();
    }
}
