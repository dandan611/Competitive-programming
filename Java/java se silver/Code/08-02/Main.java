/* javac *.java
   java Main
 */
public class Main{
    public static void main(String[] args){
        // うまくいくやつだけ記載
        /* 別パターン1
        Function f = (name) -> {
            return "hello, " + name;
        };
        */

        //* 別パターン2
        Function f = name -> {
            return "hello, " + name;
        };
        //*/

        //Function f = (name) ->  "hello, " + name;

        System.out.println(f.test("Lambda"));
    }

    private static interface Function {
        String test(String name);
    }
}