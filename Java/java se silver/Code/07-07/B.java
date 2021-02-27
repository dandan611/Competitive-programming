public class B implements A{
    default void test(){
        System.out.println("B");
    }
}