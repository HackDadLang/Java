class A1{
    int a = 1;
    public void fun1(){
        System.out.println("A1");
    }
}
class A2 extends A1{
    public void fun2(){
        super.a = 2;
        System.out.println("A2");
    }
}

public class Demo {
    public static void main(String[] args) {
        A2 a = new A2();
        a.fun2();
        System.out.println(a.a);
    }
}
