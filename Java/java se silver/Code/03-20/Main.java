public class Main{
    public static void main(String[] args){
        final int NUM = 0;
        int num = 10;
        switch(num){
            case "10": System.out.println("A");
            break;

            case num : System.out.println("B");
            break;

            case 2 * 5 : System.out.println("C");
            break;

            case NUM: System.out.println("D");
            break;
        }
    }
}