import java.io.*;
class FileMerger2
{ public static void main(String args[]) throws Exception
   { PrintWriter pw=new PrintWriter("file3.text");
     BufferedReader br1=new BufferedReader(new FileReader("input.text"));
     String line=br1.readLine();

     while(line!=null)
     { boolean available=false;
       BufferedReader br2=new BufferedReader(new FileReader("delete.text"));
       String target=br2.readLine();
     while(target!=null)
     { 
        if(line.equals(target))
        {available=true;
          break; }
     target=br2.readLine();

      
     if(available==false)
     { pw.println(line);
                          }
       
}}
     pw.flush();
     pw.close();
    }
}