import java.io.*;
class FileMerger
{   public static void main(String args[]) throws IOException
   { 
     PrintWriter pw1=new PrintWriter("file3.TEXT");
    
     BufferedReader br=new BufferedReader(new FileReader("file1.text"));
     String line=br.readLine();
     while(line!=null)
     {  pw1.println(line);
       line=br.readLine();  }
     BufferedReader br1=new BufferedReader(new FileReader("file2.text"));
     String line1=br1.readLine();
     while(line1!=null)
     {pw1.println(line1);
       line1=br1.readLine(); }
      pw1.flush();
     
     br.close();
     pw1.close();
     
     
     
    }
}