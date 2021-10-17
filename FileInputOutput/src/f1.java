import java.io.*;
class Filemerger
{   public static void main(String args[]) throws Exception
   { BufferedWriter bw=new BufferedWriter(new FileWriter("file1.text"));
      char[] ch={'a','a','a'};
      bw.write(ch);
      bw.newLine();
      bw.write("bbb");
      bw.newLine();
      bw.write("ccc");
      
      bw.flush();
      bw.close(); } }