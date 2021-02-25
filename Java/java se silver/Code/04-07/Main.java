public class Main{
    public static void main(String[] args){
        int a = 0;
        for(int i = 0, j = 0; i<3,j<5 ; i++){
            System.out.print(i++);
            j += i;
        }
    }
}