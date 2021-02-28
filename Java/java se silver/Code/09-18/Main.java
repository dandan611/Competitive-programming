import java.util.List;

public class Main{
    public static void main(String[] args){
        List<String> list = List.of("A","B","C");
        list.forEach(str -> System.out.println(str));
    }
}