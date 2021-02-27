interface Worker{
    void work();
}

class Employee implements Worker{
    public void work(){
        System.out.println("work");
    }

    public void report(){
        System.out.println("report");
    }
}

class Engineer extends Employee{
    public void create(){
        System.out.println("create");
    }
}

public class Main{
    public static void main(String[] args){
        Worker a = new Engineer();
        Employee b = new Engineer();
        Engineer c = new Engineer();
        a.create();
        b.work();
        c.report();
    }
}