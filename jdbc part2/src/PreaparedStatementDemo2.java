import java.util.*;
import java.sql.*;

public class PreaparedStatementDemo2
{
     public static void main(String args[]) throws Exception
     {
         String username="system";
         String pwd="satyam1998";
         String sql_query="insert into employee values(?,?,?,?)";
         
         Class.forName("oracle.jdbc.OracleDriver");
         Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE",username,pwd);
         PreparedStatement pst=con.prepareStatement(sql_query);
         
         Scanner sc=new Scanner(System.in);
         while(true)
         {
             System.out.print("Enter  employee   number: ");
             int eno=sc.nextInt();
             System.out.print("Enter  employee   name: ");
             String ename=sc.next();
             System.out.print("Enter  employee   salary: ");
             double esalary=sc.nextDouble();
             System.out.print("Enter  employee   Address: ");
             String eaddress=sc.next();
             
             pst.setInt(1, eno);
             pst.setString(2,ename);
             pst.setDouble(3,esalary);
             pst.setString(4, eaddress);
             
             pst.executeUpdate();
             System.out.println("Record Inseted Successfully");
             
             System.out.print(" Do you Want to inset more record [yes/no]: ");
             String option=sc.next();
             if(option.equalsIgnoreCase("no"))
             {
                 break;
             }
             
         }  
         con.close();
         
     }
             
    
}
