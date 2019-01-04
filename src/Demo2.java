abstract class A{
    public void fun(){
        System.out.println("存在有方法体的方法");
    }
    public abstract void print();//此方法没有方法体,并且存在abstract关键字,表示抽象方法
}
class B extends A{
    public void print(){
        System.out.println("hello world");
    }
}
public class Demo2 {
    public static void main(String[] args) {
        A a = new B();
        a.print();
    }
}
