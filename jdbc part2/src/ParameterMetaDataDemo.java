import java.sql.*;
public class ParameterMetaDataDemo
{
    
    public static void main(String args[]) throws Exception
    {
        Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","system","satyam1998");
        PreparedStatement pst=con.prepareStatement("insert into employee values(?,?,?,?)");
        ParameterMetaData   pmd=pst.getParameterMetaData();
        int count=pmd.getParameterCount();
        for(int i=1;i<=count;i++)
        {
            System.out.println("Parameter Number "+i);
            //System.out.println("Parameter Type"+pmd.getParameterType(i));
            //System.out.println("Parameter Mode"+pmd.getParameterMode(i));
            //System.out.println("Parameter Precision"+pmd.getPrecision(i));
            //System.out.println("Parameter Scale"+pmd.getScale(i));
            //System.out.println("Parameter isSigned"+pmd.isSigned(i));
            //System.out.println("Parameter isNullable"+pmd.isNullable(i));
            System.out.println("..................................."); 
        }
    con.close();
    }
    
    
}
