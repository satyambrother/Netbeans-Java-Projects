import java.sql.*;
import java.io.*;
import java.util.*;

public class ResultSetDemo5
{
    public static void main (String args[]) throws Exception
    { 
        Connection con =DriverManager.getConnection("jdbc:oracle:thin:system/satyam1998@localhost:1521:XE");
        Statement st=con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE);
        ResultSet rs=st.executeQuery("select * from employee");
        rs.last();
        rs.deleteRow();
        con.close();
                
    }
}    