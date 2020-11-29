public class Main{
    public static void main(String[] args){
        String a = new String("Sample");
        String b = "Sample";
        System.out.print(a == b);
        System.out.print(", ");
        System.out.println(a.equals(b));
    }
}