import java.sql.*;

public class ResultSetTypeDemo2
{
    public static void main (String args[]) throws Exception
    { 
        Connection con =DriverManager.getConnection("jdbc:oracle:thin:system/1998@localhost:1521:XE");
        Statement st=con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE);
        ResultSet rs=st.executeQuery("select * from employee1");
        
            rs.afterLast();
            rs.previous();
            System.out.println(rs.getInt(1));
            rs.beforeFirst();
            rs.next();
            System.out.println(rs.getInt(1));
            rs.last();
            System.out.println(rs.getInt(1));
            rs.first();
            System.out.println(rs.getInt(1));
            rs.absolute(-3);
            System.out.println(rs.getInt(1));
            rs.absolute(3);
            System.out.println(rs.getInt(1));
            rs.first();
            rs.relative(2);
            System.out.println(rs.getInt(1));
            rs.last();
            rs.relative(-2);
            System.out.println(rs.getInt(1));
            con.close();
            
            
            
        
    }
}    