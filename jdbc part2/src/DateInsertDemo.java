import java.sql.*;
import java.util.*;
import java.text.*;
public class DateInsertDemo
{
    public static void main(String args[]) throws Exception
    {
        Class.forName("oracle.jdbc.OracleDriver");
        Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","system","satyam1998");
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter user name: ");
        String uname=sc.next();
        System.out.print("Enter date of propasal(dd-mm-yy): ");
        String dop=sc.next();
        SimpleDateFormat sdf=new SimpleDateFormat("dd-MM-yyyy");
        java.util.Date udate=sdf.parse(dop);
        
        long l =udate.getTime();
        java.sql.Date sdate=new java.sql.Date(l);
        
        String sql_query="insert into users1 values(?,?)";
        PreparedStatement pst=con.prepareStatement(sql_query);
        pst.setString(1,uname);
        pst.setDate(2, sdate);
        
        int rc=pst.executeUpdate();
        if(rc==0)
        {
            System.out.println("Record not inserted");
        }    
        else
        {
            System.out.println("record inserted");
        }
        con.close();
    }        
    
}
