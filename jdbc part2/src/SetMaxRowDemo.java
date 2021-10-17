import java.sql.*;
public class SetMaxRowDemo
{ 
    public static void main(String args[]) throws Exception
    {
        Connection con=DriverManager.getConnection("jdbc:oracle:thin:system/satyam1998@localhost:1521:XE");
        Statement st=con.createStatement();
        st.setMaxRows(3);
        ResultSet rs=st.executeQuery("select * from employee");
        while(rs.next())
        {
            System.out.println(rs.getInt(1)+"\t"+rs.getString(2)+"\t"+rs.getDouble(3)+"\t"+rs.getString(4));
        }
        con.close();
    }
    
}
