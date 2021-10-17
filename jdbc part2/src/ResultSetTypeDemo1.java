import java.sql.*;

public class ResultSetTypeDemo1
{
    public static void main (String args[]) throws Exception
    { 
        Connection con =DriverManager.getConnection("jdbc:oracle:thin:system/1998@localhost:1521:XE");
        Statement st=con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE);
        ResultSet rs=st.executeQuery("select * from employee1");
        System.out.println("data In forword Direction");
        System.out.println("ENO \t ENAME \t ESALARY \t EADDRESS");
        while(rs.next())
        {
            System.out.println(rs.getInt(1)+"\t"+rs.getString(2)+"\t"+rs.getDouble(3)+rs.getString(4));
        }
        System.out.println("Data in backword Direction");
        System.out.println("ENO \t ENAME \t ESALARY \t EADDRESS");
         while(rs.previous())
        {
            System.out.println(rs.getInt(1)+"\t"+rs.getString(2)+"\t"+rs.getDouble(3)+rs.getString(4));
        }

        con.close();
    }
    
}
