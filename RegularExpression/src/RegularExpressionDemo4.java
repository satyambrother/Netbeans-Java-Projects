import java.util.regex.*;
class RegularExpressionDemo4
{
   public static void main(String[] args)
  {
   Pattern p=Pattern.compile("a");
   Matcher m=p.matcher("aaabbbabbaba");
   while(m.find())
   {
    System.out.println(m.start()+"-------"+m.group());
   }
  }
 }