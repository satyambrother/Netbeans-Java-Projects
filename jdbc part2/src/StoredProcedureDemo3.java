import java.util.*;
import java.sql.*;
public class StoredProcedureDemo3
{
    public static void main(String args[]) throws Exception
    {
        Class.forName("oracle.jdbc.OracleDriver");
        Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","system","satyam1998");
        Scanner sc=new Scanner(System.in);
        CallableStatement cst=con.prepareCall("{call procedure3(?,?,?)}");
        
        System.out.print("Enter employee number: ");
        int a=sc.nextInt();
        cst.setInt(1,a);
        
       
        
        cst.registerOutParameter(2,Types.VARCHAR);
        cst.registerOutParameter(3,Types.INTEGER);
        cst.execute();
        
        
        System.out.println("Name of the employee number: "+a+" is "+cst.getString(2));
        System.out.println("Salary Of employee number: "+a+" is "+cst.getInt(3));
        
        con.close();
        
    }        
    
}
