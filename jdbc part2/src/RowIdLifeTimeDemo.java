import java.sql.*;
public class RowIdLifeTimeDemo
{
    public static void main(String args[]) throws Exception
    {   
       //Connection con=DriverManager.getConnection("jdbc:mysql:///durgadb?user="system&possword=satyam1998");

        
        Connection con=DriverManager.getConnection("jdbc:oracle:thin:system/1998@localhost:1521:XE");
        DatabaseMetaData dbmd=con.getMetaData();
        System.out.println(dbmd.getRowIdLifetime());
        System.out.println(dbmd.getMaxConnections());
        con.close();
    }
}