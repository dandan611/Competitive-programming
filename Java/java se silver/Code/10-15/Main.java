class A{
    private int num;

    public A(int num){
        this.num = num;
    }

    public boolean equals(Object obj){
        A a = (A) obj;
        return this.num == a.num;
    }
}

class B{
    public B(int num){
        this.num = num;
    }

    public boolean equals(Object obj){
        B b = (B) obj;
        return this.num == b.num;
    }
}


public class Main{
    public static void main(String[] args){
        A a = new A(10);
        B b = new B(10);
        System.out.println(a.equals(b));
    }
}