import java.util.regex.*;
class RegularExpressionStringSplitDemo1
{
   public static void main(String[] args)
  {
   String s="satyam.software.co";
   String[] s1=s.split("\\.");
   for(String s2:s1)
   { System.out.println(s2); }
  }
}
   