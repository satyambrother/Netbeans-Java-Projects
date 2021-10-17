import java.io.*;
class Test3
{ public static void main(String args[]) throws IOException
  { FileWriter fw=new FileWriter("abc.txt");
    BufferedWriter bw=new BufferedWriter(fw);
    bw.write(100);
    bw.newLine();
    bw.write("satyam software");
    bw.write("\n");
    char[] ch={'s','a','t','y','a','m'};
    bw.newLine();
    bw.write(ch);
    bw.newLine();
    bw.flush();
    bw.close(); }
}