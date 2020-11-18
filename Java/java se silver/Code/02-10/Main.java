public class Main{
    public static void main(String[] args){
        String str = "hoge, world";
        hello(str);
        System.out.println(str);
    }
    private static void hello(String msg){
        msg.replaceAll("hoge", "hello");
    }
}