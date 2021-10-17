import java.io.*;
class Test
{ public static void main(String args[]) throws Exception
  { File f=new File("C:\Users\satya>d:");
    String[] s=f.list();
    int count=0;
    for(String s1:s)
    {  count++;
       super(s); }

 System.out.println("the number of file and directory present in given system is: "+count); } }