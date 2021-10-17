import java.sql.*;

public class Type2DriverDemo
{ 
    public static void main(String args[]) throws Exception
    {
        System.out.println("Type 2 Driver Demo");
        class.forName("oracle.jdbc.OracleDriver");
        Connection con=DriverManager.getConnection("jdbc:oracle:oci:@XE","system","1998");
        Statement st=con.createStatement();
        ResultSet rs=st.executeQuery("select*from EMP");
        while(rs.next())
        {
            System.out.println(rs.getInt(1)+" "+rs.getString(2));
            con.close();
        }
    }
    
}
