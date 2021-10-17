import java.util.*;
import java.sql.*;
public class DeleteMultipleRowDemo
{ public static void main(String args[]) throws Exception
 {  
      String username="system";
      String pwd="1998";
      Class.forName("oracle.jdbc.OracleDriver");
      Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE",username,pwd);
      Statement st=con.createStatement();
      Scanner sc=new Scanner(System.in);
      System.out.print("enter cutoff record");
      while(true)
      { Double cutoff=sc.nextDouble();
        String sql_query=String.format("delete from  employee where esalary=%f",cutoff);
        st.executeUpdate(sql_query);
        System.out.println("you want to delete more record [yes/no]");
        String option=sc.next();
        if(option.equalsIgnoreCase("no"));{break;}
      }
      con.close();
 }
}