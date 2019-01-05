interface A{
    String MSG = "TEST";
    void print();
}
interface B{
    void get();
}
class X implements A,B{
    public void print(){
        System.out.println("A类的抽象方法");
    }
    public void get(){
        System.out.println("B类的抽象方法");
    }
}
public class InterfaceDemo {
    public static void main(String[] args) {
        X x = new X();
        x.print();
        x.get();
        System.out.println(A.MSG);
    }
}
