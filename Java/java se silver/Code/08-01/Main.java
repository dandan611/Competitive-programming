/* javac *.java
   java Main
 */
public class Main{
    public static void main(String[] args){

        // String name or name
        Algorithm algorithm = (name) -> {
            System.out.println("hello, " + name);
        };
        Service s = new Service();
        s.setLogic(algorithm);
        s.doProcess("Lambda");
    }
}