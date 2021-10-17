import java.util.*;
import java.sql.*;
import java.io.*;
public class BlobDemo1
{ 
     public static void main(String args[]) throws Exception
    {
        Class.forName("oracle.jdbc.OracleDriver");
        Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","system","1998");
        String sql_query="insert into persons values(?,?)";
        PreparedStatement pst=con.prepareStatement(sql_query);
        pst.setString(1,"satyam");
        File f=new File("satyam.jpg");
        FileInputStream fis=new FileInputStream(f);
        pst.setBinaryStream(2, fis);
        System.out.println("Inserting Image From :"+f.getAbsolutePath());
        int updatecount=pst.executeUpdate();
        if(updatecount==0)
        {
            System.out.println("No record Inserted");
        }
        else
        {
            System.out.println(" Record Inserted");
        }
        con.close();
    }
}
