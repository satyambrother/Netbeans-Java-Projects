import java.sql.*;

public class ResultSetTypeDemo3
{
    public static void main (String args[]) throws Exception
    { 
        Connection con =DriverManager.getConnection("jdbc:oracle:thin:system/1998@localhost:1521:XE");
        Statement st=con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_UPDATABLE);
        ResultSet rs=st.executeQuery("select * from employee1");
        System.out.println("Data before updation");
        System.out.println("ENO \t ENAME \t ESALARY \t EADDRESS");
        System.out.println("...................................");
        while(rs.next())
        {
            System.out.println(rs.getInt(1)+"\t"+rs.getString(2)+"\t"+rs.getDouble(3)+rs.getString(4));
        }
        System.out.println("Application is pausing state ,Plese Update Database");
        System.in.read();
        rs.beforeFirst();
        System.out.println("Data After Updation");
        System.out.println("ENO \t ENAME \t ESALARY \t EADDRESS");
        System.out.println("...................................");
        while(rs.next())
        {
            rs.refreshRow();
            System.out.println(rs.getInt(1)+"\t"+rs.getString(2)+"\t"+rs.getDouble(3)+rs.getString(4));
        }
        con.close();
        
        
    }
}    
        