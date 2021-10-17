import java.sql.*;
public class TransactionIsolationDemo
{
    public static void main(String args[]) throws Exception
    {
        Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","system","satyam1998");
        System.out.println(con.getTransactionIsolation());
        con.setTransactionIsolation(8);
        System.out.println(con.getTransactionIsolation());
        con.close();
    }
    
}
