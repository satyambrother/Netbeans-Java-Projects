
import java.sql.*;
public class SelectMaxMinDemo{

  
    public static void main(String[] args) throws Exception 
    {
        Class.forName("oracle.jdbc.OracleDriver");
        Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","1998");
        Statement st=con.createStatement();
        ResultSet rs=st.executeQuery("select max(esalary),min(esalary) from EMPLOYEE");
        while(rs.next())
        { System.out.println("maximam salary is"+rs.getInt(1)+"\n"+"minimam salary is"+rs.getInt(2));
         
        }
        con.close();
    }
}
