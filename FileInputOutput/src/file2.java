import java.io.*;
class Test
{ public static void main(String args[]) throws Exception
  { File f=new File("abcd1234");
     System.out.println(f.exists()); 
     f.mkdir();
     System.out.println(f.exists());
                                          } }