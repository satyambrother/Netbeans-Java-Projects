import java.sql.*;
public class RowIdDemo1
{
    public static void main(String args[]) throws Exception
    {
        Connection con=DriverManager.getConnection("jdbc:oracle:thin:system/1998@localhost:1521:XE");
        System.out.println("connect");
        String sql_query="select rowid,no,name,salary,address from employee1";
        Statement st=con.createStatement();
        ResultSet rs=st.executeQuery(sql_query);
        while(rs.next())
        {
            RowId id=rs.getRowId(1);
            byte[] b=id.getBytes();
            String rowid=new String(b);
            System.out.println(rowid+"\t"+rs.getInt(2)+"\t"+rs.getString(3)+"\t"+rs.getDouble(4)+"\t"+rs.getString(5));
        }
        con.close();
    }
    
}
