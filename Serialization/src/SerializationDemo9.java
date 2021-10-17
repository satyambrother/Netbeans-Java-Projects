import java.io.*;
class Animal9
{
  int i=10;
  Animal9()
  {
  System.out.println("Animal constructor called");
  }
}
class Dog9 extends Animal9 implements Serializable
{
  int j=20;
  Dog9()
  {
  System.out.println("Dog constructor called");
  }
}
class SerializableWRTInheritance2
{
  public static void main(String[] args)throws Exception{
  Dog d1=new Dog();
  d1.i=888;
  d1.j=999;
  
  FileOutputStream fos=new FileOutputStream("abc.ser");
  ObjectOutputStream oos=new ObjectOutputStream(fos);
  oos.writeObject(d1);
  
  System.out.println("Deserialization started");
  
  FileInputStream fis=new FileInputStream("abc.ser");
  ObjectInputStream ois=new ObjectInputStream(fis);
  Dog d2=(Dog)ois.readObject()
          ;
  System.out.println(d2.i+"........."+d2.j); }}
