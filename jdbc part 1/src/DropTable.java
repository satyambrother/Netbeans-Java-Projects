import java.sql.*;
public class DropTable 
{ 
     public static void main(String args[]) throws Exception
     {  
          String username="system";
          String pwd="1998";
          String sql_query="DROP TABLE SALARY1 ";
          
          Class.forName("oracle.jdbc.OracleDriver");
          Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe",username,pwd);
          Statement st=con.createStatement();
          st.executeUpdate(sql_query);
          System.out.println("table drop successpully");
          con.close();
          
     }
    
}
