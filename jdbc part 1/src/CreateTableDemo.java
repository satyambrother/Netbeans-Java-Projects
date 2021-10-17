import java.sql.*;
public class CreateTableDemo
{
    public static void main(String[] args) throws Exception 
    {
        String sql_query="create table employee1(no number,name varchar(20),salary number,address varchar(20))";
         
        Class.forName("oracle.jdbc.OracleDriver");
        Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:system","system","1999");
        Statement st=con.createStatement();
        st.executeUpdate(sql_query);
       
        { System.out.println("table create successfully");  
        
        }
        con.close();
    }
}

