import java.util.*;
public class Rotate90Degree
{   public static void main(String args[])
    {   Scanner sc=new Scanner(System.in);
        int e,x,y,n,i,j,N;
        System.out.println("enter matrix size \t ");
        N=sc.nextInt();
        int[][] a=new int[N][N];
       
       System.out.println("enter element");
       for( i=0;i<a[0].length;i++)
       {  
           for( j=0;j<a[0].length;j++)
           { 
            a[i][j]=sc.nextInt();
           
          }
          
       }  
       System.out.println("enter substring position");
       x=sc.nextInt();
       y=sc.nextInt();
       n=sc.nextInt();
       
      int  b[][]=new int[n][n];
      int  c[][]=new int[n][n];
      for(i=0;i<n;i++)
      { for(j=0;j<n;j++)
        {
          b[i][j]=a[x+j][y+i];
         }
       }   
       for(i=0;i<n;i++)
       { int k=n-1; 
         for(j=0;j<n;j++)
          { 
            c[i][j]=b[i][k];
            k--;
         }
       } 
       for(i=0;i<n;i++)
       { for(j=0;j<n;j++)
         {
          a[i+x][j+y]=c[i][j];
         }
       }  
       
       for(i=0;i<a[0].length;i++)
       {  for(j=0;j<a[0].length;j++)
           { 
           System.out.println(a[i][j]+" ");
           }
           System.out.println();
       }  
       
       
       
    } }
    
     

