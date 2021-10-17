import java.sql.*;
public class DatabaseMetaDataDemo1
{
    public static void main(String args[]) throws Exception
    {
        Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","system","1998");
        DatabaseMetaData dbmd=con.getMetaData();
        System.out.println("Database Product Name"+dbmd.getDatabaseProductName());
        System.out.println("Database Version Name"+dbmd.getDatabaseProductVersion());
        System.out.println("Database major Version"+dbmd.getDatabaseMajorVersion());
        System.out.println("Database Minor version"+dbmd.getDatabaseMinorVersion());
        System.out.println("JDBC Major version"+dbmd.getJDBCMajorVersion());
        System.out.println("JDBC minor version"+dbmd.getJDBCMinorVersion());
        System.out.println("Driver Name"+dbmd.getDriverName());
        System.out.println("Driver Version"+dbmd.getDriverVersion());
        System.out.println("URL:"+dbmd.getURL());
        System.out.println("UserName"+dbmd.getUserName());
        System.out.println("MaxColumnsName"+dbmd.getMaxColumnsInTable());
        System.out.println("MaxRowSize"+dbmd.getMaxRowSize());
        System.out.println("Maxstatementlength"+dbmd.getMaxStatementLength());
        System.out.println("MaxTablesInSelect"+dbmd.getMaxTablesInSelect());
        System.out.println("MaxTableNameLength"+dbmd.getMaxTableNameLength());
        System.out.println("SQlkeywords"+dbmd.getSQLKeywords());
        System.out.println("NumericFunction"+dbmd.getNumericFunctions());
        System.out.println("StringFunction"+dbmd.getStringFunctions());
        System.out.println("SystemDunction"+dbmd.getSystemFunctions());
        System.out.println("supportFullouterjoin"+dbmd.supportsFullOuterJoins());
        System.out.println("supportsStoredprocedure"+dbmd.supportsStoredProcedures());
        con.close();
    }
    
}
