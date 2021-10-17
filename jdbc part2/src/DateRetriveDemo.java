import java.sql.*;
import java.util.*;
import java.text.*;
public class DateRetriveDemo
{
    public static void main(String args[]) throws Exception
    {
        Class.forName("oracle.jdbc.OracleDriver");
        Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","system","satyam1998");
        String sql_query="select * from users1";
        PreparedStatement pst=con.prepareStatement(sql_query);
        ResultSet rs=pst.executeQuery();
        SimpleDateFormat sdf=new SimpleDateFormat("dd-MM-yyyy");
        while(rs.next())
        {
            String uname=rs.getString(1);
            java.sql.Date sdate=rs.getDate(2);
            String dop=sdf.format(sdate);
            System.out.println("Name of the user is: "+uname);
            System.out.println("Date of propasal is: "+dop);
        }
    con.close();
    }
}    