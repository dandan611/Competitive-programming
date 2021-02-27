interface Worker{
    void work();
}

class Employee{
    public void work(){
        System.out.println("work");
    }
}

class Engineer extends Employee implements Worker{}

public class Main{
    public static void main(String[] args){
        Worker worker = new Engineer();
        worker.work();
    }
}