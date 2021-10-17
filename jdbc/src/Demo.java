class Mix {
    int num=10;
    Mix(){
        System.out.println("Parent Class");
    }
    void show(){
        System.out.println("Hi");
    }
    
}
public class Demo extends Mix {
    int num=20;
    Demo()
    {
        System.out.println("Child Class");
    }
    void show(){
        System.out.println("Hello");
    }
    
    public static void main(String[] args) {
        Mix d = new Demo();
        System.out.println(d.num);
        d.show();
    }
}
