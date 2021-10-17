
import java.sql.*;
public class SelectAllRowDemo{

  
    public static void main(String[] args) throws Exception 
    {
        Class.forName("oracle.jdbc.OracleDriver");
        Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","1998");
        Statement st=con.createStatement();
        ResultSet rs=st.executeQuery("select * from EMPLOYEE");
        while(rs.next())
        { System.out.println(rs.getInt(1)+".."+rs.getString(2)+".."+rs.getInt(3)+".."+rs.getString(4));  
        
        }
        con.close();
    }
}

