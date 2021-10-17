import java.io.*;
class Demo1
{  public static void main(String[] args) throws IOException
   { //FileWriter fw=new FileWriter("abcd.text");
     PrintWriter pw=new PrintWriter("abcd.text");
     pw.write(100);
     pw.println(100);
     pw.println(1000);
     pw.println(true);
     pw.println('c');
     pw.println("satyam");
     pw.flush();
     pw.close(); } 
}
