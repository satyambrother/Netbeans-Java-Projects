import java.sql.*;
import javax.sql.rowset.*;
public class CatchedRowSetDemo
{
    public static void main(String args[]) throws Exception
    {
        Connection con=DriverManager.getConnection("my sql wrl");
        Statement st=con.createStatement();
        ResultSet rs=st.executeQuery("select * from employee");
        RowSetFactory rsf=RowSetProvider.newFactory();
        CachedRowSet crs=rsf.createCachedRowSet();
        crs.populate(rs);
        con.close();
        // now we cannot access rs but we can acess crs
        // if(rs.next()) {} RE: SQLException operation not allowed after resultset closed
        System.out.println("ENO \t ENAME \t ESALARY \t EADDRES");
        System.out.println("..................................");
         while(crs.next())
        {
            System.out.println(crs.getInt(1)+"\t"+crs.getString(2)+"\t"+crs.getDouble(3)+"\t"+crs.getString(4));
        }
    }
    
}
