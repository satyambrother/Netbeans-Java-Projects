import java.util.*;
import java.sql.*;
public class StoredProcedureDemo2
{
    public static void main(String args[]) throws Exception
    {
        Class.forName("oracle.jdbc.OracleDriver");
        Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","system","satyam1998");
        Scanner sc=new Scanner(System.in);
        CallableStatement cst=con.prepareCall("{call procedure2(?,?)}");
        
        System.out.print("Enter first input parameter: ");
        int a=sc.nextInt();
        cst.setInt(1,a);
        
        cst.registerOutParameter(2,Types.INTEGER);
        
        cst.execute();
        
        System.out.println("Square of given two number: "+cst.getInt(2));
        
        con.close();
        
    }        
    
}
