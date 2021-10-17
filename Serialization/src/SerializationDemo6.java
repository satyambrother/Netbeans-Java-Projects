import java.io.*;
class Account1 implements Serializable
{
String userName="Bhaskar";
transient String pwd="kajal";
}
class UnCustomizedSerializeDemo
{
public static void main(String[] args)throws Exception
{
  Account1 a1=new Account1();
  System.out.println(a1.userName+"........."+a1.pwd);
  FileOutputStream fos=new FileOutputStream("abc.ser");
  ObjectOutputStream oos=new ObjectOutputStream(fos);
  oos.writeObject(a1);
  
  FileInputStream fis=new FileInputStream("abc.ser");
  ObjectInputStream ois=new ObjectInputStream(fis);
  Account1 a2=(Account1)ois.readObject();
  
  System.out.println(a2.userName+"........."+a2.pwd);
}
}