
public class Main{
    public static void main(String[] args){
        try{
            try{
                String[] array = {"a","b","c"};
                System.out.println(array[3]);
            }catch (ArrayIndexOutOfBoundsException e){
                System.out.println("D");
            }finally {
                System.out.println("E");
            }
        }catch (ArrayIndexOutOfBoundsException e){
                System.out.println("F");
        }finally {
            System.out.println("G");
        } 
    }
}