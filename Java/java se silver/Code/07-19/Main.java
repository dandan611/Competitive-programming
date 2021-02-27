class Parent {
    String name;
    String getName(){
        return this.name;
    }
}

class Child extends Parent{
    String name;
}

public class Main{
    public static void main(String[] args){
        Child child = new Child();
        child.name = "sample";
        System.out.println(child.getName());

    }
}