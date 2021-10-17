import java.sql.*;
import javax.sql.*;
import javax.sql.rowset.*;
class EmployeeSalaryFilter implements Predicate
{
    float low;
    float high;
    public EmployeeSalaryFilter(float low,float high)
    {
        this.low=low;
        this.high=high;
    }
    public boolean evalute(Object value,int columnindex) throws SQLException
    {
        return false;
    }
    
    public boolean evalute(RowSet rs) throws SQLException
    {
        boolean eval=false;
        try
        {
            FilteredRowSet frs=(FilteredRowSet)rs;
            float esalary=frs.getFloat(3);
            if((esalary>=low)&&(esalary<=high))
            {
                eval=true;
            }
            else
            {
                eval=false;
            }
            
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
        return eval;
    }
}
public class FilteredRowSetRetrieveDemo 
{
    public static void main(String args[]) throws Exception
    {
        RowSetFactory rsf=RowSetProvider.newFactory();
        FilteredRowSet frs=rsf.createFilteredRowSet();
        frs.setUrl("url");
        frs.setUsername("system");
        frs.setPassword("satyam1998");
        frs.setCommand("select * from employee");
        frs.execute();
        System.out.println("Data Before Filltering");
        System.out.println("ENO \t ENAME \t ESALARY \t EADDRESS");
        System.out.println("....................................");
        while(frs.next())
        {
            System.out.println(frs.getInt(1)+"\t"+frs.getString(2)+"\t"+frs.getFloat(3)+"\t"+frs.getString(4));
        }
        EmployeeSalaryFilter f=new EmployeeSalaryFilter(100,400);
        frs.setFilter(f);
        frs.beforeFirst();
        System.out.println("Data After Filltering");
        System.out.println("ENO \t ENAME \t ESALARY \t EADDRESS");
        System.out.println("....................................");
        while(frs.next())
        {
            System.out.println(frs.getInt(1)+"\t"+frs.getString(2)+"\t"+frs.getFloat(3)+"\t"+frs.getString(4));
        }
        frs.close();
        
    }
}