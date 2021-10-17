import java.util.*;
import java.sql.*;
public class StoredProcedureDemo1
{
    public static void main(String args[]) throws Exception
    {
        Class.forName("oracle.jdbc.OracleDriver");
        Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","system","1998");
        Scanner sc=new Scanner(System.in);
        CallableStatement cst=con.prepareCall("{call addProc(?,?,?)}");
        
        System.out.print("Enter first input parameter: ");
        int a=sc.nextInt();
        cst.setInt(1,a);
        
        System.out.print("Enter second input parameter: ");
        int b=sc.nextInt();
        cst.setInt(2, b);
        
        cst.registerOutParameter(3,Types.INTEGER);
        
        cst.execute();
        
        System.out.println("Addition of given two number: "+cst.getInt(3));
        
        con.close();
        
    }        
    
}
