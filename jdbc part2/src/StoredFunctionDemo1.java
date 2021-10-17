import java.util.*;
import java.sql.*;
public class StoredFunctionDemo1
{
    public static void main(String args[]) throws Exception
    {
        Class.forName("oracle.jdbc.OracleDriver");
        Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","system","1998");
        Scanner sc=new Scanner(System.in);
        CallableStatement cst=con.prepareCall("{?=call getAvg(?,?)}");
        System.out.print("enter first  number ");
        int a=sc.nextInt();
        cst.setInt(2, a);
        
        System.out.print("enter second  number ");
        int b=sc.nextInt();
        cst.setInt(3,b);
        
        cst.registerOutParameter(1, Types.FLOAT);
        cst.execute();
        System.out.println("Average salary of  given employee: "+cst.getInt(1));
        con.close();
    }
}    