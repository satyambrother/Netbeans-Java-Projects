import java.io.*;
class Filemerger
{   public static void main(String args[]) throws Exception
   { 
      PrintWriter pw=new PrintWriter("file2.text");
      pw.println(111);
      pw.println(222);
      pw.print(333);


      pw.flush();
      pw.close();                   } }
      