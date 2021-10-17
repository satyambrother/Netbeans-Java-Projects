import java.io.*;
class Test1
{ public static void main(String args[]) throws IOException
  { FileWriter fw=new FileWriter("abc.txt",true);
    fw.write(100);
    fw.write("\n");
    fw.write("satyam software");
    fw.write("\n");
    char[] ch={'s','a','t','y','a','m'};
    fw.write("\n");
    fw.write(ch);
    fw.write("\n");
    fw.flush();
    fw.close(); }
}