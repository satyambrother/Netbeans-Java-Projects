import java.util.regex.*;
class RegularExpressionDemo1
{
   public static void main(String[] args)
   {
     int count=0;
     Pattern p=Pattern.compile("ab");
     Matcher m=p.matcher("abbbabbaba");
     while(m.find())
     {
       count++;
       System.out.println(m.start()+"------"+m.end()+"------"+m.group());
     }
     System.out.println("The no of occurences:"+count);
    }
}