interface A {}

class B implements A {}

class C extends B {}

class D {}

public class Main{
    public static void main(String[] args){
        A[] array = {
            new B(),
            new C(),
            new A(),
            new D()
        };
    }
}