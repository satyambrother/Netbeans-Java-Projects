import java.util.regex.*;
class RegularExpressionDemo2
{
   public static void main(String[] args)
  {
   Pattern p=Pattern.compile("[abc]");
   Matcher m=p.matcher("a1b7@z#");
   while(m.find())
   {
    System.out.println(m.start()+"-------"+m.group());
   }
  }
 }