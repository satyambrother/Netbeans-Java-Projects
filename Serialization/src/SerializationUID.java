import java.io.*;
class Dogi implements Serializable
{
  private static final long serialVersionUID=1L;
  int i=10;
  int j=20;
}
class Sender
{
  public static void main(String[] args) throws Exception {
  Dogi d1=new Dogi();
  FileOutputStream fos=new FileOutputStream("abc.ser");
  ObjectOutputStream oos= new ObjectOutputStream(fos);
  oos.writeObject(d1);
}
}
class Receiver
{
  public static void main(String[] args)throws Exception {
  FileInputStream fis=new FileInputStream("abc.ser");
  ObjectInputStream ois=new ObjectInputStream(fis);
  Dogi d2=(Dogi) ois.readObject();
  System.out.println(d2.i+"-----"+d2.j);
}
}