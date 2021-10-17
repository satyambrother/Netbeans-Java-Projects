import java.util.*;
import java.sql.*;
public class SelectNonSelectQueryDemo
{
  public static void main(String args[]) throws Exception 
  { 
      String username="system";
      String pwd="satyam1998";
      Class.forName("oracle.jdbc.OracleDriver");
      Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE",username,pwd);
      Statement st=con.createStatement();
      Scanner sc=new Scanner(System.in);
      System.out.println("enter query which you want to execute");
      String sql_query=sc.nextLine();
      Boolean b=st.execute(sql_query);
      if(b==true)
      {
          ResultSet rs=st.executeQuery(sql_query);
          while(rs.next())
          {
              System.out.println(rs.getInt(1)+"\t"+rs.getString(2)+"\t"+rs.getDouble(3)+"\t"+rs.getString(4));
          }
      }
      else
      {
          int rowcount=st.getUpdateCount();
          System.out.println("total row affected is:"+rowcount);
      }
      con.close();
  
  }
  
}
