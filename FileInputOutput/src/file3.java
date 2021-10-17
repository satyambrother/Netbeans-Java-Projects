import java.io.*;
class Test
{ public static void main(String args[]) throws Exception
  { File f=new File("abcd12345");
    System.out.println(f.exists()); 
    f.mkdir();

    File f1=new File(f,"satyam.txt");
   
    f.createNewFile();
                                          } }