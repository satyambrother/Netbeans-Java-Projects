import javax.sql.rowset.*;
public class RowSetsCreationObjectDemo
{
    public static void main(String args[]) throws Exception
    {
        RowSetFactory rsf=RowSetProvider.newFactory();
        JdbcRowSet jdrs=rsf.createJdbcRowSet();
        CachedRowSet crs=rsf.createCachedRowSet();
        WebRowSet wrs=rsf.createWebRowSet();
        JoinRowSet jrs=rsf.createJoinRowSet();
        FilteredRowSet frs=rsf.createFilteredRowSet();
        
        System.out.println(jdrs.getClass().getName());
        System.out.println(crs.getClass().getName());
        System.out.println(wrs.getClass().getName());
        System.out.println(jrs.getClass().getName());
        System.out.println(frs.getClass().getName());
                
    }
    
}
