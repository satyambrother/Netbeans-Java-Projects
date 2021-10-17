import java.io.*;
class Test
{ public static void main(String args[]) throws Exception
  { File f=new File("C:\Users\satya>d:");
    String[] s=f.list();
    int count=0;
    for(String s1:s)
    { File f1=new File(f,s1);
       if(f1.isDirectory())
       {count++;
       super(s); }

 System.out.println("the number of directory present in given system is: "+count); } }