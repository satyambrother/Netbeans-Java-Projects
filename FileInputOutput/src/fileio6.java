import java.io.*;
class FileMerger1
{ public static void main(String args[]) throws Exception
   { PrintWriter pw=new PrintWriter("file3.text");
     BufferedReader br1=new BufferedReader(new FileReader("file1.text"));
     
      BufferedReader br2=new BufferedReader(new FileReader("file2.text"));
     String line1=br1.readLine();
     String line2=br2.readLine();
     while((line1!=null)||(line2!=null))
     { 

      if(line1!=null)
    {
      pw.println(line1);
       line1=br1.readLine();  }
     if(line2!=null)
     { pw.println(line2);
        line2=br2.readLine(); } }              
       
     pw.flush();
     br1.close();
     br2.close();
     pw.close();
    }
}