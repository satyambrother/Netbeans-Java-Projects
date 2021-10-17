import java.sql.*;
public class Type1DriverDemo
{ public static void main(String args[]) throws Exception
  {
    Class.forName("Sun.jdbc.odbc.JdbcOdbcDriver");
    Connection con=DriverManager.getConnection("jdbc:odbc:demodsn","system","1998");
    Statement st=con.createStatement();
    ResultSet rs=st.executeQuery("select * from EMP");
    while(rs.next())
    { 
        System.out.println(rs.getInt(1)+" "+rs.getString(2));
  }
   con.close();
}}
