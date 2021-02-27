class A {
    void hello(){
        System.out.println("A");
    }
}

class B extends A {
    void hello(){
        System.out.println("B");
    }
}

public class Main{
    public static void main(String[] args){
        A a = new A();
        B b = (B) a;
        b.hello();
    }
}