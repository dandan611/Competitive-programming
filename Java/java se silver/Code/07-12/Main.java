
class A{
    String val = "A";
    void print(){
        System.out.println(val);
    }

}

class B extends A{
    String val = "B";
}


public class Main{
    public static void main(String[] args){
        A a = new A();
        A b = new B();

        System.out.println(a.val);
        System.out.println(b.val);
        a.print();
        b.print();
    }
}