public class HandlingDateDemo1
{
  public static void main(String args[])
  {
      java.util.Date udate=new java.util.Date();
      System.out.println("util date: "+udate);
      
      long l=udate.getTime(); // confusion why use
      
      java.sql.Date sdate=new java.sql.Date(l); // confusion why put l 
      System.out.println("sql date: "+sdate);
  }
}
