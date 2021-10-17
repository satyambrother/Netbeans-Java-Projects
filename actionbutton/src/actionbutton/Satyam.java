
package actionbutton;
import java.sql.*;
public class Satyam {

  
    public static void main(String[] args) throws Exception 
    {
        Class.forName("oracle.jdbc.OracleDriver");
        Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","satyam1998");
        Statement st=con.createStatement();
        ResultSet rs=st.executeQuery("select * from EMPLOYEE");
        while(rs.next())
        { System.out.println(rs.getInt(1)+".."+rs.getString(2));  
        
        }
        con.close();
    }
}

