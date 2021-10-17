import java.util.regex.*;
class RegularExpressionSplitDemo1
{
   public static void main(String[] args)
  {
   Pattern p=Pattern.compile("\\s");
   String[] s=p.split("satyam software solution");
   for(String s1:s)
   { System.out.println(s1); }
  }
}
   