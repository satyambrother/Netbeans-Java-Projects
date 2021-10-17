import java.io.*;
class Dog4 implements Serializable
{
int i=10;
int j=20;
}
class Cat4 implements Serializable
{
int i=30;
int j=40;
}
class Rat4 implements Serializable
{
    int i=50;
    int j=60;
}
class SerializableDemo4
{
   public static void main(String args[])throws Exception
   {   Dog4 d1=new Dog4();
       Cat4 c1=new Cat4();
       Rat4 r1=new Rat4();
       
       System.out.println("Serialization started");

       FileOutputStream fos=new FileOutputStream("abc.ser");
       ObjectOutputStream oos=new ObjectOutputStream(fos);
       
       oos.writeObject(d1);
       oos.writeObject(c1);
       oos.writeObject(r1);
       
       System.out.println("Serialization ended");

       System.out.println("Deserialization started");

       FileInputStream fis=new FileInputStream("abc.ser");
       ObjectInputStream ois=new ObjectInputStream(fis);
/*       Dog4 d2=(Dog4)ois.readObject();
         Cat4 c2=(Cat4)ois.readObject();
         Rat4 r2=(Rat4)ois.readObject(); 
         System.out.println(d2.i+"................"+d1.j);
          System.out.println(c2.i+"................"+c1.j);
          System.out.println(r2.i+"................"+r1.j); */
       Object o=ois.readObject();
       if(o instanceof Dog4)
       {
         Dog4 d2=(Dog4)o;
         System.out.println(d2.i+"................"+d1.j);
       }
       else if(o instanceof Cat4)
       {
            Cat4 c2=(Cat4)o;
           System.out.println(c2.i+"................"+c1.j);
       }
       else if(o instanceof Rat4)
       {
           Rat4 r2=(Rat4)o;
           System.out.println(r2.i+"................"+r1.j);
       } 
       

       System.out.println("Deserialization ended");

      
      

}}