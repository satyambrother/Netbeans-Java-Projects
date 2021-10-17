import java.io.*;
class Dog5 implements Serializable
{
Cat5 c=new Cat5();
}
class Cat5 implements Serializable
{
Rat5 r=new Rat5();
}
class Rat5 implements Serializable
{
int j=20;
}
class SerializableDemo5
{
 public static void main(String args[])throws Exception
 {
  Dog5 d1=new Dog5();
  FileOutputStream fos=new FileOutputStream("abc.ser");
  ObjectOutputStream oos=new ObjectOutputStream(fos);
  oos.writeObject(d1);
  
  FileInputStream fis=new FileInputStream("abc.ser");
  ObjectInputStream ois=new ObjectInputStream(fis);
  Dog5 d2=(Dog5)ois.readObject();
  
  System.out.println(d2.c.r.j);
}
}
        