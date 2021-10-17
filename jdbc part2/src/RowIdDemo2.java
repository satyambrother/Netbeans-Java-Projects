import java.sql.*;
public class RowIdDemo2
{
    public static void main(String args[]) throws Exception
    {
        Connection con=DriverManager.getConnection("jdbc:oracle:thin:system/1998@localhost:1521:XE");
       
        String sql_query="select * from employee1 where rowid='AAAFYwAABAAALMJAAC'";
        Statement st=con.createStatement();
        ResultSet rs=st.executeQuery(sql_query);
        while(rs.next())
        {
            System.out.println(rs.getInt(1)+"\t"+rs.getString(2)+"\t"+rs.getDouble(3)+"\t"+rs.getString(4));
        }
        con.close();
    }
    
}
