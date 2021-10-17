import java.util.*;
import java.sql.*;
import oracle.jdbc.OracleTypes;
public class StoredProcedureCursorDemo1
{
    public static void main(String args[]) throws Exception
    {
        Class.forName("oracle.jdbc.OracleDriver");
        Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","system","satyam1998");
        Scanner sc=new Scanner(System.in);
        CallableStatement cst=con.prepareCall("{call getallinfo1(?,?)}");
        cst.setInt(1, 400);
        cst.registerOutParameter(2,OracleTypes.CURSOR);
        cst.execute();
        ResultSet rs=(ResultSet)cst.getObject(2);
        Boolean flag=false;
        System.out.println("ENO\t ENAME\t ESALARY \t EADDRESS");
        System.out.println("..................................");
        while(rs.next())
        {   flag=true;
            System.out.println(rs.getInt(1)+"\t"+rs.getString(2)+"\t"+rs.getInt(3)+"\t"+rs.getString(4));
        } 
        if(flag=false)
        {
            System.out.println("No record available");
            
        }
      con.close(); 

}  } 
        
    