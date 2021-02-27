class Parent {
    public Parent(){
        System.out.println("A");
    }
    public Parent(String val){
        this();
        System.out.println(val);
    }
}

class Child extends Parent{
    public Child(){
        super("B");
        System.out.println("C");
    }
    public Child(String val){
        this();
        System.out.println(val);
    }
}

public class Main{
    public static void main(String[] args){
        Cnew Child("D");
    }
}