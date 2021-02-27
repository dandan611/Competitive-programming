class A {}

class B extends A {
    void hello(){
        System.out.println("hello");
    }
}

public class Main{
    public static void main(String[] args){
        A a = new B();
        B b = (B) a;
        b.hello();
    }
}