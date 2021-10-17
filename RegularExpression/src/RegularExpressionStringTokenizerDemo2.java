import java.util.*;
class RegularExpressionStringTokenizerDemo2
{
public static void main(String[] args)
{
     StringTokenizer st=new StringTokenizer("09,10,1998",",");
     while(st.hasMoreTokens())
     {
        System.out.println(st.nextToken());
     }
 }
}