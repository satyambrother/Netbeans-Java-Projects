import javax.sql.rowset.*;
public class JdbcRowSetRetriveDemo
{
    public static void main(String args[]) throws Exception
    {
        RowSetFactory rsf=RowSetProvider.newFactory();
        JdbcRowSet jrs=rsf.createJdbcRowSet();
        jrs.setUrl("jdbc:oracle:thin:@localhost:1521:thin");
        jrs.setUsername("system");
        jrs.setPassword("satyam1998");
        jrs.setCommand("select * from employee");
        jrs.execute();
        System.out.println("Employee Detail in forward direction");
        System.out.println("ENO \t ENAME \t ESALARY \t EADDRES");
        System.out.println("..................................");
         while(jrs.next())
        {
            System.out.println(jrs.getInt(1)+"\t"+jrs.getString(2)+"\t"+jrs.getDouble(3)+"\t"+jrs.getString(4));
        }
         
        System.out.println("Employee Detail in backward direction");
        System.out.println("ENO \t ENAME \t ESALARY \t EADDRES");
        System.out.println("..................................");
         while(jrs.previous())
        {
            System.out.println(jrs.getInt(1)+"\t"+jrs.getString(2)+"\t"+jrs.getDouble(3)+"\t"+jrs.getString(4));
        }
         
         System.out.println(" Accessing data in random order");
         jrs.absolute(3);
         System.out.println(jrs.getInt(1)+"\t"+jrs.getString(2)+"\t"+jrs.getDouble(3)+"\t"+jrs.getString(4));
         jrs.first();
         System.out.println(jrs.getInt(1)+"\t"+jrs.getString(2)+"\t"+jrs.getDouble(3)+"\t"+jrs.getString(4));
         jrs.last();
         System.out.println(jrs.getInt(1)+"\t"+jrs.getString(2)+"\t"+jrs.getDouble(3)+"\t"+jrs.getString(4));
         jrs.close();
    
    }

    
}
