import java.sql.*;
import java.io.*;
import java.util.*;

public class ResultSetTypeDemo4
{
    public static void main (String args[]) throws Exception
    { 
        Connection con =DriverManager.getConnection("jdbc:oracle:thin:system/satyam1998@localhost:1521:XE");
        Statement st=con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE);
        ResultSet rs=st.executeQuery("select * from employee");
        rs.moveToInsertRow();
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        Scanner sc=new Scanner(System.in);
        while(true)
        {
            System.out.print("Employee Number :");
            int eno=Integer.parseInt(br.readLine());
            System.out.print("Employee Name :");
            String ename=br.readLine();
            System.out.print("Employee Salary :");
            float esal=Float.parseFloat(br.readLine());
            System.out.print("Employee Address :");
            String eaddr=br.readLine();
            rs.updateInt(1, eno);
            rs.updateString(2, ename);
            rs.updateFloat(3, esal);
            rs.updateString(4, eaddr);
            rs.insertRow();
            
            System.out.println("Inserted data successfully");
            System.out.print("You want to insert more record [yes/no]");
            String option=sc.next();
            if(option.equalsIgnoreCase("no"))
            {
                break;
            }
        }
        con.close();
            
        }
}    
        
        
        
        
    }
}    
    