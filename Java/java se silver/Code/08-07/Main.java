/* javac *.java
   java Main
 */

import java.util.function.*;

public class Main{
    public static void main(String[] args){
        Function<String, Integer> func = (str) -> {
            return Integer.parseInt(str);
        };

        System.out.println(func.apply("100") * 2);
    }
}