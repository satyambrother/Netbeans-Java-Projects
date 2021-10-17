import java.io.*;
class Test2
{ public static void main(String args[]) throws IOException
  { File f=new File("abc.txt");
    FileReader fr=new FileReader(f);
    //char[] ch=new char[50];
    char[] ch=new char[(int)f.length()];
    fr.read(ch);
    for(char ch1:ch)
    { System.out.println(ch1);}
 
    System.out.println("*******************************************************************************");

 
    FileReader fr1=new FileReader(f);
      int i=fr1.read();
     while(i!=-1)
     { System.out.println((char)i);
        i=fr1.read(); } 

   fr.close();   
   fr1.close();
}

}