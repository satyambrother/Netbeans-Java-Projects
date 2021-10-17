import java.sql.*;
public class InsertRecodDemo
{ 
    public static void main(String args[])
    { 
        String username="system";
        String pwd="1999";
        String sql_query="insert into salary(no,name) values(103,'deepak')";
        try
        { Class.forName("oracle.jdbc.OracleDriver");
          Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:SYSTEM",username,pwd);
          Statement st=con.createStatement();
          st.executeUpdate(sql_query);
          System.out.println("Row inserted success fully");
          
        }
        catch(Exception e){System.out.println(e);}
    }
    
}
