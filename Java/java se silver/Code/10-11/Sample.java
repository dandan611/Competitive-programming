class SampleException extends Exception{}
class TestException extends RuntimeException{}


public class Sample{
    public static void main(String[] args){
        try(FileInputStream is = new FileInputStream("sample.txt")){
            throw new FileNotFoundException();
        }catch (Exception e){
                System.out.println("A");
        }finally {
            if(is != null){
                is.close();
            }
            System.out.println("B");
        } 
    }
}