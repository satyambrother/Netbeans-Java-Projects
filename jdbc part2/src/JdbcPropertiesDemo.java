import java.sql.*;
import java.util.*;
import java.io.*;
public class JdbcPropertiesDemo 
{
    public static void main(String args[]) throws Exception
    {
        Properties p=new Properties();
        FileInputStream fis=new FileInputStream("abcd.properties");
        p.load(fis);
        String url=p.getProperty("url");
        String user=p.getProperty("user");
        String pwd=p.getProperty("pwd");
        Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE",user,pwd);
        Statement st=con.createStatement();
        ResultSet rs=st.executeQuery("select * from employee1");
        System.out.println("ENO \t ENAME \t ESALARY \t EADDRESS");
        while(rs.next())
        {
            System.out.println(rs.getInt(1)+"\t"+rs.getString(2)+"\t"+rs.getFloat(3)+"\t"+rs.getString(4));
        }
        con.close();
    }
    
}
