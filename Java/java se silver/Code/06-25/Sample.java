public class Sample{
    public Sample(){
        System.out.println("A");
        this("B");
    }
    Sample(String str){
        System.out.println(str);
    }
}