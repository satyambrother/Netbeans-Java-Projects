import java.io.*;
class Animal implements Serializable
{
int i=10;
}
class Dog8 extends Animal
{
int j=20;
}
class SerializableWRTInheritance
{
public static void main(String[] args)throws Exception
{
  Dog8 d1=new Dog8();
  System.out.println(d1.i+"........"+d1.j);

  FileOutputStream fos=new FileOutputStream("abc.ser");
  ObjectOutputStream oos=new ObjectOutputStream(fos);
  oos.writeObject(d1);
  
  FileInputStream fis=new FileInputStream("abc.ser");
  ObjectInputStream ois=new ObjectInputStream(fis);
  Dog8 d2=(Dog8)ois.readObject();
  
  System.out.println(d2.i+"........"+d2.j); }}