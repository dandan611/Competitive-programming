import java.util.ArrayList;

public class Main{
    public static void main(String[] args){
        ArrayList<String> list = new ArrayList<>();
        list.add("A");
        list.add(2,"B");
        list.add("C");
        list.add("D");        
        for(String str:list){
            System.out.println(str);
        }
    }
}