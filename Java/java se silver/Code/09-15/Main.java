import java.util.Arrays;

public class Main{
    public static void main(String[] args){
        String[] a = {"b","c"};
        String[] b = {"a","b","C"};
        System.out.println(Arrays.mismatch(a,b));
    }
}