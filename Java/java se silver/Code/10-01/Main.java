public class Main{
    public static void main(String[] args){
        try{
            int[] array ={}; //要素数０の配列であることに注意
            array[0] = 10;
            System.out.println("finish");
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("error");
        }
    }
}