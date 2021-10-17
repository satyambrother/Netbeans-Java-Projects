import java.io.*;
class DuplicateElimination
{ public static void main(String args[]) throws Exception
   { PrintWriter pw=new PrintWriter("output.text");
     BufferedReader br1=new BufferedReader(new FileReader("input.text"));
     String line1=br1.read Line();

     while(line!=null)
     { boolean available=false;
       BufferedReader br2=new BufferedReader(new FileReader("deleate.text"));
       String target=br2.readline();
     while(target!=null)
     { 
        if(line.equals(target)
        {available=true;
          break; }
target=br2.readline();

      
     if(available==false)
     { pw.println(line);
       pw.flush();ss
       line=br1.readline(); }


    }
}
