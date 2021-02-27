class Sample {
    private int num;
    public Sample(int num){
        //this.num = num;
        setNum(num);
    }

    public int getNum(){
        return num;
    }

    public void setNum(int num){
        this.num = num;
    }
}

public class Main{
    public static void main(String[] args){
        Sample s = new Sample(10);
        System.out.println(s.getNum());
    }
}